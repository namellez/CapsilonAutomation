package airport.entity;

public abstract class Plane {

    private String brand;
    private int capacity;
    private int tonnage;
    private int range;


    public Plane(String brand, int capacity, int tonnage, int range) {
        this.brand = brand;
        this.capacity = capacity;
        this.tonnage = tonnage;
        this.range = range;
    }

    @Override
    public String toString() {
        return  brand +
                " capacity: " + capacity +
                " tonnage: " + tonnage +
                " range: " + range;
    }

    public void fly(){};

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

}
