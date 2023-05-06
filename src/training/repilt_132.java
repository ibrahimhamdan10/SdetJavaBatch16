package training;

public class repilt_132 {
    public static void main(String[] args) {
        repilt_132 obj = new repilt_132();
        int[][]a={
                {1, 2, 3, 4 },
                {4 ,5, 6, 7 },
                {1 ,3, 5, 7 }
        };

        reduce10(a);
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
    static int [][] reduce10(int [][]array){

        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                array[i][j]= array[i][j]-10;
            }
        }return array;
    }
}
/*Complete the reduce10 method by making it subtract 10 from every element of the double array nums.
The method should static and it should return a new 2D array object
Print values from new array in the format below
input
```
1 2 3 4
4 5 6 7
1 3 5 7
```*/