import java.io.*;
public class FileReade
{
	public static void main(String[] args)throws Exception
	{
		BufferedReader file=new BufferedReader(new FileReader("file_writer_test"));
		String line=file.readLine();	
		System.out.println(line);
		file.close();
	}
}
