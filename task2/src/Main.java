import subtask1.Sedan;
import subtask1.Truck;

public class Main {
    public static void main(String[] args) {

        Sedan sedan = new Sedan( "petrol", 4, 1000, "E");
        System.out.println("Sedan fuel type: " + sedan.getFuelType());
        System.out.println("Sedan number of doors: " + sedan.getNumberOfDoors());
        System.out.println("Sedan trunk capacity: " + sedan.getTrunkCapacity());
        System.out.println("Sedan luxury level: " + sedan.getLuxuryLevel());

        Truck truck = new Truck("diesel", 2, 5000,10000);
        System.out.println("Truck fuel type: " + truck.getFuelType());
        System.out.println("Truck number of doors: " + truck.getNumberOfDoors());
        System.out.println("Truck trunk capacity: " + truck.getTrunkCapacity());
        System.out.println("Truck max load capacity: " + truck.getMaxLoadCapacity());
    }
}