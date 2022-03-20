package com.Melisov.spring.mvc.sanzhar.POJO;
import javax.persistence.*;

@Entity
@Table(name="program")
public class PROGRAM {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IDProgram")
    private Integer IDprogram;

    @Column(name="description")
    private String description;

    public PROGRAM() {
    }

    public PROGRAM(String description) {
        this.description = description;
    }

    public int getIDprogram() {
        return IDprogram;
    }

    public void setIDprogram(int IDprogram) {
        this.IDprogram = IDprogram;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Program{" +
                "IDprogram=" + IDprogram +
                ", description='" + description + '\'' +
                '}';
    }
}
