class Demo
{
	public static void main(String[] args)
	{
		decimalToBinary(10);
		decimalToBinary_1(15);
	}
	//此函数中获取二进制每位的值通过求模
	public static void decimalToBinary(int integer)
	{
		StringBuffer a= new StringBuffer();//此语句目的在于申请一个容器用于存储数据
		while(integer>0)
			{
				a.append(integer%2);//将数据存入该容器
				integer=integer/2;
				//System.out.println(integer%2);
			}
			System.out.println(a.reverse());//若()内只有a，则顺序打印出其中的值，a.reverse即逆序打印出其中的值
	}
	//此函数中获取二进制位通过位运算;
	public static void decimalToBinary_1(int integer)
	{
		StringBuffer a=new StringBuffer();
		while (integer>0)
		{
			int temp=integer & 1;
			a.append(temp);
			integer=integer >>> 1;
		}
		System.out.println(a.reverse());
	}
}