package ProjectHW;

public class Task4 {
    public static void main(String[] args) {
        int[][]num={
                {12,14,16},
                {15,17,19},
        };

        int sumEven=0;
        int sumOdd=0;

        for (int i = 0; i <num.length ; i++) {
            for (int j = 0; j <num[i].length ; j++) {
                if(num[i][j]%2==0){
                    sumEven+=num[i][j];
                }
                if(num[i][j]%2!=0){
                    sumOdd+=num[i][j];
                }

            }
        }System.out.println("The sum of Even numbers = "+sumEven);
        System.out.println("The sum of Odd numbers = "+sumOdd);
    }
}
