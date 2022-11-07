package com.Services;

import com.Entity.Booking;
import com.Entity.Customer;
import com.Entity.MenuCard;
import com.Entity.Restaurant;
import com.Utils.FactoryProvider;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class DAOImplementation implements DAOInterface{


    public Customer getCustomer(int customerId){
        Session session=FactoryProvider.getFactory().openSession();
        Transaction transaction=session.beginTransaction();
        Customer customer=session.get(Customer.class,customerId);
        transaction.commit();
        session.close();
        return  customer;
    }

    public MenuCard addMenu(MenuCard menuCard){
        Session session=FactoryProvider.getFactory().openSession();
        Transaction transaction=session.beginTransaction();
        session.save(menuCard);
        transaction.commit();
        session.close();
        return menuCard;
    }


    public Restaurant getRestaurant(int maxOccupancy){
        Session session=FactoryProvider.getFactory().openSession();
        Transaction transaction=session.beginTransaction();
       Restaurant restaurant=session.get(Restaurant.class,maxOccupancy);
        transaction.commit();
        session.close();
        return  restaurant;
    }



    @Override
    public void BookTable(Booking booking,int noOfSeats) {
        Session session= FactoryProvider.getFactory().openSession();
        Transaction transaction= session.beginTransaction();
         booking.setBookingStatus("Booked");
         session.save(booking);
         transaction.commit();
    }

    @Override
    public List<MenuCard> viewMenuCardList() {
        Session session=FactoryProvider.getFactory().openSession();
        Transaction transaction=session.beginTransaction();
        Query query= session.createQuery("from MenuCard");
         List<MenuCard>menuCardList=query.getResultList();
         return menuCardList;

    }
}
