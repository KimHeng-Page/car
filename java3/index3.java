package java3;

import java.util.Scanner;

public class index3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("== LOGIN ==");
        
        System.out.print("Username : ");
        String username = input.nextLine();
        
        System.out.print("Password : ");
        String password = input.nextLine();

        if (username.equals("admin") && password.equals("Admin@999")) {
            System.out.println("Welcome Administration!");
        }
        if (username.equals("user") && password.equals("User@1234")) {
            System.out.println("Welcome User!");
        }
        else {
            System.out.println("bye bye baby...!");
        }
        input.close();
    }
}