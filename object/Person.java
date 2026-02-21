package object;

public class Person {
    private String name;
    private int age;
    private String address;
    private double height;

    public Person(){

    }

    public Person(String name, int age, String address, double height){
        this.name = name;
        this.age = age;
        this.address = address;
        this.height = height;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void display(){
        System.out.print("Person Class");
    }
}
