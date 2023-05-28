package class18;

public class A {
     static void printf(){
         System.out.println("hi");
       }
     }

    class B extends A {
        public static void main(String[] args) {
            B obj = new B();
            printf();
            // or we can make sub class for main method
        }

    }
    class C extends B {

    }

