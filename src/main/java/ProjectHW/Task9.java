package ProjectHW;

public class Task9 {
    public static void main(String[] args) {
        int[] numbers = {45, 60, 30, 0};
        int max = numbers[0];
        int second = numbers[3];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                second = max;
                max = numbers[i];
            } else if (numbers[i] > second && numbers[i] != max) {
                second = numbers[i];
            }

        }
        System.out.println("The second largest number is "+second);
    }
}
