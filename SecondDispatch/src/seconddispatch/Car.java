package seconddispatch;

public class Car extends Vehicle{
    public void getDriverByMale(Driver driver)
    {
        System.out.println("a "+ driver.getClass().getName()+" drives a car");
    }
    public void getDriverByFemale(Driver driver)
    {
        System.out.println("a "+driver.getClass().getName()+" drives a car");
    }
}
