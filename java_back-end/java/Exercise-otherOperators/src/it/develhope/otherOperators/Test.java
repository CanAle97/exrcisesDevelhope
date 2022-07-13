package it.develhope.otherOperators;

/**
 *
 *# Exercise: Other operators
 * Define a testing class where you:
 * define an int variable called `a` and initialise it with the value `15`
 * add `5` to `a` without repeating the `a` variable (e.g. `a = a + 5` is not accepted)
 * then subtract `4` to `a` without repeating the `a` variable
 * assign the value of `a` to `int b` and increment `b` by one without using `a` or `int b = b + 1`
 * check and prints if both the following statements are `true`:
 *   statement 1: check if `b` is an odd number
 *   statement 2: check if the result of (`b` multiplied for `b + 1`) is a multiple of `3`
 *
 * @author Alessandro Canulli
 */

public class Test {
    public static void main(String[] args) {
        System.out.println("---START--MAIN---");

        int a = 15;
        System.out.println(a);

        a += 5;
        System.out.println(a);

        a -= 4;
        System.out.println(a);

        int b =++ a;
        System.out.println(b);

        if(b % 2 == 1) {
            System.out.println("b is odd");
        }else {
            System.out.println("b is even");
        }

        if(b * (b + 1) % 3 == 0) {
            System.out.println("b + 1 is a multiple of 3");
        }else {
            System.out.println("b + 1 is not a multiple of 3");
        }

        System.out.println("---FINISH--MAIN---");
    }
}