package class11;

public class E4 {
    public static void main(String[] args) {
        int [][]numbers={
                {10,20,30,40},
                {1,3,5,7,9,11},
                {10,8,6,4,2}
        };

        for(int [] i : numbers){
            for (int j : i){
                System.out.print(j+" ");
            }
        }
    }
}
