package co.develhope.springdatajpa.entities;

import javax.persistence.*;

/**
 *The join table `enrollments` with:
 *   a primary key
 *   the 2 foreign keys
 *
 * @author Alessandro Canulli
 */

@Entity
@Table(name = "enrollments")
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "school_class_id")
    private SchoolClass schoolClass;

    public Enrollment() {
    }

    public Enrollment(long id, Student student, SchoolClass schoolClass) {
        this.id = id;
        this.student = student;
        this.schoolClass = schoolClass;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public SchoolClass getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(SchoolClass schoolClass) {
        this.schoolClass = schoolClass;
    }
}