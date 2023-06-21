package com.example.springdatajpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "`Cities`", schema = "public")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name="`Id`")
    private Integer id;

    @Column(name="`Name`")
    private String name;

    @Column(name="`Population`")
    private int population;

    public City() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "City [id=" + id + ", name=" + name + ", population=" + population + "]";
    }
}