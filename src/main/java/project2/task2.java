package project2;

public class task2 {
    public static void main(String[] args) {

        String original="madam";
        String reverse="";
        for (int i = original.length()-1; i >=0 ; i--) {
            reverse+=original.charAt(i);
        }
        System.out.println(reverse);

        boolean Palindrome=true;
        for (int i = 0; i <original.length() ; i++) {

            if(original.charAt(i)!=reverse.charAt(i)){
                Palindrome=false;
            }
        }
        if(Palindrome){
            System.out.println("Palindrome ");
        }
        else
            System.out.println("is not Palindrome");
    }
}
/*Check if a String is Palindrome: Determine whether a given string is a palindrome,
 which means it reads the same forwards and backward. For example, "madam" is a palindrome.*/

