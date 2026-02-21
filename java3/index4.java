package java3;
import java.util.Scanner;
public class index4{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String name1 = "", name2 = "", name3 = "";
        double wage1 = 0, wage2 = 0, wage3 = 0;
        double hours1 = 0, hours2 = 0, hours3 = 0;
        double amount1 = 0, amount2 = 0, amount3 = 0;
        
        System.out.println("===== Input 3 Employees =====");
        
        // Employee 1
        System.out.print("Name  : "); name1 = sc.nextLine();
        System.out.print("Wage  : "); wage1 = sc.nextDouble();
        System.out.print("Hours : "); hours1 = sc.nextDouble();
        amount1 = wage1 * hours1;
        sc.nextLine();
        

        System.out.print("\nName  : "); name2 = sc.nextLine();
        System.out.print("Wage  : "); wage2 = sc.nextDouble();
        System.out.print("Hours : "); hours2 = sc.nextDouble();
        amount2 = wage2 * hours2;
        sc.nextLine();

        System.out.print("\nName  : "); name3 = sc.nextLine();
        System.out.print("Wage  : "); wage3 = sc.nextDouble();
        System.out.print("Hours : "); hours3 = sc.nextDouble();
        amount3 = wage3 * hours3;
        sc.nextLine();
        
        System.out.println("\n== List Employee ==");
        System.out.println("ID  Name       Wage  Hour  Amount");
        System.out.println("1   " + name1 + "   " + wage1 + "   " + hours1 + "   " + amount1);
        System.out.println("2   " + name2 + "   " + wage2 + "   " + hours2 + "   " + amount2);
        System.out.println("3   " + name3 + "   " + wage3 + "   " + hours3 + "   " + amount3);
        
        sc.close();
    }
}