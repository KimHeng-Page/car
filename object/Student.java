package object;

public class Student extends Person{
    //feild or method of person
    @Override
    public void display(){
        System.out.println("Student Class");
    }

    public void displayMajor(){
        System.out.println("IT Center");
    }
}
