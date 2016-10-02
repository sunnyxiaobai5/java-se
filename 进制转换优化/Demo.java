/*
进制转换优化
原理：	1.将二进制八进制十六进制中相同部分提取出来。写一个函数 ，传入要转换的数值，位运算的基础值以及偏移量。
		注：a.该公共函数首先判断传入值是否为0，若为0，直接打印出0然后返回。
			b.当传入值不为0时，构造查询表，即数组，数组键值对应相关字符共查找。
			c.根据基础值确定其属于哪一种进制转换，结合偏移量，挨个求出其对应字符并存储于一事先定义的共存数据的数组之中。
		2.分别为二进制八进制十六进写一个函数，该函数只有一个参数，就是要转换的值，该函数调用为相同部分提取所写的函数，
		调用函数的三个参数，依次为要转换的值，各自的位运算值以及各自的偏移量。
*/
class Demo
{
	public static void main(String[] args)
	{
		System.out.print("--------------------------------------------------------------------------------");
		System.out.println("0通过各进制转换后的值：");
		toBinary(0);
		toOctal(0);
		toHex(0);
		System.out.print("--------------------------------------------------------------------------------");
		System.out.println("-60通过各进制转换后的值：");
		toBinary(-60);
		toOctal(-60);
		toHex(-60);
		System.out.print("--------------------------------------------------------------------------------");
		System.out.println("60通过各进制转后后的值：");
		toBinary(60);
		toOctal(60);
		toHex(60);
		System.out.println("--------------------------------------------------------------------------------");
	}

	//二进制转换函数
	public static void toBinary(int number)
	{
		trans(number,1,1);
	}
	//八进制转换函数
	public static void toOctal(int number)
	{
		trans(number,7,3);
	}
	//十六进制转换函数
	public static void toHex(int number)
	{
		trans(number,15,4);
	}

	//几种进制转换提取出来的公共函数
	public static void trans(int number,int base,int offset)
	{
		//判断传入值是否为0，为0则打印后返回，不进行下一步运算。若不为0，进行 下一步运算。
		if (number == 0)
		{
			System.out.println(0);
			return ;
		}

		char [] chs= {'0','1','2','3', '4','5','6','7', '8','9','A','B', 'C','D','E','F',};
		char [] save = new char[32];
		int i = 32;
		while (number != 0)
		{
			int temp = number & base;
			save[--i] = chs[temp];
			number = number >>> offset;
		}
		for (int pos=i;pos<32 ;pos++ )
		{
			System.out.print(save[pos]);
		}
		System.out.println();
	}
}