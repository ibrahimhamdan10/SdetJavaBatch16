package training;

import java.util.Arrays;

public class repilt3_2Darray {
    public static void main(String[] args) {
        /*
        double [][]numbers={
                {1.4,2.0,3.3,2.0},
                {4.0,1.5,6.1,1.0},
                {1.2,3.1,4.0,1.6}
        };
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

         */
        /*
        double[][] ar = {
                {1.4,2.0,3.3,2},
                {4,1.5,6.1,1},
                {1.2,3.1,4,1.6}
        };

        for(int i =0; i< ar.length;i++){
            for ( int j = 0; j <ar[i].length ; j++) {
              ar[i][j]*=2;  //very good step
                System.out.print(ar[i][j]+" ");
                }
            System.out.println();
            }

         */
        /*
            int [] arr1D={5,4,8};
           int highest=arr1D[0];

        for (int i = 0; i <arr1D.length ; i++) {
            if(arr1D[i]>highest){
                highest=arr1D[i];
            }
        }
        System.out.println(highest);

         */
        /*

        int[][] ar = {
                {-5,-2,-3,7},
                {1,-5,-2, 2},
                {1,-2, 3,-4}
        };

        int sum=0;
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                sum+=ar[i][j];
            }
        }
        System.out.println(sum);

         */
        /*


        int[][] ar = {
                {1,1,2},
                {3,1,2},
                {3,5,3},
                {0,1,2}
        };

        for (int i = 0; i <ar.length ; i++) {
            int sum=0;
            for (int j = 0; j <ar[i].length ; j++) {
                sum += ar[i][j];
            }
            System.out.println(sum);
        }

         */


        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };
        int counter=0;
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                if(a[i][j]%2!=0&&a[i][j]<0){
                    counter++;
                }
            }

        } System.out.println(counter);




        

        int[][] ar = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };
        int sum=0;
        for (int i = 0; i <ar.length ; i+=2) {
            for (int j = 0; j <ar[i].length ; j+=2) {
                    sum+=ar[i][j];
            }
        } System.out.println(sum);

    }

    }





