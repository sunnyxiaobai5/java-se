import java.net.*;

public class UdpReceive implements Runnable 
{
	private DatagramSocket ds;

	public UdpReceive(DatagramSocket ds)
	{
		this.ds=ds;
	}

	public void run()
	{
		try
		{
			while(true)
			{
				byte[] buff=new byte[1024];	
				DatagramPacket dp=new DatagramPacket(buff,buff.length);
				ds.receive(dp);
				String data=new String(dp.getData(),0,dp.getLength());
				System.out.println(data);
			}
		}
		catch(Exception e)
		{
			System.out.println("消息接受失败");
		}
	}
}
