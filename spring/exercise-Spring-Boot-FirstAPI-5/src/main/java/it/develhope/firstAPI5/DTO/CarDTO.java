package it.develhope.firstAPI5.DTO;

import javax.validation.constraints.NotBlank;

/**
 *Exercise - Spring Boot - First API 5
 * write a Spring Boot application with the necessary dependencies that has:
 *   has a DTO called `CarDTO` with the following properties:
 *     a string `id` (mandatory)
 *     a string `modelName` (mandatory)
 *     a double `price`
 *
 * @author Alessandro Canulli
 */

public class CarDTO {
    @NotBlank(message = "Obligatory")
    private String id;
    @NotBlank(message = "Obligatory")
    private String modelName;
    private double price;

    public CarDTO(String id, String modelName, double price) {
        this.id = id;
        this.modelName = modelName;
        this.price = price;
    }

    public CarDTO(String id, String modelName) {
        this.id = id;
        this.modelName = modelName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CarDTO{" +
                "id='" + id + '\'' +
                ", modelName='" + modelName + '\'' +
                ", price=" + price +
                '}';
    }
}