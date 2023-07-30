
package DB;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


 
public class registerAction extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String user=req.getParameter("user");
        String pass=req.getParameter("pass");
        String name=req.getParameter("name");
        String dob=req.getParameter("dob");
        String mailid=req.getParameter("email");
        String mobile=req.getParameter("mobile");
        String address=req.getParameter("address");
        String msg=DB.Admin.setEmp(user, pass, name, dob, mailid, mobile, address);
        req.setAttribute("msg",msg);
        if(msg.startsWith("Sorry"))
        {
        req.getRequestDispatcher("signup.jsp").forward(req, resp);
        }
        else
        {
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }}

 
}
