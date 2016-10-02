/*
���ֲ��ң����ַ�ʽ����ͬС�졣
		  ��һ��:��min��maxֵ�Ƚ���Ϊѭ��������
		  �ڶ���:��array[mid]ֵ�Ƿ����keyֵ��Ϊѭ��������
�ҳ��������ݵ�λ�ã�ͨ�����ֲ��ҵķ�ʽ������keyֵ��Ӧ�ô�ŵ�λ�ã����ֲ���������ʹ���������˼�롣
*/

class Demo
{
	public static void main(String[] args)
	{
		int[] array=new int[] {6,12,45,56,78,90,100};
		int i=32;
		System.out.println("ͨ����һ�ַ�ʽ��ȡkey��λ�ã�"+half(array,i));
		System.out.println("ͨ���ڶ��ַ�ʽ��ȡkey��λ�ã�"+half_1(array,i));
		System.out.println("ͨ����һ�ַ�ʽ��ȡkeyӦ�ò����λ�ã�"+getIndex(array,i));
	}

	//���ֲ��Һ�����һ�ַ�ʽ.
	public static int half(int [] array,int key)//����һ�������һ������ͨ�����ַ����������в��Ҹ����������ڣ����ظ������ڽű꣬�����ڣ�����-1��
	{
		int min=0, max=array.length-1, mid;
		while(min<=max)//��min��maxֵ�Ƚ���Ϊѭ��������
		{
			mid=(min+max)/2;
			if(key>array[mid])//��keyֵ������ֵ������м�ֵ�ұ�һλ��Ϊ��Сֵ������ѭ��
			{
				min=mid+1;
			}
			else if(key<array[mid])//��keyֵС����ֵ������м�ֵ���һλ��Ϊ���ֵ������ѭ��
			{
				max=mid-1;
			}
			else return mid;//��minС��max������£�����������������㣬��˵����ǰmidֵ��Ϊ��key��ȵ�ֵ���ڽű꣬���ҵ��𰸣����ظ�ֵ
		}
		return -1;//��minֵ����maxֵʱ������-1����ʾû���ҵ���
	}

	//���ֲ��Һ����ڶ��ַ�ʽ.
	public static int half_1(int [] array,int key)
	{
		int min=0, max=array.length-1, mid;
		mid=(min+max)/2;
		while(key!=array[mid])//��array[mid]ֵ�Ƿ����keyֵ��Ϊѭ��������
		{
			if(key>array[mid])
			{
				min=mid+1;
			}
			else if(key<array[mid])
			{
				max=mid-1;
			}
			//���û���ҵ��𰸣�ѭ����������
			if(min>max)
			{
				return -1;
			}
			mid=(min+max)/2;
		}
		return mid;
	}

	//ͨ����һ�ַ�ʽ����keyֵ���ô�ŵ�λ�ã���������ֵͬ���򷵻ظ�ֵ����ֱ�Ӳ�����ԭֵ���ڵط�������������ֵͬ���򷵻�min����Ϊ����λ�á�
	public static int getIndex(int [] array,int key)
	{
		int min=0, max=array.length-1, mid;
		while(min<=max)
		{
			mid=(min+max)/2;
			if(key>array[mid])
			{
				min=mid+1;
			}
			else if(key<array[mid])
			{
				max=mid-1;
			}
			else return mid;
		}
		return min;//����������ֵͬ���򷵻�min����Ϊ����λ�á�
	}

}