/*
�ࣺ�����п��Դ�������������֤����Զ�������
����Ŀ������ע���Ա�����;ֲ������Ĳ��
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