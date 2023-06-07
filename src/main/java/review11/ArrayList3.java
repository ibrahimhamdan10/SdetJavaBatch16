package review11;

import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        list.add("ibrahim");
        list.add("khaled");
        list.add("mohammed");
        list.add("HAMDAN");

        for (String store : list){
            if (store.contains("a")){
            System.out.println(store);
            }
        }
    }
}
