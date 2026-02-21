package json.acess_modifer;
public class private_modifter{
  
    class Student {
        private String name;
        private int age;
        private String dob;
        private String job;
        private String address;

        public void showDetail(String fullname, int ages, String dateofBrith, String jobs, String city){
            name = fullname;
            age =  ages;
            dob = dateofBrith;
            job = jobs;
            address = city;

        }

        public void display(){
            System.out.println("======= Information of Staff =======");
            System.out.println(". Name: " + name);
            System.out.println(". Age: " + age);
            System.out.println(". Date of Birth: " + dob);
            System.out.println(". Job: " + job);
            System.out.println(". Address: " + address);
            System.out.println("====================================");
        }
    }
    public static void main(String[] args){
        System.out.println("Welcome to Java Programming!");
        private_modifter output = new private_modifter();
        Student student1 = output.new Student();
        student1.showDetail("Srun Kimheng", 20, "17/09/2007", "Software Development Assistant", "Siem Reap Province, Cambodia");
        student1.display();
    }
}
