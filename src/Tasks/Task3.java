package Tasks;

public class Task3 {
    public static void main(String[] args) {
        Task3 obj = new Task3();
        boolean result= obj.prime(5);
        System.out.println(result);
    }

        public boolean prime(int num)
        {
            for (int i = 2; i <num ; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
                    return true;
        }

}
/*Write a method to return
 whether given number is prime or not?*/