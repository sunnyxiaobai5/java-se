package seconddispatch;

public class Bus extends Vehicle{
    public void getDriverByMale(Driver driver)
    {
        System.out.println("a "+driver.getClass().getName()+" drives a bus");
    }
    public void getDriverByFemale(Driver driver)
    {
        System.out.println("a "+driver.getClass().getName()+" drives a bus");
    }
}
