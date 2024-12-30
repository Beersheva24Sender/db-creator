package telran.employees;

public class Manager extends Employee{
    private double factor;

    public Manager(int id, String department, double basicSalary, double factor) {
        super(id, department, basicSalary);
        this.factor = factor;
    }

    @Override
    public String[] toCsvRow(){
        return new String[]{String.valueOf(super.getId()), super.getDepartment(), String.valueOf(super.getBasicSalary()), "Manager", String.valueOf(factor)};
    }
}
