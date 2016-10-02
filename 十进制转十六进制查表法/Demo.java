/*
十进制转十六进制
原理：	1.定义一个函数，传入数字，通过位运算和查表法，得出其应该转换成的字符
		2.并将这些字符依次传入一个数组
		3.最后逆序打印出数组的值
*/
class Demo
{
	public static void main(String[] args)
	{
		decimalToHex(987654321);
	}

	//该函数传入一个int型数据
	public static void decimalToHex(int number)
	{
		char [] chs = {'0','1','2','3', '4','5','6','7', '8','9','A','B', 'C','D','E','F'};//定义待查表的对应关系
		char [] save = new char[8];//声明用于存储每次结果的数组
		int x = 8;
		while(number != 0)
		{
			int temp = number & 15;
			save[--x] = chs[temp];//从右往左依次存入数据
			number = number >>> 4;
		}
		for (int pos=x ;pos<8 ;pos++ )//顺序打印出结果
		{
			System.out.print(save[pos]);
		}
	}
}