package HwClass21;

public class Apple extends Computer{
    Apple(String color,int screenSize,double weight){
        super(color, screenSize, weight);
    }
    @Override
    void features(){
        System.out.println("16 gb ram and m1 chip");
    }
    @Override
    void sound(){
        System.out.println("momomom");
    }
    void closeSound(){
        System.out.println("mmmmmmmmm");
    }

}
