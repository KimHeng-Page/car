import java.util.Scanner;
public class util {
     public static void main(String[] args){
        System.out.println("This is util class");
        Scanner text = new Scanner(System.in);

        System.out.print(". input your name: ");
        String name = text.next();

        System.out.print(". input your age: ");
        int age = text.nextInt();

        System.out.print(". input your height: ");
        double height = text.nextDouble();
            System.out.print("\033[H\033[2J");
            System.out.flush();

        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);  
        System.out.println("Your height is: " + height);
        text.close();
     }
}
