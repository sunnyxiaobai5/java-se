import java.io.*;
public class FileWrite
{
	public static void main(String[] args)throws Exception
	{
		FileWriter file=new FileWriter("file_writer_test"); 
		String in;
		while(!(in=Keyboard.getString("plese input something or input 0:")).equals("0"))
		{
			file.write(in+"\n");
		}
		file.close();
	}
}
