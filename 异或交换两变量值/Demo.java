/*
�����ټ�ʵ��������ֵ�ý���
*/
class Demo
{
	public static void main(String[] args)
	{
		//���淽��,������������ȱ�㣺�����������������ķѿռ�
		int a=3,b=8,temp;
		System.out.println("����ǰ��"+"a="+a+",b="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("������"+"a="+a+",b="+b);

		//��ͨ���㣬����������ֵ������ȱ�㣺��һ��������֮�󣬸�����ߵ�ֵ�п��ܳ����䷶Χ
		int c=3,d=8;
		System.out.println("����ǰ��"+"c="+c+",d="+d);
		c=c+d;
		d=c-d;
		c=c-d;	
		System.out.println("������"+"c="+c+",d="+d);
		
		//λ���㣬����������ֵ������ע�������ڳ�����Χ�ı׶ˣ��������ٶȿ졣
		int e=3,f=8;
		System.out.println("����ǰ��"+"e="+e+",f="+f);
		e=e^f;
		f=e^f;
		e=e^f;
		System.out.println("������"+"e="+e+",f="+f);
	}
}