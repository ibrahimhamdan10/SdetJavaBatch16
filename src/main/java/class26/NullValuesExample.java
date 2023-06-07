package class26;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class NullValuesExample {
    public static void main(String[] args) {
        // HashMap allows one null key and multiple null values
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put(null, "Value 1");
        hashMap.put("Key 2", null);
        hashMap.put("Key 3", null);

        System.out.println("HashMap: " + hashMap);

        // Hashtable does not allow null keys or values
        Hashtable<String, String> hashtable = new Hashtable<>();

        // The following line will throw a NullPointerException
        // hashtable.put(null, "Value 1");

        hashtable.put("Key 2", "Value 2");

        // The following line will throw a NullPointerException
        // hashtable.put("Key 3", null);

        System.out.println("Hashtable: " + hashtable);
    }
}
