package class26;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class task1 {
    public static void main(String[] args) {
        Map<Integer,String>floor=new LinkedHashMap<>();
        floor.put(1,"microsoft");
        floor.put(2,"google");
        floor.put(3,"facebook");
        floor.put(4,"syntax");
        floor.put(5,"bestbuy");
        floor.put(6,"amazon");
        floor.put(7,"khaled");

        System.out.println(floor.size());
        floor.replace(4,"ghada");
        floor.remove(7);
        System.out.println(floor);

    }
}
