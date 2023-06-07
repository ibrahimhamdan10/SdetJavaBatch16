package class25;

import java.util.*;

public class e6Sets {
    public static void main(String[] args) {

        Set<String> fruit= new HashSet<>();
        fruit.add("mango");
        fruit.add("kiwi");
        fruit.add("mango");

        Set<String>hashSet=new TreeSet<>(fruit);
        System.out.println(hashSet);

    }
}
