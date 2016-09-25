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
				if(info.equals("exit"))
					break;
				byte[] buff=info.getBytes();	
				DatagramPacket dp=new DatagramPacket(buff,buff.length,InetAddress.getByName("169.254.255.255"),10020);
				ds.send(dp);
				//169.254.252.78
			}
			ds.close();
			System.exit(0);
		}
		catch(Exception e)
		{																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
			throw new RuntimeException("Send Faild");
		}
	}
}
