package java4;
public class stringArray{
    public static void main(String[] args){
       String  str1 = "welcome to java";
       String str2 = "For IT Center";

       //+
       String r = str1 + " - " + str2;
       System.out.println("r : " + r);

       //using concat() method of string
       String r1 = str1.concat(str2);
       System.out.println("r1 : " + r1); 

         //using String array
        String[] strArray = {str1, str2};
        String r2 = String.join(" | ", strArray);
        System.out.println("r2 : " + r2);

        //using StringBuilder
        StringBuilder sb = new StringBuilder("Hello, ");
        sb.append(" To my class ");
        sb.append(" at 7am");
        
        System.out.println("sb : " + sb.toString());
        System.out.println("sb : " + sb);
    }
}