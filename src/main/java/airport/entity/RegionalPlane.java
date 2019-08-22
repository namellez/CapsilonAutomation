package airport.entity;

public class RegionalPlane extends Plane {

    @Override
    public void fly() {
        System.out.println("Regional plane is flying");
    }

    public RegionalPlane(String brand, int capacity, int tonnage, int range) {
        super(brand, capacity, tonnage, range);
    }
}
