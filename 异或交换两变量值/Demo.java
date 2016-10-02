/*
异或快速简单实现两变量值得交换
*/
class Demo
{
	public static void main(String[] args)
	{
		//常规方法,第三个变量。缺点：声明第三个变量，耗费空间
		int a=3,b=8,temp;
		System.out.println("交换前："+"a="+a+",b="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("交换后："+"a="+a+",b="+b);

		//普通运算，两变量进行值交换。缺点：第一步加运算之后，赋给左边的值有可能超过其范围
		int c=3,d=8;
		System.out.println("交换前："+"c="+c+",d="+d);
		c=c+d;
		d=c-d;
		c=c-d;	
		System.out.println("交换后："+"c="+c+",d="+d);
		
		//位运算，两变量进行值交换。注：不存在超过范围的弊端，且运算速度快。
		int e=3,f=8;
		System.out.println("交换前："+"e="+e+",f="+f);
		e=e^f;
		f=e^f;
		e=e^f;
		System.out.println("交换后："+"e="+e+",f="+f);
	}
}