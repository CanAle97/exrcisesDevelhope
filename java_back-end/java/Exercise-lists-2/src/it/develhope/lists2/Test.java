package it.develhope.lists2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *Exercise: lists 2
 * define a testing class with a `main()` method where you:
 *   define a `List` of integers called `divisorsOf52` that contains [all the divisors](https://onlinemathtools.com/find-all-divisors) of 52
 *   define a `List` of integers called `randomNumbers` that contains the following numbers: `1, 60, 13, 12`
 *   use a specific method of `List` for appending all the elements of `divisorsOf52` at the bottom of `randomNumbers`
 *   print the elements of `randomNumbers` and the number of items inside `randomNumbers`
 *   find the positions of the duplicates and remove them, leaving just 1 occurrence of a specific integer
 *   print again the elements of `randomNumbers` and the number of items inside `randomNumbers`
 *   sort `randomNumbers` in descending order using `Collections.sort()`
 *   print again the elements of `randomNumbers`
 *
 * @author Alessandro Canulli
 */

public class Test {
    public static void main(String[] args) {

        List<Integer> divisorsOf52 = new ArrayList<>();
        divisorsOf52.add(1);
        divisorsOf52.add(2);
        divisorsOf52.add(4);
        divisorsOf52.add(13);
        divisorsOf52.add(26);
        divisorsOf52.add(52);

        List<Integer> randomNumbers = new ArrayList<>();
        randomNumbers.add(1);
        randomNumbers.add(60);
        randomNumbers.add(13);
        randomNumbers.add(12);

        randomNumbers.addAll(divisorsOf52);

        System.out.println(randomNumbers + "\n" + randomNumbers.size());

        int duplicate1 = randomNumbers.indexOf(1);
        randomNumbers.remove(duplicate1);

        int duplicate13 = randomNumbers.indexOf(13);
        randomNumbers.remove(duplicate13);

        System.out.println(randomNumbers + "\n" + randomNumbers.size());

        Collections.sort(randomNumbers, Collections.reverseOrder());
        System.out.println(randomNumbers);
    }
}