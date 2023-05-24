package review8;

public class constructorExample {

    constructorExample(){
        System.out.println("no argument constructor");
    }
    constructorExample(String s){
        System.out.println("parametrized constructor");
    }
    public static void main(String[] args) {
             //constructor call
         constructorExample obj1=new constructorExample();
         constructorExample obj2=new constructorExample("hi");

    }
}
