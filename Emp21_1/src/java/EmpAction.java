import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class EmpAction extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String ename = req.getParameter("ename");
       String sal = req.getParameter("sal");
       String dob = req.getParameter("dob");
       String mob = req.getParameter("mobile");
       String msg = db.Admin.addEmp(ename, sal, dob, mob);
       req.setAttribute("msg", msg);
       req.getRequestDispatcher("Emp.jsp").forward(req, resp);
    }
  
}
