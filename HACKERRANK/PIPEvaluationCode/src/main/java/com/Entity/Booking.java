package com.Entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingId;
    private Date bookingDate;
    private Time bookingStartTime;
    private Time bookingEndTime;
    private int tableForNoOfPeople;

    private String bookingStatus;

    @ManyToOne
    @JoinColumn(name = "customer_customer_id")
    Customer customer;

    @ManyToOne
    @JoinColumn(name = "restaurant_max_occupancy")
    Restaurant restaurant;

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Time getBookingStartTime() {
        return bookingStartTime;
    }

    public void setBookingStartTime(Time bookingStartTime) {
        this.bookingStartTime = bookingStartTime;
    }

    public Time getBookingEndTime() {
        return bookingEndTime;
    }

    public void setBookingEndTime(Time bookingEndTime) {
        this.bookingEndTime = bookingEndTime;
    }

    public int getTableForNoOfPeople() {
        return tableForNoOfPeople;
    }

    public void setTableForNoOfPeople(int tableForNoOfPeople) {
        this.tableForNoOfPeople = tableForNoOfPeople;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", bookingDate=" + bookingDate +
                ", bookingStartTime=" + bookingStartTime +
                ", bookingEndTime=" + bookingEndTime +
                ", numberOfSeats=" + tableForNoOfPeople +
                ", bookingStatus='" + bookingStatus + '\'' +
                ", customer=" + customer +
                ", restaurant=" + restaurant +
                '}';
    }
}
