package class21;

public class cat extends Animal {


         cat(String name, String color, String breed){
            super(name, color, breed);
        }

        @Override
        void speak() {
            System.out.println("Meow meow.....");
        }

        @Override
        void eat() {
            System.out.println("Cats like to eat Fish");
        }

        @Override
        void sleep() {
            System.out.println("Cats like to sleep 15 hours on Average");
        }
    }

