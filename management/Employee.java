package management;

public class Employee {
    protected double baseSalary;

    public Employee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Method to be overridden
    public double calculateSalary() {
        return baseSalary;
    }

}
