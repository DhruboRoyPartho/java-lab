/* Note: Frame does not contain border line of panel directly. JFrame contains this.
If you want border lines you should use JFrame instead of Frame.
I kept this code as simple and easy as possible.
*/
// ----------------------------------------------------------------

// Main code is in below which is comment out
// For better understand guided code starts at line 65.

// import java.awt.*;
// import java.awt.event.*;

// public class RadioButton_ComboBox_CheckBox_5 {
//     public static void main(String[] args){
//         Frame frame = new Frame("Radio Button, Combo Box and Check Boxes Example");
//         frame.setSize(500, 500);

//         Panel panel1 = new Panel();
//         Panel panel2 = new Panel();
//         frame.setLayout(new GridLayout(1, 2, 10, 10));
//         panel1.setLayout(new GridLayout(0, 1));
//         panel2.setLayout(new GridLayout(0, 1));

//         // Panel1 start
//         CheckboxGroup group = new CheckboxGroup();

//         Checkbox radioButton1 = new Checkbox("4 slices", group, false);
//         Checkbox radioButton2 = new Checkbox("8 slices", group, false);

//         panel1.add(new Label("Radio Buttons"));
//         panel1.add(radioButton1);
//         panel1.add(radioButton2);

//         frame.add(panel1);
//         // Panel1 end

//         // Panel2 start
//         Checkbox check1 = new Checkbox("Anchovies");
//         Checkbox check2 = new Checkbox("Garlic");
        
//         String[] items = {"Bird", "Cat", "Dog", "Rabbit", "Cow"};
//         Choice comboBox = new Choice();

//         for(String item:items){
//             comboBox.add(item);
//         }
//         panel2.add(new Label("Check Boxes"));
//         panel2.add(check1);
//         panel2.add(check2);
//         panel2.add(comboBox);
        
//         frame.add(panel2);
//         //Panel2 end
//         frame.addWindowListener(new WindowAdapter() {
//             @Override
//             public void windowClosing(WindowEvent e){
//                 System.exit(0);
//             }
//         });

//         frame.setVisible(true);
//     }
// }



import java.awt.*;
import java.awt.event.*;

public class RadioButton_ComboBox_CheckBox_5 {
    public static void main(String[] args){
        // Create a new Frame (main window) with a title
        Frame frame = new Frame("Radio Button, Combo Box and Check Boxes Example");

        // Set the size of the frame (width 500px and height 500px)
        frame.setSize(500, 500);

        // Create two Panels to organize components into separate sections
        Panel panel1 = new Panel();
        Panel panel2 = new Panel();

        // Set the layout of the frame to be a GridLayout with 1 row and 2 columns (two panels side by side)
        frame.setLayout(new GridLayout(1, 2, 10, 10));

        // Set the layout of both panels to be GridLayout with 1 column for each panel (components will be arranged vertically)
        panel1.setLayout(new GridLayout(0, 1)); // "0" means as many rows as needed
        panel2.setLayout(new GridLayout(0, 1)); // "0" means as many rows as needed

        // Panel1 start (for radio buttons)
        
        // Create a CheckboxGroup to group radio buttons so that only one can be selected at a time
        CheckboxGroup group = new CheckboxGroup();

        // Create two radio buttons (checkboxes with exclusive selection)
        Checkbox radioButton1 = new Checkbox("4 slices", group, false); // Initial state is unchecked (false)
        Checkbox radioButton2 = new Checkbox("8 slices", group, false); // Initial state is unchecked (false)

        // Add a label to indicate what the section is about (Radio Buttons)
        panel1.add(new Label("Radio Buttons"));

        // Add the radio buttons to panel1 (the panel on the left side of the frame)
        panel1.add(radioButton1);
        panel1.add(radioButton2);

        // Add panel1 to the frame
        frame.add(panel1);
        // Panel1 end

        // Panel2 start (for checkboxes and combo box)
        
        // Create two checkboxes for additional options
        Checkbox check1 = new Checkbox("Anchovies");
        Checkbox check2 = new Checkbox("Garlic");

        // Create a Choice component, which is a drop-down menu (combo box)
        String[] items = {"Bird", "Cat", "Dog", "Rabbit", "Cow"}; // Items to be displayed in the combo box
        Choice comboBox = new Choice();

        // Add each item from the "items" array to the combo box
        for(String item:items){
            comboBox.add(item);  // Add items like Bird, Cat, Dog, etc. to the combo box
        }

        // Add a label to indicate what the section is about (Check Boxes)
        panel2.add(new Label("Check Boxes"));

        // Add the checkboxes and combo box to panel2 (the panel on the right side of the frame)
        panel2.add(check1);
        panel2.add(check2);
        panel2.add(comboBox);

        // Add panel2 to the frame
        frame.add(panel2);
        // Panel2 end

        // Add a window listener to handle window close event
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                // Exit the program when the window is closed
                System.exit(0);
            }
        });

        // Set the frame to be visible so that the user can see it
        frame.setVisible(true);
    }
}
