package it.develhope.genericsWildcards2;

import static it.develhope.genericsWildcards2.GenericsClass.*;

/**
 * * define a testing class with a `main()` method where you:
 *   * create 4 new `GenericsClass` objects where `T` is:
 *     * `Integer` for `firstElement` and `secondElement`
 *     * `String` for `thirdElement` and `fourthElement`
 *   * assign the following object-value using the `setT()` method:
 *     * `firstElement` will have an int value `12`
 *     * `secondElement` will have an int value `13`
 *     * `thirdElement` and `fourthElement` will have the same String value `"This is a string"`
 *   * call the static method `isEqual()` for answering the following two comparisons (and notify the user):
 *     * first element is equal to second element?
 *     * third element is equal to fourth element?
 *
 * @author Alessandro Canulli
 */

public class Test {
    public static void main(String[] args) {

        GenericsClass<Integer> firstElement = new GenericsClass();
        GenericsClass<Integer> secondElement = new GenericsClass();
        GenericsClass<String> thirdElement = new GenericsClass();
        GenericsClass<String> fourthElement = new GenericsClass();

        firstElement.setT(12);
        secondElement.setT(13);
        thirdElement.setT("This is a string");
        fourthElement.setT("This is a string");

        System.out.printf("First %s\nSecond %s\nThird %s\nFourth  %s\n", firstElement, secondElement, thirdElement, fourthElement);

        System.out.println("------------------------------------------");

        System.out.println("First element is equal to second element? " + GenericsClass.isEqual(firstElement, secondElement));
        System.out.println("Third element is equal to fourth element? " + GenericsClass.isEqual(thirdElement, fourthElement));
    }
}