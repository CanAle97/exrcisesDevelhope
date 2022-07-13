package it.develhope.swagger2.entities;

/**
 *Create an entity called `ArithmeticOperation` that has the following (described) values:
 *  a string `name`
 *  an integer `minNumberOfOperands`
 *  a string `description`
 *  an array of strings `properties`
 *
 * @author Alessandro Canulli
 */

public class ArithmeticOperation {
    private String name;
    private int minNumberOfOperands;
    private String description;
    private String[] properties;

    public ArithmeticOperation(String name, int minNumberOfOperands, String description, String[] properties) {
        this.name = name;
        this.minNumberOfOperands = minNumberOfOperands;
        this.description = description;
        this.properties = properties;
    }
}