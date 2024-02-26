import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class PictureUploaderGUI extends JFrame {
    private JLabel pictureLabel;

    public PictureUploaderGUI() {
        super("Picture Uploader");

        // Create components
        JButton uploadButton = new JButton("Upload Picture");
        pictureLabel = new JLabel("Selected Picture: ");

        // Add components to the frame
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(uploadButton);
        add(pictureLabel);

        // Add action listener to the button
        uploadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open a file chooser dialog
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileFilter(new FileNameExtensionFilter("Image files", "jpg", "jpeg", "png", "gif"));
                int result = fileChooser.showOpenDialog(PictureUploaderGUI.this);

                // If a file is selected, update the label and display the image
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    pictureLabel.setText("Selected Picture: " + selectedFile.getAbsolutePath());

                    // Display the image
                    ImageIcon icon = new ImageIcon(selectedFile.getAbsolutePath());
                    pictureLabel.setIcon(icon);
                }
            }
        });

        // Set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PictureUploaderGUI();
            }
        });
    }
}
