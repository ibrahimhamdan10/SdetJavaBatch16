package class18;

public class animalTester {
    public static void main(String[] args) {

        Horse obj = new Horse();
        obj.color="black";
        obj.eat();

        cat obj2 = new cat();
        obj2.color="white";
        obj2.speak();

        dog obj3 = new dog();
        obj3.name="alex";
        obj3.dogMethod();
    }
}
