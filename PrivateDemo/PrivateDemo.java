/*
private
私有
封装不是私有，封装仅仅是私有的一种表现形式
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
		System.out.println("输入不合法");
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