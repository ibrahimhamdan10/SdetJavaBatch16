package class8;

public class E1nested {
    public static void main(String[] args) {
        int counter=1;
        while(counter<=5) {

            for (int i = 2; i <= 10  ; i+=2) {
                System.out.print(i+" ");

            }
            System.out.println();
            counter++;

        }
    }
}
