package review5;

public class E1 {
    public static void main(String[] args) {

            String [] names ={"ibrahim","HAMDAN"};

            for (int i =0;i<names.length;i++){
                System.out.println(names[i]);
            }

        System.out.println("===================");

            for(String i :names){
                System.out.println(i);
        }
            //if we want to reverse
        System.out.println("====================");


        for (int i =names.length-1; i >=0 ; i--) {
            System.out.println(names[i]);
        }


    }
}
