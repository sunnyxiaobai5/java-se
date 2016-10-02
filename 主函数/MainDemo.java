/*
主函数：是一个特殊的函数，是程序的入口，可以被jvm调用
主函数定义：
	public：表示访问权限最大
	static：表明其随着类的加载而加载
	void：	表示没有具体的返回值
	main：	并不是关键字，是一个特殊单词，能被jvm识别
	(String[] args):函数的参数，参数类型时一个数组，该数组中的元素是字符串，字符串类型的数组
*/
class MainDemo
{
	//此处为 main 函数的重载，但是其并不能被jvm直接识别，不能作为主函数入口
	public static void main(int x)
	{
		System.out.println(x);
	}
	public static void main(String[] args)//String[]表示参数为数组，args是数组参数名字 即arguments 参数的意思
	{
		System.out.println(args);//此处从打印结果可以看出jvm向main函数传入的是数组
		System.out.println(args.length);//从打印结果可以看出main函数传入的是0个元素
		System.out.println(args[0]);//此处若打印将出错，因为其传入的一个元素，脚标为0
		System.out.println(args[2]);//为保证运行时不出错，此处应该至少传入三个参数给main函数
		String[] arr ={"1111","2222","3333","4444","5555","6666"};
		TestDemo.main(arr);
	}
}
class TestDemo
{
	public static void main(String[] args)
	{
		for(int i=0;i<args.length;i++)
			System.out.println(args[i]);
	}
}
/*
main函数只能传入两种值
  String[] args = new String[0]
  String[] args = null
编译时用的javac是启动编译器
          java是启动底层的虚拟机，把类名穿个了虚拟机，然后由虚拟就调用main函数，若在调用java时，在写了类名之后再写下参数，其表示的是主函数参数
		  如函数中存在 这样的语句 System.out.println(args[0]) 然后在调用java命令的时候写 java MainDemo 4 5 6  则其会打印出4   因为其将4 5 6依次存入了参数数组
*/
