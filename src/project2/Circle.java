import project.shape;<<<<<<< HEAD
package project;public class Circle {
=======
package project;

public class Circle implements shape {

    @Override
    public void calculateArea(double radius) {

        System.out.println("Area of a circle is "+radius*radius*Math.PI);
    }


    @Override
    public void calculatePerimiter(double p) {
        System.out.println("Perimiter of a circle is "+2*p*Math.PI);
    }
>>>>>>> cbbcc96 (project 2)
}
