package telran.employees;
import org.apache.commons.csv.*;
import java.io.*;
import java.util.List;

public class CsvWriter {
    public static void writeToCsv(String fileName, List<Employee> employees) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
             CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT
                     .withHeader("ID", "Department", "BasicSalary", "Type", "Factor/Wage/Percent", "Hours/Sales"))) {

            for (Employee employee : employees) {
                printer.printRecord(employee.toCsvRow());
            }
        }
    }
}

