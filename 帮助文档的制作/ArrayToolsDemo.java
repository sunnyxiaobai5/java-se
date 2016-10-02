class ArrayToolsDemo
{
	public static void main(String[] args)
	{
		int[] arr={43,3,56,2,64,67,32,1};
		int[] arr1={43,3,56,2,64,67,32,1};
		int min=ArrayTools.getMax(arr);
		int max=ArrayTools.getMin(arr);
		System.out.println("Min="+min);
		System.out.println("Max="+max);

		System.out.print("数组原样：");
		ArrayTools.arrayPrint(arr);

		ArrayTools.arraySortBubbling(arr);
		System.out.print("冒泡排序：");
		ArrayTools.arrayPrint(arr);

		ArrayTools.arraySortChoose(arr1);
		System.out.print("选择排序：");
		ArrayTools.arrayPrint(arr1);
	}
}