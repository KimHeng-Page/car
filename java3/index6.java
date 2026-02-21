package java3;
import javax.swing.JOptionPane;
public class index6 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(
            null,                   
            "Enter your Article Name:", 
            "Input",               
            JOptionPane.QUESTION_MESSAGE
        );
        
        if (name == null) {
            JOptionPane.showMessageDialog(
                null,
                "You canceled the input!",
                "Canceled",
                JOptionPane.WARNING_MESSAGE
            );
            return;
        }
        
        name = name.trim();
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(
                null,
                "Name cannot be empty!",
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
            return;
        }
       
        JOptionPane.showMessageDialog(
            null,                                
            "GFG Java JOptionPane!\nWelcome: " + name + "!",
            "Message",                      
            JOptionPane.INFORMATION_MESSAGE      
        );
        
        JOptionPane.showMessageDialog(
            null,
            "Thank you! See you again.",
            "Goodbye",
            JOptionPane.PLAIN_MESSAGE
        );
    }
}