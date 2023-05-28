package class21;

public class StudentTester {
    public static void main(String[] args) {

        Student student[] = {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};

        for (Student mates : student) {

            if (mates instanceof SyntaxStudent) {
               ((SyntaxStudent) mates).typingInChat();
            } else if (mates instanceof SchoolStudent) {
               ((SchoolStudent) mates).fight();
            }
            mates.study();
            mates.talk();
            mates.walk();
          }

        Student school = new SchoolStudent();
        ((SchoolStudent) school).fight();


    }
}
