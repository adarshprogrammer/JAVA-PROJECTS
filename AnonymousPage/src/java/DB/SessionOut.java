
package DB;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ADARSH AND KUMAR
 */
public class SessionOut extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userid = req.getParameter("user");
        String pass = req.getParameter("pass");
        String msg = DB.Admin.cheakuser(userid, pass);
        HttpSession ses=req.getSession();
        if(ses!=null)
            {
               ses.removeAttribute(userid);
               req.setAttribute("msg","you are Succsessfully Logged Out!");
               req.getRequestDispatcher("index.jsp").forward(req, resp);
            }
    }

}
