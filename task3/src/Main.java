import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Main {

    public static void task1(String[] strings){

        String shortest = strings[0];
        String longest = strings[0];
        for (String s : strings) {
            if (s.length() < shortest.length()) {
                shortest = s;
            }
            if (s.length() > longest.length()) {
                longest = s;
            }
        }
        System.out.println("task1");
        System.out.println("Самая короткая строка: " + shortest + " длина: " + shortest.length());
        System.out.println("Самая длинная строка: " + longest + " длина: " + longest.length());
    }

    public static void task2(String[] strings){

        double avgLength = 0;
        for(String s : strings){
            avgLength += s.length();
        }
        avgLength /=strings.length;
        System.out.println("task2");
        for(String s : strings){
            if(s.length()<avgLength){
                System.out.println("Строка: " + s + " длина: " + s.length());
            }
        }

    }

    public static void task3(String[] strings){
        System.out.println("task3");
        String word = findUniqueCharString(strings);
        if(!word.equals("")){
            System.out.println("Слово: " + word);
        }else {
            System.out.println("Нет слова, состоящего только из уникальных символов.");
        }
    }

    private static String findUniqueCharString(String[] strings) {
        for (String str : strings) {
            for(String word : str.split(" ")) {
                if (isUniqueCharString(word)) {
                    return word;
                }
            }
        }
        return "";
    }

    public static boolean isUniqueCharString(String s){
        Set<Character> charSet = new HashSet<>();
        for(char c : s.toCharArray()){
            charSet.add(c);
        }
        return s.length() == charSet.size();
    }

    public static void task4(String str){
        StringBuilder doubledString = new StringBuilder();
        for (char c : str.toCharArray()) {
            doubledString.append(c).append(c);
        }
        System.out.println("task4");
        System.out.println("Преобразованная строка: " + doubledString.toString());
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = 3;
        String[] strings = new String[n];

        for(int i = 0; i < n; i++){
            strings[i] = scanner.nextLine();
        }

        task1(strings);
        task2(strings);
        task3(strings);
        task4(strings[0]);
    }
}