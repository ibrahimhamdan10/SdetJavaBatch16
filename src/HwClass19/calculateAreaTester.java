package HwClass19;

public class calculateAreaTester {
    public static void main(String[] args) {
        calculateShape obj = new calculateShape();
        double area= obj.calculateArea(10,10);
        System.out.println(area);

        calculateShape obj2 = new calculateShape();
        double square=  obj2.calculateArea(5);
        System.out.println(square);

    }
}
