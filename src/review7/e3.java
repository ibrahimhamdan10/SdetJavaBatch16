package review7;

public class e3 {
    public static void main(String[] args) {
        e3 obj= new e3();
        double result= obj.convertTemp(45);
        System.out.println(result);
    }
    double convertTemp(int cel){
        double f= cel*9/5+32;
        return f;
    }
}
