package class20;

public class dog extends animal{
    dog(String name, String color, int age){
        super(name, color, age);
    }

    @Override
    void sleep(){
        System.out.println("dog sleep");
    }
    @Override
    void eat(){
        System.out.println("dog eating ");
    }
    @Override
    void speak(){
        System.out.println("dog speak");
    }

}
