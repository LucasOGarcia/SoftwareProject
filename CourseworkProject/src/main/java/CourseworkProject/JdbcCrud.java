/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseworkProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class JdbcCrud {
        
    //verify if email is already within the database  
    public static boolean checkIfEmailExists(String email){
        try{ 
            Connection con = ConnectDB.getConnection();
            String query = "select * from user_Info where user_email=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, email);
            ResultSet rs = pst.executeQuery();
            boolean result = rs.next();
            con.close();
            return result;
        }
        catch (SQLException ex){
            // display error message
            JOptionPane.showMessageDialog(null, "Error!\n"+ex);
            return true;
        }
    }
    
    //register user to the database
    public static void registerUser(String email, String firstName, String lastName, String salt, String password){
        try{
            Connection con = ConnectDB.getConnection();
            int accountType = 0; //0 regular user //1 admin
            String query = "insert into user_Info(user_email, user_first_name, user_last_name, user_salt, user_encrypted_password, user_account_type) "
                    + "VALUES (?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, email);
            pst.setString(2, firstName);
            pst.setString(3, lastName);
            pst.setString(4, salt);
            pst.setString(5, password);
            pst.setInt(6, accountType);
            pst.executeUpdate();
            con.close();
        }
        catch (SQLException ex){
            // display error message
            JOptionPane.showMessageDialog(null, "Error!\n"+ex);
        }
    }
    
    
}
