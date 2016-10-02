public class LeastPaper
{
	public static int leastPaper(double price,double money)
	{
		int num=0;
		int back=(int)(100*(money-price));
		if(back>=10000 || back<0)
		{
			return -1;
		}
		else if(back==0)
		{
			return 0;
		}
		else			
		{
			num+=back/5000;
			back%=5000;
			num+=back/2000;
			back%=2000;
			num+=back/1000;
			back%=1000;
			num+=back/500;
			back%=500;
			num+=back/200;
			back%=200;
			num+=back/100;		
			back%=100;
			num+=back/50;
			back%=50;
			num+=back/20;
			back%=20;
			num+=back/10;
			back%=10;
			num+=back/5;
			back%=5;
			num+=back/2;
			back%=2;
			num+=back/1;
			return num;
		}
	}
}
