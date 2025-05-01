import javax.swing.*;

public class LoginForm{
    public static void main(String[] args){
        JFrame frame = new JFrame("Login Form");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(20, 20, 80, 25);
        frame.add(userLabel);

        JTextField userText = new JTextField();
        userText.setBounds(100, 20, 160, 25);
        frame.add(userText);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(20, 50, 80, 25);
        frame.add(passLabel);

        JPasswordField passText = new JPasswordField();
        passText.setBounds(100, 50, 160, 25);
        frame.add(passText);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(100, 80, 80, 25);
        frame.add(loginButton);

        loginButton.addActionListener(e -> {
            String username = userText.getText();
            String password = new String(passText.getPassword());

            if (username.equals("admin") && password.equals("password")){
                JOptionPane.showMessageDialog(frame, "Login Successful!");
            } else{
                JOptionPane.showMessageDialog(frame, "Invalid Username or Password");
            }
        });

        frame.setVisible(true);
    }
}
