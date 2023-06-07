package class24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class E3ArrayList {
    public static void main(String[] args) {
        List<Character> characters=new LinkedList<>();
        characters.add('D');
        characters.add('E');
        characters.add('W');
        System.out.println(characters);
        System.out.println(characters.indexOf('E'));

        System.out.println(characters.contains('W'));

        System.out.println( characters.isEmpty());
        characters.set(1,'H'); //replaces the character at specified index
        System.out.println(characters);
        characters.remove(3);
        characters.remove("D");



    }
}