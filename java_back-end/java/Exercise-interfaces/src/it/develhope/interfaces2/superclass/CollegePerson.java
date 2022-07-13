package it.develhope.interfaces2.superclass;

/**
 *
 * Define a Java superclass `CollegePerson` that has:
 *   3 attributes (`name`, `surname` and a numeric `collegeId`)
 *   a method `goToCollege` that prints all the `CollegePerson` attributes
 *
 * @author Alessandro Canulli
 */

public class CollegePerson {
    private String name;
    private String surname;
    private int collegeId;

    public void goToCollege() {
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------\n"
                + "Name: " + getName() + "\n" + "Surname: " + getSurname() + "\n" + "College ID: " + getCollegeId() +
                "\n--------------------------------------------------------------------------------------------------------------------------------------------\n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }
}