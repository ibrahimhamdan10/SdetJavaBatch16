package HwClass20;

public class CreditCardTester {
    public static void main(String[] args) {
        CreditCard obj1= new CreditCard();
        obj1.calculateInterest(4000.0,10.0);

        AX obj2= new AX();
        obj2.calculateInterest(5000.0,20.0);

        Visa obj3 = new Visa();
        obj3.calculateInterest(3000.0,30.0);
    }
}
