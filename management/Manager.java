package management;

public class Manager extends Employee {
    private double bonus;

    public Manager(double baseSalary, double bonus) {
        super(baseSalary); // super keyword
        this.bonus = bonus;
    }

    // Overriding method
    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}
