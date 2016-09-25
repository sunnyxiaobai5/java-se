/***************************************
 Gcd:Greatest Common Divisor 最大公约数
 Lcm:Lowest Common Multiple  最小公倍数
***************************************/
public class GcdAndLcm
{
	public static int gcd(int num1,int num2)
	{
		if(num2>num1)
		{
			num1=num2^num1;
			num2=num2^num1;
			num1=num2^num1;
		}
		while(num1 % num2 != 0)
		{
			int temp=num1;
			num1=num2;
			num2=temp % num2;
		}
		return num2;
	}
	public static int lcm(int num1,int num2)
	{
		return (num1*num2/gcd(num1,num2));	
	}
}
