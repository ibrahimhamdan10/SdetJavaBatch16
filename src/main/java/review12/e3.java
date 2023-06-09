package review12;

import java.util.HashMap;
import java.util.Map;

public class e3 {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("ibrahim",13);
        map.put("khaled",2);
        map.put("ghada",1);
        map.put("ibrahim",10);

        System.out.println(map);

        map.keySet().removeIf(x->x.startsWith("i") || x.startsWith("I"));
        System.out.println(map);

        map.values().removeIf(x->x>3);
        System.out.println(map);

    }
}
