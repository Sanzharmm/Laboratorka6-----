package com.Melisov.spring.mvc.sanzhar.POJO;
import javax.persistence.*;

@Entity
@Table(name="hotelclass")
public class HOTELCLASS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="class")
    private String hotelClass;

    public HOTELCLASS() {
    }

    public HOTELCLASS(String hotelClass) {
        this.hotelClass = hotelClass;
    }

    public String getHotelClass() {
        return hotelClass;
    }

    public void setHotelClass(String hotelClass) {
        this.hotelClass = hotelClass;
    }

    @Override
    public String toString() {
        return "HotelClass{" +
                "hotelClass='" + hotelClass + '\'' +
                '}';
    }
}
