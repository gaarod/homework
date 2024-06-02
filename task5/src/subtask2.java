import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class subtask2 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Иван", 35, "IT", 5000));
        employees.add(new Employee("Янис", 28, "HR", 4500));
        employees.add(new Employee("Яни", 32, "IT", 6000));
        employees.add(new Employee("Жан", 31, "HR", 5500));
        employees.add(new Employee("Йонас", 33, "IT", 5500));

        EmployeesOver30(employees);
        ITDepartmentCount(employees);
        MaxSalaryEmployee(employees);
        sortedHRNames(employees);
        AverageSalary(employees);
    }

    public static void EmployeesOver30(List<Employee> employees) {

        List<Employee> employeeList = employees.stream()
                .filter(e -> e.getAge() > 30)
                .sorted(Comparator.comparingInt(Employee::getAge))
                .toList();
        System.out.println("Сотрудники старше 30 лет, отсортированные по возрасту: " + employeeList);
    }

    public static void ITDepartmentCount(List<Employee> employees) {
        long itCount = employees.stream()
                .filter(e -> e.getDepartment().equals("IT"))
                .count();
        System.out.println("Общее количество сотрудников в отделе IT: " + itCount);
    }

    public static void MaxSalaryEmployee(List<Employee> employees) {
        Employee maxSalaryEmployee = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .orElse(null);
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSalaryEmployee.getName());
    }

    public static void sortedHRNames(List<Employee> employees) {
        List<String> hrNames = employees.stream()
                .filter(e -> e.getDepartment().equals("HR"))
                .map(Employee::getName)
                .sorted()
                .toList();
        System.out.println("Имена сотрудников отдела HR, отсортированные по имени: " + hrNames);
    }

    public static void AverageSalary(List<Employee> employees) {
        double averageSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);
        System.out.println("Средняя зарплата всех сотрудников: " + averageSalary);
    }
}
