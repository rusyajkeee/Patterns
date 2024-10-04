package Factory;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Successfully delivered through land by Factory.Truck");
    }
}
