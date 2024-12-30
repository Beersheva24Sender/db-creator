package telran.employees;

public class WageEmployee extends Employee {
    private double wage;
    private int hours;

    public WageEmployee(int id, String department, double basicSalary, double wage, int hours) {
        super(id, department, basicSalary);
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    public String[] toCsvRow(){
        return new String[]{String.valueOf(super.getId()), super.getDepartment(), String.valueOf(super.getBasicSalary()), "WageEmployee", String.valueOf(wage), String.valueOf(hours)};
    }
}
