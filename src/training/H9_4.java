package training;

public class H9_4 {
    public static void main(String[] args) {

        String[]cars={"toyota","honda","hyundai","kia","Bmw","mercedes"};
        for (int counter = 0; counter <cars.length ; counter++) {
            System.out.println(cars[counter]);
        }
        System.out.println();
            String[]car=new String[6];
            car[0]="toyota";
            car[1]="honda";
            car[2]="hyundai";
            car[3]="kia";
            car[4]="Bmw";
            car[5]="mercedes";
        for (int counter = 0; counter <cars.length ; counter++) {
            System.out.println(car[counter]);
        }
    }
}

