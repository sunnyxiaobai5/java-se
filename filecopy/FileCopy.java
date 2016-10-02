/*
 * 文件复制：通过接受两个命令行参数进行文件复制
 * 1.建立文件输入输出流
 * 2.复制文件
 * 3.关闭输入输出流
 */

import java.io.*;

class File
{
	private static String src;
	private static String dest;
	private static BufferedReader fin; 
	private static BufferedWriter fout; 
	File(String src,String dest)
	{
		this.src=src;
		this.dest=dest;
	}

 	// 1.建立文件输入输出流
	private static boolean open()
	{
		boolean flag=true;
		try
		{
			fin=new BufferedReader(new FileReader(src));
		}
		catch(Exception e)
		{
			flag=false;
			System.out.println("open error with: "+src);
		}

		try
		{
			fout=new BufferedWriter(new FileWriter(dest));	
		}
		catch(Exception e)
		{
		       	flag=false;
			System.out.println("open error with: "+dest);
		}
		return flag;
	}

 	// 2.复制文件
	private static boolean copy()
	{
		boolean flag=true;
		String line=null;
		while(true)
		{
			try
			{
				if((line=fin.readLine())==null)
					break;
			}
			catch(Exception e)
			{
				System.out.println("read error with: "+src);
				flag=false;
			}

			try
			{
				fout.write(line);	
				fout.newLine();
			}
			catch(Exception e)
			{
				System.out.println("read error with: "+dest);
				flag=false;
			}
		}
		return flag;
	}

 	// 3.关闭输入输出流
	private static boolean close()
	{
		boolean flag=true;
		try
	       	{
			fin.close();
		}	
		catch(Exception e)
		{
			System.out.println("close error with: "+fin);
			flag=false;
		}
		try
	       	{
			fout.close();
		}	
		catch(Exception e)
		{
			flag=false;
			System.out.println("close error with: "+fout);
		}
		return flag;
	}
	public static boolean copyFile()
	{
		return (open() && copy() && close());
	}
}
public class FileCopy
{
	public static void main(String args[])
	{
		if(args.length!=2)
		{
			System.out.println("please input 2 file names");
		}
	       	new File(args[0],args[1]).copyFile();	
	}
}
