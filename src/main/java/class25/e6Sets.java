package class25;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class e6Sets {
    public static void main(String[] args) {

        ArrayList<String>fruit= new ArrayList<>();
        fruit.add("mango");
        fruit.add("kiwi");
        fruit.add("mango");

        HashSet<String>hashSet=new HashSet<>(fruit);
        System.out.println(hashSet);

        LinkedList<String>linkedTest=new LinkedList<>(hashSet);
        System.out.println(linkedTest);
    }
}
