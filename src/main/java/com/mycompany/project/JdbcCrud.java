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
    
    //check for injections in every db query //ref https://www.journaldev.com/34028/sql-injection-in-java
        
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
            System.out.println("email in database check finished " + result);
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
        + " client_account_type)"
        + " VALUES (?,?,?,?,?,?)";
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
            psmt.setInt(6, accountType);
            
            //execute preparedStatement INSERT
            psmt.executeUpdate();
            con.commit();
            
            System.out.println("Registering into client_Info completed");
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
        PreparedStatement pst = null;
        try{
            ConnectDB connectDB = new ConnectDB();
            con = connectDB.getConnection();
            int startingValue = 0; // base value for all statistics counter
            
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
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(query);
            pst.setString(1, email);
            pst.setInt(2, startingValue);
            pst.setInt(3, startingValue);
            pst.setInt(4, startingValue);
            pst.setInt(5, startingValue);
            pst.setInt(6, startingValue);
            pst.setInt(7, startingValue);
            pst.setInt(8, startingValue);
            pst.setInt(9, startingValue);
            pst.setInt(10, startingValue);
            pst.setInt(11, startingValue);
            pst.setInt(12, startingValue);
            pst.setInt(13, startingValue);
            pst.setInt(14, startingValue);
            pst.setInt(15, startingValue);
            pst.setInt(16, startingValue);
            pst.setInt(17, startingValue);
            pst.setInt(18, startingValue);
            pst.setInt(19, startingValue);
            pst.setInt(20, startingValue);
            pst.setInt(21, startingValue);
            pst.setInt(22, startingValue);
            pst.setInt(23, startingValue);
            pst.setInt(24, startingValue);
            pst.executeUpdate();
            System.out.println("registration client_Statistics completed");
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
                    System.out.println("registration client_Statistics connection closed");
                    con.close();
                }
                if (pst != null){
                    System.out.println("registration client_Statistics statement closed");
                    pst.close();
                }
            }
            catch (SQLException ex) {
                // display error message
                System.out.println("Registration client_Statistics error - couldn't execute finally branch");
                JOptionPane.showMessageDialog(null, "Error!\n"+ex);
                throw new Exception();
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
