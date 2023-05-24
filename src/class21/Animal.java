package class21;

public class Animal {

        String name;
        String color;
        String breed;

        public Animal(String name, String color, String breed) {
            this.name = name;
            this.color = color;
            this.breed = breed;
        }

        void printInfo() {
            System.out.println(name + " " + color + " " + breed);
        }

        void speak() {
            System.out.println("Animals speak");
        }

        void sleep() {
            System.out.println("Animals sleep from 1 to 20 hours a day");
        }

        void eat() {
            System.out.println("Animals eat many different things ");
        }
    }












