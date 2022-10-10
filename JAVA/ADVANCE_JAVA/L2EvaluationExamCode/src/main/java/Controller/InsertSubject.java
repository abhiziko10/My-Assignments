package Controller;

import DAO.DAOImplementation;
import Model.Subject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/insertSubject")
public class InsertSubject extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        int subjectId= Integer.parseInt(req.getParameter("subId"));
        String subjectName=req.getParameter("sname");
        double subjectMarks= Double.parseDouble(req.getParameter("marks"));
        int studentRoll= Integer.parseInt(req.getParameter("roll"));
        Subject subject=new Subject();

        subject.setSubjectiId(subjectId);
        subject.setSubjectName(subjectName);
        if(subjectMarks<35){
              subjectMarks=subjectMarks+5;
            subject.setSubjectMarks(subjectMarks);
        }

        subject.setStudentRoll(studentRoll);
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringJT.xml");
        DAOImplementation daoImplementation=context.getBean("daoImplementation", DAOImplementation.class);
        try{
            daoImplementation.insertSubject(subject);
            out.println("Successfully inserted.....");
        }catch(Exception e){
            System.out.println(e.getMessage());
            resp.sendRedirect("Welcome.html");
        }

    }
}
