package class12;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {



        String userName="ibrahim hamdan";
        String password="king";
        String confirmPassword="king";

        if(userName.isBlank()&&password.isBlank()){
            System.out.println(" userName and password cant be empty");
        }
        else if (password.length()<=8){
            System.out.println("short");
        }
        else if(password.contains(userName)){
            System.out.println("Password cannot contain username");
        }
        else if(!password.equals(confirmPassword)){
            System.out.println("password do not match");
        }else
            System.out.println("your password is created");





    }
}
