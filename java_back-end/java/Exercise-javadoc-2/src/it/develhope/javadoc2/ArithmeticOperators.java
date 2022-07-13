package it.develhope.javadoc2;

import java.util.Scanner;

public class ArithmeticOperators {

    public ArithmeticOperators() {

    }
    
    public double firstInput(){
        Scanner digit = new Scanner(System.in);
        System.out.print("Insert first number here: ");

        return digit.nextDouble();
    }

    public double secondInput(){
        Scanner digit1 = new Scanner(System.in);
        System.out.print("Insert second number here: ");

        return digit1.nextDouble();
    }

    private void equals(String operator, double result){
        System.out.println("------------------------------------------------------------------------");
        System.out.printf("\n\t\t\tThe result of the %S is: %f \n\n", operator, result);
        System.out.println("------------------------------------------------------------------------");
    }

    public double sum(double num1, double num2){
        double result = num1 + num2;
        equals("sum", result);
        return result;
    }

    public double sub(double num1, double num2){
        double result = num1 - num2;
        equals("subtraction", result);
        return result;
    }

    public double mul(double num1, double num2){
        double result = num1 * num2;
        equals("multiplication", result);
        return result;
    }

    public double div(double num1, double num2){
        double result = num1 / num2;
        equals("division", result);
        return result;
    }
}

    /*private String equals(String operator, double result){
        return String.valueOf(System.out.printf("The result of the %S is: %f\n", operator, result));
    }*/

    /*private String equal(String operator, double result){
        return "The result of the %S is: %f\n" + operator + result;
    }*/