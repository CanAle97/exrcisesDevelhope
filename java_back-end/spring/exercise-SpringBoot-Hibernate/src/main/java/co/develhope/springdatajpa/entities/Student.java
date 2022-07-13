package co.develhope.springdatajpa.entities;

import javax.persistence.*;
import java.util.List;

/**
 *The table `students` where each student has:
 *   a primary key
 *   a column `lastName` (not null)
 *   a column `firstName` (not null)
 *   a column `email` that is unique and not null
 *
 * @author Alessandro Canulli
 */

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String firstName;
    @Column(unique = true, nullable = false)
    private String email;

    @OneToMany(mappedBy = "student")
    private List<Enrollment> enrollments;

    public Student() {
    }

    public Student(long id, String lastName, String firstName, String email, List<Enrollment> enrollments) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.enrollments = enrollments;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    public void setEnrollments(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }
}