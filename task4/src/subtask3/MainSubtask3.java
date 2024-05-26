package subtask3;

import java.util.HashSet;
import java.util.Set;

public class MainSubtask3 {
    public static void main(String[] args) {

        Set<Person> people = new HashSet<>();
        Person person1 = new Person("Андрей");
        Person person2 = new Person("Иван");
        Person person3 = new Person("Агафья");

        people.add(person1);
        people.add(person2);
        people.add(person3);

        for (Person person : people) {
            System.out.println("Человек: " + person.getName());
        }

        people.remove(person1);
        people.remove(person2);

        boolean containsAlexey = people.contains(person3);
        System.out.println("Содержится ли person3 в коллекции: " + containsAlexey);
    }
}
