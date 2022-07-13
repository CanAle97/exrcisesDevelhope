package it.develhope.defaultMethodsOverride;

import java.util.Objects;

/**
 *# Exercise: default methods override
 *  * define a `Smartphone` class that implements `Cloneable` and has:
 *    * 5 attributes:
 *      * a string `brandName`
 *      * a string `modelName`
 *      * an int `batterymAh`
 *      * an attribute `producerPrice` of type `SmartphonePrice`
 *      * an attribute `retailPrice` of type `SmartphonePrice`
 *    * [using IntelliJ] an override of the `toString()` method in order to print all the attributes of a `Smartphone` object
 *    * [using IntelliJ] an override of the `equals()` method that check all the 5 attributes to establish if two `Smartphone` objects are equal
 *    * [using IntelliJ] an override of the `hashCode()`, using all the 5 attributes
 *    * [using IntelliJ] an override of the `clone()` method (that will have to be `public`) where:
 *      * a `clonedSmartphone` is generated using `super.clone()`
 *      * there's an assignment to the `clonedSmartphone.producerPrice`
 *      * there's an assignment to the `clonedSmartphone.retailPrice`
 *      * the return value is a `Smartphone` object
 *    * a constructor method that accepts 5 params (`brand`, `model`, `battery`, `prodP`, `retailP`) and assign the right values to the object
 *
 * @author Alessandro Canulli
 */

public class Smartphone implements Cloneable{

    public String brandName;
    public String modelName;
    public int batteryMAh;

    public SmartphonePrice producePrice;
    public SmartphonePrice retailPrice;

    public Smartphone(String brand, String model, int battery, SmartphonePrice prodP, SmartphonePrice retailP) {
        this.brandName = brand;
        this.modelName = model;
        this.batteryMAh = battery;
        this.producePrice = prodP;
        this.retailPrice = retailP;
    }

    @Override
    public String toString() {
        return "----------------------------------------------------------------------\n" +
                "\tSmartphone: " + brandName + " - " + modelName +
                "\n\t\tbattery mAh: " + batteryMAh +
                "\n\t\tproducePrice: " + producePrice +
                "\n\t\tretailPrice: " + retailPrice;
    }

    @Override
    protected Smartphone clone() throws CloneNotSupportedException {
        Smartphone clonedSmartphone = (Smartphone)super.clone();
        clonedSmartphone.producePrice = this.producePrice.clone();
        clonedSmartphone.retailPrice = this.retailPrice.clone();
        return clonedSmartphone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone smartphone = (Smartphone) o;
        return this.batteryMAh == smartphone.batteryMAh && Objects.equals(this.brandName, smartphone.brandName) && Objects.equals(this.modelName, smartphone.modelName) && Objects.equals(this.producePrice, smartphone.producePrice) && Objects.equals(this.retailPrice, smartphone.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batteryMAh, producePrice, retailPrice);
    }
}
