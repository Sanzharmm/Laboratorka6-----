package com.Melisov.spring.mvc.sanzhar.Model;

import java.util.HashMap;
import java.util.Map;

public class Benutzer {

    private String name;
    private String surname;
    private String userType;
    private String address;
    private Map<String,String> types;

    public Benutzer() {
        types = new HashMap<>();
        types.put("Deputy Director","Deputy Director");
        types.put("Tour Composer","Tour Composer");
        types.put("Tour Manager","Tour Manager");
        types.put("Sales Manager","Sales Manager");
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Map<String, String> getTypes() {
        return types;
    }

    public void setTypes(Map<String, String> types) {
        this.types = types;
    }

    @Override
    public String toString() {
        return "SalesManager{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", userType='" + userType + '\'' +
                '}';
    }

}
