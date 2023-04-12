package training;

public class H3 {
    public static void main(String[] args) {
        //Print even numbers from 20 to 1 (2 ways)
        int counter=20;
        while (counter>=1){
            if(counter%2==0) {
                System.out.print(counter + " ");
            }
            counter--;
        }

        System.out.println();

        for (counter=20;counter>=1;counter-=2){
            System.out.print(counter+" ");
        }


    }
}
