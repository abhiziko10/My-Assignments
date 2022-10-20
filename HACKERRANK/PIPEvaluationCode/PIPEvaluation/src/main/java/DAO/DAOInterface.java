package DAO;

import Model.Booking;
import Model.ConferenceRoom;
import Model.User;

import java.util.List;

public interface DAOInterface {

    public int insertUser(User user);
    public int conferenceRoom(ConferenceRoom conferenceRoom);
    public int bookConferenceRoom(User user,Booking book,ConferenceRoom conferenceRoom);
    public int deleteBooking(int userId);
    public List<Booking> bookingDetails(String date);
}
