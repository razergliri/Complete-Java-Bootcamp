import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StopwatchApp extends JFrame {
    private Timer timer;
    private long startTime;
    private long elapsedTime;

    private JLabel timeLabel;

    public StopwatchApp() {
        setTitle("Stopwatch");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new java.awt.FlowLayout());

        timeLabel = new JLabel("00:00:00");
        add(timeLabel);

        JButton startButton = new JButton("Start");
        JButton pauseButton = new JButton("Pause/Resume");

        add(startButton);
        add(pauseButton);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startStopwatch();
            }
        });

        pauseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pauseResumeStopwatch();
            }
        });
    }

    private void startStopwatch() {
        startTime = System.currentTimeMillis();

        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateElapsedTime();
            }
        });

        timer.start();
    }

    private void pauseResumeStopwatch() {
        if (timer != null && timer.isRunning()) {
            timer.stop();
            elapsedTime += System.currentTimeMillis() - startTime;
        } else if (timer != null) {
            startTime = System.currentTimeMillis();
            timer.start();
        }
    }

    private void updateElapsedTime() {
        long currentTime = System.currentTimeMillis();
        elapsedTime = currentTime - startTime;

        long seconds = elapsedTime / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;

        String timeStr = String.format("%02d:%02d:%02d", hours % 24, minutes % 60, seconds % 60);
        timeLabel.setText(timeStr);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StopwatchApp().setVisible(true);
            }
        });
    }
}
