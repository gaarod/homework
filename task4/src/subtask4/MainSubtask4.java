package subtask4;

import java.util.ArrayList;
import java.util.List;

public class MainSubtask4 {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Иван", "19", 1, new int[]{3, 4, 5}));
        students.add(new Student("Мария", "29", 2, new int[]{2, 2, 4}));
        students.add(new Student("Бейбарыс", "29", 2, new int[]{2, 3, 3}));
        students.add(new Student("Анна", "39", 3, new int[]{4, 5, 5}));


        removeStudentsWithLowGrades(students);

        printStudents(students, 2);

    }

    public static void removeStudentsWithLowGrades(List<Student> students) {
        List<Student> removeList = new ArrayList<>();
        for(Student student : students){
            if (student.getAverageGrade() < 3) {
                removeList.add(student);
            }else {
                System.out.println("Студент " + student.getName() + " переведен на следующий курс" );
                student.setCourse(student.getCourse() + 1);
            }
        }
        students.removeAll(removeList);
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println("Студент: " + student.getName());
            }
        }
    }
}
