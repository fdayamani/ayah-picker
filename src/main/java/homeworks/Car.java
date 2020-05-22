package homeworks;

public class Car {
    private final String make;
    private final String model;
    private final int noOfDoors;
    private final String fuelType;
    private final double mileage;
    private final boolean isAutomatic;

    public Car(String make, String model, int noOfDoors, String fuelType, double mileage, boolean isAutomatic) {
        this.make = make;
        this.model = model;
        this.noOfDoors = noOfDoors;
        this.fuelType = fuelType;
        this.mileage = mileage;
        this.isAutomatic = isAutomatic;
    }
}
