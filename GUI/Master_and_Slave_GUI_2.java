import java.awt.*;            // Importing AWT classes for creating GUI components like Frame, etc.
import java.awt.event.*;       // Importing AWT event classes to handle events like window closing

public class Master_and_Slave_GUI_2 {
    // The main method is where the program starts
    public static void main(String[] args) {
        
        // Creating the "Master" frame (main window)
        Frame master = new Frame("Master Frame");
        
        // Setting the size of the master window (width = 300 pixels, height = 400 pixels)
        master.setSize(300, 400);
        
        // Creating the "Slave" frame (secondary window)
        Frame slave = new Frame("Slave Frame");
        
        // Setting the size of the slave window (width = 200 pixels, height = 200 pixels)
        slave.setSize(200, 200);
        
        // Making both the master and slave frames visible so the user can see them
        master.setVisible(true);
        slave.setVisible(true);

        // Adding a window listener to the master frame to handle the window closing event
        master.addWindowListener(new WindowAdapter() {
            // This method is called when the user tries to close the master window
            @Override
            public void windowClosing(WindowEvent e) {
                // Dispose of both master and slave frames (close them)
                master.dispose();    // Close the master frame
                slave.dispose();     // Close the slave frame
                // Exit the program
                System.exit(0);
            }
        });

        // Adding a window listener to the slave frame to handle the window closing event
        slave.addWindowListener(new WindowAdapter() {
            // This method is called when the user tries to close the slave window
            @Override
            public void windowClosing(WindowEvent e) {
                // Dispose of the slave frame (close it) but keep the master frame open
                slave.dispose();    // Close the slave frame only
            }
        });
    }
}






// import java.awt.*;
// import java.awt.event.*;

// public class Master_and_Slave_GUI_2 {
//     public static void main(String[] args) {
//         Frame master = new Frame("Master Frame");
//         master.setSize(300, 400);
//         Frame slave = new Frame("Slave Frame");
//         slave.setSize(200, 200);
//         master.setVisible(true);
//         slave.setVisible(true);

//         master.addWindowListener(new WindowAdapter() {
//             @Override
//             public void windowClosing(WindowEvent e) {
//                 master.dispose();
//                 slave.dispose();
//                 System.exit(0);
//             }
//         });

//         slave.addWindowListener(new WindowAdapter() {
//             @Override
//             public void windowClosing(WindowEvent e) {
//                 slave.dispose();
//             }
//         });
//     }
// }