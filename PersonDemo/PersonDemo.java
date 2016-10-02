/*
对象已建立就会调用与之对应的构造函数。
构造函数的作用：可用于给对象初始化。
构造函数细节：当一个类中没有定义构造函数的时候，系统会默认给该类添加空参数的构造函数。
			  当在该类中自定义了构造函数之后，默认的构造函数就不存在了。

构造函数和一般函数在写法上不同。
在运行时也不同。
构造函数在对象一建立就运行，给对象初始化。
而一般方法是对象调用才执行，给是对象添加具备的功能。
一个对象建立，构造函数只运行一次，而一般方法可被对象调用多次。

什么时候定义构造函数?
当分析事物时，该事物所具备的特性和行为，就定义在构造函数中。
*/
class Person
{
	private String name;
	private int age;

	//不带参数的Person()初始化函数
	Person()
	{
		System.out.println("A:name="+name+"  age="+age);
		cry();
	}

	//带age参数的Person(int a)初始化函数
	Person(int a)
	{
		age=a;
		System.out.println("B:name="+name+"  age="+age);
		cry();
	}

	 //带name和age参数的Person(String n,int a)初始化函数
	Person(String n,int a)
	{
		age=a;
		name=n;
		System.out.println("C:name="+name+"  age="+age);
		cry();
	}

	//不带参数的 cry()一般方法函数
	public void cry()
	{
		System.out.println("crying...........");
	}
	
	//不带参数的 getName()函数
	public String getName()
	{
		return name;
	}

	//带参数Sting name的 setName(String n)函数
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
		Person P2=new Person(20);//生成一个修改了age的对象P2。	
		System.out.print("P3: ");
		Person P3=new Person("P3",10);//产生一个修改了name和age的对象P3。
		System.out.println("通过getName方法获取并打印出P3的name值即 "+P3.getName());//通过getName方法获取P3的的name值并打印出来。
		System.out.print("P4: ");
		Person P4=new Person("P4",50);//产生一个修改了name和age的对象P4。
		P4.setName("P4重置");//通过setName方法重置P4的name值。
		System.out.println("通过getName方法获取并打印出P4的重置后name值即 "+P4.getName());//通过getName方法获取P4重置后的name值并打印出来。
	}
}