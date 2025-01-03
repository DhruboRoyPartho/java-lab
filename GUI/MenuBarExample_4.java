import java.awt.*;
import java.awt.event.*;

public class MenuBarExample_4 {
    
    // The main method is the starting point of the program
    public static void main(String[] args) {
        
        // Create a new Frame (main window) with the title "Menu Example"
        Frame frame = new Frame("Menu Example");
        
        // Set the size of the frame to 400 pixels by 400 pixels
        frame.setSize(400, 400);
        
        // Create a MenuBar which will hold all menus
        MenuBar menuBar = new MenuBar();
        
        // Create a Menu called "File" that will hold file-related options
        Menu fileMenu = new Menu("File");
        
        // Create MenuItems (individual options) for the "File" menu
        MenuItem openItem = new MenuItem("Open");  // Open item
        MenuItem saveItem = new MenuItem("Save as"); // Save item

        // Create another Menu called "Help" for help-related options
        Menu helpMenu = new Menu("Help");

        // Add the "Open" and "Save as" items to the "File" menu
        fileMenu.add(openItem);
        
        // Add a separator line between items in the menu (for visual separation)
        fileMenu.addSeparator();
        
        // Add the "Save as" item to the "File" menu
        fileMenu.add(saveItem);
        
        // Add the "File" menu to the menu bar
        menuBar.add(fileMenu);
        
        // Add the "Help" menu to the menu bar
        menuBar.add(helpMenu);
        
        // Set the menu bar for the frame
        frame.setMenuBar(menuBar);
        
        // Add a window listener to handle window closing events
        frame.addWindowListener(new WindowAdapter() {
            
            // This method is called when the window is closing
            @Override
            public void windowClosing(WindowEvent e){
                // Close the application when the window is closed
                System.exit(0);  // Exit the program
            }
        });
        
        // Make the frame (window) visible to the user
        frame.setVisible(true);
    }
}








// import java.awt.*;
// import java.awt.event.*;

// public class MenuBarExample_4 {
//     public static void main(String[] args) {
//         Frame frame = new Frame("Menu Example");
//         frame.setSize(400, 400);

//         MenuBar menuBar = new MenuBar();
//         Menu fileMenu = new Menu("File");
//         MenuItem openItem = new MenuItem("Open");
//         MenuItem saveItem = new MenuItem("Save as");

//         Menu helpMenu = new Menu("Help");

//         fileMenu.add(openItem);
//         fileMenu.addSeparator();
//         fileMenu.add(saveItem);

//         menuBar.add(fileMenu);
//         menuBar.add(helpMenu);
//         frame.setMenuBar(menuBar);

//         frame.addWindowListener(new WindowAdapter() {
//             @Override
//             public void windowClosing(WindowEvent e){
//                 System.exit(0);
//             }
//         });
        
//         frame.setVisible(true);
//     }
// }




