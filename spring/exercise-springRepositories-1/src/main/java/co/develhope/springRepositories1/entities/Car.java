package co.develhope.springRepositories1.entities;

import javax.persistence.*;
import java.security.SecureRandom;

/**
 *Exercise - Spring Boot - Spring Repositories 1
 * write a Spring Boot application with the necessary dependencies that:
 *   uses `Rest Repositories HAL Explorer`
 *   connects to a local MySQL db
 *   drops the schema at the end of the session
 *   defines a table of cars, where each `Car` has:
 *     a primary key
 *     a `modelName` not null
 *     a `serialNumber` not null
 *     a `currentPrice` that can be null
 *
 * @author Alessandro Canulli
 */

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String modelName;
    @Column(nullable = false)
    private String serialNumber = generateSerialNumber();
    private Integer currentPrice;

    public Car() {
    }

    public Car(Long id, String modelName, Integer currentPrice) {
        this.id = id;
        this.modelName = modelName;
        this.serialNumber = generateSerialNumber();
        this.currentPrice = currentPrice;
    }

    public String generateSerialNumber() {
        final String symbols = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        SecureRandom secureRandom = new SecureRandom();

        int capacity = 13;
        StringBuilder stringBuilder = new StringBuilder(capacity);
        for(int i = 0; i < capacity; i++) {
            stringBuilder.append(symbols.charAt(secureRandom.nextInt(symbols.length())));
        }
        return stringBuilder.toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public Integer getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Integer currentPrice) {
        this.currentPrice = currentPrice;
    }
}