package Controller;

import DAO.DAOImplementation;
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

@WebServlet("/insertUser")
public class InsertUser extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.setContentType("text/html");
      PrintWriter out= resp.getWriter();
      int id= Integer.parseInt(req.getParameter("userId"));
      String name=req.getParameter("userName");
      String contact=req.getParameter("userContact");
      String position=req.getParameter("userPosition");
        User user =new User();
        user.setUserId(id);
        user.setUserName(name);
        user.setUserContact(contact);
        user.setUserPosition(position);
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringJT.xml");
        DAOImplementation daoImplementation=applicationContext.getBean("daoImplementation",DAOImplementation.class);

        try{
            daoImplementation.insertUser(user);
            out.println("Inserted successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            resp.sendRedirect("Welcome.html");
        }
    }
}
