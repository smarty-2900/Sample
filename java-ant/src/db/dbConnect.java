
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dilshan
 */
public class dbConnect {
    
    public static Connection connect() throws ClassNotFoundException{
        
        Connection con = null;
        
        try{
          Class.forName("com.mysql.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/itp_sample", "root", "");
          
        }catch(SQLException e){
            System.out.println(e);
        }
        
        return con;
    }
}
