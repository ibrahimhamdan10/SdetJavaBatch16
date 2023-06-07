package HwClass28;

public class task1 {
    public static void main(String[] args) {

        eligibility(17);

    }
    public static void eligibility(int age){

       if(age<16){
         throw new RuntimeException("Not eligible. Age is under 16");
       }
       else
           System.out.println("your age is legal");
    }
}
/*Create a method to check age eligibility that will throw a runtime exception.
Method should throw an exception age is less than 16.
.*/