package training;

public class lst {
    public static void main(String[] args) {

        lst obj1 = new lst();
        lst obj2 = new lst();
        lst obj3 = new lst();


        obj1.count++;
        obj2.count++;
        obj3.count++;
        System.out.println(obj3.count);
    }
    static int count=0;
}

/*
Create a variable that will hold the count of all instances of the Main class
Create 3 Object of the class and print value of the count variable;
*/
