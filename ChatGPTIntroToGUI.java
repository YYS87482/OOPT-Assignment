import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatGPTIntroToGUI {
    public static void main(String[] args) {
        // Create a new JFrame (window)
        JFrame frame = new JFrame("Simple GUI");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a JPanel to hold components
        JPanel panel = new JPanel();
        
        // Create a JLabel
        JLabel label = new JLabel("Hello, World!");
        
        // Create a JButton
        JButton button = new JButton("Click Me");
        
        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Change the text of the label when the button is clicked
                label.setText("Button Clicked!");
            }
        });
        
        // Add components to the panel
        panel.add(label);
        panel.add(button);
        
        // Add the panel to the frame
        frame.add(panel);
        
        // Make the frame visible
        frame.setVisible(true);
    }
}
