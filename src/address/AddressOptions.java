/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author bijay
 */
public class AddressOptions {
        public boolean insertElement(Connection conn1,String tableName,String firstname,String lastname, String email, String phonenumber){
        PreparedStatement ps;
            try {
             ps = conn1.prepareStatement("insert into "+tableName+"(firstname,lastname,email,phonenumber) values(?,?,?,?)");
            ps.setString(1,firstname);
            ps.setString(2,lastname);
            ps.setString(3,email);
            ps.setString(4,phonenumber);
            ps.executeUpdate();
            return true;
            } catch (SQLException ex) {
                Logger.getLogger(AddressOptions.class.getName()).log(Level.SEVERE, null, ex);
            }
            return false;
   }    
            public boolean UpdateElement(Connection conn1,String tableName,String addressid,String firstname,String lastname, String email, String phonenumber){
            PreparedStatement ps;
            try {
            ps = conn1.prepareStatement("Update "+tableName+" set firstname='"+firstname+"', lastname='"+lastname+"', email='"+email+"', phonenumber='"+phonenumber+"' where addressid="+addressid);
            
            ps.execute();
            return true;
            } catch (SQLException ex) {
                Logger.getLogger(AddressOptions.class.getName()).log(Level.SEVERE, null, ex);
            }
            return false;
   }
        
        public boolean deleteElement(Connection conn,String tableName,int id){
        PreparedStatement ps;
        try{
            ps = conn.prepareStatement("delete from "+tableName+" where ADDRESSID=?");
            ps.setInt(1,id);
            ps.executeUpdate();
        }
        catch(SQLException se){
        }
        return false;
    }
        public boolean deleteAll(Connection conn,String tableName){
        PreparedStatement ps;
        try{
            ps = conn.prepareStatement("delete from "+tableName);
            ps.executeUpdate();
            return true;
        }
        catch(SQLException se){
        }
        return false;
    }
        
        

}
