package com.example.staysafe.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int CustomerID;
    private String Customer_Res_Num;
    private String Customer_Last_Name;
    private String Customer_Name;
    private String Customer_Address;
    private String Customer_PhoneNumber;
    private String Customer_Email;

    public Customer() {
    }

    public Customer(int customerID, String customer_Res_Num, String customer_Last_Name, String customer_Name, String customer_Address, String customer_PhoneNumber, String customer_Email) {
        this.CustomerID=customerID;
        this.Customer_Res_Num=customer_Res_Num;
        this.Customer_Last_Name=customer_Last_Name;
        this.Customer_Name=customer_Name;
        this.Customer_Address=customer_Address;
        this.Customer_PhoneNumber=customer_PhoneNumber;
        this.Customer_Email=customer_Email;
    }


    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }

    public String getCustomer_Res_Num() {
        return Customer_Res_Num;
    }

    public void setCustomer_Res_Num(String customer_Res_Num) {
        Customer_Res_Num = customer_Res_Num;
    }

    public String getCustomer_Last_Name() {
        return Customer_Last_Name;
    }

    public void setCustomer_Last_Name(String customer_Last_Name) {
        Customer_Last_Name = customer_Last_Name;
    }

    public String getCustomer_Name() {
        return Customer_Name;
    }

    public void setCustomer_Name(String customer_Name) {
        Customer_Name = customer_Name;
    }

    public String getCustomer_Address() {
        return Customer_Address;
    }

    public void setCustomer_Address(String customer_Address) {
        Customer_Address = customer_Address;
    }

    public String getCustomer_PhoneNumber() {
        return Customer_PhoneNumber;
    }

    public void setCustomer_PhoneNumber(String customer_PhoneNumber) {
        Customer_PhoneNumber = customer_PhoneNumber;
    }

    public String getCustomer_Email() {
        return Customer_Email;
    }

    public void setCustomer_Email(String customer_Email) {
        Customer_Email = customer_Email;
    }

    @Override
    public String toString() {
        return "Employee [id=" + Customer_Res_Num + ", ename=" + Customer_Res_Num + ", mobile=" + Customer_Res_Num + ", salary=" + Customer_Res_Num + "]";
    }

}
