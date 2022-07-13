package it.develhope.inputAndOutput3;

import java.util.Scanner;

/**
 * # Exercise: input-and-output-3
 * * create a class called `PrintYourNameAndSurname`
 * * provide the class `PrintYourNameAndSurname` with a `main` method
 * * inside the `main` method write two lines of code that print **on 2 different lines** your name and your surname
 * * the expected output should be this:
 * ```
 * YourName
 * YourSurname
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

        System.out.println("\n-----------------------------------------\n\t\t\t" + yourName + "\n\t\t\t" + yourSurname + "\n-----------------------------------------");

        input.close();
    }
}