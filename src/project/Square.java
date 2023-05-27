package project;

public class Square implements shape{
    @Override
    public void calculateArea(double radius) {
        System.out.println("Area of a square is "+radius*radius);
    }

    @Override
    public void calculatePerimiter(double p) {
        System.out.println("Perimiter of a square is "+4*p);
    }
}
