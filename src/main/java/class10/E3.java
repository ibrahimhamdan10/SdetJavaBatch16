package class10;

public class E3 {
    public static void main(String[] args) {
        int [][]number={
                {1, 2 ,3},
                {4, 5 ,6},
                {7, 8 ,9},
        };

        for (int j = 0; j <3 ; j++) {

            int []arr1=number[j];
            for (int i = 0; i <arr1.length ; i++) {
                System.out.print(arr1[i]+" ");
            }
            System.out.println();
        }
    }
}
