package class11;

import org.w3c.dom.ls.LSOutput;

public class E6 {
    public static void main(String[] args) {
        int[][] arr2D = {
                {10, 20, 30, 40, 50}, //150
                {1, 2, 3, 4, 5},  //15
                {5, 5, 5, 5, 5}, //25
                {10, 8, 6, 4, 2}  //30
        };
        // with the help of loop you have to add all the elements
        // for each row and print their sum
        int sum=0;
        for (int [] i: arr2D){
            for(int j : i){
                 sum+=j;
                //sum=sum+j;
            }
        }
        System.out.println("sum = "+sum);
    }

}
