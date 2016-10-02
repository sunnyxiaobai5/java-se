/*
for循环条件读取顺序，首先初始化表达式，然后条件表达式，然后代码块，然后第三个表达式。
*/

class Demo
{
	public static void main(String[] args)
	{
		int i=1;
		for(System.out.println('a');i<10;System.out.println('c'),i++)
		{
			System.out.println('d');
		}
	}
}