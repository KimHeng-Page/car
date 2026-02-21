package java3;
import java.util.Scanner;
public class index2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("======== EDC SiemReap =========");
            System.out.print(". please input power usage: ");
            int power = input.nextInt();

            if(power == 1 || power <=100){
                int unt = 800, total = power * unt;
                System.out.println("==== EDC SiemReap ====");
                System.out.println(". Power Usage: " + power + " kwh");
                System.out.println(". Unit Price :  " + unt + " Riel/kwh");
                System.out.println(". Total : " + total + " Riel");
            }else if(power >= 100 || power <= 500){
                int unt = 790, total = power * unt;
                System.out.println("==== EDC SiemReap ====");
                System.out.println(". Power Usage: " + power + " kwh");
                System.out.println(". Unit Price :  " + unt + " Riel/kwh");
                System.out.println(". Total : " + total + " Riel");
            }else if(power > 500){
                int unt = 750, total = power * unt;
                System.out.println("==== EDC SiemReap ====");
                System.out.println(". Power Usage: " + power + " kwh");
                System.out.println(". Unit Price :  " + unt + " Riel/kwh");
                System.out.println(". Total : " + total + " Riel");
            }else if(power == 0){
                System.out.println("no money no honey...!");
            }else{
                break;
            }
        }
        input.close();
    }   
}
