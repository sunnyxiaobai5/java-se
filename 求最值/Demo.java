/*
�Զ��庯������������������������ֵ
���ڴ���Ĳ����������������飬Ҳ������double�͵ȵ����飬��������غ�����
*/

class Demo
{
	public static void main(String[] args)
	{
		//���°�����̬��������ֲ�ͬ��ʼ����ʽ��
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
//���ڴ˺��������Ϻ�������һ����ֻ�Ǵ���Ĳ������Ͳ�һ��������˵�����غ�����
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