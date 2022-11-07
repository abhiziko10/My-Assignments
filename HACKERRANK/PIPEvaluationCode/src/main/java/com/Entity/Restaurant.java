package com.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maxOccupancy;
    private int noOfTablesWithGivenOccupancy;
    @OneToMany(mappedBy="restaurant")
    private List<Booking>bookingList;

    public int getMaxOccupancy() {
        return maxOccupancy;
    }

    public void setMaxOccupancy(int maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }

    public int getNoOfTablesWithGivenOccupancy() {
        return noOfTablesWithGivenOccupancy;
    }

    public void setNoOfTablesWithGivenOccupancy(int noOfTablesWithGivenOccupancy) {
        this.noOfTablesWithGivenOccupancy = noOfTablesWithGivenOccupancy;
    }

    public List<Booking> getBookingList() {
        return bookingList;
    }

    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "maxOccupancy=" + maxOccupancy +
                ", noOfTablesWithGivenOccupancy=" + noOfTablesWithGivenOccupancy +
                ", bookingList=" + bookingList +
                '}';
    }
}
