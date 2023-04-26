package class12;

public class StringClass {


    public static void main(String[] args) {


        String name = "ibrahim";

                if (name.length()>8){
                    System.out.println("too big");
                 }

        System.out.println("==============");


                String userName="ibrahim hamdan";
                String password="kingking";
                if(userName.length()>8 && password.length()>8){
                    System.out.println("username and pass cant be more than 8 charachter");
                }
                else
                    System.out.println("successful");


            }

}
