package demoPakage;

import javax.xml.transform.Result;
import java.sql.*;

public class JdbcConnection
{

    public static void main(String [] args) throws SQLException {

        String host="localhost";
        String port ="3306";
       Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/qadb","msawant09","Smile@999");
            Statement s=  con.createStatement();
            ResultSet set =s.executeQuery("Select * from credentials where scenario ='zerobalancecard'");
            while(set.next())
            {
                System.out.println(set.getString("username"));
                System.out.println(set.getString("pwd"));
            }

    }

}
