package java2;
import java.util.Scanner;
public class kam {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double pi = 3.14159;

        System.out.print(". please input r: ");
        int r = input.nextInt();
        double area = pi * r * r;

        System.out.println("\n Constant Area");
        System.out.print(". area : " +  area);
        input.close();
    }
}
