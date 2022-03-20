package com.Melisov.spring.mvc.sanzhar.POJO;
import javax.persistence.*;


@Entity
@Table(name="position")
public class POSITION {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IDposition")
    private int IDposition;

    @Column(name="name")
    private String name;

    public POSITION() {
    }

    public POSITION(String name) {
        this.name = name;
    }

    public int getIDposition() {
        return IDposition;
    }

    public void setIDposition(int IDposition) {
        this.IDposition = IDposition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Position{" +
                "IDposition=" + IDposition +
                ", name='" + name + '\'' +
                '}';
    }

}
