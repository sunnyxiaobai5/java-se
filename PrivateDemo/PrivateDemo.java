/*
private
˽��
��װ����˽�У���װ������˽�е�һ�ֱ�����ʽ
*/
class Person
{
	private int age;
	void speak()
	{
		System.out.println(age);
	}
	public void setAge(int a)
	{
		if(a>0 && a<130)
		age=a;
		else
		System.out.println("���벻�Ϸ�");
	}
	public int getAge()
	{
		return age;
	}
}
class PrivateDemo
{
	public static void main(String[] args)
	{
		Person p=new Person();
		p.setAge(-10);
		p.speak();
	}
}