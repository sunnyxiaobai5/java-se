/*
自定义函数，传入数组参数，返回最大值
由于传入的参数可以是整数数组，也可以是double型等等数组，因此需重载函数。
*/

class Demo
{
	public static void main(String[] args)
	{
		//以下包含静态数组的两种不同初始化方式。
		int[] array={2,6,8,1,0};
		double[] array1=new double[]{ 12.2 , 34.2 , 0 , 32 , 9.5};
		int max=max(array);
		double max1=max(array1);
		System.out.println(max);
		System.out.println(max1);
	}

public static int max(int[] arr)
{
	int max=0;
	for(int i=1;i<arr.length-1;i++)
	{
		if(arr[max]<arr[i])
			max=i;
	}
	return arr[max];
}
//由于此函数与以上函数功能一样，只是传入的参数类型不一样，所以说是重载函数。
public static double max(double[] arr)
{
	int max=0;
	for(int i=1;i<arr.length-1;i++)
	{
		if(arr[max]<arr[i])
			max=i;
	}
	return arr[max];
}

}