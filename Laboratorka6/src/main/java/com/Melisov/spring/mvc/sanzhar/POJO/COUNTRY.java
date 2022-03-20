package com.Melisov.spring.mvc.sanzhar.POJO;
import javax.persistence.*;

@Entity
@Table(name="country")
public class COUNTRY {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="country")
    private String country;
}
