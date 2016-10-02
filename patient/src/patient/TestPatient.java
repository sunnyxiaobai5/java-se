public class TestPatient
{
	public static void main(String[] args)
	{
		Patient apri1=new Patient();
		apri1.setName("zhangLi");
		apri1.setSex('f');
		apri1.setAge(33);
		apri1.setWeight(154.72f);
		apri1.setAllergies(true);
		System.out.println("Name:	"+apri1.getName());
		System.out.println("Sex:	"+apri1.getSex());
		System.out.println("Age:	"+apri1.getAge());
		System.out.println("Weight	"+apri1.getWeight());
		System.out.println("Allergies	"+apri1.getAllergies());
	}
}