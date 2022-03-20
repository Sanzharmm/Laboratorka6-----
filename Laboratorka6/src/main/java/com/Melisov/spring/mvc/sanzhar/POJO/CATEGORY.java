package com.Melisov.spring.mvc.sanzhar.POJO;
import javax.persistence.*;

@Entity
@Table(name="category")
public class CATEGORY {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IDCategory")
    private Integer IDcategory;

    @Column(name="category")
    private String category;


    public CATEGORY() {
    }

    public CATEGORY(String category) {
        this.category = category;
    }

    public Integer getIDcategory() {
        return IDcategory;
    }

    public void setIDcategory(Integer IDcategory) {
        this.IDcategory = IDcategory;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "category{" +
                "category='" + category + '\'' +
                ", IDcategory=" + IDcategory +
                '}';
    }
}
