package oop;
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    
    public int getID(){
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getName(){
        return firstName + " " + lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getSalary(){
        return salary * 12;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int giveSalary(int percent){
        this.salary += this.salary * percent / 100;
        return this.salary;
    }

    public String toString(){
        return "employee = id" + id + ", name :" + getName() + ", salary :" + salary ;
    }

    public static void main(String[] args){
         Employee emp = new Employee(101, "Sok", "Chantha", 1200);

        System.out.println(emp);
        System.out.println(". Monthly salary  : " + emp.getSalary());
        System.out.println(". Annual salary   : " + emp.getSalary());
        System.out.println(". Name            : " + emp.getName());

        int newSalary = emp.giveSalary(8);
        System.out.println(". After 8% raise  : " + newSalary);
        System.out.println(". New annual      : " + emp.getSalary());
    }
}
