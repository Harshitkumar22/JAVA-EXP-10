import javax.swing.*;
import java.awt.event.*;

public class RegistrationForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Form");
        frame.setSize(300, 350);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 20, 100, 25);
        JTextField nameField = new JTextField();
        nameField.setBounds(120, 20, 140, 25);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(20, 60, 100, 25);
        JTextField emailField = new JTextField();
        emailField.setBounds(120, 60, 140, 25);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(20, 100, 100, 25);
        JPasswordField passField = new JPasswordField();
        passField.setBounds(120, 100, 140, 25);

        JLabel confirmLabel = new JLabel("Confirm:");
        confirmLabel.setBounds(20, 140, 100, 25);
        JPasswordField confirmField = new JPasswordField();
        confirmField.setBounds(120, 140, 140, 25);

        JButton registerButton = new JButton("Register");
        registerButton.setBounds(90, 190, 100, 30);

        JLabel message = new JLabel();
        message.setBounds(20, 230, 250, 25);

        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String pass = new String(passField.getPassword());
                String confirm = new String(confirmField.getPassword());

                if (name.isEmpty() || email.isEmpty() || pass.isEmpty() || confirm.isEmpty()) {
                    message.setText("Please fill all fields.");
                } else if (!email.contains("@")) {
                    message.setText("Invalid email.");
                } else if (!pass.equals(confirm)) {
                    message.setText("Passwords do not match.");
                } else {
                    message.setText("Registration Successful!");
                }
            }
        });

        frame.add(nameLabel); frame.add(nameField);
        frame.add(emailLabel); frame.add(emailField);
        frame.add(passLabel); frame.add(passField);
        frame.add(confirmLabel); frame.add(confirmField);
        frame.add(registerButton);
        frame.add(message);

        frame.setVisible(true);
    }
}
