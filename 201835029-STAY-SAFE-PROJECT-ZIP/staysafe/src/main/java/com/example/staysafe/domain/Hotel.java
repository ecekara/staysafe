package com.example.staysafe.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int HotelCode;
    private String HotelName;
    private String Location;

    public Hotel() {
    }

    public Hotel(int hotelCode, String hotelName, String location) {
        this.HotelCode=hotelCode;
        this.HotelName=hotelName;
        this.Location=location;
    }

    public int getHotelCode() {
        return HotelCode;
    }

    public void setHotelCode(int hotelCode) {
        HotelCode = hotelCode;
    }

    public String getHotelName() {
        return HotelName;
    }

    public void setHotelName(String hotelName) {
        HotelName = hotelName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    @Override
    public String toString() {
        return "Employee [id=" + HotelCode + ", ename=" + HotelCode + ", mobile=" + HotelCode + ", salary=" + HotelCode + "]";
    }

}
