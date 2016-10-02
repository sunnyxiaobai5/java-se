/*
打印九九乘法表。
注意循环控制技巧：
对于正三角，如下：
*
**
***
****
*****
以控制内层循环的终值为宜，可使外层循环的值内为层循环的条件。
对于倒三角,如下
*****
****
***
**
*
以控制内层循环的初值为宜，可使外层循环值内层循环的初值。
*/

class Demo
{
	public static void main(String[] args)
	{
		int i,j;
		for(i=1;i<10;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i+"*"+j+"="+i*j+'\t');
			}
			System.out.println();
		}
	}
}