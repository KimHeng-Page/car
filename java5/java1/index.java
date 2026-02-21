package java5.java1;
public class index {
    public static void main(String[] args) {
        String sentence = "Java fun to learn";
        
        System.out.println("Original sentence: " + sentence);
        System.out.println("Words:");
        
        for (String word : sentence.split(" ")) {
            System.out.println("→ " + word);
        }
        
        System.out.println("Number of words: " + sentence.split(" ").length);
}
}
