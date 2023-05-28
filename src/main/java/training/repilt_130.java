package training;

public class repilt_130 {
    public static void main(String[] args) {
       // int[] a = {1,2,3,4,5};  //  another way give my array values and store it in another array called a and print it
      mystery(new int[]{10, 1, 30 ,2 ,50});
    }

    static void mystery(int [] array)	{
        for (int i = 0; i <array.length ; i++) {
            if(array[i]%2==0);
            System.out.print(array[i]+" ");
            }
        }
    }
