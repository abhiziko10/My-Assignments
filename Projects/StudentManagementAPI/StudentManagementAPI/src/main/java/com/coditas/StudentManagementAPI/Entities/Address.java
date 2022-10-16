package com.coditas.StudentManagementAPI.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer addressId;


    private int flatNumber;

    private String city;

    private int pincode;

    @OneToMany(cascade = CascadeType.ALL )
    private List<Student> student;

    public Address(Integer addressId, int flatNumber, String city, int pincode, List<Student> student) {
        this.addressId = addressId;
        this.flatNumber = flatNumber;
        this.city = city;
        this.pincode = pincode;
        this.student = student;
    }

    public Address() {
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }
}
