import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class dispatch extends HttpServlet{

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
         
        String name = req.getParameter("user");
        String password = req.getParameter("pass");
        
        if(password.equals("adarsh@")){
           req.setAttribute("user", name);
           req.getRequestDispatcher("wellcome.jsp").forward(req, resp); 
        } else{
           req.setAttribute("msg", "sorry this is invalid");
           req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
    }
    
    
}