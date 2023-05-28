package class17;

public class food {
    public static void main(String[] args) {
        food obj = new food();
        obj.printFood();
    }
       String name="pasta";

     void printFood(){
        String name="burger";
        //if you didn't use this always local variable are preferred
        System.out.println(name);
        System.out.println(this.name);
    }
}
