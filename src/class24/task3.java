package class24;

import java.util.ArrayList;

public class task3 {
    public static void main(String[] args) {
        ArrayList<String>drinks=new ArrayList();
        drinks.add("coke");
        drinks.add("spriteo");
        drinks.add("peero");

        for (int i = 0; i <drinks.size() ; i++) {
            String s= drinks.get(i);
            if(s.contains("a")||s.contains("o")){
                drinks.set(i,"water");
            }
        }                System.out.println(drinks);


    }
}
