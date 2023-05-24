package class24;

import java.util.ArrayList;

public class TASK {
    public static void main(String[] args) {
        ArrayList<String>names= new ArrayList();
        names.add("ibrahim");
        names.add("khaled");
        names.add("mohammed");
        names.add("assad");
        names.add("hamdan");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("ibrahim"));
        System.out.println(names.size());
        System.out.println(names);
    }
}
