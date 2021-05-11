package com.example.staysafe.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ename;
    private int mobile;
    private int salary;

    public Employee() {
    }

    public Employee( Long id, String ename, int mobile, int salary) {
        this.ename=ename;
        this.id=id;
        this.mobile=mobile;
        this.salary=salary;

    }

    public Long getId() {
        return id;
    }

    public String getEname() {
        return ename;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", ename=" + ename + ", mobile=" + mobile + ", salary=" + salary + "]";
    }

}
