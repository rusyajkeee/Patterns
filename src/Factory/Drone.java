package Factory;

public class Drone implements Transport{
    @Override
    public void deliver() {
        System.out.println("Successfully delivered through air by Factory.Drone");
    }
}
