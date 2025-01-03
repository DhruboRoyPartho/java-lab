import java.awt.*;  // Import AWT (Abstract Window Toolkit) classes for GUI components.
import java.awt.event.*;  // Import event handling classes (for button click event).

public class Increament_6 {
    public static void main(String[] args) {
        // Create a new frame (window) titled "Button Click Increment Example"
        Frame frame = new Frame("Button Click Increment Example");

        // Set the size of the frame (400px wide, 400px high)
        frame.setSize(400, 400);

        // Set the layout of the frame to FlowLayout (components arranged from left to right)
        frame.setLayout(new FlowLayout());

        // Create a text field where the number will be displayed
        // The initial value of the text field is "0" and the width is 20 characters
        TextField textField = new TextField("0", 20);

        // Create a button with the label "Ok"
        Button ok = new Button("Ok");

        // Add the button and the text field to the frame (so they appear on the window)
        frame.add(ok);
        frame.add(textField);

        // Add an action listener to the "Ok" button so that when it's clicked, the number increments
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the current text in the text field (which is the current number)
                String currentText = textField.getText();

                // Convert the text to an integer using Integer.parseInt() (to perform arithmetic)
                int currentNumber = Integer.parseInt(currentText);

                // Increment the number by 1
                currentNumber++;

                // Set the incremented number back into the text field
                // Convert the number back to a string and update the text field
                textField.setText(String.valueOf(currentNumber));
            }
        });

        // Add a window listener to handle when the window is closed
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Exit the program when the window is closed (terminates the program)
                System.exit(0);
            }
        });

        // Make the frame (window) visible on the screen
        frame.setVisible(true);
    }
}




// import java.awt.*;
// import java.awt.event.*;

// public class Increament_6 {
//     public static void main(String[] args) {
//         Frame frame = new Frame("Button Click Increament Example");
//         frame.setSize(400, 400);
//         frame.setLayout(new FlowLayout());

//         TextField textField = new TextField("0", 20);
//         Button ok = new Button("Ok");

//         frame.add(ok);
//         frame.add(textField);

//         ok.addActionListener(new ActionListener(){
//             @Override
//             public void actionPerformed(ActionEvent e){
//                 String currentText = textField.getText();

//                 int currentNumber = Integer.parseInt(currentText);
//                 currentNumber++;

//                 textField.setText(String.valueOf(currentNumber));
//             }
//         });

//         frame.addWindowListener(new WindowAdapter() {
//             @Override
//             public void windowClosing(WindowEvent e){
//                 System.exit(0);
//             }
//         });

//         frame.setVisible(true);
//     }
// }