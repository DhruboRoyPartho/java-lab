import java.awt.*;  // Import classes for GUI components such as Frame, Menu, MenuItem, etc.
import java.awt.event.*;  // Import event handling classes to handle user interactions like clicks.
import java.util.ArrayList;  // Import ArrayList class to store dynamic lists.

public class Example_8 {
    public static void main(String[] args) {
        // Create a frame (window) to hold the menu bar and other components
        Frame frame = new Frame("Menu Bar with output example");
        frame.setSize(500, 500);  // Set the size of the frame to 500px wide and 500px high

        // Create a MenuBar to add menus to the frame
        MenuBar menuBar = new MenuBar();

        // Create two menus: one for "Indian States" and one for "Indian Cities"
        Menu menu1 = new Menu("Indian States");
        Menu menu2 = new Menu("Indian Cities");

        // Create an ArrayList to store the menu items dynamically
        ArrayList<MenuItem> menuItem = new ArrayList<MenuItem>();

        // An array of state names to add to the "Indian States" menu
        String[] statesName = {"Himachal Pradesh", "Rajasthan", "West Bengal", "Andhra Pradesh", "Tamilnadu", "Karnataka"};
        
        int i = 0;  // Initialize a counter to track the index of states in the array
        for (String item : statesName) {
            // If the counter reaches 3, add a separator to the menu for better visual organization
            if (i == 3) menu1.addSeparator();  // Not mandatory, just for separation
            // Create a new MenuItem for each state and add it to the ArrayList
            menuItem.add(new MenuItem(item));
            // Add the created MenuItem to the "Indian States" menu
            menu1.add(menuItem.get(i));
            i++;  // Increment the counter
        }

        // Add both menus to the menu bar (menu1 and menu2)
        menuBar.add(menu1);
        menuBar.add(menu2);
        // Set the menu bar for the frame
        frame.setMenuBar(menuBar);

        // Add a window listener to handle the closing event when the window is closed
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Exit the program when the window is closed
                System.exit(0);
            }
        });

        // Add ActionListeners for each menu item dynamically using the ArrayList
        for (int j = 0; j < menuItem.size(); j++) {
            final int index = j;  // Store the current index in a final variable (for use in the ActionListener)
            // Add an ActionListener to each menu item
            menuItem.get(j).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // When a menu item is clicked, print a message with the corresponding state name
                    System.out.println("You have clicked on '" + statesName[index] + "'.");
                }
            });
        }

        // Make the frame visible so the user can interact with the GUI
        frame.setVisible(true);
    }
}






// import java.awt.*;
// import java.awt.event.*;
// import java.util.ArrayList;

// public class Example_8 {
//     public static void main(String[] args) {
//         Frame frame = new Frame("Menu Bar with output example");
//         frame.setSize(500, 500);

//         MenuBar menuBar = new MenuBar();
//         Menu menu1 = new Menu("Indian States");
//         Menu menu2 = new Menu("Indian Cities");

//         ArrayList<MenuItem> menuItem = new ArrayList<MenuItem>();
//         String[] statesName = {"Himachal Pradesh", "Rajasthan", "West Bengal", "Andhra Pradesh", "Tamilnadu", "Karnataka"};
//         int i = 0;
//         for(String item:statesName){
//             if(i == 3) menu1.addSeparator();    // Not mandatory
//             menuItem.add(new MenuItem(item));
//             menu1.add(menuItem.get(i));
//             i++;
//         }
//         menuBar.add(menu1);
//         menuBar.add(menu2);
//         frame.setMenuBar(menuBar);

//         frame.addWindowListener(new WindowAdapter(){
//             @Override
//             public void windowClosing(WindowEvent e){
//                 System.exit(0);
//             }
//         });

//         for(int j=0;j<menuItem.size();j++){
//             final int index = j;
//             menuItem.get(j).addActionListener(new ActionListener(){
//                 @Override
//                 public void actionPerformed(ActionEvent e) {
//                     System.out.println("You have clicked on \'" + statesName[index] + "\'.");
//                 }
//             });
//         }


//         frame.setVisible(true);
//     }
// }