package it.develhope.genericsWildcards1;

import java.util.ArrayList;
import java.util.List;

/**
 * * considering that:
 *   * there are two types of marks for the students:
 *     * a `List` of 2 `Double` elements for **individual marks**
 *     * a `List` of 2 `Integer` elements for **project marks**
 *   * `Lisa Stuart` has a `List` called `individualMarksListLisa` of **individual marks**
 *   * `Jeremy Green` has a `List` called `projectMarksListJeremy` of **project marks**
 * * define a testing class with a method `main()` where you:
 *   * create the `individualMarksListLisa` list
 *   * add two random double values to the list using the `.add()` built-in method of the `List`
 *   * create the `projectMarksListJeremy` list
 *   * add two random int values to the list using the `.add()` built-in method of the `List`
 *   * calculate (using the static method `Student.getAverageMark()`) the marks average double values for `lisaAvg` and `jeremyAvg`
 *   * create a `listOfStudents`
 *   * add the two new `Student` objects (Lisa and Jeremy) to the list, using the `add()` method and the `Student`'s constructor
 *   * print in console the details of the two `Student`s inside the `listOfStudents` using:
 *     * the override method
 *     * the `get()` built-in method from `List`
 *
 * @author Alessandro Canulli
 */

public class Test {
    public static void main(String[] args) {

        List<Double> individualMarksListLisa = new ArrayList();
        individualMarksListLisa.add(0, 60.542);
        individualMarksListLisa.add(1, 294.357);

        double lisaAvg = Student.getAverageMark(individualMarksListLisa);

        List<Integer> projectMarksListJeremy = new ArrayList();
        projectMarksListJeremy.add(0, 657);
        projectMarksListJeremy.add(1, 98556);

        double jeremyAvg = Student.getAverageMark(projectMarksListJeremy);

        List<Student> listOfStudents = new ArrayList();
        listOfStudents.add(0, new Student ("Lisa", "Stuart", lisaAvg));
        listOfStudents.add(1, new Student("Jeremy", "Green", jeremyAvg));

        System.out.println("\n---------------------toString--------------------------");

        System.out.println(listOfStudents.get(0).toString());
        System.out.println(listOfStudents.get(1).toString());

        System.out.println("\n-------------------------get---------------------------");

        System.out.println(listOfStudents.get(0));
        System.out.println(listOfStudents.get(1));
    }
}