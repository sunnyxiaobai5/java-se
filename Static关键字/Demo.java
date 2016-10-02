/*
static关键字的使用
	1.静态方法只能访问静态成员，非静态方法能访问静态成员和非静态成员
	2.静态方法中不可以有this，super关键字。因为静态优先于对象而存在，所以静态方法中不允许出现this
静态的利弊
	1.利：对对象的共享数据单独存储，节约存储空间，没有必要每个对象都存储一份
		  可以直接被类名调用
	2.弊：生命周期过长
		  访问出现局限性，只能访问静态
	3.主函数是静态的。是一个特殊函数，作为程序的入口，被jvm调用
*/
class StaticPerson
{
	String name;
	static String country="CHINA";
	public static void show()
	{
		//System.out.println(name);这样的写法是不成立的，静态方法不能调用非静态成员
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
		StaticPerson b=new StaticPerson();//改变静态变量的值后，新建立的对象其静态变量的值时改变后的值
		b.show();
		StaticPerson.show();//静态方法直接被类名调用
	}
}