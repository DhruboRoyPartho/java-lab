// Assignment: Fruit and Vegitable Management
// Author: Dhrubo Roy Partho
// Date: 21/04/2024
// Version: 1.0v

import java.util.ArrayList;
import java.util.Scanner;

class Item{
	private String name;
	private String type;
	private double price;
	private int quantity;

	// Constractor
	public Item(String name, String type, double price, int quantity){
		this.name = name;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName(){
		return name;
	}

	public String getType(){
		return type;
	}

	public double getPrice(){
		return price;
	}

	public int getQuantity(){
		return quantity;
	}

	public void setQuantity(int q){
		quantity += q;
	}
}

class Inventory{
	Scanner sc = new Scanner(System.in);

	// Inventory item array list
	ArrayList<Item> itemList = new ArrayList<Item>();
	public void addItem(Item item){
		/*for(Item e_item : itemList){
			if(e_item.getName().equals(item.getName()) && e_item.getType().equals(item.getType())){
				e_item.setQuantity(item.getQuantity());
				return;
			}
		}*/

		for(int i=0;i<itemList.size();i++){
			if(itemList.get(i).getName().equals(item.getName()) && itemList.get(i).getType().equals(item.getType())){
				itemList.get(i).setQuantity(item.getQuantity());
				return;
			}
		}
		itemList.add(item);
	}
	public void displayItem(){
		for(Item item : itemList){
			System.out.print("Item name: ");
			System.out.println(item.getName());
			System.out.print("Item type: ");
			System.out.println(item.getType());
			System.out.print("Item quantity: ");
			System.out.println(item.getQuantity());
			System.out.print("Item price: ");
			System.out.println("$" + item.getPrice() + "\n");
		}
	}

	public void displayByCatagory(){
		System.out.println("Fruit list:\n-----------");
		for(Item item : itemList){
			if(item.getType().equals("fruit")){
				System.out.print("Item name: ");
				System.out.println(item.getName());
				System.out.print("Item type: ");
				System.out.println(item.getType());
				System.out.print("Item quantity: ");
				System.out.println(item.getQuantity());
				System.out.print("Item price: ");
				System.out.println("$" + item.getPrice() + "\n");
			}
		}

		System.out.println("Vegitable list:\n---------------");
				for(Item item : itemList){
					if(item.getType().equals("vegitable")){
						System.out.print("Item name: ");
						System.out.println(item.getName());
						System.out.print("Item type: ");
						System.out.println(item.getType());
						System.out.print("Item quantity: ");
						System.out.println(item.getQuantity());
						System.out.print("Item price: ");
						System.out.println("$" + item.getPrice() + "\n");
					}
		}
	}

	public void search_item(String name){
		for(int i=0;i<itemList.size();i++){
			if(itemList.get(i).getName().equals(name)){
				System.out.print("Item name: ");
				System.out.println(itemList.get(i).getName());
				System.out.print("Item type: ");
				System.out.println(itemList.get(i).getType());
				System.out.print("Item quantity: ");
				System.out.println(itemList.get(i).getQuantity());
				System.out.print("Item price: ");
				System.out.println("$" + itemList.get(i).getPrice() + "\n");

				System.out.println("1. Purchase\n2. Sell\n3. Back");
				int slt = sc.nextInt();
				if(slt == 1){
					// purchase
					System.out.print("Enter ammount: ");
					int q = sc.nextInt();
					itemList.get(i).setQuantity(q);
					return;
				}
				else if(slt == 2){
					// sell
					System.out.print("Enter ammount to sell: ");
					int q = sc.nextInt();
					if(itemList.get(i).getQuantity() < q){
						System.out.println("Not enough quantity.");
						return;
					}
					itemList.get(i).setQuantity((-1)*q);
					return;
				}
				else if(slt == 3){
					// back
					return;
				}
				else{
					System.out.println("Invalid");
					return;
				}
			}
		}
	}
}


// Main class
class FruitVegManagement{
	public static void main(String[] args){
		// Scanner and Inventory object
		Scanner sc = new Scanner(System.in);
		Inventory inventory = new Inventory();

		// Input cycle number
		int n;

		System.out.print("How many fruit or veg do you want to enter: ");
		n = sc.nextInt();
		for(int i=1;i<=n;i++){
			System.out.print("Enter #" + i +" item name: ");
			String name = sc.next();
			System.out.print("Enter #" + i +" item type: ");
			String type = sc.next();

			System.out.print("Enter #" + i +" item quantity: ");
			int q = sc.nextInt();

			System.out.print("Enter #" + i +" item price: ");

			//String price = sc.next();
			//double p = Double.parseDouble(price);
			double p = sc.nextDouble();
			inventory.addItem(new Item(name, type, p, q));
		}

		System.out.println("\nAll items list:\n----------");
		inventory.displayItem();

		System.out.println("\nItems list by catagory:\n-----------------------");
		inventory.displayByCatagory();

		System.out.println("Search an item by name: ");
		String item_name = sc.next();
		inventory.search_item(item_name);

		System.out.println("\nAfter buy or sell:\n===============\nAll items list:\n----------");
		inventory.displayItem();

		System.out.println("\nItems list by catagory:\n-----------------------");
		inventory.displayByCatagory();

	}
}