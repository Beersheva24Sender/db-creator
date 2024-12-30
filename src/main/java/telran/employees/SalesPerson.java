package telran.employees;

public class SalesPerson extends Employee {
    private double percent;
    private double sales;

    public SalesPerson(int id, String department, double basicSalary, double percent, double sales){
        super(id, department, basicSalary);
        this.percent = percent;
        this.sales = sales;
    }

    @Override
    public String[] toCsvRow() {
        return new String[] { String.valueOf(super.getId()), super.getDepartment(),
                String.valueOf(super.getBasicSalary()), "SalesPerson", String.valueOf(percent), String.valueOf(sales) };
    }

}
