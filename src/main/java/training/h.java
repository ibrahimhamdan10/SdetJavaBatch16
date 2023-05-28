package training;

class main {

    public static void main (String[]args){
        main obj = new main("Toyota" ,"prius",4,120,30000.0);
        obj.display();
        main obj2 = new main("Toyota","prius",120,30000.0);
        obj.display();
        main obj3= new main(4,120,3000.0);
        obj3.display();
        main obj4 = new main("Toyota","prius",4);
        obj4.display();

    }
    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    double price;

    public main(String make, String model, int numberOfDoors, int topSpeed, double price)
    {
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;
    }
    public main(String make, String model, int topSpeed, double price)
    {
        this.numberOfDoors=4;
        this.make=make;
        this.model=model;
        this.topSpeed=topSpeed;
        this.price=price;

    }
    public main(int numberOfDoors, int topSpeed, double price)
    {
        this.numberOfDoors=numberOfDoors;
        this.make="unknown";
        this.model="unknown";
        this.topSpeed=topSpeed;
        this.price=price;
    }
    public main(String make, String model, int numberOfDoors)
    {
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=90;
        this.price=0;

    }
    void display(){
        System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
    }

}