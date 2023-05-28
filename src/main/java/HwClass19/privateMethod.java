package HwClass19;

public class privateMethod {
    private void myMethod(String name,int age){
        System.out.println("first method = "+name+" "+age);
    }
    private void myMethod(String name){
        System.out.println("second method = "+name);
    }
    private void myMethod(int age){
        System.out.println("third method = "+age);
    }

    public static void main(String[] args) {
        privateMethod obj = new privateMethod();
        obj.myMethod("ibrahim",20);
        obj.myMethod("ibrahim");
        obj.myMethod(20);
    }
}

/*Create 1 class with a private method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe
result.*/
