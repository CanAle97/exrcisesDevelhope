package it.develhope.arrays2;

import java.util.Arrays;

/**
 *# Exercise: arrays-2
 * define a testing class with a `main()` method where you:
 *   define 3 arrays of strings called `aliceToDos`, `bobToDos` and `timToDos`
 *   `aliceToDos` has the following tasks in this order: `Coding`, `Reading` and `Learning`
 *   `bobToDos` has the following tasks in this order: `Reading`, `Coding`, `Learning` and `Sleeping`
 *   `timToDos` has the following tasks in this order: `Reading`, `Learning` and `Coding`
 *   you print in console - using the right `java.util.Arrays` methods and array's attribute - the answers of the following questions:
 *   `Is Alice's array equal to Bob array?` - use a specific method from `java.util.Arrays`
 *   `Is Alice's array equal to Tim array?` - use a specific method from `java.util.Arrays`
 *   `Is Alice's array having the same length of Bob's array?` - use a specific attribute of the array
 *   `Is Alice's array having the same length of Tim's array?` - use a specific attribute of the array
 *   `Is Alice having the same tasks of Bob?` - use 2 specific methods from `java.util.Arrays`
 *   `Is Alice having the same tasks of Tim?` - use 2 specific methods from `java.util.Arrays`
 *
 * @author Alessandro Canulli
 */

public class Test {
    public static void main(String[] args) {

        String aliceToDos[];
        String bobToDos[];
        String timToDos[];

        aliceToDos = new String[]{"Coding", "Reading", "Learning"};
        bobToDos = new String[]{"Reading", "Coding", "Learning", "Sleeping"};
        timToDos = new String[]{"Reading", "Learning", "Coding"};

        System.out.println("Is Alice's array equal to Bob array? " + Arrays.equals(aliceToDos, bobToDos));
        System.out.println("Is Alice's array equal to Tim array? " + Arrays.equals(aliceToDos, timToDos));

        System.out.println("Is Alice's array having the same length of Bob's array? " + (aliceToDos.length == bobToDos.length));
        System.out.println("Is Alice's array having the same length of Tim's array? " + (aliceToDos.length == timToDos.length));

        Arrays.sort(aliceToDos);
        Arrays.sort(bobToDos);
        Arrays.sort(timToDos);
        System.out.println("Is Alice having the same tasks of Bob? " + Arrays.equals(aliceToDos, bobToDos));
        System.out.println("Is Alice having the same tasks of Tim? " + Arrays.equals(aliceToDos, timToDos));
    }
}