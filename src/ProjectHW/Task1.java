package ProjectHW;

public class Task1 {
    public static void main(String[] args) {

        int [] temperatures={34,54,32,-6,-15,0,5};
        int highest=temperatures[0];
        int lowest=temperatures[1];

        for (int i = 0; i <temperatures.length ; i++) {

                if(temperatures[i]>highest){
                 highest=temperatures[i];
                    }
                if(temperatures[i]<lowest){
                    lowest=temperatures[i];
                    }

        }
        System.out.println("The highest temperatures for a week, "+highest);
        System.out.println("The lowest temperatures for a week, "+lowest);

    }
}
