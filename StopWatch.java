import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StopWatch{
    private static int elapsedTime = 0;
    private static Timer timer;

    public static void main(String[] args){
        JFrame frame = new JFrame("Stopwatch");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel timeLabel = new JLabel("Time: 0 s");
        timeLabel.setFont(new Font("Arial", Font.BOLD, 24));

        JButton startButton = new JButton("Start");
        JButton stopButton = new JButton("Stop");
        JButton resetButton = new JButton("Reset");

        // Timer updates label every 1 second
        timer = new Timer(1000, e -> {
            elapsedTime++;
            timeLabel.setText("Time: " + elapsedTime + " s");
        });

        startButton.addActionListener(e -> timer.start());
        stopButton.addActionListener(e -> timer.stop());
        resetButton.addActionListener(e -> {
            timer.stop();
            elapsedTime = 0;
            timeLabel.setText("Time: 0 s");
        });

        frame.add(timeLabel);
        frame.add(startButton);
        frame.add(stopButton);
        frame.add(resetButton);

        frame.setVisible(true);
    }
}
