package training;

public class H9_5 {
    public static void main(String[] args) {
        String[] animals={"Lion","dog","donkey","tiger","rabbit"};
        for (int counter = 0; counter <animals.length ; counter++) {
            System.out.println(animals[counter]);
        }
        System.out.println();

        String [] animal=new String[5];
        animal[0]="Lion";
        animal[1]="dog";
        animal[2]="donkey";
        animal[3]="tiger";
        animal[4]="rabbit";
        for (int counter = 0; counter <animal.length ; counter++) {
            System.out.println(animal[counter]);
        }
    }
}
