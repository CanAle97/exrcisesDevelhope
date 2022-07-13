package it.develhope.interfaces2.entities;

import it.develhope.interfaces2.interfaces.LearningPerson;
import it.develhope.interfaces2.interfaces.TeachingPerson;
import it.develhope.interfaces2.superclass.CollegePerson;

/**
 *
 * Considering that an assistant **is** a `CollegePerson` that **can learn and teach**, define a subclass `Assistant` that:
 *   implements the right interfaces and overrides the abstract methods with informative messages
 *   has an attribute of type `boolean` called `isGoingToBeAPhD`
 *   has a constructor that takes 4 params (`name`, `surname`, `id`, `willBeAPhD`) and assigns their values to the right attributes
 *
 * @author Alessandro Canulli
 */

public class Assistant extends CollegePerson implements LearningPerson, TeachingPerson {
    private boolean isGoingToBeAPhD;

    public Assistant(String name, String surname, int id, boolean willBeAPhD) {
        this.setName(name);
        this.setSurname(surname);
        this.setCollegeId(id);
        this.setGoingToBeAPhD(willBeAPhD);
    }

    @Override
    public void studyAtHome() {
        System.out.printf("--------------------------------------------------------------------------------------------------------------------------------------------\n" +
                "I'm the Assistant %s %s\n" +
                "When I am at school I learn new concepts which I deepen by studying at home.\n" +
                "--------------------------------------------------------------------------------------------------------------------------------------------\n", getName(), getSurname());
    }

    @Override
    public void teachToOtherPeople() {
        System.out.printf("--------------------------------------------------------------------------------------------------------------------------------------------\n" +
                "I'm the Assistant %s %s,\n" +
                "I assist the professor in the lessons or, if the professor is indisposed, I can also carry on the program under the teacher's instructions.\n" +
                "I also correct the homework assigned to students by the professor.\n" +
                "--------------------------------------------------------------------------------------------------------------------------------------------\n", getName(), getSurname());
    }

    public boolean isGoingToBeAPhD() {
        return isGoingToBeAPhD;
    }

    public void setGoingToBeAPhD(boolean goingToBeAPhD) {
        isGoingToBeAPhD = goingToBeAPhD;
    }
}