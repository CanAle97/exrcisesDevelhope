package it.develhope.genericsWildcards2;

/**
 * # Exercise: generics-wildcards-2
 * * define a `GenericsClass` using the [diamond operator](https://www.baeldung.com/java-diamond-operator) `<T>` that has:
 *   * a private attribute `t` of type `T`
 *   * a public method `getT()` method (with no parameters) that returns the current instance's `t`
 *   * a public method `setT()` method that:
 *     * takes a `T` parameter called `valueToSet`
 *     * assign the parameter's value to the current instance's `t`
 *   * a public static generics method `isEqual()` that:
 *     * takes two generics parameters in input:
 *       * a `GenericsClass` gc1
 *       * a `GenericsClass` gc2
 *     * uses Java's [Object `equals` operator](https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#equals(java.lang.Object)) and the `getT()` method to understand if the two `Object` are equal:
 *       * please note that the `equals()` operator has the following syntax: `object1.equals(object2)`
 *     * returns a `boolean` (`true` if the two objects are equals, `false` if the two objects are not equals)
 *
 * @param <T>
 * @author Alessandro Canulli
 */

public class GenericsClass<T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T valueToSet) {
        this.t = valueToSet;
    }

    public static boolean isEqual(GenericsClass gc1, GenericsClass gc2) {
        boolean result = gc1.equals(gc2);

        return result;
    }

    @Override
    public String toString() {
        return "element: " + t;
    }
}