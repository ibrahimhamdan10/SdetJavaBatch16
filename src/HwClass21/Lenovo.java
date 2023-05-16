package HwClass22;

public class Lenovo extends Computer{

    Lenovo(String color, int screenSize, double weight) {
        super(color, screenSize, weight);
    }

    @Override
    void features() {
        System.out.println("9 gb ram and so bad chip");
    }
    @Override
    void sound() {
        System.out.println("lolololo");
    }
    void search(){
        System.out.println("search bar in the right");
    }
}
