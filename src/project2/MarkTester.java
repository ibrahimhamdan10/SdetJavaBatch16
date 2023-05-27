
package project;
public class MarkTester {


//import java.sql.SQLOutput;

    public static void main(String[] args) {

        A obj = new A(20,30,40);
        double averageForA = obj.getPercentage();
        System.out.println(averageForA);

        B obj2 = new B(30,50,70,15);
        double averageForB = obj2.getPercentage();
        System.out.println(averageForB);

    }

}
