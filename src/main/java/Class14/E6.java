package Class14;

public class E6 {
    public static void main(String[] args) {
        E6 obj =new E6();
        boolean result= obj.Even(41);
        System.out.println(result);

    }

    boolean isEven=false;
    public boolean Even (int num){
        if(num%2==0){
            isEven =true;
        }
        return isEven;
    }



}
