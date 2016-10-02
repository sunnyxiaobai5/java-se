class Demo
{
	public static void main(String[] args)
	{
		System.out.println("================================================");
		for(int i=0;i<=5;i++)
		{	
			for(int j=0;j<=15;j++)//打印图形前面的空白区域
			{
				System.out.print(" ");		
			}
		
			for(int j=i;j<=5;j++)//打印前半部分的-

			{
				System.out.print("-");		
			}

			System.out.print(" ");//在-和*交界处打印一个空格，以便和后面的对称

			for(int j=0;j<=i;j++)//打印*
			{	
				System.out.print("* ");
			}
	
			for(int j=i;j<=5;j++)//打印后半部分的-
			{
				System.out.print("-");
			}
			System.out.println();
		}
		//以下是打印图形的下半部分，由于是对称的，原理一样，相应的地方改变
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=15;j++)
			{
				System.out.print(" ");		
			}
	
			for(int j=0;j<=i;j++)
			{
				System.out.print("-");		
			}
			System.out.print(" ");
			for(int j=i;j<=5;j++)
			{	
				System.out.print("* ");
			}	
			for(int j=0;j<=i;j++)
			{
				System.out.print("-");
			}
			System.out.println();
		}
		System.out.println("================================================");
	}
}
