package review7;

public class method {
    public static void main(String[] args) {
        System.out.println(largest(2,4));
    }
    static int largest (int num1,int num2){
        int largest;
        if(num1>num2){
           largest=num1;
        }else
            largest=num2;

            return largest;
    }
}
