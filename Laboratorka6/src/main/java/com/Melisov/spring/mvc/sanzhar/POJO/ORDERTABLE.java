package com.Melisov.spring.mvc.sanzhar.POJO;
import javax.persistence.*;

@Entity
@Table(name="ordertable")
public class ORDERTABLE {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IDorder")
    private int IDorder;

    @OneToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "tour_id")
    private TOUR tour;

    @OneToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "staff_id")
    private WEHEREISMYSTAFF staff;


    public ORDERTABLE() {
    }


    public int getIDorder() {
        return IDorder;
    }

    public void setIDorder(int IDorder) {
        this.IDorder = IDorder;
    }

    public TOUR getTour() {
        return tour;
    }

    public void setTour(TOUR tour) {
        this.tour = tour;
    }

    public WEHEREISMYSTAFF getStaff() {
        return staff;
    }

    public void setStaff(WEHEREISMYSTAFF staff) {
        this.staff = staff;
    }

    @Override
    public String toString() {
        return "OrderTable{" +
                "IDorder=" + IDorder +
                '}';
    }
}
