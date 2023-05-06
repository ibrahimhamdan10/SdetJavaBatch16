package HwClass16;

public class Hw2 {
    public static void main(String[] args) {

        String result=vowels("hello java");
        System.out.println(result);
    }
      static String vowels(String s){

       s=s.replaceAll("[^iouea]","");
       return s;

        }
}
