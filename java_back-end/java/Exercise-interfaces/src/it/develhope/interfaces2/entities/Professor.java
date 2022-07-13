package it.develhope.interfaces2.entities;

import it.develhope.interfaces2.interfaces.TeachingPerson;
import it.develhope.interfaces2.superclass.CollegePerson;

/**
 *
 * Considering that a professor **is** a `CollegePeorson` that **can teach**, define a subclass `Professor` that:
 *   implements the right interface and overrides the abstract method with an informative message
 *   has an attribute of type `String` called `teachingSubject`
 *   has a constructor that takes 4 params (`name`, `surname`, `id`, `subject`) and assigns their values to the right attributes
 *
 * @author Alessandro Canulli
 */

public class Professor extends CollegePerson implements TeachingPerson {
    private String teachingSubject;

    public Professor(String name, String surname, int id, String Subject) {
        this.setName(name);
        this.setSurname(surname);
        this.setCollegeId(id);
        this.setTeachingSubject(Subject);
    }

    @Override
    public void teachToOtherPeople() {
        System.out.printf("--------------------------------------------------------------------------------------------------------------------------------------------\n" +
                "I am Professor %s %s,\n" +
                "I teach %s to my students\n" +
                "--------------------------------------------------------------------------------------------------------------------------------------------\n", getName(), getSurname(), getTeachingSubject());
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }
}