import subtask1.Animal;
import subtask1.Cat;
import subtask1.Dog;
import subtask2.InitExample;
import subtask4.MathOperations;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();

        Dog dog = new Dog();

        dog.setName("Baron");
        dog.setAge(10);
        dog.setBreed("Bernese Mountain Dog");

        animals.add(dog);
        animals.add(new Cat("Kuzya", 1, "white"));
        animals.add(new Dog("Bobik", 2, "Yard Terrier"));

        for (var animal : animals) {
            animal.makeSound();
        }

        System.out.println(InitExample.getStaticValue());
        InitExample example = new InitExample();

        MathOperations math = new MathOperations();

        System.out.println("Sum of 2 integers: " + math.add(1, 2));
        System.out.println("Sum of 2 doubles: " + math.add(1.5, 2.5));
        System.out.println("Sum of 3 integers: " + math.add(1, 2, 3));


    }
}