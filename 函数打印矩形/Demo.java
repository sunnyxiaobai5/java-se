class Demo
{
	public static void main(String[] args)
	{
		drawHr(20);
		draw(12,20);
		drawHr(20);	
	}
//�Զ��庯������ӡһ�����Σ���������int�Ͳ������ֱ�����Ϳ�
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
//�Զ��庯������ӡֱ�ߣ�����һ��int�Ͳ���������ֱ�߳��ȡ�	
	public static void drawHr(int width)
	{	
		for(int i=0;i<width;i++)
		{
			System.out.print('-');	
		}
		System.out.println();
	}
}