package repilt2;

public class CarObjects {


        String model;
        double price;
        int quantity;

        public CarObjects(String model,double price,int quantity){
            this.model=model;
            this.price=price;
            this.quantity=quantity;
        }

    public String carStockValue(){
        String str = model+" Stock Value "+(price*quantity);
        System.out.println(str);
        return str;
    }

    public static void main(String []args){

        CarObjects obj = new CarObjects("Toyota 2019",25000.00, 100);
        obj.carStockValue();
        CarObjects obj2 = new CarObjects("BMW 2019",65298.00,10);
        obj2.carStockValue();
    }


}

