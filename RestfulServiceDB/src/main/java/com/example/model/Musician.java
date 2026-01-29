package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;


import com.fasterxml.jackson.annotation.JsonBackReference;
@Entity
public class Musician {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private Integer strings;

    private String type;

    @ManyToOne
    @JsonBackReference
    private Band band;/// Band_id

    public Musician(long id, String name, Integer strings, String type, Band band) {
        super();
        this.id = id;
        this.name = name;
        this.strings = strings;
        this.type = type;
        this.band = band;
    }
    public Musician() {
        super();
        // TODO Auto-generated constructor stub
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getStrings() {
        return strings;
    }

    public void setStrings(Integer strings) {
        this.strings = strings;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Band getBand() {
        return band;
    }

    public void setBand(Band band) {
        this.band = band;
    }


}


