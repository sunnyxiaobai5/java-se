public class MaxAndMin
{
	public static void main(String[] args)
	{
		int x,y,z;
		System.out.print("please input the first number:");
		x=Keyboard.getInteger();
		System.out.print("please input the second number:");
		y=Keyboard.getInteger();
		System.out.print("please input the third number:");
		z=Keyboard.getInteger();
		if(y>x)
		{
			y=y^x;
			x=y^x;
			y=y^x;
		}
		if(z>y)
		{
			z=z^y;
			y=z^y;
			z=z^y;
			if(y>x)
			{
				y=y^x;
				x=y^x;
				y=y^x;
			}
		}
		System.out.println("max:"+x);
		System.out.println("min:"+z);
	}
}
