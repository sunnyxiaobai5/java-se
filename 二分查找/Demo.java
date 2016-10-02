/*
二分查找：两种方式，大同小异。
		  第一种:把min和max值比较作为循环条件。
		  第二种:把array[mid]值是否等于key值作为循环条件。
找出插入数据的位置：通过二分查找的方式，返回key值所应该存放的位置，体现插入数据仍使数组有序的思想。
*/

class Demo
{
	public static void main(String[] args)
	{
		int[] array=new int[] {6,12,45,56,78,90,100};
		int i=32;
		System.out.println("通过第一种方式获取key的位置："+half(array,i));
		System.out.println("通过第二种方式获取key的位置："+half_1(array,i));
		System.out.println("通过第一种方式获取key应该插入的位置："+getIndex(array,i));
	}

	//二分查找函数第一种方式.
	public static int half(int [] array,int key)//传入一个数组和一个数，通过二分法，在数组中查找该数，若存在，传回该数所在脚标，不存在，传回-1；
	{
		int min=0, max=array.length-1, mid;
		while(min<=max)//把min和max值比较作为循环条件。
		{
			mid=(min+max)/2;
			if(key>array[mid])//若key值大于中值，则把中间值右边一位作为最小值，接着循环
			{
				min=mid+1;
			}
			else if(key<array[mid])//若key值小于中值，则把中间值左边一位作为最大值，接着循环
			{
				max=mid-1;
			}
			else return mid;//在min小于max的情况下，若以上情况均不满足，则说明当前mid值即为与key相等的值所在脚标，即找到答案，返回该值
		}
		return -1;//当min值大于max值时，返回-1，表示没有找到答案
	}

	//二分查找函数第二种方式.
	public static int half_1(int [] array,int key)
	{
		int min=0, max=array.length-1, mid;
		mid=(min+max)/2;
		while(key!=array[mid])//把array[mid]值是否等于key值作为循环条件。
		{
			if(key>array[mid])
			{
				min=mid+1;
			}
			else if(key<array[mid])
			{
				max=mid-1;
			}
			//如果没有找到答案，循环结束条件
			if(min>max)
			{
				return -1;
			}
			mid=(min+max)/2;
		}
		return mid;
	}

	//通过第一种方式查找key值所该存放的位置，若存在相同值，则返回该值，可直接插入在原值所在地方，若不存在相同值，则返回min，作为插入位置。
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
		return min;//若不存在相同值，则返回min，作为插入位置。
	}

}