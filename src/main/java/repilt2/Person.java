package repilt2;

import calss16.person;
public class Person{
    String name;
    String lastName;
    int age;
}
class Employee extends Person{
    int salary;
    void method1(){
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }
}
class Student extends Person{
    int grade;
    void method2(){
        System.out.println(name+" "+lastName+" "+age+" "+grade);
    }
}
class Retiree extends Person{
    String seniorActivity;
    void method3(){
        System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
    }
}

