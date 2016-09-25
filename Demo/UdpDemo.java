import java.net.*;
import java.io.*;

public class UdpDemo
{
	public static void main(String args[])throws Exception
	{
		DatagramSocket send=new DatagramSocket();
		DatagramSocket rece=new DatagramSocket(10002);
		new Thread(new UdpReceive(rece)).start();
		new Thread(new UdpSend(send)).start();
	}
}
