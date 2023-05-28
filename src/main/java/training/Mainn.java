package training;

public class Mainn {
    public static void main(String[] args) {
        Mainn obj = new Mainn();
        int result = obj.sumEvenToX(8);
        System.out.println(result);
    }

    int sumEvenToX(int x) {
        int sumEven = 0;
        for (int i = 0; i <= x; i++) {

            if (i % 2 == 0) {
            sumEven+=i;
            }
        }return sumEven;
    }
}
