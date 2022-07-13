package it.develhope.sqlview;

/**
 * create a class `Student` that has:
 *   2 string properties:
 *     `name`
 *     `surname`
 *   a constructor for setting the 2 values
 *   getters methods
 *
 * @author Alessandro Canulli
 */

public class Students {

    private String name;
    private String surname;

    public Students(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "name= '" + name + '\'' +
                " surname= '" + surname;
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
}