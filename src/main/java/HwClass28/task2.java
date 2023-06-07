package HwClass28;

public class task2 {
    public static void main(String[] args) {
            checkUserName("ibrahim");
    }
    public static void checkUserName(String userName){

            if (userName.length()<5){
                throw new RuntimeException("RuntimeException");
            }
            else System.out.println("great name my friend");
        }
    }

/*Create a method checkUserName that will throw a runtime exception.
 Method should throw an exception when entered username is less than 5 characters.*/