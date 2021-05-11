package com.example.staysafe.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int Res_Num;
    private int CustomerID;
    private int HotelCode;

    public Reservation() {
    }

    public Reservation(int res_Num, int customerID, int hotelCode) {
        this.Res_Num=res_Num;
        this.CustomerID=customerID;
        this.HotelCode=hotelCode;
    }

    public int getRes_Num() {
        return Res_Num;
    }

    public void setRes_Num(int res_Num) {
        Res_Num = res_Num;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }

    public int getHotelCode() {
        return HotelCode;
    }

    public void setHotelCode(int hotelCode) {
        HotelCode = hotelCode;
    }

    @Override
    public String toString() {
        return "Employee [id=" + Res_Num + ", ename=" + Res_Num + ", mobile=" + Res_Num + ", salary=" + Res_Num + "]";
    }

}
