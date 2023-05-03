package training;

public class Main9 {
    public static void main(String[] args) {
        Main9 obj = new Main9();
        boolean result = obj.even(2,4);
        System.out.println(result);
    }
    boolean even(int n1,int n2){
        if(n1%2==0&&n2%2==0){
            return true;
        }
        return false;
    }

}
