class Demo
{
	public static void main(String[] args)
	{
		drawHr(20);
		draw(12,20);
		drawHr(20);	
	}
//自定义函数，打印一个矩形，传入两个int型参数，分别代表长和宽。
	public static void draw(int rows,int cols)
	{
		for(int i=0;i<rows;i++)
		{	
			for(int j=0;j<cols;j++)
				{
				System.out.print('*');
				}
		System.out.println();
		}
	}
//自定义函数，打印直线，传入一个int型参数，代表直线长度。	
	public static void drawHr(int width)
	{	
		for(int i=0;i<width;i++)
		{
			System.out.print('-');	
		}
		System.out.println();
	}
}