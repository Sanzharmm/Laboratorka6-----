package com.Melisov.spring.mvc.sanzhar.POJO;
import javax.persistence.*;

@Entity
@Table(name="contract")
public class CONTRACT {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IDcontract")
    private Integer IDcontract;

    @Column(name="agreementDate")
    private String agreementDate;

    //СВЯЗЬ ОДИН К ОДНОМУ С ТАБЛИЦЕЙ Client
    @OneToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "client_id")
    private CLIENT client;

    //СВЯЗЬ ОДИН К ОДНОМУ С ТАБЛИЦЕЙ Tour
    @OneToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "tourNumber")
    private TOUR tour;

    public CONTRACT() {
    }


    public CONTRACT(String agreementDate) {
        this.agreementDate = agreementDate;
    }

    public Integer getIDcontract() {
        return IDcontract;
    }

    public void setIDcontract(Integer IDcontract) {
        this.IDcontract = IDcontract;
    }

    public String getAgreementDate() {
        return agreementDate;
    }

    public void setAgreementDate(String agreementDate) {
        this.agreementDate = agreementDate;
    }



    public CLIENT getClient() {
        return client;
    }

    public void setClient(CLIENT client) {
        this.client = client;
    }

    public TOUR getTour() {
        return tour;
    }

    public void setTour(TOUR tour) {
        this.tour = tour;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "IDcontract=" + IDcontract +
                ", agreementDate='" + agreementDate + '\'' +
                '}';
    }
}
