package class24;

import java.util.ArrayList;

//Create an arrayList of even numbers from 1 to 500.
// Remove any number that is divisible by 5 from that arrayList.
public class E14ArrayList {
    public static void main(String[] args) {

        int [] arr= new int[50];
        for (int i = 0; i < 50 ; i++) {
            arr[i]=i;
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        ArrayList<Integer> numbers=new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            numbers.add(i);
            System.out.print(numbers.get(i)+" ");
        }
    }
}