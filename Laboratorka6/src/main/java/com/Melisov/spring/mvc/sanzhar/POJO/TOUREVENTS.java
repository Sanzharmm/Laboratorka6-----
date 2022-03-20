package com.Melisov.spring.mvc.sanzhar.POJO;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="tourevents")
public class TOUREVENTS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IDtourEvents")
    private int IDtourEvents;

    @Column(name="beginningTime")
    private String beginningTime;

    @Column(name="city")
    private String city;

    @Column(name="name")
    private String name;

    @Column(name="place")
    private String place;

    //СВЯЗЬ МНОГИЕ К ОДНОМУ С ТАБЛИЦЕЙ Tour (Bi)
    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    private TOUR tour;

    //СВЯЗЬ ОДИН КО МНОГИМ С ТАБЛИЦЕЙ EventTickets (Bi)
    @OneToMany(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH},mappedBy = "tourEvents")
    private List<EVENTTICKETS> eventTickets;

    public TOUREVENTS() {
    }


    public TOUREVENTS(String beginningTime, String city, String name, String place) {
        this.beginningTime = beginningTime;
        this.city = city;
        this.name = name;
        this.place = place;
    }

    public List<EVENTTICKETS> getEventTickets() {
        return eventTickets;
    }

    public void setEventTickets(List<EVENTTICKETS> eventTickets) {
        this.eventTickets = eventTickets;
    }

    public TOUR getTour() {
        return tour;
    }

    public void setTour(TOUR tour) {
        this.tour = tour;
    }

    public int getIDtourEvents() {
        return IDtourEvents;
    }

    public void setIDtourEvents(int IDtourEvents) {
        this.IDtourEvents = IDtourEvents;
    }

    public String getBeginningTime() {
        return beginningTime;
    }

    public void setBeginningTime(String beginningTime) {
        this.beginningTime = beginningTime;
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

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }


    @Override
    public String toString() {
        return "TourEvents{" +
                "IDtourEvents=" + IDtourEvents +
                ", beginningTime='" + beginningTime + '\'' +
                ", city='" + city + '\'' +
                ", name='" + name + '\'' +
                ", place='" + place + '\'' +
                '}';
    }


}
