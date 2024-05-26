import java.util.LinkedList;

public class Subtask2 {
    public static void main(String[] args) {

        LinkedList<String> countries = new LinkedList<>();

        countries.addFirst("Франция");
        countries.addFirst("Германия");
        countries.addLast("Япония");
        countries.addLast("Австралия");
        System.out.println("Список стран: " + countries);

        countries.removeFirst();
        countries.removeLast();
        System.out.println("После удаления элементов из начала и конца списка: " + countries);

        String firstElement = countries.getFirst();
        String lastElement = countries.getLast();
        System.out.println("Первый элемент: " + firstElement);
        System.out.println("Последний элемент: " + lastElement);
    }
}
