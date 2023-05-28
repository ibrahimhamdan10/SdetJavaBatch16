package class25;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class task3 {
    public static void main(String[] args) {
        LinkedHashSet<String> city=new LinkedHashSet<>();
        city.add("ramallah");
        city.add("amman");

        city.removeIf(s->s.startsWith("a"));
        System.out.println(city);
    }
}


