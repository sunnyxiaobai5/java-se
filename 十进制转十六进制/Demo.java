/*
十进制转十六进制：通过位运算依次取出二进制的四位，转换成十六进制数值。
第一种方式依次打印出其值，但其值是反向的。第二种方式取出其值后存入一个容器中，最后打印出，可按容器逆向打印出来，即转换后的正确顺序。
*/
class Demo
{
	public static void main(String[] args)
	{
		decimalToHex(60);
		decimalToHex_1(60);
	}

	public static void decimalToHex(int number)
	{
		for (int i=0;i<8 ;i++ )
		{
			int temp = number & 15;//通过位运算取出末四位
			if(temp > 9)
			{
				System.out.print((char)(temp-10+'A'));//大于9时强制转换成对应的字母
			}
			else
			{
				System.out.print(temp);//小于9时直接打印出数字
			}
			number = number >>> 4;//每次循环结束后把当前数值右移四位
		}
		System.out.println();
	}

	public static void decimalToHex_1(int number)
	{
		StringBuffer a = new StringBuffer(); 
		for(int i=0;i<8;i++)
		{
			int temp = number & 15;//通过位运算取出末四位
			if(temp > 9)
			{
				char c = (char)(temp-10+'A');//大于9时强制转换成对应的字母
				a.append(c);//将转换后的字母存入容器
			}
			else
			{
				a.append(temp);//小于9时直接将数字存入容器
			}
			number = number >>> 4;//每次循环结束后把当前数值右移四位
		}
		System.out.println(a);//顺序打印出容器中的值，其值与所求值相反
		System.out.println(a.reverse());//逆序打印出转换后的值，即所求值
	}
}