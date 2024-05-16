package subtask1;

public class Dog extends Animal {
     private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Dog() {
        super();
        this.breed = "Unknown";
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    public void fetch() {
        System.out.println("Fetching...");
    }
}
