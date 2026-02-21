import java.util.Scanner;

class scan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine(); // clear buffer

        System.out.print("Enter your date of birth: ");
        String dob = input.nextLine();

        System.out.print("Enter your major: ");
        String major = input.nextLine();

        System.out.print("Enter your address: ");
        String address = input.nextLine();

        System.out.print("Enter your salary per hour: ");
        int salary = input.nextInt();

        System.out.print("Enter your working hours: ");
        int hours = input.nextInt();

        int sumSalary = salary * hours;
        int tax = sumSalary / 10;

        System.out.println("=============== Staff Information ===============");
        System.out.println("|\tName: " + name + "\t\t\t|");
        System.out.println("|\tAge: " + age + "\t\t\t|");
        System.out.println("|\tDate of Birth: " + dob + "\t\t|");
        System.out.println("|\tMajor: " + major + "\t\t\t|");
        System.out.println("|\tAddress: " + address + "\t\t|");
        System.out.println("|\tSalary Total: " + sumSalary + "\t\t|");
        System.out.println("|\tTax (10%): " + tax + "\t\t|");
        System.out.println("================================================");

        input.close();
    }
}
