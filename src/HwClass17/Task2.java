package HwClass17;

public class Task2 {

    String name;
    String job;
    int age;
    boolean tall;

    private Task2(String name,int age){
       this.name=name;
       this.age=age;
        System.out.println(name+" "+age);
    }
     public Task2(String job)
    {
            this.job=job;
        System.out.println(job);
    }
     Task2(boolean tall)
    {
            this.tall=tall;
        System.out.println(tall);
    }
    protected Task2()
    {
        System.out.println("default constructor");
    }


    public static void main(String[] args) {
        Task2 obj1 = new Task2("ibrahim",20);
        Task2 obj2 = new Task2("QA engineer in sha allah");
        Task2 obj3 = new Task2(true);
        Task2 obj4 = new Task2();

    }
}
/*Write a java class that have 4 constructors with 4 different access levels of constructors(private,
public,default,protected) and create 4 objects of this class:
 1 - inside same class; 2 - from outside the class; 3 - from different class inside different package  and observe result.
 */