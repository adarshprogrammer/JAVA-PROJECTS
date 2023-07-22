package db;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Report extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      PrintWriter out = resp.getWriter();
      out.println("<body bgcolor=lightyellow><tt><center>");
      out.println("<table width=95% border=1>");
      out.println("<tr><th>Empno</th><th>Ename</th><th>Salary</th><th>DOB</th><th>Mobile</th><th>DOJ Date Time</th><th>Action</th></tr>");
      try
      {
          ResultSet rs = db.Admin.getEmpReport();
          while(rs.next()) // jab tak rs me next record hai - rs empty nahi hai n
          {
              out.println("<tr>");
              for(int i=1;i<=6;i++)
                  out.print("<td>"+rs.getString(i)+"</td>");
              out.println("<td><a href=Update.jsp>Edit</a> | <a href=DelEmp?e="+rs.getString(1)+">Delete</a></tr>");
              out.println("</tr>");
          }
      }catch(Exception ex) { out.println(ex);}
    }
   
}
