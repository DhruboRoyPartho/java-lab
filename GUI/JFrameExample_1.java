import java.awt.FlowLayout;   // Importing the FlowLayout class from AWT for arranging components
import javax.swing.*;          // Importing Swing components (JFrame, JLabel, JButton)

public class JFrameExample_1 {
    // Main method is the entry point for the Java program
    public static void main(String[] args) {
        
        // Creating a new JFrame object. JFrame is a window where we can add components.
        // The argument passed to the JFrame constructor is the title of the window.
        JFrame frame = new JFrame("JFrame Example");

        // Setting the size of the frame (width = 400 pixels, height = 300 pixels)
        frame.setSize(400, 300);

        // Setting the layout manager to FlowLayout. This arranges the components (like buttons, labels) in a left-to-right flow
        frame.setLayout(new FlowLayout());

        // Creating a new JLabel with text "This is a label."
        // JLabel is a non-interactive component that displays a short string or image.
        JLabel label = new JLabel("This is a label.");

        // Adding the label to the frame so that it will be displayed in the window
        frame.add(label);

        // Creating a new JButton with text "click me"
        // JButton is a component that allows the user to click on it to trigger an action.
        JButton button = new JButton("click me");

        // Adding the button to the frame so that it will be displayed in the window
        frame.add(button);

        // Setting the default close operation of the frame to EXIT_ON_CLOSE
        // This means that when the user closes the window, the application will terminate
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Making the frame visible on the screen so that the user can see it.
        // If this line is omitted, the frame will not appear.
        frame.setVisible(true);
    }
}






// import java.awt.FlowLayout;
// import javax.swing.*;

// public class JFrameExample_1 {
//     public static void main(String[] args) {
//         JFrame frame = new JFrame("JFrame Example");

//         frame.setSize(400, 300);

//         frame.setLayout(new FlowLayout());

//         JLabel label = new JLabel("This is a label.");
//         frame.add(label);

//         JButton button = new JButton("click me");
//         frame.add(button);

//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setVisible(true);
//     }
// }
