package co.develhope.springdatajpa.entities;

import javax.persistence.*;
import java.util.List;

/**
 *The table `classes` where each class has:
 *   a primary key
 *   a `title` (not null)
 *   a `description` (not null)
 *
 * @author Alessandro Canulli
 */

@Entity
@Table(name = "classes")
public class SchoolClass {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String description;

    @OneToMany(mappedBy = "schoolClass")
    private List<Enrollment> enrollments;

    public SchoolClass() {
    }

    public SchoolClass(long id, String title, String description, List<Enrollment> enrollments) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.enrollments = enrollments;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    public void setEnrollments(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }
}