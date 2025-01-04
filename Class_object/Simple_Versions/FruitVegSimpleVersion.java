// Importing the ArrayList class which will be used to store a collection of items.
import java.util.ArrayList;

// Item class represents an item that has a name, type, and price.
class Item {
    // Private fields to store the details of an item.
    private String name;    // Name of the item (e.g., "Tomato", "Mango")
    private String type;    // Type of the item (e.g., "vegetable", "fruit")
    private Double price;   // Price of the item (e.g., 10.0, 30.0)
    
    // Constructor to initialize the fields when an item object is created.
    public Item(String name, String type, Double price) {
        this.name = name;     // Initialize the name field with the given name
        this.type = type;     // Initialize the type field with the given type
        this.price = price;   // Initialize the price field with the given price
    }

    // Getter method to retrieve the name of the item
    String getName() {
        return this.name;
    }

    // Getter method to retrieve the type of the item
    String getType() {
        return this.type;
    }

    // Getter method to retrieve the price of the item
    Double getPrice() {
        return this.price;
    }
}

// Inventory class represents a collection of items.
class Inventory {
    // An ArrayList to store the items in the inventory.
    ArrayList<Item> items = new ArrayList<Item>();

    // Method to add an item to the inventory.
    public void addItem(Item item) {
        items.add(item);  // Adds the given item to the items list.
    }

    // Method to display all items in the inventory.
    public void displayItems() {
        System.out.println("Items:");  // Print a title for the list of items.
        
        // Loop through all items in the inventory and print their details.
        for (Item item : items) {
            // Displaying the details of each item using its getter methods.
            System.out.println("Name: " + item.getName());
            System.out.println("Type: " + item.getType());
            System.out.println("Price: " + item.getPrice() + "$\n");
        }
    }
}

// Main class where the program starts executing
public class FruitVegSimpleVersion {
    public static void main(String[] args) {
        // Create an inventory object to store items.
        Inventory inventory = new Inventory();

        // Adding items to the inventory using the addItem method.
        inventory.addItem(new Item("Tomato", "vegetable", 10.0));  // Adds a vegetable item
        inventory.addItem(new Item("Mango", "fruit", 30.0));      // Adds a fruit item
        inventory.addItem(new Item("Lichi", "fruit", 15.0));      // Adds another fruit item
        inventory.addItem(new Item("Pumpkin", "vegetable", 5.30)); // Adds another vegetable item

        // Display the list of items in the inventory by calling displayItems method.
        inventory.displayItems();
    }
}





// package Assignment1;
// import java.util.ArrayList;

// class Item{
//     private String name;    // It is not mandatory use of private
//     private String type;
//     private Double price;
    
//     public Item(String name, String type, Double price){
//         this.name = name;
//         this.type = type;
//         this.price = price;
//     }

//     String getName() {
//         return this.name;
//     }

//     String getType() {
//         return this.type;
//     }

//     Double getPrice() {
//         return this.price;
//     }
// }

// class Inventory{
//     ArrayList<Item> items = new ArrayList<Item>();

//     public void addItem(Item item){
//         items.add(item);
//     }

//     public void displayItems(){
//         System.out.println("Items:");
//         for(Item item:items){
//             System.out.println("Name: " + item.getName());
//             System.out.println("Type: " + item.getType());
//             System.out.println("Price: " + item.getPrice() + "$\n");
//         }
//     }
// }

// public class FruitVegSimpleVersion {
//     public static void main(String[] args) {
//         Inventory inventory = new Inventory();

//         // Input section
//         inventory.addItem(new Item("Tomato", "vegitable", 10.0));
//         inventory.addItem(new Item("Mango", "fruit", 30.0));
//         inventory.addItem(new Item("Lichi", "fruit", 15.0));
//         inventory.addItem(new Item("Pumpkin", "vegitable", 5.30));

//         // Display items
//         inventory.displayItems();
//     }
// }