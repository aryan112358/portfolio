package com.example.Portfolio.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

@Entity
@Table(name = "project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PROJECT_SEQ")
    @SequenceGenerator(sequenceName = "PROJECT_SEQ", allocationSize = 1, name="PROJECT_SEQ")
    @Column(name="id",nullable = false)
    private Long id;

    @Column( name = "project_name")
    private String projectName;

    @Column( name = "description")
    private String description;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(orphanRemoval = true)
    @JoinColumn(name = "project_id")
    private ArrayList<Skill> skills = new ArrayList<>();

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}