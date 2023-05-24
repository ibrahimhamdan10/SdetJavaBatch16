package class20;

public class horse extends animal{
    horse(String name, String color, int age){
        super(name, color, age);
    }
    @Override
    void sleep(){
        System.out.println("horse sleep");
    }
    @Override
    void eat(){
        System.out.println("horse eating ");
    }
    @Override
    void speak(){
        System.out.println("horse speak");
    }
}
