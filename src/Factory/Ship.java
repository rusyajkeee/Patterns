package Factory;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Successfully delivered through sea by Factory.Ship");
    }
}
