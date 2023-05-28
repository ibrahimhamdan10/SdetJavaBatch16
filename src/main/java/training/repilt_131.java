package training;

public class repilt_131 {
    public static void main(String[] args) {
        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"
    }
    static String thirdLetter(String s){
        String word="";
        for (int i = 0; i <s.length() ; i+=3) {
             word+=s.charAt(i);
        }
             return word;
     }

 }

