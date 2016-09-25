public class LeastPaperTest
{
	public static void main(String[] args)
	{
		double price=Keyboard.getDouble("please input the price:");
		if(price>5 || price<0)
			System.out.println("invalid input");
		int num=LeastPaper.leastPaper(price,5);
		System.out.println(num);
	}
}
