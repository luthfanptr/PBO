package Praktikum.Sesi8.Vehicle;
//Inheritance dengan Konstruktor Superclass dan Method Overloading

//Superclass
class Vehicle {
    String brand;

    //Constructor
    public Vehicle(String brand){
        this.brand = brand;
    }

    // Metode untuk menampilkan informasi kendaraan
    public void displayInfo(){
        System.out.println("Brand: " + brand);
    }
}

//Subclass
class Car extends Vehicle{
    int doors;

    //constructor
    public Car(String brand, int doors){
        super(brand); // memanggil konstruktor superclass
        this.doors = doors;
    }

    //Overloading metode displayInfo
    public void displayInfo(String type){
        super.displayInfo();
        System.out.println("Type: " + type + ", Doors: " + doors);
    }
}

public class VehicleTester {
    public static void main(String[] args) {
        // Membuat objek car
        Car car = new Car("Toyota", 4);
        car.displayInfo("Sedan"); //Output: Brand: Toyota, Type: Sedan, Doors: 4
    }
}
