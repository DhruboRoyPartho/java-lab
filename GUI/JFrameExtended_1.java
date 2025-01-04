import javax.swing.*;
import java.awt.*;

public class JFrameExtended_1 extends JFrame {
    
    public JFrameExtended_1() {
        // Set the title of the frame (window)
        super("JFrame Extended Example");

        // Set the size of the frame (400px width, 300px height)
        setSize(400, 300);

        // Set the layout of the frame to FlowLayout (components will be arranged from left to right)
        setLayout(new FlowLayout());

        // Create a label with some text
        JLabel label = new JLabel("This is a label.");

        // Add the label to the frame (display it in the window)
        add(label);

        // Create a button with text "Click me"
        JButton button = new JButton("Click me");

        // Add the button to the frame (display it in the window)
        add(button);

        // Set the default close operation for the frame (exit when the window is closed)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible (this will display the window)
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of JFrameExtended_1 (corrected class name)
        new JFrameExtended_1();
    }
}
