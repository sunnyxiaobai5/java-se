package seconddispatch;

public class FemaleDriver extends Driver{
    public void drives(Vehicle vehicle)
    {
        vehicle.getDriverByFemale(this);
    }
}
