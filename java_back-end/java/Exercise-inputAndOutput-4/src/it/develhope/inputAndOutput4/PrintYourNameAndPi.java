package it.develhope.inputAndOutput4;

import java.util.Scanner;

/**
 * # Exercise: input-and-output-4
 * * create a class called `PrintYourNameAndPi`
 * * inside the `main` method write two lines of code using `System.out.printf` that print:
 *   * your name ALL CAPS, using the `%S` *converter*, followed by a new line (`%n` converter)
 *   * the [number Pi](https://en.wikipedia.org/wiki/Pi) `3.141590`, using the `%f` *converter*
 * * the expected output should be this:
 * ```
 * YOURNAME
 * The number Pi is: 3.141590
 * ```
 * * please note that the output of the number Pi could be `3,141590` (using the comma `,` instead of the dot `.`)
 *
 * @author Alessandro Canulli
 */

public class PrintYourNameAndPi {
    public static void main(String[] args) {
        String yourName;
        String yourSurname;
        Scanner input = new Scanner(System.in);

        System.out.print("Write your name here: ");
        yourName = input.nextLine();

        System.out.print("Write your surname here: ");
        yourSurname = input.nextLine();

        System.out.printf("\n-----------------------------------------\n\t\t\t%S %S\n-----------------------------------------" +
                "%n\t the number Pi is: %f%n-----------------------------------------", yourName, yourSurname, Math.PI);

        input.close();
    }
}