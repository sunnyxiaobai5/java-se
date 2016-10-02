/*
十进制转二进制：同十进制转十六进制类似。
*/
class Demo
{
	public static void main(String[] args)
	{
		decimalToBinary(15);
		System.out.println();
		System.out.println(Integer.toBinaryString(15));
	}

	public static void decimalToBinary(int number)
	{
		char [] chs =  {'0','1'};
		char [] save = new char[32];
		int i=32;
		while (number != 0)
		{
			int temp = number & 1;
			save[--i] = chs[temp];
			number = number >>> 1;
		}
		for (int pos=i;i<save.length ;i++ )
		{
			System.out.print(save[i]);
		}
	}
}