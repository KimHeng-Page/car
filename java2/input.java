package java2;
import java.util.*;
public class input{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print(". please input name: ");
        String name = input.nextLine();
        
        System.out.print(". please input wage: ");
        float wag = input.nextFloat();

        System.out.print(". please input hours: ");
        int hour = input.nextInt();

        float amount = wag * hour;

        System.out.println("========== Salary Infromation =============");
        System.out.println("==> name : "+ name);
        System.out.println("==> wag : "+ wag);
        System.out.println("==> hours : "+ hour);
        System.out.println("==> amount : "+ amount);
        System.out.println("===========================================");
        input.close();
    }
}