public class Factorial
{
	public int factorial(int num)
	{
		if(num==0)
			return 1;
		return (num*factorial(num-1));
	}
}