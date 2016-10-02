public class Complex
{
	private double realPart;
	private double imaginPart;
	Complex()
        {
            this(0,0);
        }	
	Complex(double realPart,double imaginPart)
	{
		this.realPart=realPart;
		this.imaginPart=imaginPart;
	}        
	public void setRealPart(double realpart)
	{
		this.realPart=realPart;
	}
	public double getRealPart()
	{
		return realPart;
	}
	public void setImaginPart(double imaginPart)
	{
		this.imaginPart=imaginPart;
	}
	public double getImaginPart()
	{
		return imaginPart;
	}
	public Complex complexAdd(Complex a)
        {
            Complex c=new Complex();
            c.realPart=this.realPart+a.realPart;
            c.imaginPart=this.imaginPart+a.imaginPart;
            return c;
        }
	public Complex complexSub(Complex a)
        {
            Complex c=new Complex();
            c.realPart=this.realPart-a.realPart;
            c.imaginPart=this.imaginPart-a.imaginPart;
            return c;
        }
        public Complex complexMultiplication(Complex a)
        {
            Complex c=new Complex();
            c.realPart=this.realPart*a.realPart-this.imaginPart*a.imaginPart;
            c.imaginPart=this.imaginPart*a.realPart+this.realPart*a.imaginPart;
            return c;
        }
        public String toString()
        {
            String s1="The realpart is "+this.realPart+"\n";
            String s2="The imaginpart is "+this.imaginPart+"i";
            return (s1+s2);
        }	
}