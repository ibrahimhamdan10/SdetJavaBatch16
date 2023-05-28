package class20;

public class animalTester {
    public static void main(String[] args) {
        cat obj1 = new cat("bitch","white",8);
        obj1.sleep();
        obj1.eat();
        obj1.speak();
        System.out.println();
        dog obj2 = new dog("alex","black",9);
        obj2.sleep();
        obj2.speak();
        obj2.eat();
        System.out.println();
        horse obj3 = new horse("3zzzz","brown",13);
        obj3.sleep();
        obj3.speak();
        obj3.eat();



    }
}
