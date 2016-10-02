//字符串数据和任何数据使用+，都是相连接，最后都会变成字符串。
class Demo
{
	public static void main(String[] args)
	{
		System.out.println("shenme"+12);
		System.out.println("字符串数据和任何数据使用+，都是相连接，最后都会变成字符串.");
		System.out.println("5+5"+5+5);
		System.out.println(5+5+"5+5");
		System.out.println("5+5="+5+5);
	}
}