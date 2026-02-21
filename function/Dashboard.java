package function;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Dashboard extends JFrame {

    public Dashboard() {
        setTitle("Java Dashboard");
        setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // ===== Sidebar =====
        JPanel sidebar = new JPanel();
        sidebar.setBackground(new Color(30, 30, 60));
        sidebar.setPreferredSize(new Dimension(200, 0));
        sidebar.setLayout(new GridLayout(6, 1, 10, 10));

        JButton btnDashboard = new JButton("Dashboard");
        JButton btnUsers = new JButton("Users");
        JButton btnReports = new JButton("Reports");
        JButton btnSettings = new JButton("Settings");
        JButton btnLogout = new JButton("Logout");

        JButton[] buttons = {btnDashboard, btnUsers, btnReports, btnSettings, btnLogout};
        for (JButton btn : buttons) {
            btn.setFocusPainted(false);
            btn.setBackground(new Color(70, 70, 120));
            btn.setForeground(Color.WHITE);
            sidebar.add(btn);
        }

        // ===== Header =====
        JPanel header = new JPanel(new BorderLayout());
        header.setBackground(new Color(50, 120, 200));
        header.setPreferredSize(new Dimension(0, 60));

        JLabel title = new JLabel("  Admin Dashboard");
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        header.add(title, BorderLayout.WEST);

        // ===== Main Content =====
        JPanel main = new JPanel();
        main.setLayout(new GridLayout(2, 2, 15, 15));
        main.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        main.add(createCard("Users", "120"));
        main.add(createCard("Orders", "45"));
        main.add(createCard("Revenue", "$2,340"));
        main.add(createCard("Messages", "18"));

        add(sidebar, BorderLayout.WEST);
        add(header, BorderLayout.NORTH);
        add(main, BorderLayout.CENTER);
    }

    private JPanel createCard(String title, String value) {
        JPanel card = new JPanel(new BorderLayout());
        card.setBackground(Color.WHITE);
        card.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));

        JLabel lblTitle = new JLabel(title);
        lblTitle.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 10));
        lblTitle.setFont(new Font("Arial", Font.PLAIN, 16));

        JLabel lblValue = new JLabel(value, SwingConstants.CENTER);
        lblValue.setFont(new Font("Arial", Font.BOLD, 28));

        card.add(lblTitle, BorderLayout.NORTH);
        card.add(lblValue, BorderLayout.CENTER);

        return card;
    }

    // ===== Login Screen =====
    public static class Login extends JFrame {
        private JTextField txtUsername;
        private JPasswordField txtPassword;
        private JCheckBox rememberMe;

        public Login() {
            setTitle("Login");
            setSize(400, 300);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new BorderLayout());

            JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
            panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

            panel.add(new JLabel("Username:"));
            txtUsername = new JTextField();
            panel.add(txtUsername);

            panel.add(new JLabel("Password:"));
            txtPassword = new JPasswordField();
            txtPassword.setEchoChar('*'); // hide password
            panel.add(txtPassword);

            rememberMe = new JCheckBox("Remember Me");
            panel.add(rememberMe);

            JButton btnForgot = new JButton("Forgot Password?");
            panel.add(btnForgot);

            JButton btnLogin = new JButton("Login");
            panel.add(new JLabel()); // empty cell
            panel.add(btnLogin);

            add(panel, BorderLayout.CENTER);
            btnLogin.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String username = txtUsername.getText();
                    String password = new String(txtPassword.getPassword());

                    if(checkCredentials(username, password)) {
                        JOptionPane.showMessageDialog(Login.this, "Login successful!");
                        new Dashboard().setVisible(true);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(Login.this, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

            btnForgot.addActionListener(e -> {
                JOptionPane.showMessageDialog(Login.this, "Contact admin to reset your password.");
            });
        }

        private boolean checkCredentials(String username, String password) {
            String url = "jdbc:mysql://localhost:3306/method"; // your MySQL DB name
            String dbUser = "root"; // defa
            // lt Laragon MySQL user
            String dbPass = "";     // default Laragon MySQL password (usually empty)

            try {
                Connection conn = DriverManager.getConnection(url, dbUser, dbPass);
                String sql = "SELECT * FROM users WHERE username=? AND password=?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, username);
                stmt.setString(2, password);
                ResultSet rs = stmt.executeQuery();

                boolean valid = rs.next();
                rs.close();
                stmt.close();
                conn.close();

                return valid;
            } catch (SQLException ex) {
                ex.printStackTrace();
                return false;
            }
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                new Login().setVisible(true);
            });
        }
    }
}

/*
MySQL script for Laragon database 'method':

CREATE DATABASE IF NOT EXISTS method;
USE method;

CREATE TABLE IF NOT EXISTS users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(50) NOT NULL
);

INSERT INTO users (username, password) VALUES ('admin', '1234');
*/