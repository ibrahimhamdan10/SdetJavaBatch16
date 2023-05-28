package training;

import java.util.Scanner;

public class repilt_obj_string {
    public static void main(String[] args) {


        /*
        String given ="I love Java classes at Syntax";
        System.out.println(given.indexOf('c'));
        System.out.println(given.substring(12));
        System.out.println(given.substring(0,12));

         */
/*
        Scanner scan = new Scanner(System.in);
        System.out.println("enter string");
        String str =scan.next();
        String letters="";

       if(str.length()>=3){
            String letter = (str.substring(0,3));
            System.out.println("The first 3 letters of "+str+ " is "+letter);
                      }

 */
/*

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any programming language");
        String language = scan.nextLine();
        if(language.equals("Java")){
            System.out.println("Java is a programming language");
        }
        else if (language.equals("C")){
            System.out.println("C is a procedural programming language");
        }
        else if (language.equals("C++")) {
            System.out.println("C++ is a middle-level programming language");
        }

        else
            System.out.println("Doesn't match any programming language");

 */

/*
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the browser name to proceed further with execution");
        String browser = scan.nextLine();
        if(browser.equalsIgnoreCase("chrome")){
            System.out.println("Proceed with Chrome browser");
        }else if(browser.equalsIgnoreCase("firefox")){
            System.out.println("Proceed with Firefox browser");
        } else if (browser.equalsIgnoreCase("ie")) {
            System.out.println("Proceed with IE browser");
        }
        else
            System.out.println("Invalid browser");

 */
/*
     String given="Hello Syntax friends";
    System.out.println(given.replaceAll("Hello Syntax friends","Welcome Syntax family"));

 */
/*

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scan.nextLine();

        // Convert the input string to lowercase and remove spaces
        inputString = inputString.toLowerCase();

        // Reverse the input string
        StringBuilder reversedString = new StringBuilder(inputString).reverse();

        // Check if the reversed string is equal to the original input string
        if (inputString.equals(reversedString.toString())) {
            System.out.println("true");
        }
        else
            System.out.println("false");

 */
        /*

        Scanner scan = new Scanner(System.in);
        System.out.println("in: ");
        String [] name =new String[5];
        for (int i = 0; i <name.length ; i++) {
                name[i] = scan.next();
                String s = name[i];
                if(name.length>=3){
                    System.out.println(s.substring(0,3));
                }
              }

         */
        /*

        Scanner input = new Scanner(System.in);
        System.out.print("In:");
        String word = input.nextLine();
        String vowels="";
        for (int i = 0; i <word.length() ; i++) {
            char s =word.charAt(i);
            if(s=='a'||s=='u'||s=='e'||s=='i'||s=='o'){
                vowels+=s;
            }

        }System.out.println(vowels);

         */
        /*

       StringBuffer str= new StringBuffer("Hello");
       StringBuffer str2= new StringBuffer("World");
        System.out.print(str.toString().toUpperCase()+" ");
        System.out.print(str2.toString().toUpperCase());

         */

        StringBuffer str = new StringBuffer("Hello Friends");
        System.out.println(str.reverse());






        }

        }














