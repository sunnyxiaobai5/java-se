/*
�����ѽ����ͻ������֮��Ӧ�Ĺ��캯����
���캯�������ã������ڸ������ʼ����
���캯��ϸ�ڣ���һ������û�ж��幹�캯����ʱ��ϵͳ��Ĭ�ϸ�������ӿղ����Ĺ��캯����
			  ���ڸ������Զ����˹��캯��֮��Ĭ�ϵĹ��캯���Ͳ������ˡ�

���캯����һ�㺯����д���ϲ�ͬ��
������ʱҲ��ͬ��
���캯���ڶ���һ���������У��������ʼ����
��һ�㷽���Ƕ�����ò�ִ�У����Ƕ�����Ӿ߱��Ĺ��ܡ�
һ�������������캯��ֻ����һ�Σ���һ�㷽���ɱ�������ö�Ρ�

ʲôʱ���幹�캯��?
����������ʱ�����������߱������Ժ���Ϊ���Ͷ����ڹ��캯���С�
*/
class Person
{
	private String name;
	private int age;

	//����������Person()��ʼ������
	Person()
	{
		System.out.println("A:name="+name+"  age="+age);
		cry();
	}

	//��age������Person(int a)��ʼ������
	Person(int a)
	{
		age=a;
		System.out.println("B:name="+name+"  age="+age);
		cry();
	}

	 //��name��age������Person(String n,int a)��ʼ������
	Person(String n,int a)
	{
		age=a;
		name=n;
		System.out.println("C:name="+name+"  age="+age);
		cry();
	}

	//���������� cry()һ�㷽������
	public void cry()
	{
		System.out.println("crying...........");
	}
	
	//���������� getName()����
	public String getName()
	{
		return name;
	}

	//������Sting name�� setName(String n)����
	public void setName(String n)
	{
		name=n;
	}
}

class PersonDemo
{
	public static void main(String[] args)
	{
		System.out.print("P1: ");
		Person P1=new Person();
		System.out.print("P2: ");
		Person P2=new Person(20);//����һ���޸���age�Ķ���P2��	
		System.out.print("P3: ");
		Person P3=new Person("P3",10);//����һ���޸���name��age�Ķ���P3��
		System.out.println("ͨ��getName������ȡ����ӡ��P3��nameֵ�� "+P3.getName());//ͨ��getName������ȡP3�ĵ�nameֵ����ӡ������
		System.out.print("P4: ");
		Person P4=new Person("P4",50);//����һ���޸���name��age�Ķ���P4��
		P4.setName("P4����");//ͨ��setName��������P4��nameֵ��
		System.out.println("ͨ��getName������ȡ����ӡ��P4�����ú�nameֵ�� "+P4.getName());//ͨ��getName������ȡP4���ú��nameֵ����ӡ������
	}
}