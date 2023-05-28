package class4;

import com.sun.security.jgss.GSSUtil;

public class E2IfElseStatement {
    public static void main(String[] args) {
        // String is a non-primitive data type, and with non-primtive data types we
        // can't use relational operators
        //name.equals("Corey") => checks if name and the value that we write
        // inside equals() are same or not

        String name="ibrahim";

        if(name.equals(name))
        {
            System.out.println("I like swimming");
        }

        else
        {
            System.out.println("I like programming");
        }

    }
}