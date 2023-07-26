<%-- 
    Document   : alibaba
    Created on : Jul 26, 2023, 2:37:51 AM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="font-family: Arial, Helvetica, sans-serif;">
        <form action="eAction" method="post">
        <fieldset><legend>Enter Data</legend><hr><br>
            <table  border="0" align="center">
                
                    <tr>
                        <th>Emp Name:</th>
                        <th><input type="text" name="ename" value="" /></th>
                    </tr>
                
               
                     <tr>
                        <th>Emp Sallary:</th>
                        <th><input type="text" name="sal" value="" /></th>
                    </tr>
                    <tr>
                        <th>Emp Mobile:</th>
                        <th><input type="text" name="mob" value="" /></th>
                    </tr>
                     <tr>
                        <th>Emp Email:</th>
                        <th><input type="email" name="email" value="" /></th>
                    </tr>
                    <tr>
                        <th>Emp DOB:</th>
                        <th><input type="date" name="dob" value="2000-01-01" /></th>
                    </tr>
                    
                    <tr><th colspan="2"><br><input type="submit" value="S a v e"></tr></th>
                
            </table>
            <hr>
        </fieldset></form>
        <br>
        ${msg}<hr><a href="Report">List of all Employee</a>
    </body>
</html>
