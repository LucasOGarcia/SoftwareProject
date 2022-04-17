/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project;

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
        Connection con = null;
        PreparedStatement pst = null;
        try{
            ConnectDB connectDB = new ConnectDB();
            con = connectDB.getConnection();
            String query = "select * from client_Info where client_email=?";
            pst = con.prepareStatement(query);
            pst.setString(1, email);
            ResultSet rs = pst.executeQuery();
            boolean result = rs.next();
            System.out.println("email check finished " + result);
            return result;
        }
        catch (SQLException ex){
            // display error message
            JOptionPane.showMessageDialog(null, "Error!\n"+ex);
            return true;
        }
        finally {
            try {
                if (con != null) {
                    con.close();
                    System.out.println("email check connection closed");
                }
                if (pst != null){
                    System.out.println("email check prepared statement closed");
                    pst.close();
                }
            }
            catch (SQLException ex) {
                // display error message
                System.out.println("couldn't execute finally branch");
                JOptionPane.showMessageDialog(null, "Error!\n"+ex);
                return true;
            }
        }
    }
    
    //register user to the database
    public static void registerUser(String email, String firstName, String lastName, String salt, String password){
        Connection con = null;
        PreparedStatement pst = null;
        try{
            ConnectDB connectDB = new ConnectDB();
            con = connectDB.getConnection();
            int accountType = 0; //0 regular user //1 admin
            
            String query = "insert into client_Info(client_email, client_forename, client_surname, client_salt, client_encrypted_password, client_account_type) "
                    + "VALUES (?,?,?,?,?,?)";
            pst = con.prepareStatement(query);
            pst.setString(1, email);
            pst.setString(2, firstName);
            pst.setString(3, lastName);
            pst.setString(4, salt);
            pst.setString(5, password);
            pst.setInt(6, accountType);
            pst.executeUpdate();
            System.out.println("registration completed");
        }
        catch (SQLException ex){
            // display error message
            JOptionPane.showMessageDialog(null, "Error!\n"+ex);
        }
        finally {
            try {
                if (con != null) {
                    System.out.println("registration connection closed");
                    con.close();
                }
                if (pst != null){
                    System.out.println("registration statement closed");
                    pst.close();
                }
            }
            catch (SQLException ex) {
                // display error message
                System.out.println("couldn't execute finally branch");
                JOptionPane.showMessageDialog(null, "Error!\n"+ex);
            }
        }
    }
    
    
}

//    //verify if email is already within the database  
//    public static boolean checkIfEmailExists(String email){
//        try{
//            connectDB connectDB = new connectDB();
//            Connection con = connectDB.getConnection();
//            String query = "select * from client_Info where client_email=?";
//            PreparedStatement pst = con.prepareStatement(query);
//            pst.setString(1, email);
//            ResultSet rs = pst.executeQuery();
//            boolean result = rs.next();
//            con.close();
//            return result;
//        }
//        catch (SQLException ex){
//            // display error message
//            JOptionPane.showMessageDialog(null, "Error!\n"+ex);
//            return true;
//        }
//    }
//    
//    //register user to the database
//    public static void registerUser(String email, String firstName, String lastName, String salt, String password){
//        try{
//            connectDB connectDB = new connectDB();
//            Connection con = connectDB.getConnection();
//            int accountType = 0; //0 regular user //1 admin
//            String query = "insert into client_Info(client_email, client_forename, client_surname, client_salt, client_encrypted_password, client_account_type) "
//                    + "VALUES (?,?,?,?,?,?)";
//            PreparedStatement pst = con.prepareStatement(query);
//            pst.setString(1, email);
//            pst.setString(2, firstName);
//            pst.setString(3, lastName);
//            pst.setString(4, salt);
//            pst.setString(5, password);
//            pst.setInt(6, accountType);
//            pst.executeUpdate();
//            con.close();
//        }
//        catch (SQLException ex){
//            // display error message
//            JOptionPane.showMessageDialog(null, "Error!\n"+ex);
//        }
//    }
