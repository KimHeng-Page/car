package java3;
import javax.swing.JOptionPane;
public class index7 {
    public static void main(String[] args) {
       
        JOptionPane.showMessageDialog(
            null,
            "Welcome to our quiz.\nPlease answer the question correctly!",
            "Welcome",
            JOptionPane.PLAIN_MESSAGE
        );
       
        int playAgain = JOptionPane.YES_OPTION;
       
        while (playAgain == JOptionPane.YES_OPTION) {
           
            String answerStr = JOptionPane.showInputDialog(
                null,
                "Which one is correct?\n" +
                "1- int i; a=5;\n" +
                "2- float score = 65.4f;\n" +
                "3- string n = 5;\n\n" +
                "Enter the number (1, 2, or 3):",
                "Question",
                JOptionPane.QUESTION_MESSAGE
            );
           
            if (answerStr == null) {
                int choice = JOptionPane.showConfirmDialog(
                    null,
                    "Are you sure you want to quit?",
                    "Quit?",
                    JOptionPane.YES_NO_OPTION
                );
                if (choice == JOptionPane.YES_OPTION) {
                    break;
                }
                continue;
            }
           
            answerStr = answerStr.trim();
           
            boolean correct = "2".equals(answerStr);
           
            if (correct) {
                JOptionPane.showMessageDialog(
                    null,
                    "Congratulations!\nYou got it right!",
                    "Answer",
                    JOptionPane.INFORMATION_MESSAGE
                );
            } else {
                JOptionPane.showMessageDialog(
                    null,
                    "Sorry, that's incorrect.\nThe correct answer is 2.",
                    "Answer",
                    JOptionPane.ERROR_MESSAGE
                );
            }
           
            playAgain = JOptionPane.showConfirmDialog(
                null,
                "Do you want to try again?",
                "Answer",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
            );
        }
       
        JOptionPane.showMessageDialog(
            null,
            "Thank you for playing!\nSee you next time.",
            "Goodbye",
            JOptionPane.PLAIN_MESSAGE
        );
    }
}