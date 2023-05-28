package ProjectHW;

public class Task2 {
    public static void main(String[] args) {

        int [] num={10,20,30,40,50};
        int sum=0;

        for (int i = 0; i <num.length ; i++) {
            sum+=num[i];
        }
        System.out.println("The sum of all stored elements = "+sum);
        System.out.println("The avg of all stored elements = "+sum/num.length);
    }
}
