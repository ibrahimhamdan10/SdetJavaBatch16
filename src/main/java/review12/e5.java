package review12;

import org.openqa.selenium.devtools.v111.css.model.Value;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class e5 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("ibrahim", 13);
        map.put("khaled", 2);
        map.put("ghada", 1);
        map.put("ibrahim", 10);

        map.forEach((Key, Value) -> {
            System.out.println(Key + " " + Value);
        });
        for (var entry : map.entrySet()) {
            if (entry.getKey().contains("a") && entry.getValue() > 4) {
                System.out.println(entry);
            }

        }
    }
}
