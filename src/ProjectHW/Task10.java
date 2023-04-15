package ProjectHW;

public class Task10 {
    public static void main(String[] args) {
        String[]array={"apple", "banana", "pear", "banana", "peach", "apple", "grape"};
        for (int i = 0; i <array.length ; i++) {
            for (int j = i+1; j <array.length ; j++) {
               if(array[i].equals(array[j])){
                   System.out.println("Duplicate element : "+array[i]);
               }
            }
        }
    }
}
/*if we put int j=0 we gonna compare each element with it self and
 the answer always gonna be equal so we are not gonna get the real Duplicate strings
By using int j = i + 1, we start comparing each element with the
 element after it, excluding itself. This ensures that each pair of
 elements is only compared once, and we only find the
 duplicates in the array.*/