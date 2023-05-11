package repilt2;

public class Main {
    public static void main(String [] args){


        StoreProduct obj = new StoreProduct("Egss",3.0,"Produce",true,10);
        obj.display();
        StoreProduct obj2 = new StoreProduct("paper towels",2.0,24);
        obj2.display();
        StoreProduct obj3 = new StoreProduct("Paper Towels",2.0);
        obj3.display();
    }
}
