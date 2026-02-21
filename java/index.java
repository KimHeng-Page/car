import javax.swing.JOptionPane;
public class index {
    public static void main(String[] args) {
        System.out.println("This is index class");

        String name = JOptionPane.showInputDialog(". please input your name: ");
        JOptionPane.showMessageDialog(null,"Your name is : " +  name);
    }
}
