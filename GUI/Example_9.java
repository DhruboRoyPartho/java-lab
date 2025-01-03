import java.awt.*;  // Importing classes from the java.awt package for GUI components.
import java.awt.event.*;  // Importing event classes for handling user actions like button clicks.

public class Example_9 {
    public static void main(String[] args) {
        // Create a new Frame (window) with the title "Fahrenheit to Celsius Conversion Example"
        Frame frame = new Frame("Fahrenheit to Celcius Conversion Example");
        
        // Set the size of the frame (window)
        frame.setSize(400, 400);
        
        // Set the layout of the frame to FlowLayout (components will be arranged left to right)
        frame.setLayout(new FlowLayout());

        // Create a Label with the text "Enter Fahrenheit temperature: "
        Label label1 = new Label("Enter Fahrenheit temperature: ");
        
        // Create a TextField to input the Fahrenheit temperature, defaulting to "0"
        TextField f_field = new TextField("0", 5);  // 5 means the width of the TextField will be 5 characters.

        // Create another Label to display "Temperature in Celsius: "
        Label label2 = new Label("Temperature in Celcius: ");
        
        // Create a TextField to display the converted Celsius temperature (initially empty)
        TextField c_field = new TextField("", 5);  // 5 means the width of the TextField will be 5 characters.
    
        // Create a Button that will trigger the conversion when clicked, with the label "Convert"
        Button convert = new Button("Convert");

        // Add the components (label, text fields, and button) to the frame (window)
        frame.add(label1);
        frame.add(f_field);
        frame.add(label2);
        frame.add(c_field);
        frame.add(convert);

        // Make the frame visible (display it on the screen)
        frame.setVisible(true);

        // Add a window listener to handle the event when the user closes the window
        frame.addWindowListener(new WindowAdapter() {
            // Override the windowClosing method to close the application when the window is closed
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);  // Exit the program
            }
        });

        // Add an action listener to the "Convert" button to perform the conversion when clicked
        convert.addActionListener(new ActionListener(){
            @Override
            // The actionPerformed method is called when the button is clicked
            public void actionPerformed(ActionEvent e){
                // Get the text entered in the Fahrenheit text field (f_field)
                String s = f_field.getText();
                
                // Convert the text from String to Double (Fahrenheit temperature)
                Double f_temp = Double.parseDouble(s);  // Parse the string as a double.
                
                // Convert the Fahrenheit temperature to Celsius using the formula
                // Celsius = (5/9) * (Fahrenheit - 32)
                Double c_temp = (5.0/9.0) * (f_temp - 32);

                /* 
                Below are two ways to convert the Celsius value to a string:
                1. String.valueOf(c_temp): Converts the double value to a string without rounding.
                2. String.format("%.2f", c_temp): Converts the double value to a string, rounding it to 2 decimal places.
                You can use either method, depending on whether you want to round the Celsius value to two decimal places.
                */
                
                // Convert the Celsius temperature to a string (rounded to 2 decimal places)
                s = String.format("%.2f", c_temp);  // Format the number to show 2 decimal places
                
                // Set the formatted Celsius string to the Celsius text field (c_field)
                c_field.setText(s);
            }
        });
    }
}




// import java.awt.*;
// import java.awt.event.*;

// public class Example_9 {
//     public static void main(String[] args) {
//         Frame frame = new Frame("Fahrenheit to Celcius Conversion Example");
//         frame.setSize(400, 400);
//         frame.setLayout(new FlowLayout());

//         Label label1 = new Label("Enter Fahrenheit temperature: ");
//         TextField f_field = new TextField("0", 5);

//         Label label2 = new Label("Temperature in Celcius: ");
//         TextField c_field = new TextField("", 5);
    
//         Button convert = new Button("Convert");

//         frame.add(label1);
//         frame.add(f_field);
//         frame.add(label2);
//         frame.add(c_field);
//         frame.add(convert);

//         frame.setVisible(true);

//         frame.addWindowListener(new WindowAdapter() {
//             @Override
//             public void windowClosing(WindowEvent e){
//                 System.exit(0);
//             }
//         });

//         convert.addActionListener(new ActionListener(){
//             @Override
//             public void actionPerformed(ActionEvent e){
//                 String s = f_field.getText();
//                 Double f_temp = Double.parseDouble(s);
//                 Double c_temp = (5.0/9.0) * (f_temp - 32);

//                 /*  Below the next 2 lines you can use any one of them. Two lines are correct. */
//                 // s = String.valueOf(c_temp);      /*  this will give accurate value */
//                 s = String.format("%.2f", c_temp);  /*  this will give 2 digit after radix point */
                
//                 c_field.setText(s);
//             }
//         });
//     }
// }



