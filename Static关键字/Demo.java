/*
static�ؼ��ֵ�ʹ��
	1.��̬����ֻ�ܷ��ʾ�̬��Ա���Ǿ�̬�����ܷ��ʾ�̬��Ա�ͷǾ�̬��Ա
	2.��̬�����в�������this��super�ؼ��֡���Ϊ��̬�����ڶ�������ڣ����Ծ�̬�����в��������this
��̬������
	1.�����Զ���Ĺ������ݵ����洢����Լ�洢�ռ䣬û�б�Ҫÿ�����󶼴洢һ��
		  ����ֱ�ӱ���������
	2.�ף��������ڹ���
		  ���ʳ��־����ԣ�ֻ�ܷ��ʾ�̬
	3.�������Ǿ�̬�ġ���һ�����⺯������Ϊ�������ڣ���jvm����
*/
class StaticPerson
{
	String name;
	static String country="CHINA";
	public static void show()
	{
		//System.out.println(name);������д���ǲ������ģ���̬�������ܵ��÷Ǿ�̬��Ա
		System.out.println(country);
	}
}
class Demo
{
	public static void main(String[] args)
	{
		StaticPerson a=new StaticPerson();
		a.show();
		a.country="ch";
		a.show();
		StaticPerson b=new StaticPerson();//�ı侲̬������ֵ���½����Ķ����侲̬������ֵʱ�ı���ֵ
		b.show();
		StaticPerson.show();//��̬����ֱ�ӱ���������
	}
}