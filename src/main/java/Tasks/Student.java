package Tasks;

public class Student {public static void main(String[] args) {
    Student obj = new Student();
    char grade = obj.getGrade(89);
    System.out.println(grade);
}
    public char getGrade(int score) {
        char grade;
        if (score > 90) {
            grade='A';
        } else if (score > 80) {
            grade='B';
        } else if (score > 70) {
            grade='C';
        } else if (score > 60) {
            grade='D';
        } else grade='F';
        return grade;
    }
   }

