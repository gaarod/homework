package subtask1;

public class Truck extends Car {

    private int numberOfDoors;
    private int trunkCapacity;
    private int maxLoadCapacity;

    public Truck(String fuelType, int numberOfDoors, int trunkCapacity, int maxLoadCapacity) {
        super(fuelType);
        this.numberOfDoors = numberOfDoors;
        this.trunkCapacity = trunkCapacity;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public int getTrunkCapacity() {
        return trunkCapacity;
    }

    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }
}
