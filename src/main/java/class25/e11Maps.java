package class25;

import HwClass20.Visa;

import java.util.Collection;
import java.util.TreeMap;

public class e11Maps {
    public static void main(String[] args) {
        TreeMap<String,Double> makeup=new TreeMap<>();
        makeup.put("fff",5.6);
        makeup.put("gyt",7.8);

        var value = makeup.values();
        value.removeIf(v->v>98);
        System.out.println(value);
    }
}
