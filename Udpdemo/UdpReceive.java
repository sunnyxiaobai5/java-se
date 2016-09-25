import java.net.*;

public class UdpReceive
{
	public static void main(String args[])throws Exception
	{
		DatagramSocket ds=new DatagramSocket(10000);
		byte[] buff=new byte[1024];	
		while(true)
		{
			DatagramPacket dp=new DatagramPacket(buff,buff.length);
			ds.receive(dp);
			String data=new String(dp.getData(),0,dp.getLength());
			System.out.println(data);
		}
	}
}
