package repilt2;

public class Main {
    String label;
    double price;
    String category;
    boolean hasExpiration;
    int stock;

    public Main(String label, double price, String category, boolean hasExpiration, int stock) {
        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.stock = stock;
    }
    public Main(String label, double price, int stock) {
        this.label = label;
        this.price = price;
        this.category = "misc";
        this.hasExpiration = false;
        this.stock = stock;
    }
    public Main(String label, double price) {
        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.stock = 0;
    }

    void display(){
        System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
    }

    public static void main(String[] args) {
        StoreProduct obj = new StoreProduct("Egss",3.0,"Produce",true,10);
        obj.display();
        StoreProduct obj2 = new StoreProduct("Paper Towels",2.0,false,24);
        obj2.display();
        StoreProduct obj3 = new StoreProduct("Paper Towels",3.0,"Produce",false);
        obj3.display();

    }

}
