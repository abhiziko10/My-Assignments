package com.Services;

import com.Entity.Booking;
import com.Entity.MenuCard;

import java.util.List;

public interface DAOInterface {

public void BookTable(Booking booking,int noOfSeats);

public List<MenuCard> viewMenuCardList();


}
