package HwClass22;

public abstract class Computer {

    String color;
    int screenSize;
    double weight;

    Computer(String color,int screenSize,double weight){
        this.color=color;
        this.screenSize=screenSize;
        this.weight=weight;
    }


    abstract void features();
    abstract void sound ();


    void printInfo(){
        System.out.println(color+" "+screenSize+" "+weight);
    }


}
