/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Student
 */
public class eAction extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String ename=req.getParameter("ename");
         String sallary=req.getParameter("sal");
          String mobile=req.getParameter("mob");
           String email=req.getParameter("email");
            String dob=req.getParameter("dob");
             String msg=DB.Admin.addUser(ename, sallary, mobile, email, dob);
             req.setAttribute("msg", msg);
req.getRequestDispatcher("alibaba.jsp").forward(req, resp);
    }


}
