package com.Melisov.spring.mvc.sanzhar.POJO;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="tourflights")
public class TOURFLIGHTS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IDtourFlights")
    private int IDtourFlights;

    @Column(name="airLine")
    private String airLine;

    @Column(name="ArrivalCity")
    private String arrivalCity;

    @Column(name="departureCity")
    private String departureCity;

    @Column(name="departureDate")
    private String departureDate;

    @Column(name="departureTime")
    private String departureTime;

    @Column(name="directions")
    private String directions;

    //СВЯЗЬ ОДИН К ОДНОМУ С ТАБЛИЦЕЙ Tour
    @OneToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "tour_id")
    private TOUR tour;

    //СВЯЗЬ ОДИН КО МНОГИМ С ТАБЛИЦЕЙ AirTickets
    @OneToMany(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH},mappedBy = "tourFlights")
    private List<AIRTICKETS> airTickets;

    public TOURFLIGHTS() {
    }

    public TOURFLIGHTS(String airLine, String arrivalCity, String beginningDate, String country, String departureCity, String departureDate, String departureTime, String directions, String endingDate, int flightCode, int programNumber, int tourNumber, String tourType) {
        this.airLine = airLine;
        this.arrivalCity = arrivalCity;
        this.departureCity = departureCity;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.directions = directions;
    }

    public int getIDtourFlights() {
        return IDtourFlights;
    }

    public void setIDtourFlights(int IDtourFlights) {
        this.IDtourFlights = IDtourFlights;
    }

    public String getAirLine() {
        return airLine;
    }

    public void setAirLine(String airLine) {
        this.airLine = airLine;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public TOUR getTour() {
        return tour;
    }

    public List<AIRTICKETS> getAirTickets() {
        return airTickets;
    }

    public void setAirTickets(List<AIRTICKETS> airTickets) {
        this.airTickets = airTickets;
    }

    public void setTour(TOUR tour) {
        this.tour = tour;
    }

    @Override
    public String toString() {
        return "TourFlights{" +
                "IDtourFlights=" + IDtourFlights +
                ", airLine='" + airLine + '\'' +
                ", arrivalCity='" + arrivalCity + '\'' +
                ", departureCity='" + departureCity + '\'' +
                ", departureDate='" + departureDate + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", directions='" + directions + '\'' +
                '}';
    }
}
