package com.example.Portfolio.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "education")
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_SEQ")
    @SequenceGenerator(sequenceName = "USER_SEQ", allocationSize = 1, name="USER_SEQ")
    @Column(name="id",nullable = false)
    private Long id;

    @Column( name = "college_name")
    private String collegeName;

    @Column ( name = "course_name")
    private String courseName;

    @Column(name = "duration")
    private String duration;

    @Column( name = "score")
    private String score;

    public Education() {
    }

    public Education(Long id, String collegeName, String courseName, String duration, String score) {
        this.id = id;
        this.collegeName = collegeName;
        this.courseName = courseName;
        this.duration = duration;
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Education{" +
                "id=" + id +
                ", collegeName='" + collegeName + '\'' +
                ", courseName='" + courseName + '\'' +
                ", duration='" + duration + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
}