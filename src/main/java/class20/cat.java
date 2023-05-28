package class20;

public class cat extends animal{

    cat(String name, String color, int age){
        super(name, color, age);

    }
    @Override
    void sleep(){
        System.out.println("cat sleep");
    }
    @Override
    void eat(){
        System.out.println("cat eating ");
    }
    @Override
    void speak(){
        System.out.println("cat speak");
    }


}
