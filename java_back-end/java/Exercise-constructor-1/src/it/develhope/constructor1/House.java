package it.develhope.constructor1;

/**
 * # Exercise: constructor-1
 * * create a class called `House` that has 3 instance variables:
 *   * a string `address`
 *   * an int `numberOfFloors`
 * * define a *constructor method* for `House` that will print in console a message as soon as a `House` object is created
 *
 * @author Alessandro Canulli
 */

public class House {

    public String address;
    public int numberOfFloors;
    public int numberOfApartments;

    public House(String address, int numberOfFloors, int numberOfApartments) {
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        this.numberOfApartments = numberOfApartments;

        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "\n\t\t\t\t\tHOUSE\n" +
                "\t\t\taddress: " + address + "\n" +
                "\t\t\tnumberOfFloors: " + numberOfFloors + "\n" +
                "\t\t\tnumberOfApartments: " + numberOfApartments +
                "\n-------------------------------------------------";
    }
}