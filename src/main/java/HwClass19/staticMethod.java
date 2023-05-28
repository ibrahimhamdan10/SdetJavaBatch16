package HwClass19;

public class staticMethod {
    String name;
    int age;
    boolean handSome;
    static void method(String name,int age,boolean handSome){
        System.out.println(name+" "+age+" "+handSome);
    }
    static void method(boolean handSome,int age,String name){
        System.out.println(handSome+" "+age+" "+name);
     }
     static void method(int age,String name,boolean handSome){
         System.out.println(age+" "+name+" "+handSome);
     }

    public static void main(String[] args) {
        staticMethod obj1= new staticMethod();
        method("ibrahim",20,true);
        method(false,100,"idk");
        method(49,"ghada",true);

    }
}

/*Create 1 class with a static method that has 3 overloaded forms.
 Then call each overloaded method with
 specific arguments and observe result.*/