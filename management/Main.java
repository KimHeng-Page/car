package management;

public class Main {

    public static void main(String[] args) {

        Employee emp1 = new Manager(1000, 300); // Polymorphism
        Employee emp2 = new Developer(800, 20, 10); // Polymorphism

        System.out.println("Manager Salary: $" + emp1.calculateSalary());
        System.out.println("Developer Salary: $" + emp2.calculateSalary());
    }
}