package Controller;

import DAO.DAOImplementation;
import Model.Booking;
import Model.ConferenceRoom;
import Model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/bookRoom")
public class BookingRoom extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out= resp.getWriter();
        int userId= Integer.parseInt(req.getParameter("userId"));
        String date=req.getParameter("date");
        String time=req.getParameter("time");
        String roomName=req.getParameter("roomName");
        User user=new User();
        ConferenceRoom conferenceRoom=new ConferenceRoom();
        Booking booking=new Booking();
        user.setUserId(userId);
        booking.setDate(date);
        booking.setTime(time);
        conferenceRoom.setRoomName(roomName);
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringJT.xml");
        DAOImplementation daoImplementation=applicationContext.getBean("daoImplementation",DAOImplementation.class);
        try{
            daoImplementation.bookConferenceRoom(user,booking,conferenceRoom);
            out.println("Conference Room Booked ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            resp.sendRedirect("Welcome.html");
        }


    }
}
