class SortTools
{
	private SortTools(){}
	public static void arraySort(int[] arr)
	{
		for (int i=0;i<arr.length-1 ;i++ )
		{
			for (int j=i+1;j<arr.length ;j++ )
			{
				if (arr[j]<arr[i])
				{
					swap(arr,i,j);
				}
			}
		}
	}

	private static void swap(int[] arr,int a,int b)
	{
		int temp;
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public static void arrayPrint(int[] arr)
	{
		for (int i=0;i<arr.length ;i++ )
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
}