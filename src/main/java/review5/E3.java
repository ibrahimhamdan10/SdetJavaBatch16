package review5;

public class E3 {
    public static void main(String[] args) {
        int [][]number={
                {1,2,3,4,5,6},
                {2,3,4,5,6,7,6},
                {3,4,5,6,7,8,9}
        };

        for (int row = 0; row <number.length ; row++) {
            for (int col = 0; col <number[row].length ; col++) {
                if(number[row][col]%3==0) {
                    System.out.print(number[row][col] + " ");
                }
            }
            System.out.println();
        }
    }
}
