import java.awt.*;
import java.awt.event.*;

public class LayoutGUI_3 {
    public static void main(String[] args) {
        // Creating frames for different layout types
        Frame defaultlayout_frame = new Frame("DefaultLayout Example Frame"); // Frame with default layout
        Frame flowlayout_frame = new Frame("FlowLayout Example Frame"); // Frame with FlowLayout
        Frame borderlayout_frame = new Frame("BorderLayout Example Frame"); // Frame with BorderLayout
        Frame gridlayout_frame = new Frame("GridLayout Example Frame"); // Frame with GridLayout

        // Default Layout (No specific layout manager is set, so it uses the default FlowLayout)
        defaultlayout_frame.setSize(400, 400); // Set the size of the frame (width=400, height=400)

        // Create label and button components
        Label label1 = new Label("This is default frame label"); // A simple text label
        Button button1 = new Button("Default frame button"); // A button with text

        // Add the label and button to the default layout frame
        defaultlayout_frame.add(label1); // Add label to the frame
        defaultlayout_frame.add(button1); // Add button to the frame

        // Make the frame visible to the user
        defaultlayout_frame.setVisible(true); // true to show the frame, false to hide it

        // Adding a WindowListener to close the frame when the user clicks the close button
        defaultlayout_frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) { // Triggered when the window close button is clicked
                defaultlayout_frame.dispose(); // Close the frame and release its resources
            }
        });
        // End of Default Layout

        // Flow Layout (Sets a simple left-to-right arrangement of components)
        flowlayout_frame.setLayout(new FlowLayout()); // Set the layout to FlowLayout (default left-to-right flow)

        // Create a label, button, and text area for the flow layout frame
        Label label = new Label("This is a label"); // A simple label
        Button button = new Button("Button"); // A simple button
        TextArea textArea = new TextArea(10, 10); // A text area with 10 rows and 10 columns

        // Set the size of the flow layout frame
        flowlayout_frame.setSize(400, 400); // Set the frame's size (400x400)

        // Add components to the frame
        flowlayout_frame.add(label); // Add the label to the frame
        flowlayout_frame.add(button); // Add the button to the frame
        flowlayout_frame.add(textArea); // Add the text area to the frame

        // Make the frame visible to the user
        flowlayout_frame.setVisible(true); // true to show the frame, false to hide it

        // Add a window listener to handle closing the frame
        flowlayout_frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                flowlayout_frame.dispose(); // Close the frame when the close button is clicked
            }
        });
        // End of Flow Layout

        // Border Layout (Divides the frame into 5 regions: North, South, East, West, and Center)
        borderlayout_frame.setLayout(new BorderLayout()); // Set the layout manager to BorderLayout

        borderlayout_frame.setSize(400, 400); // Set the size of the frame

        // Add buttons to each region of the BorderLayout
        borderlayout_frame.add(new Button("North"), BorderLayout.NORTH); // Add button to the North region
        borderlayout_frame.add(new Button("South"), BorderLayout.SOUTH); // Add button to the South region
        borderlayout_frame.add(new Button("East"), BorderLayout.EAST); // Add button to the East region
        borderlayout_frame.add(new Button("West"), BorderLayout.WEST); // Add button to the West region
        borderlayout_frame.add(new Button("Center"), BorderLayout.CENTER); // Add button to the Center region

        // Make the frame visible to the user
        borderlayout_frame.setVisible(true); // true to show the frame, false to hide it

        // Add a window listener to handle closing the frame
        borderlayout_frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                borderlayout_frame.dispose(); // Close the frame when the close button is clicked
            }
        });
        // End of Border Layout

        // Grid Layout (Arranges components in a grid with specified rows and columns)
        gridlayout_frame.setLayout(new GridLayout(3, 2, 10, 10)); // 3 rows, 2 columns, 10px horizontal and vertical gap
        gridlayout_frame.setSize(400, 400); // Set the size of the frame

        // Add buttons to the grid layout frame
        gridlayout_frame.add(new Button("Button 1")); // Add a button to the grid
        gridlayout_frame.add(new Button("Button 2")); // Add another button to the grid
        gridlayout_frame.add(new Button("Button 3")); // Add another button
        gridlayout_frame.add(new Button("Button 4")); // Add another button
        gridlayout_frame.add(new Button("Button 5")); // Add another button
        gridlayout_frame.add(new Button("Button 6")); // Add another button

        // Make the frame visible to the user
        gridlayout_frame.setVisible(true); // true to show the frame, false to hide it

        // Add a window listener to handle closing the frame
        gridlayout_frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                gridlayout_frame.dispose(); // Close the frame when the close button is clicked
            }
        });
        // End of Grid Layout
    }
}




// import java.awt.*;
// import java.awt.event.*;

// public class LayoutGUI_3 {
//     public static void main(String[] args) {
//         Frame defaultlayout_frame = new Frame("DefaultLayout Example Frame"); // Default layout frame
//         Frame flowlayout_frame = new Frame("FlowLayout Example Frame"); // Flow layout frame
//         Frame borderlayout_frame = new Frame("BorderLayout Example Frame"); // Border layout frame
//         Frame gridlayout_frame = new Frame("GridLayout Example Frame"); // Grid layout frame

//         // Default layout start
//         defaultlayout_frame.setSize(400, 400); // Frame.setSize(width, height)

//         Label label1 = new Label("This is default frame label"); // Label means the text which we want to show in GUI
//         Button button1 = new Button("Default frame button"); // Button - for click, call event etc.

//         defaultlayout_frame.add(label1); // Adding component here(components- label, button, textarea etc.)
//         defaultlayout_frame.add(button1);

//         defaultlayout_frame.setVisible(true); // setVisible(boolean value); value: (true-shows/visible the frame),
//                                               // (false-invisible the frame)

//         defaultlayout_frame.addWindowListener(new WindowAdapter() { // Window event listener listens window related
//                                                                     // action
//             @Override
//             public void windowClosing(WindowEvent e) { // Closing function triggered when the window close button
//                                                        // clicked
//                 defaultlayout_frame.dispose(); // Closing the frame by dispose() method/function
//             }
//         });
//         // Default layout end

//         // Flow layout strat
//         flowlayout_frame.setLayout(new FlowLayout()); // Layout select by setLayout() function/method. FlowLayout()
//                                                       // class ensures frame layout type

//         Label label = new Label("This is a label"); // label
//         Button button = new Button("Button");   // button

//         flowlayout_frame.setSize(400, 400); // frame size

//         TextArea textArea = new TextArea(10, 10);   // text area component like button, label

//         flowlayout_frame.add(label);    // Adding component in frame
//         flowlayout_frame.add(button);
//         flowlayout_frame.add(textArea);

//         flowlayout_frame.setVisible(true);  // visibility set true-visible, false-invisible

//         flowlayout_frame.addWindowListener(new WindowAdapter() {    //
//             @Override
//             public void windowClosing(WindowEvent e) {
//                 flowlayout_frame.dispose();
//             }
//         });
//         // flow layout end

//         // Border layout start
//         borderlayout_frame.setLayout(new BorderLayout());

//         borderlayout_frame.setSize(400, 400);

//         borderlayout_frame.add(new Button("North"), BorderLayout.NORTH);
//         borderlayout_frame.add(new Button("South"), BorderLayout.SOUTH);
//         borderlayout_frame.add(new Button("East"), BorderLayout.EAST);
//         borderlayout_frame.add(new Button("West"), BorderLayout.WEST);
//         borderlayout_frame.add(new Button("Center"), BorderLayout.CENTER);

//         borderlayout_frame.setVisible(true);

//         borderlayout_frame.addWindowListener(new WindowAdapter() {
//             @Override
//             public void windowClosing(WindowEvent e) {
//                 borderlayout_frame.dispose();
//             }
//         });
//         // Border box layout end

//         // Grid Layout start
//         gridlayout_frame.setLayout(new GridLayout(3, 2, 10, 10)); // GridLayout(row number, column number, horizontal
//                                                                   // gap, vertical gap)
//         gridlayout_frame.setSize(400, 400); // frame size define

//         gridlayout_frame.add(new Button("Button 1")); // shorthanded button creation
//         gridlayout_frame.add(new Button("Button 2"));
//         gridlayout_frame.add(new Button("Button 3"));
//         gridlayout_frame.add(new Button("Button 4"));
//         gridlayout_frame.add(new Button("Button 5"));
//         gridlayout_frame.add(new Button("Button 6"));

//         gridlayout_frame.setVisible(true);

//         gridlayout_frame.addWindowListener(new WindowAdapter() {
//             @Override
//             public void windowClosing(WindowEvent e) {
//                 gridlayout_frame.dispose();
//             }
//         });
//         // Grid Layout end
//     }
// }
