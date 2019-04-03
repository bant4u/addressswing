/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author bijay
 */
public class Database {
        public Connection createConnection(String dbName){
                
        Connection conn = null;
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String url = "jdbc:derby://localhost:1527/"+dbName;
            conn = DriverManager.getConnection(url);
        }
        catch(ClassNotFoundException | SQLException se){
        }
        return conn;
    }    
}
