// to accept only get method request. 
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetOnly extends HttpServlet
{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String u = req.getParameter("uid");
        String p = req.getParameter("pass");
         PrintWriter out = res.getWriter(); // get the response writer for write onm response window
        out.println("<body bgcolor=lightgreen><tt>");// html code aayega 
        if(p.equals("hiet@"))
        {
           out.println("Hello "+u+",Welcome's U");
           out.close();
        }   
        out.println("Sorry "+u+", this is Invalid User Id & Password, try again");
        out.println("<br><a href=index.html>Click here for try again</a>");
    
        
    }
   
}