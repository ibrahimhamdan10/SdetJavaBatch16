package project;

import org.w3c.dom.ls.LSOutput;

public class carTester {
    public static void main(String[] args) {
        Car obj1 = new Car(2000, "black");
        System.out.println("Car price = " + obj1.calculateSalePrice());

        Truck obj2 = new Truck(20000, "White", 2500);
        System.out.println("Truck price = "+obj2.calculateSalePrice());

        sedan obj3 = new sedan(3000,"gray",20);
        System.out.println("Sedan price = "+obj3.calculateSalePrice());
    }
}
