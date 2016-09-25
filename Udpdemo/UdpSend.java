import java.net.*;
import java.io.*;

public class UdpSend
{
	public static void main(String args[])throws Exception
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
