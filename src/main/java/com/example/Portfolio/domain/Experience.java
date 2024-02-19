package com.example.Portfolio.domain;

import jakarta.persistence.*;

@Entity
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Experience_SEQ")
    @SequenceGenerator(name = "Experience_SEQ", sequenceName = "Experience_SEQ")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column( name = "COMPANY_NAME")
    private String companyName;

    @Column (name = "WORK_DETAILS")
    private String workDetails;

    @Column(name = "Duration")
    private String duration;

    @Column(name = "location")
    private String location;

    public Experience() {
    }

    public Experience(Long id, String companyName, String workDetails, String duration, String location) {
        this.id = id;
        this.companyName = companyName;
        this.workDetails = workDetails;
        this.duration = duration;
        this.location = location;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getWorkDetails() {
        return workDetails;
    }

    public void setWorkDetails(String workDetails) {
        this.workDetails = workDetails;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", workDetails='" + workDetails + '\'' +
                ", duration='" + duration + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
