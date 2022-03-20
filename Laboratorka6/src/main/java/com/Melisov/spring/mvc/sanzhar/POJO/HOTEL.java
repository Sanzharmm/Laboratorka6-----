package com.Melisov.spring.mvc.sanzhar.POJO;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="hotel")
public class HOTEL {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDhotel")
    private int IDhotel;

    //СВЯЗЬ ОДИН К ОДНОМУ С ТАБЛИЦЕЙ HotelClass
    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "hotelClass")
    private HOTELCLASS hotelClass;

    //СВЯЗЬ ОДИН К ОДНОМУ С ТАБЛИЦЕЙ Tour (Bi)
    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "tour_id")
    private TOUR tour;

    //СВЯЗЬ ОДИН КО МНОГИМ С ТАБЛИЦЕЙ Rooms (Bi)
    @OneToMany(mappedBy = "hotel",cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    private List<ROOMS> roomsList;

    @Column(name = "city")
    private String city;

    @Column(name = "name")
    private String name;

    public HOTEL() {
    }


    public HOTEL(String beginningDate, String city, String country, String endingDate, String name, Integer programNumber, Integer tourNumber, String tourType) {
        this.city = city;
        this.name = name;
    }

    public int getIDhotel() {
        return IDhotel;
    }

    public void setIDhotel(int IDhotel) {
        this.IDhotel = IDhotel;
    }

    public TOUR getTour() {
        return tour;
    }

    public void setTour(TOUR tour) {
        this.tour = tour;
    }

    public List<ROOMS> getRoomsList() {
        return roomsList;
    }

    public void setRoomsList(List<ROOMS> roomsList) {
        this.roomsList = roomsList;
    }

    public HOTELCLASS getHotelClass() {
        return hotelClass;
    }

    public void setHotelClass(HOTELCLASS hotelClass) {
        this.hotelClass = hotelClass;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
