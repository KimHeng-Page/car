package java6;
public class account{
class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int raiseSalary(int percent) {
        this.salary += this.salary * percent / 100;
        return this.salary;
    }

    @Override
    public String toString() {
        return "Employee[id=" + id +
               ",name=" + firstName + " " + lastName +
               ",salary=" + salary + "]";
    }
}

class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            balance -= amount;
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account[id=" + id +
               ",name=" + name +
               ",balance=" + balance + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("          EMPLOYEE & ACCOUNT DEMO        ");
        System.out.println("=========================================");
        System.out.println();

        System.out.println("=== EMPLOYEE DEMO ===");
        Employee emp = new Employee(101, "Sokha", "Kim", 1800);
        System.out.println(emp);
        System.out.println("Monthly salary    : " + emp.getSalary());
        System.out.println("Annual salary     : " + emp.getAnnualSalary());
        System.out.println("Full name         : " + emp.getName());

        emp.raiseSalary(10);
        System.out.println("After 10% raise   : " + emp.getSalary());
        System.out.println("New annual salary : " + emp.getAnnualSalary());
        System.out.println();

    
        System.out.println("=== ACCOUNT DEMO ===");
        Account a1 = new Account("A001", "Sokha", 5000);
        Account a2 = new Account("A002", "Vannak", 800);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println();

        a1.credit(2000);
        System.out.println("After deposit 2000          : " + a1);

        a1.debit(3000);
        System.out.println("After withdraw 3000         : " + a1);

        System.out.print("Trying to withdraw 10000    : ");
        a1.debit(10000);
        System.out.println("Balance after failed debit  : " + a1);

        a1.transferTo(a2, 2500);
        System.out.println("After transfer 2500 to a2   : ");
        System.out.println("  From: " + a1);
        System.out.println("    To: " + a2);

        System.out.print("Trying to transfer 6000     : ");
        a1.transferTo(a2, 6000);
        System.out.println("Balance after failed transfer: ");
        System.out.println("  From: " + a1);
        System.out.println("    To: " + a2);
    }
}
}