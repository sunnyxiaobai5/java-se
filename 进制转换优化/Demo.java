/*
����ת���Ż�
ԭ��	1.�������ư˽���ʮ����������ͬ������ȡ������дһ������ ������Ҫת������ֵ��λ����Ļ���ֵ�Լ�ƫ������
		ע��a.�ù������������жϴ���ֵ�Ƿ�Ϊ0����Ϊ0��ֱ�Ӵ�ӡ��0Ȼ�󷵻ء�
			b.������ֵ��Ϊ0ʱ�������ѯ�������飬�����ֵ��Ӧ����ַ������ҡ�
			c.���ݻ���ֵȷ����������һ�ֽ���ת�������ƫ����������������Ӧ�ַ����洢��һ���ȶ���Ĺ������ݵ�����֮�С�
		2.�ֱ�Ϊ�����ư˽���ʮ����дһ���������ú���ֻ��һ������������Ҫת����ֵ���ú�������Ϊ��ͬ������ȡ��д�ĺ�����
		���ú�������������������ΪҪת����ֵ�����Ե�λ����ֵ�Լ����Ե�ƫ������
*/
class Demo
{
	public static void main(String[] args)
	{
		System.out.print("--------------------------------------------------------------------------------");
		System.out.println("0ͨ��������ת�����ֵ��");
		toBinary(0);
		toOctal(0);
		toHex(0);
		System.out.print("--------------------------------------------------------------------------------");
		System.out.println("-60ͨ��������ת�����ֵ��");
		toBinary(-60);
		toOctal(-60);
		toHex(-60);
		System.out.print("--------------------------------------------------------------------------------");
		System.out.println("60ͨ��������ת����ֵ��");
		toBinary(60);
		toOctal(60);
		toHex(60);
		System.out.println("--------------------------------------------------------------------------------");
	}

	//������ת������
	public static void toBinary(int number)
	{
		trans(number,1,1);
	}
	//�˽���ת������
	public static void toOctal(int number)
	{
		trans(number,7,3);
	}
	//ʮ������ת������
	public static void toHex(int number)
	{
		trans(number,15,4);
	}

	//���ֽ���ת����ȡ�����Ĺ�������
	public static void trans(int number,int base,int offset)
	{
		//�жϴ���ֵ�Ƿ�Ϊ0��Ϊ0���ӡ�󷵻أ���������һ�����㡣����Ϊ0������ ��һ�����㡣
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