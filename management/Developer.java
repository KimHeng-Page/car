package management;

public class Developer extends Employee {
    private int overtimeHours;
    private double overtimeRate;

    public Developer(double baseSalary, int overtimeHours, double overtimeRate) {
        super(baseSalary);
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + (overtimeHours * overtimeRate);
    }
}
