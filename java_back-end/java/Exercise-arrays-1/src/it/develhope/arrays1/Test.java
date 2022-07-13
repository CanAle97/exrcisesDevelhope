package it.develhope.arrays1;

import java.util.Arrays;

/**
 *# Exercise: arrays-1
 * define a testing class with a `main()` method where you:
 *   define an array of strings called `carBrands` that is populated with 5 famous car brand names
 *   print in console the number of items of the `carBrands` array
 *   print in console the 3rd item of `carBrands` array
 *   declare an empty array of integers called `primeNumbers` with a predefined size of 6 items
 *   insert one by one the values of the first 6 [prime numbers](https://en.wikipedia.org/wiki/Prime_number), populating `primeNumbers` array
 *   print in console all the content of the already populated `primeNumbers` array
 *
 * @author Alessandro Canulli
 */

public class Test {
    public static void main(String[] args) {

        String carBrands[] = {"BMW", "Mercedes", "Audi", "Alfa Romeo", "Maserati"};

        System.out.println(carBrands.length);
        System.out.println(carBrands[2]);

        int primeNumbers[] = new int[6];

        primeNumbers[0] = 2;
        primeNumbers[1] = 3;
        primeNumbers[2] = 5;
        primeNumbers[3] = 7;
        primeNumbers[4] = 11;
        primeNumbers[5] = 13;

        System.out.println(Arrays.toString(primeNumbers));
    }
}