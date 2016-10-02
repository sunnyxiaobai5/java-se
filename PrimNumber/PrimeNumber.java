public class PrimeNumber
{
	private static final int N=5;// N决定primeNumber函数每行输出的素数个数
	/* 输出小于num的所有素数，每N个换一行 */
	public static void primeNumber(int num)
	{
		int l=1;// l用于在输出时判断是否换行
		for(int i=2;i<=num;i++)
		{
			int j;
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0)
					break;
			}	
			if(j>i/2 && l%N==0)
			{
				l++;
				System.out.printf("%4d\n",i);
			}
			else if(j>i/2)
			{
				l++;
				System.out.printf("%4d",i);
			}	
		}
	}
	/* 判断num否为素数，若是，则返回true，否者返回false */
	public static boolean isPrime(int num)
	{
		int j;
		for(j=2;j<=num/2;j++)
		{
			if(num%j==0)
				break;
		}
		if(j>num/2 && num>=2)
			return true;
		return false;
	}
		
}	
