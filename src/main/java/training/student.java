package training;

public class student {
    String studentName;
    int Grade1;
    int Grade2;
    int Grade3;

    student(String studentName,int Grade1,int Grade2,int Grade3){
            this.studentName=studentName;
            this.Grade1=Grade1;
            this.Grade2=Grade2;
            this.Grade3=Grade3;
    }
    int averageGrade(){
        int sum= Grade1+Grade2+Grade3;
        return sum/3;
    }

}
/*  and 3 subject grades.
Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students with different marks.
 Your program should print an average mark of each students name.*/