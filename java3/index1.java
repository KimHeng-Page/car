package java3;
import java.util.Scanner;
public class index1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("====== Score [0-100]\n");
            System.out.print(". please input your score : ");
            float num = input.nextFloat();

            if (num == 100) {
                System.out.println("your score: " + num);
                if (num >= 50 || num <= 100) {
                    System.out.println("=> pass, grade : A");
                } else {
                    System.out.println("fail, grade : F");
                }
            } else if (num == 90) {
                System.out.println("your score: " + num);
                if (num >= 50 || num <= 100) {
                    System.out.println("=> pass, grade : B");
                } else {
                    System.out.println("fail, grad : F");
                }
            } else if (num == 80) {
                System.out.println("your score: " + num);
                if (num >= 50 || num <= 100) {
                    System.out.println("=> pass, grade : C");
                } else {
                    System.out.println("fail, grade : F");
                }
            } else if (num == 70) {
                System.out.println("your score: " + num);
                if (num >= 50 || num <= 100) {
                    System.out.println("=> pass, grade : D");
                } else {
                    System.out.println("fail, grade : F");
                }
            } else if (num == 60) {
                System.out.println("your score: " + num);
                if (num >= 50 || num <= 100) {
                    System.out.println("=> pass, grade : E");
                } else {
                    System.out.println("fail, grade : F");
                }
            } else {
                System.out.println(". your score : " + num);
                System.out.println(". please keep study...!");
                break;
            }
        }

        input.close();
    }
}