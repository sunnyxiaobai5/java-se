/*
ѡ�������ԭ���Լ�λ���㽻��������ֵ
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
	//�Զ��庯��������һ�����飬ʵ��ѡ�����������������ڶ��ڴ��У���ͬC�ڶ�������ĵ�ַ	��������û�з���ֵ��ʱ���ܽ��������ֵ�����
	public static void sort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
				{	//�˴�����λ�������ֵ���������ö��������������
					arr[i]=arr[i]^arr[j];
					arr[j]=arr[i]^arr[j];
					arr[i]=arr[i]^arr[j];
				}
			}
		}
	}
	//�Զ��庯��������һ�����飬ʵ�����δ�ӡ�����ֵ��
	public static void draw(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		} 
		System.out.println();
	}
}