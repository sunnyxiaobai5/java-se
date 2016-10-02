/*��ʹ�ñ��˵�class�ļ�ʱ��Ӧ�ð�classpath����Ϊ����class�ļ���λ��*/
/** 
����һ�����Զ����������ز����Ĺ����࣬�������ӡ���飬��ȡ��ֵ����������ȹ��ܡ�
@author sunny_xiaobai5
@version V1.1
*/

public class ArrayTools
{
	/**
	�ղ������캯��
	*/
	private ArrayTools(){}
	
	/**
	��ӡһ�����������Ԫ�ء���ӡ��ʽΪ��element1	element2	...
	@param array ����һ��int������
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
	��ȡint�����е����ֵ
	@param array ����һ��int������
	@return ���������е����ֵ
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
	��ȡint�����е���Сֵ
	@param array ����һ��int������
	@return ���������е���Сֵ
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
	��int�������ð������
	@param array ����һ��int������
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
	��int�������ѡ������
	@param array ����һ��int������
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
	������Ԫ�ؽ���λ�ý���
	@param array ����һ��int����
	@param i Ҫ�û���λ��
	@param j Ҫ�û���λ��
	*/
	private static void ex(int[] array,int i,int j)
	{
		array[i]=array[i]^array[j];
		array[j]=array[i]^array[j];
		array[i]=array[i]^array[j];
	}
}