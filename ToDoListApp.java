import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ToDoListApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("To-Do List");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Top panel with input and Add button
        JPanel topPanel = new JPanel();
        JTextField taskField = new JTextField(20);
        JButton addButton = new JButton("Add");
        topPanel.add(taskField);
        topPanel.add(addButton);

        // Center area with JList
        DefaultListModel<String> taskListModel = new DefaultListModel<>();
        JList<String> taskList = new JList<>(taskListModel);
        JScrollPane scrollPane = new JScrollPane(taskList);

        // Bottom panel with Remove button
        JPanel bottomPanel = new JPanel();
        JButton removeButton = new JButton("Remove");
        bottomPanel.add(removeButton);

        // Add listeners
        addButton.addActionListener(e -> {
            String task = taskField.getText().trim();
            if (!task.isEmpty()) {
                taskListModel.addElement(task);
                taskField.setText("");
            }
        });

        removeButton.addActionListener(e -> {
            int selectedIndex = taskList.getSelectedIndex();
            if (selectedIndex != -1) {
                taskListModel.remove(selectedIndex);
            }
        });

        // Add panels to frame
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
