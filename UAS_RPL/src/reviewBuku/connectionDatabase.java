/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reviewBuku;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class connectionDatabase {
    
    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "user_boora";
    private static Integer portnumber = 3306;
    private static String password = "";
    
    public static Connection getConnection()
    {
        Connection con = null;
        
        MysqlDataSource ds = new MysqlDataSource();
        
        ds.setServerName(servername);
        ds.setUser(username);
        ds.setPassword(password);
        ds.setDatabaseName(dbname);
        ds.setPortNumber(3306);
        
        try {
            con = ds.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger("menyambungkan koneksi ->"+connectionDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }
    
}
