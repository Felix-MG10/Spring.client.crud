package com.felix.felix.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "responsable")
public class Responsable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String respo_name;

    public Responsable() {
    }

    public Responsable(int id, String respo_name) {
        this.id = id;
        this.respo_name = respo_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRespo_name() {
        return respo_name;
    }

    public void setRespo_name(String respo_name) {
        this.respo_name = respo_name;
    }
}
