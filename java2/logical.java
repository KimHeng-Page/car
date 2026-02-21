package java2;
import java.util.Scanner;
public class logical {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print(". please input your age: ");
        int age = input.nextInt();

        System.out.println(" Logical Operator");
        System.out.println(". 8age >= 1 and age <= 60 :" + (age >= 18 &&  age <= 60));
        System.out.println(". age < 18 and age > 60 :" + (age < 18 || age > 60));
        System.out.println(". age >= 18 :" +  !(age >= 18));
        input.close();
    }
}