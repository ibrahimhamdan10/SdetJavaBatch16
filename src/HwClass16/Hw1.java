package HwClass16;

public class Hw1 {
    public static void main(String[] args) {

        String result= reverseMethod("ibrahim");
        System.out.println(result);
    }
  static String reverseMethod(String s){
        String word="";
      for (int i =s.length()-1; i >= 0 ; i--) {
       word+=s.charAt(i);
      }
      return word;
  }

}
