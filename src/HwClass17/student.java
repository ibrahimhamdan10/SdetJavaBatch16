package HwClass17;

public class student {
    String studentName;
    int subject1;
    int subject2;
    int subject3;

    student(String studentName, int subject1, int subject2, int subject3){
            this.studentName=studentName;
            this.subject1 = subject1;
            this.subject2 = subject2;
            this.subject3 = subject3;
    }
    int averageGrade(){
        int sum= subject1 + subject2 + subject3;
        return sum/3;
    }
    void printInfo(){
        System.out.println(studentName+" "+ subject1 +" "+ subject2 +" "+ subject3 +" "+" and the average is = "+averageGrade());

    }

}
/*
Write a java Class Students that have a constructor which takes students name and 3 subject grades.
Inside your class also have a method to Calculate Average Grade.
Test Student class for 5 different students with different marks.
 Your program should print an average mark of each students name.
 */