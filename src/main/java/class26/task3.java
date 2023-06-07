package class26;

import java.util.LinkedHashMap;
import java.util.Map;

public class task3 {
    public static void main(String[] args) {
        Map<Integer,String>store=new LinkedHashMap<>();
        store.put(1,"phone");
        store.put(2,"socks");
        store.put(3,"pc");
        store.put(4,"food");

        for(var s :store.entrySet()){
            System.out.println(s);
        }
    }
}
/*Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.*/