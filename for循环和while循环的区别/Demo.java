/*
while循环条件变量和for循环条件变量作用域的差别
while循环条件变量只能定义在循环外，因此循环结束之后其任然存在，for循环条件变量若定义在循环内，则在循环结束后变量将消失
*/

class Demo
{
	public static void main(String[]args)
	{
		int i=1;
		while(i<5)
		{	

			System.out.println("i="+i);
			i++;
		}
		System.out.println("括号外的i为"+i);
		for(int j=0;j<5;j++)
		{
			System.out.println("j="+j);	
		}
		//System.out.println("括号外的j"+j)		
	}

}
