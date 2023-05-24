package review8;

public class Doctor {
    String name;
    String lastName;
    int experience;
    double salary;
    static boolean degree;


    public Doctor(String name, String lastName, int experience) {
        this.name = name;
        this.lastName = lastName;
        this.experience = experience;
    }
    Doctor(String name, String lastName, int experience,double salary){
        this(name, lastName, experience);
        this.salary=salary;
    }

   void display(){
       System.out.println(name+" "+lastName+" "+experience+" "+salary);
   }

}
