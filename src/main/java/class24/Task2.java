package class24;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("ibrahie");
        words.add("ghada");
        words.add("hijaz");
        for (int i = 0; i < words.size(); i++) {
            String s = words.get(i);
            if (s.endsWith("e")) {
              words.remove(i);
              i--;
            }
        }
        System.out.println(words);
    }
}

