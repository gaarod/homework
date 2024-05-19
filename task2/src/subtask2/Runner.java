package subtask2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<String> hobbies = new  ArrayList<>(Arrays.asList("SuperHero", "ComputerGame" ));
        ImmutablePerson immutablePerson = new ImmutablePerson("Saitama", 25, hobbies);
        System.out.println("ImmutablePerson: " + immutablePerson.getName() + ", " + immutablePerson.getAge() + ", " + immutablePerson.getHobbies());

        //ошибка(
        //immutablePerson.getHobbies().add("Cycling");


        MutablePerson mutablePerson = new MutablePerson("Piter", 25, hobbies);
        System.out.println("MutablePerson before: " + mutablePerson.getName() + ", " + mutablePerson.getAge() + ", " + mutablePerson.getHobbies());
        mutablePerson.setName("Spider-man");
        mutablePerson.setAge(26);

        //не ошибка)
        mutablePerson.getHobbies().add("Cycling");
        System.out.println("MutablePerson after: " + mutablePerson.getName() + ", " + mutablePerson.getAge() + ", " + mutablePerson.getHobbies());
    }
}
