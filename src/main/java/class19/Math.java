package class19;

public class Math {
    static void add(int num1,int num2){
        System.out.println(num1+num2);
    }
    static void add(int num1,double num2){
        System.out.println(num1+num2);
    }
    static void add(double num2,int num1){
        System.out.println(num2+num1);
    }
    static void add(double num1,double num2){
        System.out.println(num1+num2);
    }
    public static void main(String[] args) {
        add(2,3);
        add(4,6.0);
        add(4.0,5);
        add(8.0,4.0);
    }
}
