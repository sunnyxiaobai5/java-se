public class GcdAndLcmTest
{
	public static void main(String[] args)
	{
		System.out.print("Please input the second number:");
		int num1=Keyboard.getInteger("Please input the second number:");
		System.out.print("Please input the first number:");
		int num2=Keyboard.getInteger("Please input the second number:");
		System.out.println("Greatest common divisor:"+GcdAndLcm.gcd(num1,num2));
		System.out.println("Lowest common multiple:"+GcdAndLcm.lcm(num1,num2));
	}
}
