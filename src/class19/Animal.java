package class19;

public class Animal {

    String name;
    String color;
    int weight;
    int numOfLegs;
    int age;
    public Animal (String name,String color,int weight,int numOfLegs,int age){
        this.name=name;
        this.numOfLegs=numOfLegs;
        this.age=age;
        this.weight=weight;
        this.color=color;
    }
    void display(){
        System.out.println(name+" "+color+" "+weight+" "+numOfLegs+" "+age);
    }

}
