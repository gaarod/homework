import subtask1.Animal;
import subtask1.Cat;
import subtask1.Dog;
import subtask2.InitExample;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();



        animals.add(new Cat("Kuzya", 1, "white"));
        animals.add(new Dog("Bobik", 2, "yard terrier"));

        for (var animal : animals) {
            animal.makeSound();
        }

        System.out.println(InitExample.getStaticValue());
        InitExample example = new InitExample();
    }
}