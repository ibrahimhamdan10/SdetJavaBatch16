package OopTraining;

public class Circle {

    private double radius;
    private String color;

    public void setRadius(double r) {
         radius=r;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String c) {
         color=c;
    }

    public String getColor() {
        return color;
    }
    public double getArea(){
        return 3.14 *radius*radius;
    }
    public double getCircumference(){
        return 3.14 * 2 *radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color='" + color + '\'' + '}';
    }
}
