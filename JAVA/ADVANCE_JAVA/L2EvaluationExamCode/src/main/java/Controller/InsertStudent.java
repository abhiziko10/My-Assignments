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
@WebServlet("/insertStudent")
public class InsertStudent extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp .setContentType("text/html");
        PrintWriter out=resp.getWriter();
       int studentRoll= Integer.parseInt(req.getParameter("roll"));
       String studentName=req.getParameter("name");
       String studentDivision=req.getParameter("division");
       int studentAge= Integer.parseInt(req.getParameter("age"));
       String studentAddress=req.getParameter("address");
          Student student=new Student();
          student.setStudentRoll(studentRoll);
          student.setStudentName(studentName);
          student.setStudentDivision(studentDivision);
          student.setAge(studentAge);
          student.setAddress(studentAddress);
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringJT.xml");
        DAOImplementation daoImplementation=context.getBean("daoImplementation", DAOImplementation.class);

        try{
            daoImplementation.insertStudent(student);
            out.println("Your data is inserted");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            resp.sendRedirect("Welcome.html");
        }
    }
}
