package it.develhope.inputAndOutput1;

import java.util.Scanner;

/**
 * # Exercise: input-and-output-1
 * * create a class called `PrintYourName`
 * * provide the class `PrintYourName` with a `main` method:
 * ```
 * public static void main(String[] args) { ... }
 * ```
 * * inside the `main` method write the code that prints your name
 *
 * **Note**: in the console, after your name, you will notice a message like the following:
 * ```
 * Process finished with exit code 0
 * ```
 * Don't worry, it means that you didn't break Java, so there were 0 errors :)
 *
 * @author Alessandro Canulli
 */

public class PrintYourName {
    public static void main(String args[]){
        String yourName;
        Scanner input = new Scanner(System.in);

        System.out.print("Write your name here: ");
        yourName = input.nextLine();

        System.out.println("\n-----------------------------------------\n\t\t\t" + yourName + "\n-----------------------------------------");

        input.close();
    }
}