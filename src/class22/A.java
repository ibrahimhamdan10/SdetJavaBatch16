package class22;

public class A {
    void print() {
        System.out.println("i am A");
    }
}
    class B extends A {
        @Override
        void print() {
            System.out.println("i am B");
        }
    }
    class C extends A{

    }
 class aTester {
    public static void main(String[] args) {
            A obj = new C();
            obj.print();
        }
    }

