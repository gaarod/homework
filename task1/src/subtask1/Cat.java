package subtask1;

public class Cat extends Animal {
    String color;

    public Cat() {
        super();
        this.color = "Unknown";
    }

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    public void scratch() {
        System.out.println("Scratching...");
    }
}
