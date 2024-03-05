package com.example.Portfolio.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_SEQ")
    @SequenceGenerator(sequenceName = "USER_SEQ", allocationSize = 1, name="USER_SEQ")
    @Column(name="id",nullable = false)
    private Long id;

    @Column(name = "NAME",nullable = false)
    private String name;

    @Column(name = "DOB", nullable = false)
    private String DOB;

    @OneToMany(mappedBy = "user")
    @JoinTable(
            name = "CONTACT_DETAILS",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn( name = "contact_id")
        )
    private List<Contacts> contact ;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinTable(
            name = "EDUCATION_DETAILS",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "education_id")
    )
    private Education education;

    @OneToMany(mappedBy = "user")
    @JoinTable(
            name = "PROJECTS",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id")
    )
    private  List<Project> projects ;

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

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    @OneToMany(mappedBy = "user")
    @JoinTable(
            name = "EXPERIENCE",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "experience_id")

    )



    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }


    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public List<Contacts> getContact() {
        return contact;
    }

    public void setContact(List<Contacts> contact) {
        this.contact = contact;
    }


}
