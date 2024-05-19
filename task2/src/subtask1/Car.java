package subtask1;

public abstract class Car implements Vehicle {

    private String fuelType;

    public Car(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    @Override
    public String getFuelType() {

        return fuelType;
    }

    public abstract int getNumberOfDoors();

    public abstract int getTrunkCapacity();
}
