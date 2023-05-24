package HwClass21;

public class HP extends Computer{


    HP(String color, int screenSize, double weight) {
        super(color, screenSize, weight);
    }

    @Override
    void features() {
        System.out.println("8 gb ram and good chip");
    }

    @Override
    void sound() {
        System.out.println("sasasasa");
    }
    void homePage(){
        System.out.println("organized");
    }
}
