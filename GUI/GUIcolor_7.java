import java.awt.*;  // Import the AWT (Abstract Window Toolkit) classes needed for GUI components.
import java.awt.event.*;  // Import event handling classes for dealing with button clicks and window events.

public class GUIcolor_7 {
    public static void main(String[] args) {
        // Create a new Frame (window) and set its title to "Color Change Example"
        Frame frame = new Frame("Color Change Example");
        
        // Set the size of the window (400px wide, 400px high)
        frame.setSize(400, 400);
        
        // Set the layout of the window to FlowLayout, meaning components are arranged horizontally.
        frame.setLayout(new FlowLayout());

        // Create two buttons: one for changing the color to red and the other for green
        Button redButton = new Button("Red");  // Button labeled "Red"
        Button greenButton = new Button("Green");  // Button labeled "Green"

        // Add both buttons to the window (Frame)
        frame.add(redButton);
        frame.add(greenButton);

        // Add an ActionListener to the Red button
        redButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // This method will be called when the Red button is clicked
                // Change the background color of the window (frame) to red
                frame.setBackground(Color.RED);
            }
        });

        // Add an ActionListener to the Green button
        greenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // This method will be called when the Green button is clicked
                // Change the background color of the window (frame) to green
                frame.setBackground(Color.GREEN);
            }
        });

        // Add a WindowListener to listen for the window closing event
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Close the application when the window is closed
                // System.exit(0) exits the program
                System.exit(0);
            }
        });

        // Make the window (frame) visible on the screen
        frame.setVisible(true);
    }
}





// import java.awt.*;
// import java.awt.event.*;

// public class GUIcolor_7 {
//     public static void main(String[] args){
//         Frame frame = new Frame("Color Change Example");
//         frame.setSize(400, 400);
//         frame.setLayout(new FlowLayout());

//         Button redButton = new Button("Red");
//         Button greenButton = new Button("Green");

//         frame.add(redButton);
//         frame.add(greenButton);

//         redButton.addActionListener(new ActionListener(){
//             @Override
//             public void actionPerformed(ActionEvent e){
//                 frame.setBackground(Color.RED);
//             }
//         });

//         greenButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e){
//                 frame.setBackground(Color.GREEN);
//             }
//         });

//         frame.addWindowListener(new WindowAdapter(){
//             @Override
//             public void windowClosing(WindowEvent e) {
//                 System.exit(0);
//             }
//         });

//         frame.setVisible(true);
//     }
// }