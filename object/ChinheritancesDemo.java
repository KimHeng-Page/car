package object;

public class ChinheritancesDemo {
    public static void main(String[] args){
        //object Person
        Person p = new Person();
        p.display();
        p.setName("dara");
        System.out.println(". Name: " + p.getName());

        //object Student
        Student stu = new Student();
        stu.display();
        stu.setName("Bopha");
        System.out.println(". Name: " + stu.getName());
        stu.displayMajor();
    }
}
