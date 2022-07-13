package it.develhope.javadoc1;

import java.util.Scanner;

/**
 * # Exercise: javadoc-1
 * * create a class called `WordGames` that has two methods:
 *   * `addHelloWord` method that takes one parameter as input called `word` and returns the String `Hello [wordHere]`
 *   * `getFullName` method that takes two parameters as input called `name` and `surname` and returns their concatenation
 * * create a class called `Tester` that has the `main` method where you:
 *   * create a new `WordGames` object
 *   * print in console the result of the `addHelloWord` method invocation
 *   * print in console the result of the `getFullName` method invocation
 * * add `Javadoc` comments to:
 *   * the 2 classes with a short description and the author
 *   * the 3 methods with a short description, the parameters and the return
 *
 * @author Alessandro Canulli
 */

public class Tester {
    public static void main(String[] args) {
        String yourName;
        String yourSurname;
        Scanner input = new Scanner(System.in);
        WordGames wordGames = new WordGames();

        wordGames.addHelloWord("word");

        System.out.print("Write your name here: ");
        yourName = input.nextLine();

        System.out.print("Write your surname here: ");
        yourSurname = input.next();

        wordGames.getFullName(yourName, yourSurname);

        input.close();
    }
}