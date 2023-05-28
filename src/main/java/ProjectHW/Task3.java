package ProjectHW;

public class Task3 {
    public static void main(String[] args) {

        int [][]numbers={
                {10,22,33},
                {-7,-11,-4},
        };

        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                if(numbers[i][j]%2==0){
                    System.out.print(+numbers[i][j]+" ");
                     }

                                                         }

        }

    }
}
