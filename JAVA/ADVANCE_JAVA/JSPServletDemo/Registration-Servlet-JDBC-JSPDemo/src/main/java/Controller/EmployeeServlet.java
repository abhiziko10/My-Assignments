package Controller;

import DAO.EmployeeDAO;
import Model.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/register")
public class EmployeeServlet extends HttpServlet {
    private EmployeeDAO employeeDAO=new EmployeeDAO();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int ID= Integer.parseInt(req.getParameter("ID"));
        String FirstName=req.getParameter("FirstName");
        String LastName=req.getParameter("LastName");
        String username =req.getParameter("username");
        String password=req.getParameter("password");
        String address=req.getParameter("address");
        String contact=req.getParameter("contact");
        Employee employee=new Employee();
        employee.setID(ID);
        employee.setFirstName(FirstName);
        employee.setLastName(LastName);
        employee.setUsername(username);
        employee.setPassword(password);
        employee.setAddress(address);
        employee.setContact(contact);

     try{
       employeeDAO.registerEmployee(employee);
     } catch (ClassNotFoundException e) {
         throw new RuntimeException(e);
     }
          resp.sendRedirect("EmployeeDetails.jsp");
    }
}
