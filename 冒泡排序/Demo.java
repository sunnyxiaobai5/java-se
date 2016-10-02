/*
冒泡排序的算法。
对数组排序，数组元素值交换以及数组元素的打印进行函数封装，提高复用性。
*/
class Demo
{
	public static void main(String[] args)
	{
		int[] array=new int[]{23,54,0,34,212,345,67,3};
		ArrayPrint(array);
		bubbling(array);
		ArrayPrint(array);
	}
	public static void bubbling(int [] array)//该函数传入一个数组名，通过冒泡的方式，实现由小到大的排序
	{
		for (int i=0;i<array.length-1;i++)
		{
			for(int j=0;j<array.length-1;j++)
			if(array[j]>array[j+1])
			{
				ex(array,j,j+1);
			}
		}
	}
	public static void ex(int[]array,int a,int b)//该函数传入一个数组名和两个数组脚标，通过位运算，实现对应数组元素的交换
	{
		array[a]=array[a]^array[b];
		array[b]=array[a]^array[b];
		array[a]=array[a]^array[b];
	}
	public static void ArrayPrint(int [] array)//该函数传入一个数组名，实现数组元素的打印
	{
		for (int i=0;i<array.length ;i++ )
		{
			System.out.print(array[i]+"\t");
		}	
		System.out.println();
	}
}
