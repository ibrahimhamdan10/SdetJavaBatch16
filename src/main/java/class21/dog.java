package class21;

public class dog extends Animal {


        public dog(String name, String color, String breed) {
            super(name, color, breed);
        }

        @Override
        void speak() {
            System.out.println("woof woof");
        }

        @Override
        void sleep() {
            System.out.println("Dogs sleep 8 hours");
        }

        void run() {
            System.out.println("Dog can run Fast");
        }

        @Override
        void eat() {
            System.out.println("Dogs like to chew the bones");
        }
    }


