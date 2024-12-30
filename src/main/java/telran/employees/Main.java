package telran.employees;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            List<Employee> employees = EmployeeDataGenerator.generateEmployees();
            CsvWriter.writeToCsv("employees.csv", employees);
            System.out.println("CSV file generated successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to CSV: " + e.getMessage());
        }
    }
}
