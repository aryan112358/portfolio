package com.example.Portfolio.domain;

import jakarta.persistence.*;

@Entity
@Table(name="SKILL")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SKILL_SEQ")
    @SequenceGenerator(sequenceName = "SKILL_SEQ", allocationSize = 1, name="SKILL_SEQ")
    @Column(name="id",nullable = false)
    private Long id;

    @Column(name="skill_name",nullable = true)
    private String skillName;

    @Column(name="YOE",nullable=true)
    private Long yoe;

    @ManyToOne()
    @JoinColumn( name = "project_id")
    private Project project;

    public Skill() {
    }

    public Skill(Long id, String skillName, Long yoe) {
        this.id = id;
        this.skillName = skillName;
        this.yoe = yoe;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public Long getYoe() {
        return yoe;
    }

    public void setYoe(Long yoe) {
        this.yoe = yoe;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "id=" + id +
                ", skillName='" + skillName + '\'' +
                ", yoe=" + yoe +
                '}';
    }
}
