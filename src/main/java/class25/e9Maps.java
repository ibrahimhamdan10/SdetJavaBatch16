package class25;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class e9Maps {
    public static void main(String[] args) {
        TreeMap<String,Double>makekos=new TreeMap<>();
        makekos.put("fff",5.6);
        makekos.put("gyt",7.8);

        Set<String>s =makekos.keySet();
        System.out.println(s);
        Collection<Double>d =makekos.values();
        System.out.println(d);
    }
}
