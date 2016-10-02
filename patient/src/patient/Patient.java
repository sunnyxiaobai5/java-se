public class Patient
{
	private String name;
	private char sex;
	private int age;
	private float weight;
	private boolean allergies;
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setSex(char sex)
	{
		this.sex=sex;
	}
	public char getSex()
	{
		return sex;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public void setWeight(float weight)
	{
		this.weight=weight;
	}
	public float getWeight()
	{
		return weight;
	}
	public void setAllergies(boolean allergies)
	{
		this.allergies=allergies;
	}
	public boolean getAllergies()
	{
		return allergies;
	}
}