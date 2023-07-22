package db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class Admin {
   // connect() method design that return Connection object
    private static Connection connect() throws Exception
    {
       Class.forName("com.mysql.jdbc.Driver"); // driver load kiya
       return DriverManager.getConnection("jdbc:mysql://localhost:3306/adarsh","root","");
    }
    public static String addUser(String userid,String pass,String mobile,String mailid)
    {
        try{
            String str = String.format("{call addUser('%s','%s','%s','%s',?)}",userid,pass,mobile,mailid);
            CallableStatement cs = connect().prepareCall(str);
            cs.registerOutParameter(1,Types.VARCHAR);
            cs.execute();
            return cs.getString(1); // return out parameter value
            /*  or
            CallableStatement cs = connect().prepareCall("{call addUser(?,?,?,?,?)}");
            cs.setString(1,userid);
            cs.setString(2,pass);
            cs.setString(3,mobile);
            cs.setString(4,mailid);
            cs.registerOutParameter(5,Types.VARCHAR);
            cs.execute();
            return cs.getString(1); // return out parameter value
         */
        }catch(Exception ex) { return "Sorry Exception is - "+ex; }
    }
    public static String checkId(String userid,String pass)
    {
        try{
            String str = String.format("{call checkId('%s','%s',?)}",userid,pass);
            CallableStatement cs = connect().prepareCall(str);
            cs.registerOutParameter(1,Types.VARCHAR);
            cs.execute();
            return cs.getString(1); // return out parameter value
        }catch(Exception ex) { return "Sorry Exception is - "+ex; }
    }
    public static String forgetpass(String userid)
    {
        try{
            String str = String.format("{call forgetPass('%s',?)}",userid);
            CallableStatement cs = connect().prepareCall(str);
            cs.registerOutParameter(1,Types.VARCHAR);
            cs.execute();
            return cs.getString(1); // return out parameter value
        }catch(Exception ex) { return "Sorry Exception is - "+ex; }
    }
    
    
    
    
}


