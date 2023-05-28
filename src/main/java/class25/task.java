package class25;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class task {
    public static void main(String[] args) {
        List<String>aList= new ArrayList<>();
        aList.add("john");
        aList.add("jahn");
        aList.add("james");
        aList.add("jasmine");
        aList.add("jane");
        aList.add("james");

        HashSet<String>names=new HashSet<>(aList);
        System.out.println(names);
    }
}
