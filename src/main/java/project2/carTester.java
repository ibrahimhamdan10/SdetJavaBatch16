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

