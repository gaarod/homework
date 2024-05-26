import java.util.ArrayList;
import java.util.List;


public class Subtask1 {
    public static void main(String[] args) {

        List<String> countries = new ArrayList<>();

        countries.add("Россия");
        countries.add("Китай");
        countries.add("Индия");
        System.out.println("Список стран: " + countries);

        countries.set(1, "США");
        System.out.println("После замены 2-го элемента: " + countries);

        countries.remove(2);
        System.out.println("После удаления 3-го элемента: " + countries);

        countries.remove("США");
        System.out.println("После удаления элемента по значению: " + countries);

        int index = countries.indexOf("Россия");
        System.out.println("Индекс России: " + index);

        boolean contains = countries.contains("Канада");
        System.out.println("Содержит ли список Канаду: " + contains);
    }
}
