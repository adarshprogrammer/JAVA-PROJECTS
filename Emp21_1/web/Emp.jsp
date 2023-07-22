<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
     <pre>
      <form action="EmpAction" method="POST">
          Ename  <input type="text" name="ename" required placeholder="Plz Enter Emp Name"/>
          
          Salary <input type="text" name="sal" required placeholder="Plz Enter Emp Salary"/>
          
          D.O.B. <input type="date" name="dob" required value="2000-01-01" />
          
          Mobile <input type="mobile" name="mobile" required placeholder="9990046906"/>
          
             <input type="submit" value="Save " />
          
            ${msg}
         <hr size="3" color="red">
         <a href="Report">List of All Employees</a>
      </form>       
     </pre>
    </body>
</html>
