package class26;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class task2 {
    public static void main(String[] args) {
        Map<String,String>country=new TreeMap<>();
        country.put("palestine","Al quds");
        country.put("jordan","amman");
        country.put("usa","washington");
        country.put("syria","demscus");
        country.put("qatar","doha");

       for(var s :country.entrySet()){
           System.out.println(s);
       }
        System.out.println();

        for (String value : country.values()) {
            System.out.println(value);
        }
        for(var s : country.entrySet()){
            System.out.println(s);
        }


    }
}
