package it.develhope.constructor1;

/**
 * * define a testing class (e.g. `Tester`, `Start` or another _reasonable_ name you prefer) with a `main` method where:
 *   * you declare two `House` variables `house1` and `house2`
 *   * you create two `House` objects and assign them to the variables `house1` and `house2`
 *
 * @author Alessandro Canulli
 */

public class Test {
    public static void main(String[] args) {

        House house1;
        House house2;

        house1 = new House("Narrow Way 90", 5, 17);
        house2 = new House("High Way 3", 15, 50);
    }
}