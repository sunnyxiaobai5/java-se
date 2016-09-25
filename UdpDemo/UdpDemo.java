import java.net.*;

public class UdpDemo
{
	public static void main(String args[])throws SocketException
	{
		DatagramSocket send=new DatagramSocket();
		DatagramSocket rece=new DatagramSocket(10020);
		new Thread(new UdpSend(send)).start();
		new Thread(new UdpReceive(rece)).start();
	}
}
