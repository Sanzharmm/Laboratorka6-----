package com.Melisov.spring.mvc.sanzhar.POJO;

import javax.persistence.*;

@Entity
@Table(name="airclass")
public class AIRCLASS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IDairClass")
    private int ID;

    @Column(name="name")
    private String name;

    public AIRCLASS() {
    }

    public AIRCLASS(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Airclass{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
