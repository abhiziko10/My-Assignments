package Controller;

import DAO.DAOImplementation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cancel")
public class CancelBooking extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out= resp.getWriter();
        int userId= Integer.parseInt(req.getParameter("userId"));
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringJT.xml");
        DAOImplementation daoImplementation=applicationContext.getBean("daoImplementation",DAOImplementation.class);
        try{
            daoImplementation.deleteBooking(userId);
            out.println("Deleted Successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            resp.sendRedirect("Welcome.html");
        }

    }
}
