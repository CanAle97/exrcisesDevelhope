package it.develhope.defaultMethodsOverride;

import java.util.Objects;

/**
 * * define a `SmartphonePrice` class that implements `Cloneable` and has:
 *   * 2 attributes:
 *     * a string `priceType`
 *     * a double `priceInEuros`
 *   * [using IntelliJ] an override of the `clone()` method (that will have to be `public`) where:
 *     * a `clonedSmartphonePrice` is generated using `super.clone()`
 *     * the return value is a `SmartphonePrice` object
 *   * [using IntelliJ] an override of the `toString()` method for returning an informative `String` about the 2 `SmartphonePrice` attributes
 *   * [using IntelliJ] an override of the `equals()` method that check the 2 attributes to establish if two `SmartphonePrice` objects are equal
 *   * [using IntelliJ] an override of the `hashCode()`, using the 2 attributes
 *   * a constructor method that accepts 2 params (`type`, `price`) and assign the right values to the object
 *
 * @author Alessandro Canulli
 */

public class SmartphonePrice implements Cloneable{

    public String priceType;
    public double priceInEuros;

    public SmartphonePrice(String priceType, double priceInEuros) {
        this.priceType = priceType;
        this.priceInEuros = priceInEuros;
    }

    public SmartphonePrice() {

    }

    @Override
    public String toString() {
        return "\n\t\t\tpriceType: " + priceType +
                "\n\t\t\tpriceInEuros: " + priceInEuros;
    }

    @Override
    public SmartphonePrice clone() throws CloneNotSupportedException {
        return (SmartphonePrice)super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartphonePrice smartphonePrice = (SmartphonePrice) o;
        return Double.compare(this.priceInEuros, smartphonePrice.priceInEuros) == 0 && Objects.equals(this.priceType, smartphonePrice.priceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }
}
