package Factory;

public class Factory {
    public static Transport create(String how) {
        if(how.equals("land"))
            return new Truck();
        if(how.equals("sea"))
            return new Ship();

        return new Drone();

    }

    public static void main(String[] args) {
        Transport a = Factory.create("land");
        a.deliver();
        Transport b = Factory.create("air");
        b.deliver();
    }
    }
