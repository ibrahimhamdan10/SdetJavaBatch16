package project;

import HwClass20.Visa;

import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        task4 obj = new task4();
        System.out.println(Anagrams("listen","ibrahim"));
    }
    String str1;
    String str2;

    public static boolean Anagrams(String str1,String str2){
        str1=str1.replaceAll("\\s","").toLowerCase();
        str2=str2.replaceAll("\\s","").toLowerCase();

        char[]charArray1=str1.toCharArray();
        char[]charArray2=str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        if(Arrays.equals(charArray1,charArray2)){
            return true;
        }else
            return false;
    }
}
/*Check if Two Strings are Anagrams: Given two strings, determine if
they are anagrams, meaning they contain the same characters in a
different order. For example, "listen" and "silent" are anagrams*/
