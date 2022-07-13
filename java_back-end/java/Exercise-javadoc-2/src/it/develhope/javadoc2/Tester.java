package it.develhope.javadoc2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * # Exercise: javadoc-2
 * * have a quick look at the [Java arithmetic operators](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op1.html)
 * * create a class called `ArithmeticOperators` that has 4 methods:
 *   * `sum()` method that takes 2 int parameters as input called `num1` and `num2` and returns their summation int
 *   * `sub()` method that takes 2 int parameters as input called `num1` and `num2` and returns their subtraction int
 *   * `mul()` method that takes 2 int parameters as input called `num1` and `num2` and returns their multiplication int
 *   * `div()` method that takes 2 int parameters as input called `num1` and `num2` and returns their division int
 * * create a class called `Tester` that has the `main` method where you:
 *   * create a new `ArithmeticOperators` object
 *   * print in console the result of the 4 methods invocations, passing them (as params) int numbers as you like
 * * add `Javadoc` comments to:
 *   * the 2 classes with a short description and the author
 *   * the 5 methods with a short description, the parameters and the return value
 * * create a folder called `GeneratedJavadoc` under the main project folder
 * * generate the Javadoc file using the [IntelliJ Javadoc plugin](https://plugins.jetbrains.com/plugin/7157-javadoc) right inside the newly created folder
 * * explore the freshly generated Javadoc
 *
 * @author Alessandro Canulli
 */

public class Tester {
    public static void main(String[] args) {
        new Tester();
    }

    public void firstMenu() {
        System.out.println("1)Sum \n2)Subtraction \n3)Multiplication \n4)Division \n");
        System.out.print("Make your choice: ");
    }

    public void onOff() {
        System.out.println("\nType 9 to proceed.");
        System.out.println("Type 0 to exit.");
        System.out.print("Make your choice: ");

        try (Scanner onOff = new Scanner(System.in)) {

            switch (onOff.nextInt()) {
                case 0:
                    System.out.println("\n------------------------------------------------------------------------");
                    System.out.println("\t\t\t\t\t\tProgram finished.");
                    System.out.println("------------------------------------------------------------------------");

                    onOff.close();
                    break;

                case 9:
                    System.out.println("\nPlease select a voice.");
                    new Tester();

                    onOff.close();
                    break;

                default:
                    try {
                        System.err.println("Unrecognized value.");
                        Thread.sleep(200);
                        System.out.println("\t\tEnter 9 to perform other instructions\n\t\tor you can enter 0 to exit the program");
                        Thread.sleep(200);
                        onOff();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }
    }

    public Tester() {

        try (Scanner choice = new Scanner(System.in)) {
            firstMenu();

            switch (choice.nextInt()) {
                case 1:
                    System.out.println("\n\t\tHere you can add two numbers\n");

                    ArithmeticOperators arithmeticOperators = new ArithmeticOperators();
                    arithmeticOperators.sum(arithmeticOperators.firstInput(), arithmeticOperators.secondInput());

                    onOff();
                    choice.close();

                    break;

                case 2:
                    System.out.println("\n\t\tHere you can subtract two numbers\n");

                    ArithmeticOperators arithmeticOperators1 = new ArithmeticOperators();
                    arithmeticOperators1.sub(arithmeticOperators1.firstInput(), arithmeticOperators1.secondInput());

                    onOff();
                    choice.close();

                    break;

                case 3:
                    System.out.println("\n\t\tHere you can multiply two numbers\n");

                    ArithmeticOperators arithmeticOperators2 = new ArithmeticOperators();
                    arithmeticOperators2.mul(arithmeticOperators2.firstInput(), arithmeticOperators2.secondInput());

                    onOff();
                    choice.close();
                    break;

                case 4:
                    System.out.println("\n\t\tHere you can divide two numbers\n");

                    ArithmeticOperators arithmeticOperators3 = new ArithmeticOperators();
                    arithmeticOperators3.div(arithmeticOperators3.firstInput(), arithmeticOperators3.secondInput());

                    onOff();
                    choice.close();
                    break;

                default:
                    try {
                        System.err.println("Unrecognized value.");
                        Thread.sleep(200);
                        System.out.println("\t\tEnter a number between 1 and 4");
                        Thread.sleep(200);
                        new Tester();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }catch (InputMismatchException inputMismatchException){
            System.err.println("You cannot insert a period '.'.\nUse comma ','");
        }
    }
}