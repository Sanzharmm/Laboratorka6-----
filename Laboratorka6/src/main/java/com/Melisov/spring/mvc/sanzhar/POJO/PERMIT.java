package com.Melisov.spring.mvc.sanzhar.POJO;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="permit")
public class PERMIT {

    //Many to many Rooms
    @ManyToMany(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinTable(name = "room_permit",
            joinColumns = @JoinColumn(name = "permit_id"),inverseJoinColumns = @JoinColumn(name = "room_id"))
    private List<ROOMS> roomsList;

    //one to one Tourist
    @OneToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "tourist_id")
    private FOREIGHNER tourist;

    //Many to many EventTickets
    @ManyToMany(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinTable(name = "permit_tourTicket",
            joinColumns = @JoinColumn(name = "permit_id"),
            inverseJoinColumns = @JoinColumn(name = "ticket_id"))
    private List<EVENTTICKETS> eventTickets;

    //Many to many AirTickets
    @ManyToMany(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinTable(name = "permit_airTicketTour",
            joinColumns = @JoinColumn(name = "permit_id"),
            inverseJoinColumns = @JoinColumn(name = "ticket_id"))
    private List<AIRTICKETS> airTickets;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IDpermit")
    private int IDpermit;

    @Column(name="agreementDate")
    private String agreementDate;

    @Column(name="tourNumber")
    private int tourNumber;

    public PERMIT() {
    }

    public PERMIT(String agreementDate, int tourNumber) {
        this.agreementDate = agreementDate;
        this.tourNumber = tourNumber;
    }

    public int getIDpermit() {
        return IDpermit;
    }

    public void setIDpermit(int IDpermit) {
        this.IDpermit = IDpermit;
    }

    public String getAgreementDate() {
        return agreementDate;
    }

    public void setAgreementDate(String agreementDate) {
        this.agreementDate = agreementDate;
    }

    public int getTourNumber() {
        return tourNumber;
    }

    public void setTourNumber(int tourNumber) {
        this.tourNumber = tourNumber;
    }

    public FOREIGHNER getTourist() {
        return tourist;
    }

    public void setTourist(FOREIGHNER tourist) {
        this.tourist = tourist;
    }

    public List<ROOMS> getRoomsList() {
        return roomsList;
    }

    public void setRoomsList(List<ROOMS> roomsList) {
        this.roomsList = roomsList;
    }

    public List<EVENTTICKETS> getEventTickets() {
        return eventTickets;
    }

    public void setEventTickets(List<EVENTTICKETS> eventTickets) {
        this.eventTickets = eventTickets;
    }

    public List<AIRTICKETS> getAirTickets() {
        return airTickets;
    }

    public void setAirTickets(List<AIRTICKETS> airTickets) {
        this.airTickets = airTickets;
    }

    @Override
    public String toString() {
        return "Permit{" +
                "IDpermit=" + IDpermit +
                ", agreementDate='" + agreementDate + '\'' +
                ", tourNumber=" + tourNumber +
                '}';
    }
}
