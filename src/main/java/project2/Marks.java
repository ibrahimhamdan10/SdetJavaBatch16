package project2;

public abstract class Marks {
    abstract double getPercentage();
}
class A extends Marks {

    int subject1;
    int subject2;
    int subject3;

    public A(int subject1, int subject2, int subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    @Override
    double getPercentage() {
     double sum= subject1+subject2+subject3;
     return sum/3;
    }
}

class B extends Marks{
    int subject1;
    int subject2;
    int subject13;
    int subject4;

    public B(int subject1, int subject2, int subject13, int subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject13 = subject13;
        this.subject4 = subject4;
    }

    @Override
    double getPercentage() {
        double sum = subject1+subject2+subject13+subject4;
        return sum/4;
    }
}


/*We have to calculate the average of marks obtained in three subjects
by student A and by student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning the average percentage
of marks. Provide implementation of abstract method in classes 'A'
and 'B'. The constructor of student A takes the marks in three
subjects as its parameters and the marks in four subjects as its
parameters for student B. Test your code*/

