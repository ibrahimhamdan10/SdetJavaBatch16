package project2;

public class task1 {
    public static void main(String[] args) {

        task1 obj = new task1();
        String reverseWord =obj.reverse("Hello");
        System.out.println(reverseWord);
    }
    public String reverse(String s) {
        StringBuilder word = new StringBuilder(s);
        return word.reverse().toString();
    }
}

/*Reverse a String: Write a function to reverse a given string.
 For example, given the input "Hello", the output should be "olleH".*/


