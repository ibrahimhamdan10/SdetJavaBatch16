package repilt2;

public class Main extends Method{
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        Method obj = new Method();
        int sumResult= sum2D(arr);
        System.out.println(sumResult);
    }
}
