package HwClass22;

public class Dell extends Computer{

    Dell(String color,int screenSize,double weight){
        super(color, screenSize, weight);
    }
    @Override
    void features() {
        System.out.println("6 gb ram and bad chip");
    }

    @Override
    void sound() {
        System.out.println("vevevevev");
    }
    void desktop(){
        System.out.println("beautiful");
    }
}
