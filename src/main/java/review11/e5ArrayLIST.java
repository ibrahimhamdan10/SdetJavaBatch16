package review11;

import java.util.ArrayList;

public class e5ArrayLIST {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        list.add("ibrahim");
        list.add("khaled");
        list.add("mohammed");
        list.add("Assad");
        list.add("HAMDAN");

        list.removeIf(x->x.length()>5);
        System.out.println(list);
        list.removeIf(x->x.length()%2!=0);
        System.out.println(list);
        list.removeIf(x->x.contains("a")||x.length()>5);
        System.out.println(list);
    }
}
