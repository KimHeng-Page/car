package java2;
import java.util.Scanner;
public class check {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print(". please input number: ");
        int num = input.nextInt();

        System.out.println(" Range Check");
        System.out.println(". number > 0 and < 100 :" + (num > 0 && num < 100));
        System.out.println(". number != 50 :" + (num != 50));
        input.close();
    }
}
