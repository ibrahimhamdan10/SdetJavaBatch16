package training;

public class H9_6 {
    public static void main(String[] args) {
        int [] numbers={2,4,6,8,10};
        int sum=0;
        for (int counter = 0; counter <numbers.length ; counter++) {
            sum+=numbers[counter];
        }
        System.out.println(sum);
    }
}
