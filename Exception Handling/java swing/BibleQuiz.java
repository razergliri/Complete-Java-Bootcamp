import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BibleQuiz extends JFrame {
    private static final String[][] questions = {
            {"Who is known as the father of faith?", "Abraham"},
            {"What is the first book of the Bible?", "Genesis"},
            {"Who was the first king of Israel?", "Saul"}
            // Add more questions as needed
    };

    private int currentQuestionIndex = 0;
    private int score = 0;

    private JLabel questionLabel;
    private JTextField answerField;
    private JButton submitButton;

    public BibleQuiz() {
        setTitle("Bible Quiz App");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createUI();

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void createUI() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        questionLabel = new JLabel();
        answerField = new JTextField(20);
        submitButton = new JButton("Submit");

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkAnswer();
            }
        });

        panel.add(questionLabel);
        panel.add(answerField);
        panel.add(submitButton);

        add(panel);

        displayQuestion();
    }

    private void displayQuestion() {
        if (currentQuestionIndex < questions.length) {
            questionLabel.setText("Question " + (currentQuestionIndex + 1) + ": " + questions[currentQuestionIndex][0]);
            answerField.setText("");
        } else {
            showResult();
        }
    }

    private void checkAnswer() {
        String userAnswer = answerField.getText();
        String correctAnswer = questions[currentQuestionIndex][1];

        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            JOptionPane.showMessageDialog(this, "Correct! Well done.");
            score++;
        } else {
            JOptionPane.showMessageDialog(this, "Incorrect. The correct answer is: " + correctAnswer);
        }

        currentQuestionIndex++;
        displayQuestion();
    }

    private void showResult() {
        JOptionPane.showMessageDialog(this, "Quiz completed! Your final score is: " + score + "/" + questions.length);
        System.exit(0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BibleQuiz();
            }
        });
    }
}
