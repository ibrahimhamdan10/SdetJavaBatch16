package review11;

import java.util.ArrayList;

public class e4ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        list.add("ibrahim");
        list.add("khaled");
        list.add("mohammed");
        list.add("Assad");
        list.add("HAMDAN");
        System.out.println(list.isEmpty());
        System.out.println(list.contains("hijaz"));
        System.out.println(list.indexOf("ibrahim"));
        list.remove("HAMDAN");
        System.out.println(list);
        list.removeIf(x->x.startsWith("A"));
        System.out.println(list);

    }
}
