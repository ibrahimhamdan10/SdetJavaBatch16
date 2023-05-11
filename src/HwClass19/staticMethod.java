package HwClass19;

public class task3 {
    String name;
    int age;
    boolean handSome;
    static void method(String name,int age,boolean handSome){
    }
    static void method(boolean handSome,int age,String name){
     }
     static void method(int age,String name,boolean handSome){
     }

    public static void main(String[] args) {
        task3 obj1= new task3();
        method("ibrahim",20,true);
        method(false,100,"idk");
        method(49,"ghada",true);


    }
}

/*Create 1 class with a static method that has 3 overloaded forms.
 Then call each overloaded method with
 specific arguments and observe result.*/