package Task;

import Tasks.Student;

public class Students {
    public static void main(String[] args) {

        Students obj1= new Students();
        obj1.Name="Ibrahim";
        obj1.ID=12345;
        Students.numberOfStudents++;

        Students obj2= new Students();
        obj2.Name="mohammed";
        obj2.ID=11111;
        Students.numberOfStudents++;

        Students obj3= new Students();
        obj3.Name="ghada";
        obj3.ID=21212;
        Students.numberOfStudents++;

        System.out.println("The total number of students is "+numberOfStudents);

       }
            String Name;
            int ID;
            static int numberOfStudents;
    }
