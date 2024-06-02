import java.util.ArrayList;
import java.util.List;

public class Subtask1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);
        numbers.add(5);
        numbers.add(5);

        int sum = numbers.stream()
                .distinct()
                .filter(n -> n % 2 == 0)
                .reduce(0, Integer::sum);

        System.out.println("Сумма четных элементов без дубликатов: " + sum);
    }
}
