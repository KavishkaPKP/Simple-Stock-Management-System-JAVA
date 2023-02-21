package storagemaqnagement;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class dbConnection {
    
    public static Connection conectDB() {
        
        try{
              String username = "root";
              String pass = "pasi11@PK";
              String sql = "jdbc:mysql://localhost/storsmanagement";
              Class.forName("com.mysql.jdbc.Driver");
              Connection con = DriverManager.getConnection(sql, username,pass);
              return con;
              
              
        } catch (HeadlessException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
       
    
       
