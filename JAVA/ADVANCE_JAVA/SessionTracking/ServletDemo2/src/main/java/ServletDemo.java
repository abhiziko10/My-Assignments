

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class ServletDemo extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

           //HTTP SESSION

        ServletConfig out=getServletConfig();
        PrintWriter printWriter = resp.getWriter();
        resp.setContentType("text/html");
        String pagename=out.getInitParameter("pagename");
        printWriter.println("<center><h1>Welcome "+pagename+"</h1></center><hr>");

        //URL Rewriting:
       // String username = req.getParameter("uname");

        //printWriter.println("Welcome " + username);
        //printWriter.println("<a href='ByeServlet?user="+username+"' target='_blank'>Bye</a>");

//
//        //HIDDEN FROM FIELDS
//        printWriter.println("<form action='ByeServlet'>"
//        +"<input type='hidden' name='uname' value='"+username+"'/>"
//        +"<button>Click here to go to next servlet</button>");

         String username=req.getParameter("uname");
         printWriter.println("Welcome to this page " +username);
         //printWriter.println("<br><a href='ByeServlet?user="+username+"' target='_blank'/>Click here</a>");
           printWriter.println("<form action='ByeServlet'>" +
//                   "<input type='text' name='user_name' value="username+">" +
                   "<button>Click here to visit the next page</button>");

        HttpSession session=req.getSession();
        session.setAttribute("username",username);
//        session.getAttribute("username");







        //create a Cookie
//        Cookie cookie=new Cookie("user_name",username);
//        resp.addCookie(cookie);







//
//        ServletContext application=getServletContext();
//        Connection connection;
//        Statement statement;
//        try
//        {
//            Class.forName(application.getInitParameter("Driver"));
//            connection= DriverManager.getConnection(application.getInitParameter("Url"),application.getInitParameter(
//                    "Username"),application.getInitParameter("Password"));
//            statement=connection.createStatement();
//            ResultSet resultSet=statement.executeQuery("select * from faculty");
//            printWriter.println("<center border= 2><table><tr><th>Id</th><th>Name</th></tr>");
//            while(resultSet.next())
//            {
//                printWriter.println("<tr><td>" + resultSet.getInt(1)+ "</td> "
//                        +"<td> "+ resultSet.getString(2) + "</td> </tr>");
//            }
//            printWriter.println("</table> </center>");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
    }
}

