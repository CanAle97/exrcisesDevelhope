package it.develhope.lists1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *Exercise: lists 1
 * define a testing class with a `main()` method where you:
 *   create a **not mutable** `List` of strings called `cityNames` using `asList()` that you populate with 3 city names
 *   try to add a 4th city name at the end of the `List`
 *     if you get an exception, try to understand why and eventually comment the faulty code
 *   try to change the 2nd item of the array, entering the value `Tegucigalpa`
 *   print the content of `cityNames`
 *   define a **mutable empty** `List` of strings called `kingsOfRome`
 *   insert the names of the [7 kings of Rome](https://en.wikipedia.org/wiki/King_of_Rome) into the mutable list
 *   print the content of `kingsOfRome`
 *   convert `kingsOfRome` into an array called `kingsOfRomeArray`, using `new String[0]` to determine the type of the array
 *   change the value of the 7th king in `kingsOfRomeArray` with the value `Lucius Tarquinius Supercar`
 *   print the content of `kingsOfRomeArray`
 *
 * @author Alessandro Canulli
 */

public class Test {
    public static void main(String[] args) {

        List<String> cityNames = Arrays.asList("Torino", "Valencia", "Tokyo");
        //cityNames.add("Mosca");
        cityNames.set(1, "Tegucigalpa");
        System.out.println(cityNames);

        List<String> kingsOfRome = new ArrayList<>();
        kingsOfRome.add("Romulus");
        kingsOfRome.add("Numa Pompilius");
        kingsOfRome.add("Tullus Hostilius");
        kingsOfRome.add("Ancus Marcius");
        kingsOfRome.add("Lucius Tarquinius Priscus");
        kingsOfRome.add("Servius Tullius");
        kingsOfRome.add("Lucius Tarquinius Superbus");
        System.out.println(kingsOfRome);

        String kingsOfRomeArray[] = kingsOfRome.toArray(new String[0]);
        kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";
        System.out.println(Arrays.toString(kingsOfRomeArray));
    }
}