package com.Melisov.spring.mvc.sanzhar.POJO;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="air_tickets")
public class AIRTICKETS {

    //СВЯЗЬ МНОГИЕ К ОДНОМУ С ТАБЛИЦЕЙ TourFlights
    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "tourFlight")
    private TOURFLIGHTS tourFlights;

    //СВЯЗЬ ОДИН К ОДНОМУ С ТАБЛИЦЕЙ AirLine
    @OneToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "class_id")
    private AIRCLASS airclass;

    //СВЯЗЬ МНОГИЕ КО МНОГИМ С ТАБЛИЦЕЙ Permit
    @ManyToMany(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinTable(name = "permit_airTicketTour",
            joinColumns = @JoinColumn(name = "ticket_id"),
            inverseJoinColumns = @JoinColumn(name = "permit_id"))
    private List<PERMIT> permitList;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IDairTickets")
    private Integer idAirTickets;

    @Column(name="airline")
    private String airline;

    @Column(name="fligheCode")
    private Integer flightCode;

    @Column(name="place")
    private Integer place;

    public AIRTICKETS() {
    }

    public AIRTICKETS(String airline, Integer flightCode, Integer place) {
        this.airline = airline;
        this.flightCode = flightCode;
        this.place = place;
    }

    public Integer getIdAirTickets() {
        return idAirTickets;
    }

    public void setIdAirTickets(Integer idAirTickets) {
        this.idAirTickets = idAirTickets;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public Integer getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(Integer flightCode) {
        this.flightCode = flightCode;
    }

    public Integer getPlace() {
        return place;
    }

    public void setPlace(Integer place) {
        this.place = place;
    }

    public AIRCLASS getAirclass() {
        return airclass;
    }

    public void setAirclass(AIRCLASS airclass) {
        this.airclass = airclass;
    }

    public List<PERMIT> getPermitList() {
        return permitList;
    }

    public void setPermitList(List<PERMIT> permitList) {
        this.permitList = permitList;
    }

    public TOURFLIGHTS getTourFlights() {
        return tourFlights;
    }

    public void setTourFlights(TOURFLIGHTS tourFlights) {
        this.tourFlights = tourFlights;
    }

    @Override
    public String toString() {
        return "AirTickets{" +
                "idAirTickets=" + idAirTickets +
                ", airline='" + airline + '\'' +
                ", flightCode=" + flightCode +
                ", place=" + place +
                '}';
    }
}
