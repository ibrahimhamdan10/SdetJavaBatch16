package review5;

public class E2 {
    public static void main(String[] args) {

        String[][] cars={
                {"toyota","honda"},
                {"bmw","mercedes"}
        };

      //  System.out.println(cars[0][0]);how about print all of them ?

            for(String[] i :cars){
                for(String j:i) {
                    System.out.println(j);
                }
             }
       }
  }
