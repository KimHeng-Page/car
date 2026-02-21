package json.acess_modifer;

public class public_modifier {

    public class Student {
        public String name;
        public int age;
        public String dob;
        public String job;
        public String address;

        public void showDetail(String fullname, int ages, String dateofBirth, String jobs, String city) {
            name = fullname;
            age = ages;
            dob = dateofBirth;
            job = jobs;
            address = city;
        }

        public void display() {
            System.out.println("======= Information of Staff =======");
            System.out.println(". Name: " + name);
            System.out.println(". Age: " + age);
            System.out.println(". Date of Birth: " + dob);
            System.out.println(". Job: " + job);
            System.out.println(". Address: " + address);
            System.out.println("====================================");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Java Programming!");

        public_modifier output = new public_modifier();
        Student student1 = output.new Student();

        student1.showDetail(
            "Srun Kimheng",
            20,
            "17/09/2007",
            "Software Development Assistant",
            "Siem Reap Province, Cambodia"
        );

        student1.display();
    }
}
