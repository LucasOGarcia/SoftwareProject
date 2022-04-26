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
import java.sql.Types;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class JdbcCrud {
    
    //check for injections in every db query reference:
    // https://www.journaldev.com/34028/sql-injection-in-java
    //reference for date timestamp:
    //https://www.dariawan.com/tutorials/java/how-convert-java-util-date-to-java-sql-timestamp/#:~:text=Date%20to%20java.-,sql.,millisecond%20value%20of%20that%20object.
        
    //verify if email is already within the database  
    public static boolean checkIfEmailExists(String email){
        Connection con = null;
        PreparedStatement pst = null;
        String query = "select * from client_Info where client_email=?";
        try{
            ConnectDB connectDB = new ConnectDB();
            con = connectDB.getConnection();
            System.out.println("Checking if email "+email+" is already in database");
            //set all parameters
            pst = con.prepareStatement(query);
            pst.setString(1, email);
            
            // execute preparedStatement SELECT * FROM WHERE
            ResultSet rs = pst.executeQuery();
            boolean result = rs.next();
            System.out.println("Checking if email in database finished, result:" + result);
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
                }
                if (pst != null){
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
    
    // Registers user to the client_Info table in the database
    public static void registerUserClientInfo(String email, String firstName, String lastName, String salt, String password) throws Exception{
        Connection con = null;
        PreparedStatement psmt = null;
        String query = "INSERT INTO client_Info("
        + " client_email,"
        + " client_forename,"
        + " client_surname,"
        + " client_salt,"
        + " client_encrypted_password,"
        + " client_last_login,"
        + " client_last_logout,"
        + " client_account_type)"
        + " VALUES (?,?,?,?,?,?,?,?)";
        try{
            ConnectDB connectDB = new ConnectDB();
            con = connectDB.getConnection();
            int accountType = 0; //0 regular user //1 admin
            System.out.println("Registering user into client_Info...");
            
            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setString(1, email);
            psmt.setString(2, firstName);
            psmt.setString(3, lastName);
            psmt.setString(4, salt);
            psmt.setString(5, password);
            psmt.setNull(6, Types.NULL);
            psmt.setNull(7, Types.NULL);
            psmt.setInt(8, accountType);
            
            //execute preparedStatement INSERT
            psmt.executeUpdate();
            con.commit();
            
            System.out.println("Registering user into client_Info completed!");
        }
        catch (SQLException ex){
            // display error message
            JOptionPane.showMessageDialog(null, "Error!\n"+ex);
            System.out.println(ex);
            throw new Exception();
        }
        finally {
            try {
                if (con != null) {
                    System.out.println("registration client_Info connection closed");
                    con.close();
                }
                if (psmt != null){
                    System.out.println("registration client_Info statement closed");
                    psmt.close();
                }
            }
            catch (SQLException ex) {
                // display error message
                System.out.println("Registration client_Info error - couldn't execute finally branch");
                JOptionPane.showMessageDialog(null, "Error!\n"+ex);
                throw new Exception();
            }
        }
    }
    
    // Registers user to the client_Statistics table in the database
    public static void registerUserClienStatistics(String email) throws Exception{
        Connection con = null;
        PreparedStatement psmt = null;
        String query = "insert into client_Statistics(client_email, client_statistics_language_roleplay_complete_a1,"
        + " client_statistics_language_roleplay_complete_a2, client_statistics_language_roleplay_complete_b1,"
        + " client_statistics_language_roleplay_complete_b2, client_statistics_language_roleplay_person_a,"
        + " client_statistics_language_roleplay_person_b, client_statistics_language_vocab_assist,"
        + " client_statistics_topic_directions, client_statistics_topic_employment,"
        + " client_statistics_topic_cultural_experiences, client_statistics_topic_personal_info,"
        + " client_statistics_topic_shopping, client_statistics_topic_health, "
        + " client_statistics_topic_housing, client_statistics_topic_introductions,"
        + " client_statistics_topic_appointments, client_statistics_topic_invitations,"
        + " client_statistics_topic_travel, client_statistics_topic_food_drink,"
        + " client_statistics_topic_socialising, client_statistics_topic_university,"
        + " client_statistics_topic_weather, client_statistics_topic_work) "
        + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
            ConnectDB connectDB = new ConnectDB();
            con = connectDB.getConnection();
            int startingValue = 0; // base value for all statistics counter
            System.out.println("Registering user into client_Statistics...");
            
            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setString(1, email);
            psmt.setInt(2, startingValue);
            psmt.setInt(3, startingValue);
            psmt.setInt(4, startingValue);
            psmt.setInt(5, startingValue);
            psmt.setInt(6, startingValue);
            psmt.setInt(7, startingValue);
            psmt.setInt(8, startingValue);
            psmt.setInt(9, startingValue);
            psmt.setInt(10, startingValue);
            psmt.setInt(11, startingValue);
            psmt.setInt(12, startingValue);
            psmt.setInt(13, startingValue);
            psmt.setInt(14, startingValue);
            psmt.setInt(15, startingValue);
            psmt.setInt(16, startingValue);
            psmt.setInt(17, startingValue);
            psmt.setInt(18, startingValue);
            psmt.setInt(19, startingValue);
            psmt.setInt(20, startingValue);
            psmt.setInt(21, startingValue);
            psmt.setInt(22, startingValue);
            psmt.setInt(23, startingValue);
            psmt.setInt(24, startingValue);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate();
            con.commit();
            System.out.println("registering user into client_Statistics completed!");
        }
        catch (SQLException ex){
            // display error message
            JOptionPane.showMessageDialog(null, "Error!\n"+ex);
            System.out.println(ex);
            throw new Exception();
        }
        finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (psmt != null){
                    psmt.close();
                }
            }
            catch (SQLException ex) {
                // display error message
                JOptionPane.showMessageDialog(null, "Error!\n"+ex);
                throw new Exception();
            }
        }
    }
    
    public static void updateClientLoginTimestamp() throws Exception {
        if (ApplicationInfo.getUser() == null) {
            return;
        }
        
        Connection con = null;
        PreparedStatement psmt = null;
        String userEmail = ApplicationInfo.getUser().userEmail;
        String query ="UPDATE client_Info"
                + " SET client_last_login= ?"
                + " WHERE client_email= ?;";
        java.util.Date utilDate = new java.util.Date();
        java.sql.Timestamp SQLTimestamp = new java.sql.Timestamp(utilDate.getTime());
        try {
            ConnectDB connectDB = new ConnectDB();
            con = connectDB.getConnection();
            System.out.println("Updating user login timestamp...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setTimestamp(1, SQLTimestamp);
            psmt.setString(2, userEmail);
            
            // execute preparedStatement UPDATE
            psmt.executeUpdate();
            con.commit();
            System.out.println("User login timestamp update completed!");
            
        } catch (SQLException ex) {
            // display error message
            JOptionPane.showMessageDialog(null, "Error!\n"+ex);
            System.out.println(ex);
            throw new Exception();
        }
        finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (psmt != null){
                    psmt.close();
                }
            }
            catch (SQLException ex) {
                // display error message
                JOptionPane.showMessageDialog(null, "Error!\n"+ex);
                throw new Exception();
            }
        }
    }
    
    public static void updateClientLogoutTimestamp() throws Exception {
        if (ApplicationInfo.getUser() == null) {
            return;
        }
        
        Connection con = null;
        PreparedStatement psmt = null;
        String userEmail = ApplicationInfo.getUser().userEmail;
        String query ="UPDATE client_Info"
                + " SET client_last_logout= ?"
                + " WHERE client_email= ?;";
        java.util.Date utilDate = new java.util.Date();
        java.sql.Timestamp SQLTimestamp = new java.sql.Timestamp(utilDate.getTime());
        try {
            ConnectDB connectDB = new ConnectDB();
            con = connectDB.getConnection();
            System.out.println("Updating user logout timestamp...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setTimestamp(1, SQLTimestamp);
            psmt.setString(2, userEmail);
            
            // execute preparedStatement UPDATE
            psmt.executeUpdate();
            con.commit();
            System.out.println("User logout timestamp update completed!");
            
        } catch (SQLException ex) {
            // display error message
            JOptionPane.showMessageDialog(null, "Error!\n"+ex);
            System.out.println(ex);
            throw new Exception();
        }
        finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (psmt != null){
                    psmt.close();
                }
            }
            catch (SQLException ex) {
                // display error message
                JOptionPane.showMessageDialog(null, "Error!\n"+ex);
                throw new Exception();
            }
        }
    } 
    
    
}
