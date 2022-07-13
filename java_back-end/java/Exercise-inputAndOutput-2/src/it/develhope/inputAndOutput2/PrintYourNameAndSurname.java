package it.develhope.inputAndOutput2;

import java.util.Scanner;

/**
 * # Exercise: input-and-output-2
 * * create a class called `PrintYourNameAndSurname`
 * * provide the class `PrintYourNameAndSurname` with a `main` method:
 * ```
 * public static void main(String[] args) { ... }
 * ```
 * * inside the `main` method write two lines of code that print **on the same line** your name followed by a space and by your surname
 * * the expected output should be this:
 * ```
 * YourName YourSurname
 * ```
 *
 * @author Alessandro Canulli
 */

public class PrintYourNameAndSurname {
    public static void main(String args[]){
        String yourName;
        String yourSurname;
        Scanner input = new Scanner(System.in);

        System.out.print("Write your name here: ");
        yourName = input.nextLine();

        System.out.print("Write your surname here: ");
        yourSurname = input.nextLine();

        System.out.println("\n-----------------------------------------\n\t\t\t" + yourName + " " + yourSurname + "\n-----------------------------------------");

        input.close();
    }
}