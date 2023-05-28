package class25;

import java.util.ArrayList;
import java.util.HashSet;

public class e3Set {
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<>();
        names.add("ibrahim");
        names.add("ibrahim");
        System.out.println(names);

        HashSet<String>uniqNames=new HashSet<>();
        uniqNames.add("ibrahim");
        uniqNames.add("ghada");
        System.out.println(uniqNames);
    }
}
