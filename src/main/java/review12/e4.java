package review12;

import java.util.HashMap;
import java.util.Map;

public class e4 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("ibrahim",13);
        map.put("khaled",2);
        map.put("ghada",1);
        map.put("ibrahim",10);

        map.entrySet().removeIf(x->x.getKey().startsWith("i")&& x.getValue()>3);
        System.out.println(map);
    }
}
