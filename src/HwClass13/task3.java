package HwClass13;

public class task3 {
    public static void main(String[] args) {
        String str = "Aba";

        str = str.toLowerCase();
        StringBuilder reverse = new StringBuilder(str);
        reverse.reverse();

        if (str.equals(reverse.toString())) {
            System.out.println("true");
        }
        else
            System.out.println("false");

        }
    }


