//扶植=与+=的在关于不同数据类型时的不同处理方式，精度提升
class Demo
{
	public static void main(String[] args)
	{
		short a,b,c,e;
		e=1;
		a=2*2*2*2*2*2*2*2*2*2*2*2*2*2*2-1;//short为两个字节，并且是signd数据。首位表示正负。


		//b=5+32767;//此运算为两次运算，先算b+5，由于5在内存中占四个字节，运算结果提升为int型的，然后赋值给左边的b，但是左边的b是short型的，所以会丢失精度，出错。
		System.out.println(c=3);//此运算为一次运算，虽然3在内存中是占四个字节，但是在把3赋给c的时候，由于3在c能容纳的范围内，所以不会出错。
		System.out.println(e+=32768);//此运算为一次运算，会将两边的和值赋e，因此最高位将有值，所以变成负数。
		c+=5;
		System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
	}
}