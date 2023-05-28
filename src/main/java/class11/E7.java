package class11;

public class E7 {
    public static void main(String[] args) {
                boolean [][]arr2D={
                {true, false, true, true, false},
                {true, false, false, false, false}
        };
        // with the help of loops count how many times we have true in above 2Darray
        int counter=0;
        for(boolean[] arr1D:arr2D){
             for (boolean j :arr1D){
                 if(j==true){
                     counter++;
                 }
             }
        }
        System.out.println("counter = "+counter);

        System.out.println();
        counter=0;
        for (int i = 0; i <arr2D.length ; i++) {
            for (int j = 0; j <arr2D[i].length ; j++) {
                if(arr2D[i][j]==false){
                    counter++;
                }
            }
        }
        System.out.println("second counter = "+counter);
    }
}
