package HwClass21;

public class computerTester {
    public static void main(String[] args) {

       Computer[]computers={new Apple("white",20,15),
               new HP("black",16,20),
               new Lenovo("blue",14,23),
               new Dell("red",30,15)};

       for (Computer i:computers){
           i.features();
           i.sound();
           i.printInfo();

           if(i instanceof Apple){
               ((Apple) i).closeSound();
           } else if (i instanceof HP) {
               ((HP) i).homePage();
           } else if (i instanceof Lenovo) {
               ((Lenovo)i).search();
           } else if (i instanceof Dell) {
               ((Dell)i).desktop();
           }
           System.out.println();
       }
    }
}
