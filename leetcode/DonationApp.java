import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DonationApp {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DonationGUI donationGUI = new DonationGUI();
            donationGUI.showGUI();
        });
    }
}

class DonationGUI {

    private JFrame frame;
    private JLabel welcomeLabel;
    private JButton donateButton;

    public void showGUI() {
        frame = new JFrame("School Donation App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Set a custom font for the entire application
        Font customFont = new Font("Arial", Font.PLAIN, 16);
        UIManager.put("Button.font", customFont);
        UIManager.put("Label.font", customFont);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Use BoxLayout for vertical alignment

        welcomeLabel = new JLabel("Welcome to the School Donation App!");
        welcomeLabel.setAlignmentX(Component.CENTER_ALIGNMENT); // Center the label

        donateButton = new JButton("Donate");

        // Customize the button appearance
        donateButton.setBackground(new Color(0, 128, 255)); // Set a custom background color
        donateButton.setForeground(Color.WHITE); // Set text color
        donateButton.setFocusPainted(false);

        donateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleDonation();
            }
        });

        // Add some padding around components
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Add components to the panel
        panel.add(welcomeLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 20))); // Add some vertical space
        panel.add(donateButton);

        // Set the panel background color
        panel.setBackground(new Color(240, 240, 240));

        // Add the panel to the frame
        frame.getContentPane().add(BorderLayout.CENTER, panel);

        // Set the frame visibility
        frame.setVisible(true);
    }

    private void handleDonation() {
        JOptionPane.showMessageDialog(frame, "Thank you for your donation! We appreciate your support.");
    }
}
