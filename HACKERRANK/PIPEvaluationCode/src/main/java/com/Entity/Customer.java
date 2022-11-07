package com.Entity;



import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;
    private String customerName;
    private long customerMobile;
    @OneToMany(mappedBy ="customer")
    List<Booking> bookingList;
    @OneToMany(mappedBy="customer")
    List<Order>orderList;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getCustomerMobile() {
        return customerMobile;
    }

    public void setCustomerMobile(long customerMobile) {
        this.customerMobile = customerMobile;
    }

    public List<Booking> getBookingList() {
        return bookingList;
    }

    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerMobile=" + customerMobile +
                ", bookingList=" + bookingList +
                ", orderList=" + orderList +
                '}';
    }
}
