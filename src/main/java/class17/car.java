package class17;

public class car {
    String make;
    String model;
    String color;
    int engineCC;

    car(String make,String model, String color,int engineCC){
        this.make =make;
        this.model =model;
        this.color =color;
        this.engineCC =engineCC;
    }
    void printInfo(){
        System.out.println(make+" "+model+" "+color+" "+engineCC);
    }


}
