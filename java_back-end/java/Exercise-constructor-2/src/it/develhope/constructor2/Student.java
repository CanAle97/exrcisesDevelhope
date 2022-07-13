package it.develhope.constructor2;

/**
 * # Exercise: constructor-2
 * * define a class called `Student` that has:
 *   * a string instance variable `name`
 *   * a int instance variable `grade`
 *   * a constructor method that
 *     * informs the user about the object creation
 *     * takes a `studentName` parameter and assign it to the object's instance variable `name`
 *   * a method `getStudentDetails()` that prints a student `name` and `grade`
 *
 * @author Alessandro Canulli
 */

public class Student {

    public String name;
    public int grade;

    public Student(String studentName) {
        System.out.printf("\t\tStudent object created: %s\n", this.name = studentName);
    }

    public void getStudentDetails(){
        System.out.printf("\t\tThis is the student %s\n\t\tHis grade is: %d\n", name, grade);
    }
}