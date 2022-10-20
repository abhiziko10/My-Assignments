package Controller;

import DAO.DAOImplementation;
import Model.ConferenceRoom;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/insertRoom")
public class InsertRoom extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out= resp.getWriter();
        int roomNumber= Integer.parseInt(req.getParameter("roomId"));
        String roomName=req.getParameter("roomName");
        ConferenceRoom conferenceRoom=new ConferenceRoom();
        conferenceRoom.setRoomNo(roomNumber);
        conferenceRoom.setRoomName(roomName);
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringJT.xml");
        DAOImplementation daoImplementation=applicationContext.getBean("daoImplementation",DAOImplementation.class);
        try{
            daoImplementation.conferenceRoom(conferenceRoom);
            out.println("inserted successfully!!!!!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            resp.sendRedirect("Welcome.html");
        }

    }
}
