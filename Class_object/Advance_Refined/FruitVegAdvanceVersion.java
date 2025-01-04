import java.util.ArrayList;   // Import ArrayList class to store a list of items
import java.util.Scanner;     // Import Scanner class for reading user input

// Class to represent an individual item
class Item {
    private String name;    // Item name (e.g., "Tomato")
    private String type;    // Item type (e.g., "fruit" or "vegetable")
    private double price;   // Price of the item (e.g., 10.0)
    private int quantity;   // Quantity of the item available (e.g., 50)

    // Constructor to initialize the Item object
    public Item(String name, String type, double price, int quantity) {
        this.name = name;     // Set the name of the item
        this.type = type;     // Set the type of the item
        this.price = price;   // Set the price of the item
        this.quantity = quantity; // Set the initial quantity of the item
    }

    // Getter method for item name
    public String getName() {
        return name;
    }

    // Getter method for item type
    public String getType() {
        return type;
    }

    // Getter method for item price
    public double getPrice() {
        return price;
    }

    // Getter method for item quantity
    public int getQuantity() {
        return quantity;
    }

    // Setter method for updating the quantity
    public void setQuantity(int q) {
        quantity += q;   // Add the new quantity to the existing quantity
    }
}

// Class to represent the inventory of items
class Inventory {
    Scanner sc = new Scanner(System.in);   // Scanner object to read user input

    // ArrayList to store a list of items
    ArrayList<Item> itemList = new ArrayList<Item>();

    // Method to add an item to the inventory
    public void addItem(Item item) {
        // Check if the item already exists in the inventory
        for (int i = 0; i < itemList.size(); i++) {
            // If the item with same name and type is found, update its quantity
            if (itemList.get(i).getName().equals(item.getName()) && itemList.get(i).getType().equals(item.getType())) {
                itemList.get(i).setQuantity(item.getQuantity());  // Add quantity
                return;  // Exit the method after updating
            }
        }
        // If the item is not found, add the new item to the list
        itemList.add(item);
    }

    // Method to display all items in the inventory
    public void displayItem() {
        // Loop through each item in the itemList and display its details
        for (Item item : itemList) {
            System.out.println("Item name: " + item.getName());
            System.out.println("Item type: " + item.getType());
            System.out.println("Item quantity: " + item.getQuantity());
            System.out.println("Item price: $" + item.getPrice() + "\n");
        }
    }

    // Method to display items by their categories (fruit/vegetable)
    public void displayByCategory() {
        // Display fruit items
        System.out.println("Fruit list:\n-----------");
        for (Item item : itemList) {
            if (item.getType().equals("fruit")) {
                System.out.println("Item name: " + item.getName());
                System.out.println("Item type: " + item.getType());
                System.out.println("Item quantity: " + item.getQuantity());
                System.out.println("Item price: $" + item.getPrice() + "\n");
            }
        }

        // Display vegetable items
        System.out.println("Vegetable list:\n---------------");
        for (Item item : itemList) {
            if (item.getType().equals("vegetable")) {
                System.out.println("Item name: " + item.getName());
                System.out.println("Item type: " + item.getType());
                System.out.println("Item quantity: " + item.getQuantity());
                System.out.println("Item price: $" + item.getPrice() + "\n");
            }
        }
    }

    // Method to search for an item by name
    public void search_item(String name) {
        // Loop through each item to check if its name matches the search term
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).getName().equals(name)) {
                // Display details of the item found
                System.out.println("Item name: " + itemList.get(i).getName());
                System.out.println("Item type: " + itemList.get(i).getType());
                System.out.println("Item quantity: " + itemList.get(i).getQuantity());
                System.out.println("Item price: $" + itemList.get(i).getPrice() + "\n");

                // Ask the user if they want to purchase, sell, or go back
                System.out.println("1. Purchase\n2. Sell\n3. Back");
                int choice = sc.nextInt();
                if (choice == 1) {
                    // Purchase: increase the quantity of the item
                    System.out.print("Enter amount to purchase: ");
                    int q = sc.nextInt();
                    itemList.get(i).setQuantity(q);
                    return;  // Exit the method
                } else if (choice == 2) {
                    // Sell: decrease the quantity of the item
                    System.out.print("Enter amount to sell: ");
                    int q = sc.nextInt();
                    if (itemList.get(i).getQuantity() < q) {
                        System.out.println("Not enough quantity.");
                        return;  // Exit if not enough quantity to sell
                    }
                    itemList.get(i).setQuantity(-q);  // Decrease quantity
                    return;  // Exit the method
                } else if (choice == 3) {
                    return;  // Exit the method to go back
                } else {
                    System.out.println("Invalid choice");
                    return;  // Exit for invalid choice
                }
            }
        }
    }
}

// Main class
class FruitVegAdvanceVersion {
    public static void main(String[] args) {
        // Scanner and Inventory objects
        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();

        // Input: Ask the user how many items they want to enter
        System.out.print("How many fruits or vegetables do you want to enter? ");
        int n = sc.nextInt();
        sc.nextLine();  // Use nextLine() to consume the leftover newline character from previous input

        // Loop to input details for each item
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter #" + i + " item name: ");
            String name = sc.nextLine();  // Read item name

            System.out.print("Enter #" + i + " item type: ");
            String type = sc.nextLine();  // Read item type

            System.out.print("Enter #" + i + " item quantity: ");
            int q = sc.nextInt();  // Read item quantity
            sc.nextLine();  // Use nextLine() to consume the leftover newline character

            System.out.print("Enter #" + i + " item price: ");
            double p = sc.nextDouble();  // Read item price
            sc.nextLine();  // Use nextLine() to consume the leftover newline character

            // Add the item to the inventory
            inventory.addItem(new Item(name, type, p, q));
        }

        // Display all items in the inventory
        System.out.println("\nAll items list:\n----------");
        inventory.displayItem();

        // Display items by category (fruit or vegetable)
        System.out.println("\nItems list by category:\n-----------------------");
        inventory.displayByCategory();

        // Search for an item by name
        System.out.println("Search an item by name: ");
        String item_name = sc.next();
        inventory.search_item(item_name);

        // Display items again after purchase/sell
        System.out.println("\nAfter buy or sell:\n===============\nAll items list:\n----------");
        inventory.displayItem();

        System.out.println("\nItems list by category:\n-----------------------");
        inventory.displayByCategory();

        sc.close();  // Close the scanner
    }
}





// import java.util.ArrayList;
// import java.util.Scanner;

// class Item{
// 	private String name;
// 	private String type;
// 	private double price;
// 	private int quantity;

// 	// Constractor
// 	public Item(String name, String type, double price, int quantity){
// 		this.name = name;
// 		this.type = type;
// 		this.price = price;
// 		this.quantity = quantity;
// 	}

// 	public String getName(){
// 		return name;
// 	}

// 	public String getType(){
// 		return type;
// 	}

// 	public double getPrice(){
// 		return price;
// 	}

// 	public int getQuantity(){
// 		return quantity;
// 	}

// 	public void setQuantity(int q){
// 		quantity += q;
// 	}
// }

// class Inventory{
// 	Scanner sc = new Scanner(System.in);

// 	// Inventory item array list
// 	ArrayList<Item> itemList = new ArrayList<Item>();
// 	public void addItem(Item item){
// 		/*for(Item e_item : itemList){
// 			if(e_item.getName().equals(item.getName()) && e_item.getType().equals(item.getType())){
// 				e_item.setQuantity(item.getQuantity());
// 				return;
// 			}
// 		}*/

// 		for(int i=0;i<itemList.size();i++){
// 			if(itemList.get(i).getName().equals(item.getName()) && itemList.get(i).getType().equals(item.getType())){
// 				itemList.get(i).setQuantity(item.getQuantity());
// 				return;
// 			}
// 		}
// 		itemList.add(item);
// 	}
// 	public void displayItem(){
// 		for(Item item : itemList){
// 			System.out.print("Item name: ");
// 			System.out.println(item.getName());
// 			System.out.print("Item type: ");
// 			System.out.println(item.getType());
// 			System.out.print("Item quantity: ");
// 			System.out.println(item.getQuantity());
// 			System.out.print("Item price: ");
// 			System.out.println("$" + item.getPrice() + "\n");
// 		}
// 	}

// 	public void displayByCatagory(){
// 		System.out.println("Fruit list:\n-----------");
// 		for(Item item : itemList){
// 			if(item.getType().equals("fruit")){
// 				System.out.print("Item name: ");
// 				System.out.println(item.getName());
// 				System.out.print("Item type: ");
// 				System.out.println(item.getType());
// 				System.out.print("Item quantity: ");
// 				System.out.println(item.getQuantity());
// 				System.out.print("Item price: ");
// 				System.out.println("$" + item.getPrice() + "\n");
// 			}
// 		}

// 		System.out.println("Vegitable list:\n---------------");
// 				for(Item item : itemList){
// 					if(item.getType().equals("vegitable")){
// 						System.out.print("Item name: ");
// 						System.out.println(item.getName());
// 						System.out.print("Item type: ");
// 						System.out.println(item.getType());
// 						System.out.print("Item quantity: ");
// 						System.out.println(item.getQuantity());
// 						System.out.print("Item price: ");
// 						System.out.println("$" + item.getPrice() + "\n");
// 					}
// 		}
// 	}

// 	public void search_item(String name){
// 		for(int i=0;i<itemList.size();i++){
// 			if(itemList.get(i).getName().equals(name)){
// 				System.out.print("Item name: ");
// 				System.out.println(itemList.get(i).getName());
// 				System.out.print("Item type: ");
// 				System.out.println(itemList.get(i).getType());
// 				System.out.print("Item quantity: ");
// 				System.out.println(itemList.get(i).getQuantity());
// 				System.out.print("Item price: ");
// 				System.out.println("$" + itemList.get(i).getPrice() + "\n");

// 				System.out.println("1. Purchase\n2. Sell\n3. Back");
// 				int slt = sc.nextInt();
// 				if(slt == 1){
// 					// purchase
// 					System.out.print("Enter ammount: ");
// 					int q = sc.nextInt();
// 					itemList.get(i).setQuantity(q);
// 					return;
// 				}
// 				else if(slt == 2){
// 					// sell
// 					System.out.print("Enter ammount to sell: ");
// 					int q = sc.nextInt();
// 					if(itemList.get(i).getQuantity() < q){
// 						System.out.println("Not enough quantity.");
// 						return;
// 					}
// 					itemList.get(i).setQuantity((-1)*q);
// 					return;
// 				}
// 				else if(slt == 3){
// 					// back
// 					return;
// 				}
// 				else{
// 					System.out.println("Invalid");
// 					return;
// 				}
// 			}
// 		}
// 	}
// }


// // Main class
// class FruitVegAdvanceVersion{
// 	public static void main(String[] args){
// 		// Scanner and Inventory object
// 		Scanner sc = new Scanner(System.in);
// 		Inventory inventory = new Inventory();

// 		// Input cycle number
// 		int n;

// 		System.out.print("How many fruit or veg do you want to enter: ");
// 		n = sc.nextInt();
// 		sc.nextLine();		// use for avoid String scanning conflict
// 		for(int i=1;i<=n;i++){
// 			System.out.print("Enter #" + i +" item name: ");
// 			String name = sc.nextLine();
			
// 			System.out.print("Enter #" + i +" item type: ");
// 			String type = sc.nextLine();

// 			System.out.print("Enter #" + i +" item quantity: ");
// 			int q = sc.nextInt();
// 			sc.nextLine();	// use for avoid String scanning conflict
			
// 			System.out.print("Enter #" + i +" item price: ");

// 			double p = sc.nextDouble();
// 			sc.nextLine();	// use for avoid String scanning conflict
// 			inventory.addItem(new Item(name, type, p, q));
// 		}

// 		System.out.println("\nAll items list:\n----------");
// 		inventory.displayItem();

// 		System.out.println("\nItems list by catagory:\n-----------------------");
// 		inventory.displayByCatagory();

// 		System.out.println("Search an item by name: ");
// 		String item_name = sc.next();
// 		inventory.search_item(item_name);

// 		System.out.println("\nAfter buy or sell:\n===============\nAll items list:\n----------");
// 		inventory.displayItem();

// 		System.out.println("\nItems list by catagory:\n-----------------------");
// 		inventory.displayByCatagory();
//         sc.close();
// 	}
// }