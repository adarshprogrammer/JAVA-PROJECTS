package DB;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class DelEmp extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String eno = req.getParameter("e");
       String msg = Admin.delEmp(eno);
       req.setAttribute("msg", msg);
       req.getRequestDispatcher("Report").forward(req, resp);
    }
  
}
