package Praktikum.Sesi8.Animal;

//Superclass
class Animal{
    // Properti
    String name;

    // Constructor
    public Animal(String name){
        this.name = name;
    }

    // Metode
    public void speak() {
        System.out.println("Animal Speaks");
    }
}

//Subclass
class Dog extends Animal {

    // Constructor
    public Dog(String name){
        super(name); // memanggil constructor dari superclass
    }

    // Override metode speak
    @Override
    public void speak(){
        System.out.println(name + " says Woof");
    }
}

public class AnimalTester {
    public static void main(String[] args) {
        // Membuat objek dari superclass Dog
        Dog dog = new Dog("Buddy");
        dog.speak(); // Output: Buddy says woof
    }
}
