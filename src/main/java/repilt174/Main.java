package repilt174;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("ONE", "AAA");
        map.put("TWO", "BBB");
        map.put("THREE", "CCC");
        map.put("FOUR", "DDD");
        map.put("FIVE", "EEE");

        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            var all =it.next();
            System.out.println(all.getKey()+" : "+all.getValue());
        }
        System.out.println("------------------");

        map.replace("THREE","THREE");
        map.replace("FIVE","SUMAIR");
            for(var store : map.entrySet()){
                System.out.println(store.getKey()+" : "+store.getValue());
            }
    }
}
