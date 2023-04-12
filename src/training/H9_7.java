package training;

public class H9_7 {
    public static void main(String[] args) {

            int [] numbers={4,7,9,-9,5,12};
            int max= numbers[1];
        for (int counter = 0; counter <numbers.length ; counter++) {
           if(numbers[counter]>max){
               max=numbers[counter];
           }

        }
        System.out.println("The largest number is "+max);
    }
}
