import java.net.*;
import java.io.*;

class UdpSend implements Runnable 
{
	void run() throws Exception
	{
		
		BufferedReader inputStream=new BufferedReader(new InputStreamReader(System.in));
		DatagramSocket ds=new DatagramSocket();
		String info;
		while((info=inputStream.readLine())!=null)
		{
			byte[] buff=info.getBytes();	
			DatagramPacket dp=new DatagramPacket(buff,buff.length,InetAddress.getByName("127.0.0.1"),10000);
			ds.send(dp);
		}
		ds.close();
	}
}
class UdpReceive implements Runnable
{
	void run() throws Exception
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

public class UdpDemo
{
	public static void main(String args[])throws Exception
	{
	}
}
