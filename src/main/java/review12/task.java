package review12;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class task {
    public static void main(String[] args) {

        int [] arr={10,20,10,30,40,50,20,30,70,80,70};

        Map<Integer,Integer>map = new TreeMap<>();

        for (var num :arr) {

           if (map.get(num)==null) {
               map.put(num,1);
           }
               int count =map.get(num)+1;
           map.put(num,count);
        }
        System.out.println(map);
    }
}
