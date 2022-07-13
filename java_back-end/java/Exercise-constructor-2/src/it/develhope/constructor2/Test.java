package it.develhope.constructor2;

/**
 * * define a testing class where you:
 *   * create 2 students
 *   * create 1 teacher
 *   * assign a name to the teacher
 *   * assign grades to the 2 students
 *   * prints the students' details
 *
 * @author Alessandro Canulli
 */

public class Test {
    public static void main(String[] args) {

        System.out.println("\n--------------------Student--------------------------");

        Student student1 = new Student("Alberto");
        Student student2 = new Student("Silene");

        System.out.println("\n--------------------Teacher--------------------------");

        Teacher teacher1 = new Teacher("Sergio");

        teacher1.assignGrade(student1, 7);
        teacher1.assignGrade(student2, 9);

        System.out.println("\n------------------Student-Details--------------------");

        student1.getStudentDetails();
        student2.getStudentDetails();
    }
}