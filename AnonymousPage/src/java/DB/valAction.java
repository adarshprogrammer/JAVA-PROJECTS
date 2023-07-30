
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
public class valAction extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userid = req.getParameter("user");
        String pass = req.getParameter("pass");
        String msg = DB.Admin.cheakuser(userid, pass);

        if (msg.startsWith("Sorry")) {
            req.setAttribute("msg", msg);
            req.getRequestDispatcher("index.jsp").forward(req, resp);

        } else {
            HttpSession ses = req.getSession(true);
            ses.setAttribute("id", userid);
            ses.setAttribute("mode",msg);
            req.getRequestDispatcher("welcome.jsp").forward(req, resp);
        }
    }

}
