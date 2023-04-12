package training;

public class repilt3 {
    public static void main(String[] args) {
     /*
        int [] numbers={45,78,12,67,55};

        for (int counter = 0; counter <numbers.length ; counter++) {
            System.out.print(numbers[counter]+" ");
        }
*/
        /*

        int [] numbers={45,78,12,67,55,89,23,77,88};
        for (int counter = 0; counter < numbers.length; counter+=2) {
            System.out.print(numbers[counter]+" ");
        }
        */


        char [] myChar={'s', 'a', 'y',  'b', 'n', 'c', 't' ,  'd','a', 'e', 'x'};
         String sumString="";
        for (int counter = 0; counter <myChar.length ; counter++) {
            if(myChar[counter]=='s'&&myChar[counter]=='y'&&myChar[counter]=='n'&&myChar[counter]=='t'&&myChar[counter]=='a'&&myChar[counter]=='x')
            {      sumString+=myChar[counter];

                    }
        } System.out.print(sumString);


    }
}
