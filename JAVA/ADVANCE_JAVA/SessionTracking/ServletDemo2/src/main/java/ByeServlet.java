import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;


public class ByeServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {


        resp.setContentType("text/html");
        ServletConfig servletConfig=getServletConfig();
        String pagename=servletConfig.getInitParameter("pagename");

        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<center><h1> Welcome "+pagename+"</h1></center><hr>");
        String username=req.getParameter("username");
        HttpSession session=req.getSession();

        printWriter.println("Bye thank you "+session.getAttribute("username"));
        printWriter.println("<a href='last'>Click here </a>");
        session.invalidate();

        //getting all cookies

//        Cookie[] cookies= req.getCookies();
//        String name="";
//        boolean b=false;
//        if(cookies==null)
//        {
//            printWriter.println("<h1>You are a new user please register first</h1>");
//            return;
//        }
//        else{
//          for(int i=0;i< cookies.length;i++)
//          {
//              String tname=cookies[i].getName();
//              if(tname.equals("user_name"))
//              {
//                  b=true;
//                  name=cookies[i].getValue();
//              }
//          }
//        }
//        if(b){
//            printWriter.println("<h1>Bye " + name+"</h1>");
//        } else{
//            printWriter.println("<h1>You are a new user please register first</h1>");
//        }

    }
}
