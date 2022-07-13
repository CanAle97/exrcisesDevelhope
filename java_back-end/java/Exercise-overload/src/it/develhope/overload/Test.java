package it.develhope.overload;

/**
 * * define a testing class where you:
 *   * create the 5 `Shape` objects using all the different constructor invocations
 *   * invoke `getShapeDetails()` for each `Shape` object and assign the returned values to dedicated `String` variables
 *   * print in console the values of the 5 dedicated `String` variables
 *
 * @author Alessandro Canulli
 */

public class Test {
    public static void main(String[] args) {

        Shape shape = new Shape();
        Shape circle = new Shape(5.9);
        Shape square = new Shape(4, 8.6);
        Shape rectangle = new Shape(4, 3.7, 6.5);
        Shape triangle = new Shape(3, 4.1, 6.3, 5.0);

        String c1 = shape.getShapeDetails();
        String c2 = circle.getShapeDetails();
        String c3 = square.getShapeDetails();
        String c4 = rectangle.getShapeDetails();
        String c5 = triangle.getShapeDetails();

        System.out.printf("%s\n%s\n%s\n%s\n%s\n", c1, c2, c3, c4, c5);
    }
}