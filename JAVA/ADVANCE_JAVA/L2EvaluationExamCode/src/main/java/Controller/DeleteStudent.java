package Controller;

import DAO.DAOImplementation;
import Model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/delete")
public class DeleteStudent extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp .setContentType("text/html");
        PrintWriter out=resp.getWriter();
        int studentRoll= Integer.parseInt(req.getParameter("roll"));
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringJT.xml");
        DAOImplementation daoImplementation=context.getBean("daoImplementation", DAOImplementation.class);
        try{
            daoImplementation.deleteStudent(studentRoll);
            out.println("Successfully deleted");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            resp.sendRedirect("Welcome.html");
        }
    }
}
