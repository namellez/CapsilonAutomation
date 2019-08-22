package airport.entity;

public class PrivatePlane extends Plane {

    @Override
    public void fly() {
        System.out.println("Private plane is flying");
    }

    public PrivatePlane(String brand, int capacity, int tonnage, int range) {
        super(brand, capacity, tonnage, range);
    }
}
