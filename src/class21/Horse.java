package class21;

public class Horse extends Animal{


        public Horse(String name, String color, String breed) {
            super(name, color, breed);
        }
        @Override
        void speak(){
            System.out.println("neigh neigh");
        }

        @Override
        void eat() {
            System.out.println("Horses like Carrots+ Grass");
        }

        @Override
        void sleep() {
            System.out.println("Horses sleep 2-3 hours");
        }
    }

