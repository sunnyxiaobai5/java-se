/*
类：在类中可以创建主函数，保证类可以独立运行
本例目的在于注意成员变量和局部变量的差别
*/
class car
{
	String color = "red";
	int wheels = 4;
	void run()
	{
		System.out.println(color);
	}
}
class Demo
{
	public static void main(String[] args)
	{
		car car1 = new car();
		car1.color = "blue";
		car1.run();
		car car2 = new car();
		car2.run();
	}
}