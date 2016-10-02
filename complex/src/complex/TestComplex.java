public class TestComplex
{
    public static void main(String args[])
    {
        //setFont("Times New Roman-20");
        Complex add,sub,mul;
        Complex first = new Complex(31,22);
        Complex second = new Complex(22,21);
        add=first.complexAdd(second);
        sub=first.complexSub(second);
        mul=first.complexMultiplication(second);
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
    }
}