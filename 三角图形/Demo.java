class Demo
{
	public static void main(String[] args)
	{
		System.out.println("================================================");
		for(int i=0;i<=5;i++)
		{	
			for(int j=0;j<=15;j++)//��ӡͼ��ǰ��Ŀհ�����
			{
				System.out.print(" ");		
			}
		
			for(int j=i;j<=5;j++)//��ӡǰ�벿�ֵ�-

			{
				System.out.print("-");		
			}

			System.out.print(" ");//��-��*���紦��ӡһ���ո��Ա�ͺ���ĶԳ�

			for(int j=0;j<=i;j++)//��ӡ*
			{	
				System.out.print("* ");
			}
	
			for(int j=i;j<=5;j++)//��ӡ��벿�ֵ�-
			{
				System.out.print("-");
			}
			System.out.println();
		}
		//�����Ǵ�ӡͼ�ε��°벿�֣������ǶԳƵģ�ԭ��һ������Ӧ�ĵط��ı�
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
