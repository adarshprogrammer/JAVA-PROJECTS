package DB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Report extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       PrintWriter out = resp.getWriter(); // get the response writer & write on response window.
       out.println("<body style=\"font-family: Arial, Helvetica, sans-serif;\"><tt><center>");
       out.println("<table border=1 width=90%>");
       try
       {
           ResultSet rs = Admin.getEmpReport();
           ResultSetMetaData mt = rs.getMetaData();
           out.println("<tr>");
           for(int i=1;i<=mt.getColumnCount();i++)
               out.println("<th>"+mt.getColumnName(i).toUpperCase()+"</th>");
           out.println("<th>ACTION</th>");
           out.println("</tr>");
           while(rs.next()) // records 1 to n 
           {
             out.println("<tr>");
             for(int i=1;i<=mt.getColumnCount();i++)
               out.println("<td>"+rs.getString(i)+"</td>");
             out.println("<td><a href=DelEmp?e="+rs.getString(1)+">Delete</a> | <a href=UpdEmp.jsp?e="+rs.getString(1)+">Edit</a></th>");
             out.println("</tr>");
           }
           out.println("</table></center>");
           String msg = (String)req.getAttribute("msg");
           if(msg!=null)
                 out.println(msg); 
           out.println("<hr size=2 color=red><a href=alibaba.jsp>Add new Employee</a>"); 
         }catch(Exception ex) { out.println(ex); }
       
    }
   
}
