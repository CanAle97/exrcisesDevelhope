package it.develhope.interfaces2;

import it.develhope.interfaces2.entities.Assistant;
import it.develhope.interfaces2.entities.Professor;
import it.develhope.interfaces2.entities.Student;

/**
 *
 * Define a Java testing class where you:
 *   create 3 objects, 1 for each subclass type
 *   invoke the `goToCollege()` method for each of the newly created objects
 *   invoke the implemented methods from interfaces (1 for `Student`, 1 for `Professor` and 2 for `Assistant`)
 *
 * @author Alessandro Canulli
 */

public class Test {
    public static void main(String[] args) {
        System.out.println("--------------------------START---------------------------------------------------------MAIN------------------------------------------------");

        Student student1 = new Student("Alessandro", "Canulli", 1, 1);
        Professor professor1 = new Professor("Francesco", "De Lorenzo", 2, "programming");
        Assistant assistant1 = new Assistant("I'm the cat", "Squirrel", 3, true);

        student1.goToCollege();
        professor1.goToCollege();
        assistant1.goToCollege();

        student1.studyAtHome();

        professor1.teachToOtherPeople();

        assistant1.studyAtHome();
        assistant1.teachToOtherPeople();

        System.out.println("--------------------------FINISH--------------------------------------------------------MAIN------------------------------------------------");
    }
}