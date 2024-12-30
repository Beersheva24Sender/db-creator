package telran.employees;

import java.util.*;
import java.util.stream.IntStream;

public class EmployeeDataGenerator {
    private static Random random = new Random();

    public static int generateRandomInt(int min, int max) {
        return random.nextInt(max - min) + min;
    }

    public static double generateRandomDouble(double min, double max) {
        return random.nextDouble() * (max - min) + min;
    }

    public static List<Employee> generateEmployees() {
        List<Employee> employees = new ArrayList<>();

        employees.addAll(generateDepartmentEmployees("QA", 1, 2, 10));
        employees.addAll(generateDepartmentEmployees("Development", 1, 0, 30));
        employees.addAll(generateDepartmentEmployees("Devops", 1, 5, 0));
        employees.addAll(generateDepartmentEmployees("Sales", 1, 3, 0));

        return employees;
    }

    private static List<Employee> generateDepartmentEmployees(String department, int managers, int employees, int wageEmployees) {
        return generateDepartmentEmployees(department, managers, employees, wageEmployees, 0);
    }

    private static List<Employee> generateDepartmentEmployees(String department, int managers, int employees, int wageEmployees, int salesPersons) {
        List<Employee> result = new ArrayList<>();

        IntStream.range(0, managers).forEach(i -> 
            result.add(new Manager(generateRandomInt(1000, 9999), department, 
                generateRandomDouble(5000, 50000), generateRandomDouble(1.5, 4))));

        IntStream.range(0, wageEmployees).forEach(i -> 
            result.add(new WageEmployee(generateRandomInt(1000, 9999), department, 
                generateRandomDouble(5000, 50000), generateRandomDouble(30, 300), 
                generateRandomInt(1, 200))));

        IntStream.range(0, salesPersons).forEach(i -> 
            result.add(new SalesPerson(generateRandomInt(1000, 9999), department, 
                generateRandomDouble(5000, 50000), generateRandomDouble(0.1, 1.5), 
                generateRandomDouble(100, 1000))));

        return result;
    }

}
