package project;

public class shapeTester {
    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.calculateArea(123.);
        obj.calculatePerimiter(10);
        Square obj2 = new Square();
        obj2.calculateArea( 15.5);
        obj2.calculatePerimiter(19.0);
    }
}
