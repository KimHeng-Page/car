package java4;

public class index2 {
    public static void main(String[] args){
        double[] mylist = {1.9, 2.9, 3.4, 3.5};

        System.out.print("Print all the array elements \n");
        for (int i = 0; i < mylist.length; i++){
            System.out.println(mylist[i] + " ");
        }
        System.out.print("\n");

        System.out.println("Summing all element");
        double total = 0;
        for(int i = 0; i < mylist.length; i++){
            total += mylist[i];
        }
        System.out.println(". Total is " + total + "\n");

        System.out.println("finding the largest element");
        double max = mylist[0];
        for(int i = 1; i < mylist.length; i++){
            if(mylist[i] > max){
                max = mylist[i];
            }
        }
        System.out.print(". Result of max is : " + max);
    }
}
