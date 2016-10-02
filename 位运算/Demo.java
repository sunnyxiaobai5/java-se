/*
位运算：位运算速度快于一般的运算，因为其直接操作二进制数，无需转换。
>>:右移运算，其结果相当于将原值初以2的所移动位数次方 eg:6>>2   相当于12/(2*2),结果为3
<<:左移运算，其结果相当于将原值乘以2的所移动的数次方
注：>>高位将补原来最高位的值
    >>>高位始终补0
*/

class Demo
{
	public static void main(String[] args)
	{
		System.out.println(6>>2);
		System.out.println(12>>2);
		System.out.println(6<<2);
		System.out.println(-6>>2);
		System.out.println((-6)>>2);
		System.out.println(-6>>1);
		System.out.println((-6)>>1);
	}
}