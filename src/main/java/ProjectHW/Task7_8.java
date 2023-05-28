package ProjectHW;

public class Task7_8 {
    public static void main(String[] args) {
        int []Fibonacci={0, 1, 1, 2, 3, 5, 8, 13, 21, 34};

        int Maximum=Fibonacci[0];
        int Minimum=Fibonacci[4];

        for ( int i = 0; i <Fibonacci.length ; i++) {
            if(Fibonacci[i]>Maximum){
                Maximum=Fibonacci[i];
            }if(Fibonacci[i]<Minimum){
                Minimum=Fibonacci[i];
            }
            System.out.print(Fibonacci[i]+" ");
        }
        System.out.println();

        System.out.println("The Maximum number is "+Maximum);
        System.out.println("The Minimum number is "+Minimum);
    }
}
