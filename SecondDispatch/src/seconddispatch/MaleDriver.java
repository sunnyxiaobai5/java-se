package seconddispatch;

public class MaleDriver extends Driver{
    public void drives(Vehicle vehicle)
    {
        vehicle.getDriverByMale(this);
    }
}
