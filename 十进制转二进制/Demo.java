class Demo
{
	public static void main(String[] args)
	{
		decimalToBinary(10);
		decimalToBinary_1(15);
	}
	//�˺����л�ȡ������ÿλ��ֵͨ����ģ
	public static void decimalToBinary(int integer)
	{
		StringBuffer a= new StringBuffer();//�����Ŀ����������һ���������ڴ洢����
		while(integer>0)
			{
				a.append(integer%2);//�����ݴ��������
				integer=integer/2;
				//System.out.println(integer%2);
			}
			System.out.println(a.reverse());//��()��ֻ��a����˳���ӡ�����е�ֵ��a.reverse�������ӡ�����е�ֵ
	}
	//�˺����л�ȡ������λͨ��λ����;
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