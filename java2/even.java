package java2;
import java.util.Scanner;
public class even {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print(". please input number: ");
        int num = input.nextInt();
        String[] status = {"even", "odd"};

        System.out.println(" Even - Odd ");
        System.out.print("-> result :" + num + " : " + status[Math.abs(num)]);
        input.close();
    }
}
