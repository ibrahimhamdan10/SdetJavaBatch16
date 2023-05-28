package class19;

import repilt2.A;

public class Dog extends Animal {
    String eyeColor;
 Dog(String name,String color,int weight,int numOfLegs,int age,String eyeColor){
     super(name, color, weight, numOfLegs, age);
     this.eyeColor=eyeColor;

   }
 void display(){
        System.out.println(name+" "+color+" "+weight
        +" "+numOfLegs+" "+age+" "+eyeColor);
    }

}

