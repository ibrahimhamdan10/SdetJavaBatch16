package training;

public class trainConstructer {
    String make;
    String model;
    int year;
    double price;

    trainConstructer (){
        System.out.println("default");
    }
    void printInfo(){
        System.out.println(make+" "+model+" "+year+" "+price);
    }

    public static void main(String[] args) {
        trainConstructer obj = new trainConstructer();

    }
}
