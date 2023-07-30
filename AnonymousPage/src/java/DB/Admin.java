package DB;

import java.sql.CallableStatement;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.Types;

public class Admin {

    private static Connection connect() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "");
    }

    public static String setEmp(String userid, String pass, String name, String dob, String mailid, String mobile, String address) {

        String str = String.format("{CALL setData('%s','%s','%s','%s','%s','%s','%s',?)}", userid, pass, name, dob, mailid, mobile, address);

        try {

            CallableStatement cs = connect().prepareCall(str);
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.execute();
            return cs.getString(1);
        } catch (Exception ex) {
            return "Exception is:- " + ex;
        }
    }

    public static String cheakuser(String userid, String pass) {

        String str = String.format("{CALL cheakId('%s','%s',?)}", userid, pass);

        try {

            CallableStatement cs = connect().prepareCall(str);
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.execute();
            return cs.getString(1);
        }
        catch (Exception ex) {
            return "Exception is:- " + ex;
        }
    }

}
