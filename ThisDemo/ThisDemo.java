/*
this用法
this代表它所在函数所属对象的引用.
即那个对象在调用this所在的函数，this就代表那个对象
*/
class Person
{
	private String name;
	private int age;
	Person(String name)
	{
		this.name=name;
	}
}