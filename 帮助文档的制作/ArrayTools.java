/*在使用别人的class文件时，应该把classpath设置为你存放class文件的位置*/
/** 
这是一个可以对数组进行相关操作的工具类，该类提打印数组，获取最值，数组排序等功能。
@author sunny_xiaobai5
@version V1.1
*/

public class ArrayTools
{
	/**
	空参数构造函数
	*/
	private ArrayTools(){}
	
	/**
	打印一个数组的所有元素。打印形式为：element1	element2	...
	@param array 接收一个int型数组
	*/
	public static void arrayPrint(int[] array)
	{
		for (int i=0;i<array.length ;i++ )
		{
			System.out.print(array[i]+"\t");
		}
		System.out.println();
	}

	/**
	获取int数组中的最大值
	@param array 接收一个int型数组
	@return 返回数组中的最大值
	*/
	public static int getMax(int[] array)
	{
		int max=0;
		for (int i=1;i<array.length ;i++ )
		{
			if (array[i]>array[max])
			{
				max=i;
			}
		}
		return array[max];
	}

	/**
	获取int数组中的最小值
	@param array 接收一个int型数组
	@return 返回数组中的最小值
	*/
	public static int getMin(int[] array)
	{
		int min=0;
		for (int i=1;i<array.length ;i++ )
		{
			if (array[i]<array[min])
			{
				min=i;
			}
		}
		return array[min];
	}

	/**
	给int数组进行冒泡排序
	@param array 接收一个int型数组
	*/
	public static void arraySortBubbling(int[] array)
	{
		for (int i=0;i<array.length-1 ;i++ )
		{
			for (int j=0;j<array.length-1 ;j++ )
			{
				if (array[j+1]<array[j])
				{
					ex(array,j,j+1);
				}
			}
		}
	}

	/**
	给int数组进行选择排序
	@param array 接收一个int型数组
	*/
	public static void arraySortChoose(int[] array)
	{
		for (int i=0;i<array.length-1 ;i++ )
		{
			for (int j=i+1;j<array.length ;j++ )
			{
				if (array[j]<array[i])
				{
					ex(array,j,i);
				}
			}
		}
	}
	/**
	给数组元素进行位置交换
	@param array 接收一个int数组
	@param i 要置换的位置
	@param j 要置换的位置
	*/
	private static void ex(int[] array,int i,int j)
	{
		array[i]=array[i]^array[j];
		array[j]=array[i]^array[j];
		array[i]=array[i]^array[j];
	}
}