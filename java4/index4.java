package java4;
import java.util.Arrays;
public interface index4 {
    public static void main(String[] args){
        String src = " Hello everyone.";
        System.out.println(src + " Today is 4th Week.");

        String src1 = new String("Srun Kimheng");
        System.out.print("Your name is: " + src1.toUpperCase());

        String[] strName = new String[] {"kimheng", "bopha", "thida", "sokha", "usea", "apple"};
        for(int i = 0; i< strName.length; i++){
            System.out.println(". name : " + strName[i]);
        }


        System.out.println("===== sort name =====");
        Arrays.sort(strName);
        for(String name: strName){
            System.out.println(". name: " + name); 
        }
    }
}
