import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Welcome extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        String username=req.getParameter("FirstName");
        String password=req.getParameter("password");
    boolean status=false;
    try{
        Class.forName("com.mysql.jdbc.Driver");

        //creating connection with the database
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employeeabhi","root",
                "qwerty123@#");
        PreparedStatement ps = con.prepareStatement("select * from employee where Fname=? and pass=?");
         ps.setString(1,username);
         ps.setString(2,password);
        ResultSet rs=ps.executeQuery();
         if(rs.next())
         {
             out.println("welcome " +rs.getString(3));
         }
         else {
             out.println("username and password is not valid" );
             RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.html");
             requestDispatcher.forward(req, resp);
         }
    }

    catch(Exception e)
    {
        e.printStackTrace();
    }
    }
}
