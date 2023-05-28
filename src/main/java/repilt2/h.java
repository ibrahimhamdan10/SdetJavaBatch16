package repilt2;

class ShoppingStore{

    String item;
    double price;
    int quanitity;

    public ShoppingStore(String item,double price,int quanitity){
        this.item=item;
        this.quanitity=quanitity;
        this.price=price;
    }
    public String itemTotalPrice(){
        String str= item + " Total value "+(quanitity*price);
        System.out.println(str);
        return str;
    }



}