// Parent class
class Vehicle {
    private String brand;
    private String model;
    private int year;

    Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void displayVehicleDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Child class
class Car extends Vehicle {
    String type = "Car";
    String engine;
    String color;
    int wheel_num;
    Car(String brand, String model, int year, String color, String engine, int wheel_num){
        super(brand, model, year);
        this.color = color;
        this.engine = engine;
        this.wheel_num = wheel_num;
    }

    void displayVehicleDetails(boolean trig) {
        super.displayVehicleDetails();        
        System.out.println("Color: " + color);
        System.out.println("Engine capacity: " + engine + " cc");
        System.out.println("Number of wheels: " + wheel_num);
    }
}

// Child class
class Truck extends Vehicle {
    String type = "Truck";
    String engine;
    String color;
    int wheel_num;
    Truck(String brand, String model, int year, String color, String engine, int wheel_num){
        super(brand, model, year);
        this.color = color;
        this.engine = engine;
        this.wheel_num = wheel_num;
    }

    void displayVehicleDetails(boolean trig) {
        super.displayVehicleDetails();        
        System.out.println("Color: " + color);
        System.out.println("Engine capacity: " + engine + " cc");
        System.out.println("Number of wheels: " + wheel_num);
    }
}

// Child class
class Motorcycle extends Vehicle {
    String type = "Motorcycle";
    String engine;
    String color;
    int wheel_num;
    Motorcycle(String brand, String model, int year, String color, String engine, int wheel_num){
        super(brand, model, year);
        this.color = color;
        this.engine = engine;
        this.wheel_num = wheel_num;
    }

    void displayVehicleDetails(boolean trig) {
        super.displayVehicleDetails();        
        System.out.println("Color: " + color);
        System.out.println("Engine capacity: " + engine + " cc");
        System.out.println("Number of wheels: " + wheel_num);
    }
}

// Main class
public class VehicleHierarchy {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2018, "Red", "1200.0", 4);
        Truck truck  = new Truck("Mitsubishi", "HR-05", 2014, "Yello", "4500.0", 6);
        Motorcycle motorcycle = new Motorcycle("Yamaha", "R15", 2023, "Blue", "149.5", 2);
        
        System.out.println("\n=======================\n");
        System.out.println("Car base object details:");
        car.displayVehicleDetails();
        System.out.println("---------------------");
        System.out.println("Car full details:");
        car.displayVehicleDetails(true);

        System.out.println("\n=======================");
        System.out.println("\nTruck base object details:");
        truck.displayVehicleDetails();
        System.out.println("---------------------");
        System.out.println("Truck full details:");
        truck.displayVehicleDetails(true);

        System.out.println("\n=======================");
        System.out.println("\nMotorcycle base object details:");
        motorcycle.displayVehicleDetails();
        System.out.println("---------------------");
        System.out.println("Motorcycle full details:");
        motorcycle.displayVehicleDetails(true);
        
        return;
    }
}