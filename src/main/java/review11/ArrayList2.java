package review11;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("ibrahim");
        list.add("khaled");
        list.add("mohammed");
        list.add("HAMDAN");


        for (int i = 0 ; i<list.size();i++){
            String name=list.get(i);
            if(name.contains("a")) {
                System.out.println(list.get(i));
            }
        }
    }
}
