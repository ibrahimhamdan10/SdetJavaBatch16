package Task;

import Tasks.Student;

public class Students {
    public static void main(String[] args) {

        Students obj1= new Students();
        obj1.Name="Ibrahim";
        Students.numberOfStudents++;
        System.out.println(numberOfStudents);

        Students obj2= new Students();
        obj2.Name="mohammed";
        Students.numberOfStudents++;
       System.out.println(numberOfStudents);

        Students obj3= new Students();
        obj3.Name="ghada";
        Students.numberOfStudents++;
        System.out.println(numberOfStudents);

        Students obj4= new Students();
        System.out.println(numberOfStudents);


        System.out.println("The total number of students is "+numberOfStudents);
       }
    static int numberOfStudents=0;
            String Name;
            int ID;

    }
