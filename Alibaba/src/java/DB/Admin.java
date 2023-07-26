
package DB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Types;


public class Admin {
    private static Connection connect() throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","");
       
    }
    public static String addUser(String ename, String sal,String mobile,String email,String dob)
    {
            String str=String.format("{call setData('%s',%s,'%s','%s','%s',?)}",ename,sal,mobile,email,dob);
            try
            {
                CallableStatement cs=connect().prepareCall(str);
                cs.registerOutParameter(1,Types.VARCHAR);
                cs.execute(); 
                return cs.getString(1); // return out mode parameter values
            }
            catch(Exception ex)   {       return "Ex:"+ex;     }
    }
    public static String delEmp(String eno)
    {
            String str=String.format("{call delEmp(%s,?)}",eno);
            try
            {
                CallableStatement cs=connect().prepareCall(str);
                cs.registerOutParameter(1,Types.VARCHAR);
                cs.execute(); 
                return cs.getString(1); // return out mode parameter values
            }
            catch(Exception ex)   {       return "Ex:"+ex;     }
    }
    public static ResultSet getEmpReport() throws Exception
    {
       return connect().prepareCall("{call getReport()}").executeQuery();
    }
    
}
