<<<<<<< HEAD:src/main/java/project2/carTester.java
package project2;

public class carTester {
    public static void main(String[] args) {


            sedan obj2= new sedan(8250,"Red",25);
            double price1=obj2.calculateSalePrice();
            System.out.println("Total price with discount is: "+price1);

            Truck obj3 =new Truck(7500,"Black",2500);
            double price2=obj3.calculateSalePrice();
            System.out.println("Total price with discount is: "+price2);
        }
    }

=======
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
>>>>>>> cbbcc966ea66f2efb3f7fd9675ac8798c69d979f:src/project/carTester.java
