package com.Melisov.spring.mvc.sanzhar.POJO;
import javax.persistence.*;

@Entity
@Table(name="client")
public class CLIENT {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IDClient")
    private Integer IDclient;

    @Column(name="fullName")
    private String fullName;

    @Column(name="address")
    private String address;

    @Column(name="phoneNumber")
    private Integer phoneNumber;

    public CLIENT() {
    }

    public CLIENT(String fullName, String address, Integer phoneNumber) {
        this.fullName = fullName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }


    public Integer getIDclient() {
        return IDclient;
    }

    public void setIDclient(Integer IDclient) {
        this.IDclient = IDclient;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Client{" +
                "IDclient=" + IDclient +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
