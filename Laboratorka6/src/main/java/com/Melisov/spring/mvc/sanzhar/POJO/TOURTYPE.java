package com.Melisov.spring.mvc.sanzhar.POJO;
import javax.persistence.*;

@Entity
@Table(name="tourtype")
public class TOURTYPE {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IDtourType")
    private int IDtourType;

    @Column(name = "tourType")
    private String tourType;

    public TOURTYPE(){}

    public TOURTYPE(String tourType) {
        this.tourType = tourType;
    }

    @Override
    public String toString() {
        return "TourType{" +
                "IDtourType=" + IDtourType +
                ", tourType='" + tourType + '\'' +
                '}';
    }

    public int getIDtourType() {
        return IDtourType;
    }

    public void setIDtourType(int IDtourType) {
        this.IDtourType = IDtourType;
    }

    public String getTourType() {
        return tourType;
    }

    public void setTourType(String tourType) {
        this.tourType = tourType;
    }
}
