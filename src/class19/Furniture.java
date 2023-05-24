package class19;

public class Furniture {
    String color="Black";  //instance in the super class
}

class Chair extends Furniture{
    String color="White";  //instance in the same class

    void printColor(){
        String color="Blue";  //local variable
        System.out.println(color);
        System.out.println(super.color);
        System.out.println(this.color);
    }
}
class FurnitureTester{
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printColor();
    }
}
/*
Super keyword:
    By default javas preference for variables:
        1)local
        2) instance variables of the same class.
        3) instance variables of parent class.
if we want to modify this default preference. we can use "this" and "super" keyword
*/