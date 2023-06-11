<<<<<<< HEAD:src/main/java/project2/Car.java
package project2;
=======
package project;
>>>>>>> cbbcc966ea66f2efb3f7fd9675ac8798c69d979f:src/project/Car.java

public class Car {
    private double carPrice;
    private String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    public double calculateSalePrice(){
       return carPrice;
    }
}

class sedan extends Car{
        private  double length;
    public sedan(double carPrice, String color,double length) {
        super(carPrice, color);
        this.length=length;
    }

    public double calculateSalePrice(){
        double carPrice= super.calculateSalePrice();
        if (length>20){
            carPrice=carPrice*0.05;
        }else {
            carPrice = carPrice * 0.1;
        }
        return carPrice;
    }

}
class Truck extends Car{

    private double weight;

    public Truck(double carPrice, String color,double weight) {
        super(carPrice, color);
        this.weight=weight;
    }

    @Override
    public double calculateSalePrice(){
        double carPrice=super.calculateSalePrice();
        if(weight>2000){
           carPrice=carPrice*0.1;
        }else{
            carPrice=carPrice*0.2;
        }
        return carPrice;
    }
}
/*Create a Class Car that would have the following fields: carPrice and
color and method calculateSalePrice() which should be returning a
price of the car.
Create 2 sub classes: Sedan and Truck. The Truck class has a field as weight and
has its own implementation of calculateSalePrice()
method in which returned price is calculated as following: if
weight>2000 then returned price car should include 10% discount,
otherwise 20% discount.
The Sedan class has field as length and also does it is own
implementation of calculateSalePrice(): if length of sedan is >20 feet
then returned car price should include 5% discount, otherwise 10%
discount
*/

