package HwClass13;

public class Task4 {
    public static void main(String[] args) {
        String a="hello";
        String b="world";
        System.out.println("the value of a before swapping is "+a);
        System.out.println("the value of b before swapping is "+b);
        a=a+b;//helloworld
        b=a.substring(0,a.length()-b.length());// b= hello
        a=a.substring(b.length());// a =world
        System.out.println("the value of a after swapping is "+a);
        System.out.println("the value of b after swapping is "+b);
    }
}
