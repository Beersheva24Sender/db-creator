package telran.employees;

/* properties
Departments: QA, Development, Devops, Sales
QA: Managers - 1, Employees - 2, WageEmployees - 10
Development: Managers - 1, WageEmployees - 30
Devops: Managers - 1, Employees - 5
Sales: Managers - 1, SalesPersons - 3

ranges
id: [1000:9999]
basic_salary: [5000:50000]
factor: [1.5:4]
wage: [30:300]
hours: [1:200]
percent: [0.1:1.5]
sales: any positive number */

public abstract class Employee {
    private int id;
    private String department;
    private double basicSalary;

    public Employee(int id, String department, double basicSalary) {
        this.id = id;
        this.department = department;
        this.basicSalary = basicSalary;
    }

    public abstract String[] toCsvRow();

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public double getBasicSalary() {
        return basicSalary;
    }
}
