import java.awt.*;
import java.awt.event.*;

public class FrameExample_1 {
    public static void main(String[] args) {
        // Create a Frame (this is the window where components will be displayed)
        Frame frame = new Frame("Frame Example");

        // Set the size of the frame (400px width, 300px height)
        frame.setSize(400, 300);

        // Set the layout of the frame to FlowLayout (components are arranged from left to right)
        frame.setLayout(new FlowLayout());

        // Create a label with some text
        Label label = new Label("This is a label.");

        // Add the label to the frame (display it in the window)
        frame.add(label);

        // Create a button with text "Click me"
        Button button = new Button("Click me");

        // Add the button to the frame (display it in the window)
        frame.add(button);

        // Add a window listener to handle closing the window properly
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);  // Exit the application when the window is closed
            }
        });

        // Make the frame visible (this will display the window)
        frame.setVisible(true);
    }
}
