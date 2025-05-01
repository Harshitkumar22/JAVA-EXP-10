import javax.swing.*;
import java.awt.event.*;

public class Calculator{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Easy Calculator");

        JLabel label1 = new JLabel("Number 1:");
        label1.setBounds(20, 20, 80, 25);
        JTextField text1 = new JTextField();
        text1.setBounds(100, 20, 100, 25);

        JLabel label2 = new JLabel("Number 2:");
        label2.setBounds(20, 50, 80, 25);
        JTextField text2 = new JTextField();
        text2.setBounds(100, 50, 100, 25);

        JButton add = new JButton("+");
        add.setBounds(20, 90, 50, 30);
        JButton sub = new JButton("-");
        sub.setBounds(80, 90, 50, 30);
        JButton mul = new JButton("*");
        mul.setBounds(140, 90, 50, 30);
        JButton div = new JButton("/");
        div.setBounds(200, 90, 50, 30);

        JLabel result = new JLabel("Result:");
        result.setBounds(20, 130, 250, 25);

        // Shared ActionListener
        ActionListener action = e -> {
            try {
                double num1 = Double.parseDouble(text1.getText());
                double num2 = Double.parseDouble(text2.getText());
                double res = 0;

                if (e.getSource() == add){
                    res = num1 + num2;
                } else if (e.getSource() == sub){
                    res = num1 - num2;
                } else if (e.getSource() == mul){
                    res = num1 * num2;
                } else if (e.getSource() == div){
                    if (num2 == 0) {
                        result.setText("Error: Cannot divide by zero!");
                        return;
                    }
                    res = num1 / num2;
                }

                result.setText("Result: " + res);
            } catch(NumberFormatException ex){
                result.setText("Invalid input!");
            }
        };

        add.addActionListener(action);
        sub.addActionListener(action);
        mul.addActionListener(action);
        div.addActionListener(action);

        frame.add(label1); frame.add(text1);
        frame.add(label2); frame.add(text2);
        frame.add(add); frame.add(sub);
        frame.add(mul); frame.add(div);
        frame.add(result);

        frame.setSize(300, 220);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
