package training;

public class Mainm {
    public static void main(String[] args) {
            Mainm obj = new Mainm();
            String result= obj.spaceOut("hello");
            System.out.println(result);
    }
    String spaceOut(String a){
        String word="";
        for (int i = 0; i <a.length() ; i++) {
            word+=a.charAt(i)+" ";
        }return word;
    }
}
