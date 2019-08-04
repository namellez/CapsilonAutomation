package airport.entity;

public class HeavyPlane extends Plane {


    public HeavyPlane(String brand, int capacity, int tonnage, int range) {
        super(brand, capacity, tonnage, range);
    }

    @Override
    public void fly() {
        System.out.println("Heavy plane is flying");
    }

}
