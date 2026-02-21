package polimorphism;

public class Data {
    public static void main(String[] args) {
        System.out.println("welcome to my project");

        //create object person
        Person show = new Person();
        System.out.println("====== Person Class ========");
        show.displayInfo();

        //create object Student Class
        Student stu = new Student();
        System.out.println("====== Student Class ======");
        stu.displayInfo();

        //polymorphsim
        Person stu1 = new Person();
        System.out.println("===== Person act as Student ======");
        stu1.displayInfo();
    }
}
