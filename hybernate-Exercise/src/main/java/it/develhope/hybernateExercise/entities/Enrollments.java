package it.develhope.hybernateExercise.entities;

import javax.persistence.*;

@Entity
@Table(name = "enrollments")
public class Enrollments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Classes classes;
    @ManyToOne(fetch = FetchType.LAZY)
    private Students students;

    public Enrollments(){}

    public Enrollments(long id, Classes classes, Students students) {
        this.id = id;
        this.classes = classes;
        this.students = students;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }
}
