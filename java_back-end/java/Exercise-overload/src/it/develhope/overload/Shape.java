package it.develhope.overload;

/**
 * # Exercise: overload
 * * define a class called `Shape` that has:
 *   * an instance variable `shapeName`
 *   * an instance variable `numberOfEdges`
 *   * 1 basic constructor method with no params that
 *     * informs the user about the `Shape` object creation
 *     * assign `Undefined shape` to the object's `shapeName`
 *   * 4 params overload constructor methods:
 *     * for circle:
 *       * takes a double `radius` param
 *       * informs the user about the object creation
 *       * assigns the `shapeName`
 *     * for square
 *       * takes an int `edges` param and a double `edgeLength` param
 *       * informs the user about the object creation
 *       * assigns the values to `numberOfEdges` and to `shapeName`
 *     * for rectangle:
 *       * takes an int `edges` param and 2 double (`e1`, `e2`) params
 *       * informs the user about the object creation
 *       * assigns the values to `numberOfEdges` and to `shapeName`
 *     * for triangle:
 *       * takes an int `edges` param and 3 double (`e1`, `e2`, `e3`) params
 *       * informs the user about the object creation
 *       * assigns the values to `numberOfEdges` and to `shapeName`
 *   * a method called `getShapeDetails()` that returns an informative `String` containing:
 *     * `shapeName`
 *     * `numberOfEdges`
 *
 * @author Alessandro Canulli
 */

public class Shape {

    public String shapeName;
    public int numberOfEdges;

    public Shape() {
        System.out.println("---------------------------Constructor-------------------------------------------");
        System.out.printf("\t\tShape object created\n\t\t\t%s\n", this.shapeName = "Undefined shape");
    }

    public Shape(double radius) {
        System.out.println("---------------------------Constructor-------------------------------------------");
        System.out.printf("\t\tShape object created\n\t\t\tIt is a %s\n", this.shapeName = "circle");
    }

    public Shape(int edges, double edgeLength) {
        System.out.println("---------------------------Constructor-------------------------------------------");
        System.out.printf("\t\tShape object created\n\t\t\tIt has %d sides\n\t\t\tIt is a %s\n", this.numberOfEdges = 4, this.shapeName = "square");
    }

    public Shape(int edges, double e1, double e2) {
        System.out.println("---------------------------Constructor-------------------------------------------");
        System.out.printf("\t\tShape object created\n\t\t\tIt has %d sides\n\t\t\tIt is a %s\n", this.numberOfEdges = 4, this.shapeName = "rectangle");
    }

    public Shape(int edges, double e1, double e2, double e3) {
        System.out.println("---------------------------Constructor-------------------------------------------");
        System.out.printf("\t\tShape object created\n\t\t\tIt has %d sides\n\t\t\tIt is a %s\n\n", this.numberOfEdges = 3, this.shapeName = "triangle");
    }

    public String getShapeDetails(){
        return "\n---------------------------Get-shape-details-------------------------------------" +
                "\n\t\tIt is a/an " + shapeName + "\n\t\t\tIt has " + numberOfEdges;
    }
}