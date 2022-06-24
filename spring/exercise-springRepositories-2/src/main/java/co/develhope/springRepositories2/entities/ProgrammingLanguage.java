package co.develhope.springRepositories2.entities;

import javax.persistence.*;
import java.time.LocalDate;

/**
 *Exercise - Spring Boot - Spring Repositories 2
 * write a Spring Boot application with the necessary dependencies that:
 *   runs on port `5050`
 *   uses `Rest Repositories HAL Explorer`
 *   connects to a local MySQL db
 *   drops the schema at the end of the session
 *   defines a table of programming languages, where each `ProgrammingLanguage` has:
 *     a primary key
 *     a `name` not null
 *     a year of `firstAppearance` that can be null
 *     a column `inventor` not null
 *
 * @author Alessandro Canulli
 */

@Entity
@Table(name = "ProgrammingLanguages")
public class ProgrammingLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String name;
    private LocalDate firstAppearance;
    @Column(nullable = false)
    private String inventor;

    public ProgrammingLanguage() {
    }

    public ProgrammingLanguage(Long id, String name, LocalDate firstAppearance, String inventor) {
        this.id = id;
        this.name = name;
        this.firstAppearance = firstAppearance;
        this.inventor = inventor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getFirstAppearance() {
        return firstAppearance;
    }

    public void setFirstAppearance(LocalDate firstAppearance) {
        this.firstAppearance = firstAppearance;
    }

    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor;
    }
}