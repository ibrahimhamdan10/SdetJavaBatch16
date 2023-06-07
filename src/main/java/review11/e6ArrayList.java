package review11;

import java.util.ArrayList;

public class e6ArrayList {
    public static void main(String[] args) {

            ArrayList<String> student =new ArrayList<>();
            student.add("ibrahim");
            student.add("khaled");
            student.add("mohammed");
            student.add("Assad");
            student.add("HAMDAN");

            ArrayList<String>feeStudent = new ArrayList<>();
            feeStudent.add("khaled");
            feeStudent.add("HAMDAN");

            student.removeAll(feeStudent);
            System.out.println(student);


    }
}
