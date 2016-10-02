import java.lang.Math;
public class CountRandom
{
	public static void main(String[] args)
	{
		int max,min,count=0;
		max=min=(int)(100*Math.random());
		if(max>50)
			count++;
		for(int i=0;i<100;i++)
		{
			int ran=(int)(100*Math.random());
			max=max>ran?max:ran;
			min=min<ran?min:ran;
			if(ran>50)
				count++;
		}
		System.out.println("Max:"+max);
		System.out.println("Min:"+min);
		System.out.println("Greater than 50:"+count);
	}
}
