package db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Types;

public class Admin {
   private static Connection connect() throws Exception
   {
      Class.forName("com.mysql.jdbc.Driver"); // Driver class load kiya
      return DriverManager.getConnection("jdbc:mysql://localhost:3306/aneesh","root","");
   }
   public static String addEmp(String ename,String sal,String dob,String mob)
   {
      try
      {
        String str = String.format("{call addEmp('%s',%s,'%s','%s',?)}",ename,sal,dob,mob);
        CallableStatement cs = connect().prepareCall(str);
        cs.registerOutParameter(1,Types.VARCHAR);
        cs.execute();
        return cs.getString(1); // return out parameter value 
      }catch(Exception ex) { return "Sorry Exception is - "+ex; }
   }
   public static ResultSet getEmpReport() throws Exception{
       return connect().prepareCall("{call empReport()}").executeQuery();
   }
}
