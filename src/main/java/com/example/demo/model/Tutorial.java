package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tutorials")
public class Tutorial {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "published")
    private boolean pulished;

    public Tutorial(){

    }

    public Tutorial(long id, String title, String description, boolean pulished) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.pulished = pulished;
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

    public boolean isPulished() {
        return pulished;
    }

    public void setPulished(boolean pulished) {
        this.pulished = pulished;
    }

    @Override
    public String toString() {
        return "Tutorial{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", pulished=" + pulished +
                '}';
    }
}
