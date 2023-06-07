package class26;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class NullValuesExample {
    public static void main(String[] args) {

        // HashMap allows one null key and multiple null values
        Map<String, String> hashMap = new HashMap<>();

        hashMap.put(null, "Value 1");
        hashMap.put("Key 2", "value 2");
        hashMap.put(null, "value 3");

        System.out.println("HashMap: " + hashMap);
    }
}
