import java.io.*;
public class Keyboard
{
	static BufferedReader inputStream = new BufferedReader(new InputStreamReader(System.in));
	public static int getInteger()
	{
		boolean flag=false;
		int num=0;
		while(!flag)
		{
			try
			{
				num=(Integer.valueOf(inputStream.readLine().trim()).intValue());
				flag=true;
			}
			catch(Exception e)
			{
				System.out.print("please input again:");
			}
		}
		return num;
	}
	public static int getInteger(String str)
	{
		System.out.print(str);
		boolean flag=false;
		int num=0;
		while(!flag)
		{
			try
			{
				num=(Integer.valueOf(inputStream.readLine().trim()).intValue());
				flag=true;
			}
			catch(Exception e)
			{
				System.out.print("please input again:");
			}
		}
		return num;
	}

	public static String getString()
	{
		try
		{
			return (inputStream.readLine().trim());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return "0";
		}
	}
	public static String getString(String str)
	{
		System.out.print(str);
		try
		{
			return (inputStream.readLine().trim());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return "0";
		}
	}

	public static float getFloat()
	{
		boolean flag=false;
		float num=0;
		while(!flag) {
			try
			{
				num=(Float.valueOf(inputStream.readLine().trim()).floatValue());
				flag=true;
			}
			catch(Exception e)
			{
				System.out.println("please input again:");
			}
		}
		return num;			
	}
	public static float getFloat(String str)
	{
		System.out.print(str);
		boolean flag=false;
		float num=0;
		while(!flag) {
			try
			{
				num=(Float.valueOf(inputStream.readLine().trim()).floatValue());
				flag=true;
			}
			catch(Exception e)
			{
				System.out.println("please input again:");
			}
		}
		return num;			
	}
	public static double getDouble()
	{
		boolean flag=false;
		double num=0;
		while(!flag)
		{
			try
			{
				num=(Double.valueOf(inputStream.readLine().trim()).doubleValue());
				flag=true;
			}
			catch(Exception e)
			{
				System.out.println("please input again:");
			}
		}
		return num;
	}
	public static double getDouble(String str)
	{
		System.out.print(str);
		boolean flag=false;
		double num=0;
		while(!flag)
		{
			try
			{
				num=(Double.valueOf(inputStream.readLine().trim()).doubleValue());
				flag=true;
			}
			catch(Exception e)
			{
				System.out.println("please input again:");
			}
		}
		return num;
	}
}
