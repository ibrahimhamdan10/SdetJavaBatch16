package project;

import java.util.HashMap;

public class task5 {
    public static void main(String[] args) {

            task5 obj = new task5();
            findElements("abracadabra");
    }
    public static void findElements(String str){

        HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
        int lengthOfString = str.length();
        for (int i = 0; i <str.length() ; i++) {
            Character current= str.charAt(i);
            if(hmap.containsKey(current)==false){
                hmap.put(current,1);
            }else {
                int currentFreq=hmap.get(current);
                currentFreq++;
                hmap.put(current,currentFreq);
            }
        }
        boolean notFound=false;
        for (int i = 0; i <str.length() ; i++) {
            Character current= str.charAt(i);
            int currentFreq= hmap.get(current);
            if (currentFreq==1){
                System.out.println(current);
                notFound=true;
                break;
            }
        }
          if (notFound==false){
              System.out.println(-1);
        }
    }
}
/*Find the First Non-Repeating Character in a String: Given a string,
find and return the first non-repeating character. For example, in the
string "abracadabra", the first non-repeating character is 'c'.*/
