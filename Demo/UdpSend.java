import java.net.*;
import java.io.*;

public class UdpSend implements Runnable 
{
	private DatagramSocket ds;

	public UdpSend(DatagramSocket ds)
	{
		this.ds=ds;
	}

	public void run()
	{
		try
		{
			BufferedReader bufr=new BufferedReader(new InputStreamReader(System.in));
			String info=null;
			while((info=bufr.readLine())!=null)
			{
				if("886".equals(info))
					break;
				byte[] buff=info.getBytes();	
				DatagramPacket dp=new DatagramPacket(buff,buff.length,InetAddress.getByName("127.0.0.1"),10000);
				ds.send(dp);
			}
		}
		catch(Exception e)
		{
			throw new RuntimeException("消息发送失败");
		}
	}
}
