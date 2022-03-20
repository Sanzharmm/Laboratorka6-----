package com.Melisov.spring.mvc.sanzhar.POJO;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="eventtickets")
public class EVENTTICKETS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IDeventTickets")
    private Integer IDeventTickets;

    @Column(name="place")
    private Integer place;

    //СВЯЗЬ МНОГИЕ К ОДНОМУ С ТАБЛИЦЕЙ TourEvents
    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "tourEvent_id")
    private TOUREVENTS tourEvents;

    //СВЯЗЬ МНОГИЕ КО МНОГИМ С ТАБЛИЦЕЙ Permit
    @ManyToMany(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinTable(name = "permit_tourTicket",
                joinColumns = @JoinColumn(name = "ticket_id"),
                inverseJoinColumns = @JoinColumn(name = "permit_id"))
    private List<PERMIT> permitList;

    public EVENTTICKETS() {
    }

    public EVENTTICKETS(Integer place) {
        this.place = place;
    }

    public Integer getIDeventTickets() {
        return IDeventTickets;
    }

    public void setIDeventTickets(Integer IDeventTickets) {
        this.IDeventTickets = IDeventTickets;
    }

    public Integer getPlace() {
        return place;
    }

    public void setPlace(Integer place) {
        this.place = place;
    }

    public List<PERMIT> getPermitList() {
        return permitList;
    }

    public void setPermitList(List<PERMIT> permitList) {
        this.permitList = permitList;
    }

    public TOUREVENTS getTourEvents() {
        return tourEvents;
    }

    public void setTourEvents(TOUREVENTS tourEvents) {
        this.tourEvents = tourEvents;
    }

    @Override
    public String toString() {
        return "EventTickets{" +
                "IDeventTickets=" + IDeventTickets +
                ", place=" + place +
                '}';
    }
}
