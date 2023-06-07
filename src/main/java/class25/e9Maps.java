package class25;

import java.util.*;

public class e9Maps {
    public static void main(String[] args) {

        Map<String,Integer>numbers=new HashMap<>();
        numbers.put("ibrahim",2);
        numbers.put("ibrahim",1);
        numbers.put("ibrahim",0);

        for(var s :numbers.entrySet()){
            System.out.println(s);
        }
//
//        var keyAndValue=numbers.entrySet();
//        System.out.println(keyAndValue);
//
//        var key=numbers.keySet();
//        System.out.println(key);
//
//        var value =numbers.values();
//        System.out.println(value);



    }
}
