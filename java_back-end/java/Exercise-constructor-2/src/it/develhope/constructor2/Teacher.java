package it.develhope.constructor2;

/**
 * * define a class called `Teacher` that has:
 *   * a string instance variable called `teacherName`
 *   * a constructor method that simply inform the user about the creation of a `Teacher` object
 *   * a method `assignGrade()` that
 *     * takes 2 params:
 *       * `alum` of type `Student`
 *       * a int `finalGrade`
 *     * assigns `finalGrade` to the `Student`'s `grade`
 *
 * @author Alessandro Canulli
 */

public class Teacher {

    public String teacherName;

    public Teacher(String teacherName) {
        System.out.printf("\t\tTeacher object created: %s\n", this.teacherName = teacherName);
    }

    public void assignGrade(Student alum, int finalGrade){
        alum.grade = finalGrade;
    }
}