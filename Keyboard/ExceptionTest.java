public class ExceptionTest
{
	public static void main(String [] args)
	{
		int a1=Keyboard.getInteger();
		System.out.println("the number of your input is "+a1);
		int a2=Keyboard.getInteger("Please input an integer:");
		System.out.println("the number of your input is "+a2);

		float b1=Keyboard.getFloat();
		System.out.println("the number of your input is "+b1);
		float b2=Keyboard.getFloat("Please input an integer:");
		System.out.println("the number of your input is "+b2);

		double c1=Keyboard.getDouble();				
		System.out.println("the number of your input is "+c1);
		double c2=Keyboard.getDouble("Please input an integer:");				
		System.out.println("the number of your input is "+c2);

		String st1=Keyboard.getString();
		System.out.println("the String of your input is "+st1);
		String st2=Keyboard.getString("Please input an integer:");
		System.out.println("the String of your input is "+st2);
	}
}
