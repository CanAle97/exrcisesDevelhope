package it.develhope.interfaces2.entities;

import it.develhope.interfaces2.interfaces.LearningPerson;
import it.develhope.interfaces2.superclass.CollegePerson;

/**
 *
 * Considering that a student **is** a `CollegePerson` that **can learn**, define a subclass `Student` that:
 *   implements the right interface and overrides the abstract method with an informative message
 *   has an attribute `academicYear` of type `int`
 *   has a constructor that takes 4 params (`name`, `surname`, `id`, `year`) and assigns their values to the right attributes
 *
 * @author Alessandro Canulli
 */

public class Student extends CollegePerson implements LearningPerson {
    private int academicYear;

    public Student(String name, String surname, int id, int year) {
        this.setName(name);
        this.setSurname(surname);
        this.setCollegeId(id);
        this.setAcademicYear(year);
    }

    @Override
    public void studyAtHome() {
        System.out.printf("--------------------------------------------------------------------------------------------------------------------------------------------\n" +
                "I'm the student %s %s\n" +
                "When I am at school I learn new concepts which I deepen by studying at home.\n" +
                "--------------------------------------------------------------------------------------------------------------------------------------------\n", getName(), getSurname());
    }

    public int getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(int academicYear) {
        this.academicYear = academicYear;
    }
}