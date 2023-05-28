package training;

public class nestedfor {
    public static void main(String[] args) {

        for (int counter = 1; counter <=3 ; counter++) {
            System.out.println("the Outer loop value is "+counter);
                for (int i = 0; i <=2; i++) {
                    System.out.println("the Nested loop value is " + i);
                        for (int j = 0; j <=2 ; j++) {
                            System.out.println("the Third loop value is "+j);
                        }
                    System.out.println();
            }
            System.out.println();
        }

    }
}
