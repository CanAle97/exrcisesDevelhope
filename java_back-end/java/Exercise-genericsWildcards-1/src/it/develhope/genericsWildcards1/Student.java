package it.develhope.genericsWildcards1;

import java.util.List;

/**
 * # Exercise: generics-wildcards-1
 * * define a class `Student` that has:
 *   * 3 attributes:
 *     * a `String studentName`
 *     * a `String studentSurname`
 *     * a `double marksAverage`
 *   * a constructor method that takes 3 params (`name`, `surname`, `average`) and assign the values to the right attributes
 *   * a `static` method `getAverageMark()` that:
 *     * accepts as parameter a `listOfMarks`, where the `List` has an **upper bound wildcard** related to `Number` for relaxing the restriction so that:
 *       * the `listOfMarks` can be a `List` of integers or double
 *     * calculates the average using:
 *       * `listOfMarks.get(0).doubleValue()` to get the first value from the list
 *       * `listOfMarks.get(1).doubleValue()` to get the second value from the list
 *       * the arithmetic summation operator and the arithmetic division operator
 *     * returns the average value as `double`
 *   * an override of the `toString()` method that returns a `String` with all the `Student` attributes
 *
 * @author Alessandro Canulli
 */

public class Student {

    public String studentName;
    public String studentSurname;
    public Number marksAverage;

    public Student(String name, String surname, Number average) {
        this.studentName = name;
        this.studentSurname = surname;
        this.marksAverage = average;
    }

    public static double getAverageMark(List<? extends Number> listOfMarks){

        double x = listOfMarks.get(0).doubleValue();
        double y = listOfMarks.get(1).doubleValue();

        return (x + y) / 2;
    }

    @Override
    public String toString() {
        return "\n\tStudent\n" +
                "\t\tName: " + studentName + '\n' +
                "\t\tSurname: " + studentSurname + '\n' +
                "\t\tMarks average: " + marksAverage;
    }
}