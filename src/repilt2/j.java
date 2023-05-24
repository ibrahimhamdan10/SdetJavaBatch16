package repilt2;

class Main1 {
    public static void main (String []args){
        ShoppingStore obj1 = new ShoppingStore("Blanket",49.99, 2);
        obj1.itemTotalPrice();
        ShoppingStore obj2 = new ShoppingStore("Mattress", 219.59, 2);
        obj2.itemTotalPrice();
        System.out.println("you purchased "+ (obj1.quanitity*obj1.price+obj2.quanitity* obj2.price)+" Today");
    }

}