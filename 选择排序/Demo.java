/*
选择排序的原理以及位运算交换两数的值
*/

class Demo
{
	public static void main(String[] args)
	{
		int[] array=new int[]{23, 243, 65, 7, 89, 12, 0};
		draw(array);
		sort(array);
		draw(array);
	}
	//自定义函数，传入一个数组，实现选择排序。由于数组是在堆内存中，如同C在堆中申请的地址	，不存在没有返回值得时候不能交换传入的值得情况
	public static void sort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
				{	//此处利用位运算进行值交换，不用定义第三个变量。
					arr[i]=arr[i]^arr[j];
					arr[j]=arr[i]^arr[j];
					arr[i]=arr[i]^arr[j];
				}
			}
		}
	}
	//自定义函数，传入一个数组，实现依次打印数组的值。
	public static void draw(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		} 
		System.out.println();
	}
}