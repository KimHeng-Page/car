package java2;
import javax.swing.JOptionPane;
public class index2 {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Please input your name:");

        int age;
        try {
            age = Integer.parseInt(
                    JOptionPane.showInputDialog("Please input your age:")
            );
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Age must be a number!");
            return;
        }

        String address = JOptionPane.showInputDialog("Please input your address:");
        String phone = JOptionPane.showInputDialog("Please input your phone number:");
        String city = JOptionPane.showInputDialog("Please input your city:");

        JOptionPane.showMessageDialog(
                null,
                "Name: " + name +
                "\nAge: " + age +
                "\nAddress: " + address +
                "\nPhone: " + phone +
                "\nCity: " + city
        );
    }
}
