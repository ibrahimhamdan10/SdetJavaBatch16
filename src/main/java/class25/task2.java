package class25;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class task2 {
    public static void main(String[] args) {
        TreeSet<String> country=new TreeSet<>();
        country.add("palestine");
        country.add("jordan");
        country.add("usa");

        for (String i :country){
            System.out.println(country);
        }
    }
}
