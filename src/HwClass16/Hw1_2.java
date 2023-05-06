package HwClass16;

public class Hw1_2 {
    public static void main(String[] args) {
        String result= reverseMethod("ibrahim Hamdan");
        System.out.println(result);

    }
    //another way
    static String reverseMethod(String s){
        StringBuilder obj = new StringBuilder(s);
        return obj.reverse().toString();
    }

}
