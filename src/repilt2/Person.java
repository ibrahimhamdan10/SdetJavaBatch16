package repilt2;

import calss16.person;

public class Person{
    String name;
    String lastName;
    int age;
}
class Employee extends person{
    int salary;
    void method1(){
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }
}
class Student extends person {
    int grade;
  System.out.println(name+" "+lastName+" "+age+" "+grade);
}
class Retiree extends person{
    String seniorActivity;
  System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
}