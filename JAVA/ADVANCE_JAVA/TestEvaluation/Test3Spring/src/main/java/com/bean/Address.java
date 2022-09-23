package com.bean;

public class Address {
    private int EmployeeeID;
    private String flatNo;
    private String city;

    public int getEmployeeeID() {
        return EmployeeeID;
    }

    public void setEmployeeeID(int employeeeID) {
        EmployeeeID = employeeeID;
    }

    public String getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(String flatNo) {
        this.flatNo = flatNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "EmployeeeID=" + EmployeeeID +
                ", flatNo='" + flatNo + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
