import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp extends JFrame {

    private JTextField textField;
    private double firstOperand;
    private String operator;
    private boolean startNewInput;

    public CalculatorApp() {
        // Set up the frame
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLayout(new BorderLayout());

        // Create components
        textField = new JTextField();
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false);

        JPanel buttonPanel = createButtonPanel();

        // Add components to the frame
        add(textField, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        // Initialize variables
        firstOperand = 0;
        operator = "";
        startNewInput = true;
    }

    private JPanel createButtonPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener());
            panel.add(button);
        }

        return panel;
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            JButton source = (JButton) event.getSource();
            String buttonText = source.getText();

            if (buttonText.matches("[0-9.]")) {
                handleDigitInput(buttonText);
            } else if (buttonText.matches("[/+\\-*=]")) {
                handleOperatorInput(buttonText);
            }
        }

        private void handleDigitInput(String digit) {
            if (startNewInput) {
                textField.setText("");
                startNewInput = false;
            }
            textField.setText(textField.getText() + digit);
        }

        private void handleOperatorInput(String op) {
            if (!operator.isEmpty()) {
                // If an operator is already set, perform the previous operation
                double secondOperand = Double.parseDouble(textField.getText());
                double result = performOperation(firstOperand, secondOperand, operator);
                textField.setText(String.valueOf(result));
                startNewInput = true;
                firstOperand = result;
            } else {
                // If no operator is set, store the current input as the first operand
                firstOperand = Double.parseDouble(textField.getText());
                startNewInput = true;
            }
            operator = op.equals("=") ? "" : op;
        }

        private double performOperation(double firstOperand, double secondOperand, String operator) {
            switch (operator) {
                case "+":
                    return firstOperand + secondOperand;
                case "-":
                    return firstOperand - secondOperand;
                case "*":
                    return firstOperand * secondOperand;
                case "/":
                    if (secondOperand != 0) {
                        return firstOperand / secondOperand;
                    } else {
                        JOptionPane.showMessageDialog(CalculatorApp.this, "Cannot divide by zero!", "Error", JOptionPane.ERROR_MESSAGE);
                        return Double.NaN;
                    }
                default:
                    return secondOperand; // For '=' or unknown operators
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculatorApp calculator = new CalculatorApp();
            calculator.setVisible(true);
        });
    }
}
