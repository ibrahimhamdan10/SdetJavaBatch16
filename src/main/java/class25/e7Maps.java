package class25;

import java.util.HashMap;

public class e7Maps {
    public static void main(String[] args) {
        HashMap<String,Double>grocery=new HashMap<>();
        grocery.put("apple",2.4);
        grocery.put("soap",5.6);
        grocery.put("milk",3.0);
        grocery.put("apple",3.0);
        System.out.println(grocery);
    }
}
