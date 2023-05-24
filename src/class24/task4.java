package class24;

import java.util.ArrayList;

public class task4 {
    public static void main(String[] args) {

        ArrayList<Integer>evenNum=new ArrayList();

        for (int i = 2; i <=500 ; i+=2) {
           evenNum.add(i);
        }
        System.out.println(evenNum);
        evenNum.removeIf(num->num%2!=0);
        System.out.println(evenNum);


    }
}
