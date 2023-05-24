package HwClass19;

public class Programming {

    public Programming() {
        System.out.println("I love programming languages");
    }

    public Programming(String word) {
        System.out.println("I love Java");
    }


    public static void main(String[] args) {

        Programming obj1 = new Programming();
        Programming obj2 = new Programming("Java");
    }
}
