import java.util.ArrayList;
import java.util.Scanner;

// Parent class
class Vehicle {
    public String brand;
    public String model;
    public int year;
    public String type;

    Vehicle(String brand, String model, int year, String type) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.type = type;
    }

    void displayVehicleDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Type: " + type);
    }
}

// Child class
class Car extends Vehicle {
    String engine;
    String color;
    int wheel_num;
    Car(String brand, String model, int year, String type, String color, String engine, int wheel_num){
        super(brand, model, year, type);
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
    Truck(String brand, String model, int year, String type, String color, String engine, int wheel_num){
        super(brand, model, year, type);
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
    Motorcycle(String brand, String model, int year, String type, String color, String engine, int wheel_num){
        super(brand, model, year, type);
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

class Garage {
    private int car_capacity;
    private int truck_capacity;
    private int bike_capacity;

    int car_num = 0;
    int truck_num = 0;
    int bike_num = 0;

    public ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
    Garage(int car, int truck, int bike){
        car_capacity = car;
        truck_capacity = truck;
        bike_capacity = bike;
    }
    void error_message() {
        System.out.println("!!!!!!!! There is no enough space");
    }
    void displayCapacity() {
        System.out.println("\n====Capacity====");
        System.out.println("Car: " + car_num + " / " + car_capacity);
        System.out.println("Truck: " + truck_num + " / " + truck_capacity);
        System.out.println("Motorcycle: " + bike_num + " / " + bike_capacity);
        System.out.println("================");
    }
    void insert_vehicle(Vehicle vehicle) {
        if(vehicle.type == "Car"){
            if(car_num == car_capacity){
                error_message();
            }
            else{
                vehicles.add(vehicle);
                car_num++;
            }
        }
        else if(vehicle.type == "Truck"){
            if(truck_num == truck_capacity){
                error_message();
            }
            else{
                vehicles.add(vehicle);
                truck_num++;
            }
        }
        else if(vehicle.type == "Motorcycle"){
            if(bike_num == bike_capacity){
                error_message();
            }
            else{
                vehicles.add(vehicle);
                bike_num++;
            }
        }
        else{
            System.out.println("Invalid vehicle");
        }
    }
    void remove_vehicle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter type: ");
        String v_type = sc.next();
        System.out.print("Enter brand name: ");
        String v_brand = sc.next();
        System.out.print("Enter model: ");
        String v_model = sc.next();

        boolean flag = false;

        for(int i=0;i<vehicles.size();i++){
            if(vehicles.get(i).model.equals(v_model) && vehicles.get(i).brand.equals(v_brand) && vehicles.get(i).type.equals(v_type)){
                vehicles.remove(i);
                flag = true;
                if(v_type.equals("Car") && car_num > 0) car_num--;
                else if(v_type.equals("Truck") && truck_num > 0) truck_num--;
                else if(v_type.equals("Motorcycle") && bike_num > 0) bike_num--;
                else{
                    System.out.println("No vehicle available");
                }
                break;
            }
        }

        if(flag == true){
            System.out.println("Removed");
        }
        else{
            System.out.println("Not found");
        }
        sc.close();
        return;
    }
}

public class GarageSystem {
    public static void main(String[] args) {
        Car car = new Car("a", "a", 2020, "Car", "red", "1200.0", 4);
        Truck truck = new Truck("b", "b", 2010, "Truck", "Red", "4500.0", 4);
        Motorcycle motorcycle = new Motorcycle("Yamaha", "R15", 2023, "Motorcycle", "red", "149.5", 2);
        // car.displayVehicleDetails();

        final int car_capacity = 3;
        final int truck_capacity = 2;
        final int bike_capacity = 2;

        Garage garage = new Garage(car_capacity, truck_capacity, bike_capacity);

        System.out.println("Starting phase:");
        garage.displayCapacity();

        garage.insert_vehicle(truck);
        System.out.println("After 1st truck insert:");
        garage.displayCapacity();

        garage.insert_vehicle(truck);
        System.out.println("After 2nd truck insert:");
        garage.displayCapacity();

        System.out.println("After 3rd truck insert:");
        garage.insert_vehicle(truck);
        garage.displayCapacity();

        System.out.println("After 1 motorcycle insert:");
        garage.insert_vehicle(motorcycle);
        garage.displayCapacity();

        System.out.println("Remove function:\n------------");
        garage.remove_vehicle();
        garage.displayCapacity();
    }
}