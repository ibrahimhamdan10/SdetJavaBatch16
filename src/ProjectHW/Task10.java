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
