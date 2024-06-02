import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Subtask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        try (FileOutputStream outputStream = new FileOutputStream("tms.txt")) {
            outputStream.write(input.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream inputStream = new FileInputStream("tms.txt")) {
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes);
            String output = new String(bytes);
            output = output.replace(" ", "_");
            System.out.println("Output: " + output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
