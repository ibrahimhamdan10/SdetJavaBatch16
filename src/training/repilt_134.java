package training;

public class repilt_134 {
    public static void main(String[] args) {
        System.out.println(countVowels("obama")); //3
        System.out.println(countVowels("happy friday! i love weekends")); //9
    }
    static int countVowels(String s){

        int count=0;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='a'||s.charAt(i)=='e'){
                count++;
            }
        }return count;
    }
}
