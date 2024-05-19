package subtask1;

public class Sedan extends Car {

    private int numberOfDoors;
    private int trunkCapacity;
    private String luxuryLevel;

    public Sedan(String fuelType, int numberOfDoors, int trunkCapacity, String luxuryLevel) {
        super(fuelType);
        this.numberOfDoors = numberOfDoors;
        this.trunkCapacity = trunkCapacity;
        this.luxuryLevel = luxuryLevel;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public int getTrunkCapacity() {

        return trunkCapacity;
    }

    public String getLuxuryLevel() {
        return luxuryLevel;
    }
}
