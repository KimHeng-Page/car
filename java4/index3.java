package java4;

public class index3 {
    public static void main(String[] args){
        double num[] = {1, 2, 3, 4, 5 ,6};

        System.out.println("== total value ==");
        for(int i = 0; i < num.length; i++){
            double total = num[i] * 8000;
                   total += num[i];
                   i++;
            System.out.print("totall result: " + total + "\n");
        }
        System.out.println("\n");
        
        double total = 0;
        int i = 0;
        while (i < num.length) {
            total += num[i];
            i++;
        }
        System.out.println("Total: " + total);
    }
}
