/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
            con = ConnectDB.getConnection();
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
            con = ConnectDB.getConnection();
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
    public static void registerUserClienStatistics(String email, String language) throws Exception{
        Connection con = null;
        PreparedStatement psmt = null;
        String query = "insert into client_Statistics_"+language+"(client_email, client_statistics_language_roleplay_complete_a1,"
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
        + " client_statistics_topic_weather, client_statistics_topic_work, client_statistics_last_roleplay) "
        + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
            con = ConnectDB.getConnection();
            int startingValue = 0; // base value for all statistics counter
            System.out.println("Registering user into client_Statistics_"+language+"...");
            
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
            psmt.setNull(25, Types.NULL);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate();
            con.commit();
            System.out.println("registering user into client_Statistics_"+language+" completed!");
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
    
    // Registers user to the client_Statistics table in the database
    public static void registerUserSpanishProgress(String email) throws Exception{
        Connection con = null;
        PreparedStatement psmt = null;
        String query = "insert into progress_Spanish_A1_Directions (client_email, client_progress_repeat_name,"
        + " client_progress_delivery_driver)"
        + " VALUES (?,?,?)";
        
        String query2 = "insert into progress_Spanish_A2_Directions (client_email, client_progress_delivery_driver,"
        + " client_progress_hospital_visit)"
        + " VALUES (?,?,?)";
        
        String query3 = "insert into progress_Spanish_B2_Directions (client_email, client_progress_delivery_driver,"
        + " client_progress_hospital_visit)"
        + " VALUES (?,?,?)";
        
        String query4 = "insert into progress_Spanish_A1_Employment (client_email, client_progress_cover,"
        + " client_progress_interview)"
        + " VALUES (?,?,?)";
        
        String query5 = "insert into progress_Spanish_A1_Cultural_Experiences (client_email, client_progress_international_food)"
        + " VALUES (?,?)";
        
        String query6 = "insert into progress_Spanish_A2_Cultural_Experiences (client_email, client_progress_omelette)"
        + " VALUES (?,?)";
        
        String query7 = "insert into progress_Spanish_A1_Personal_Info (client_email, client_progress_social_media,"
        + " client_progress_instagram, client_progress_neighbours_parcel, client_progress_description_of_town)"
        + " VALUES (?,?,?,?,?)";
        
        String query8 = "insert into progress_Spanish_A2_Personal_Info (client_email, client_progress_age_restricted)"
        + " VALUES (?,?)";
        
        String query9 = "insert into progress_Spanish_A1_Shopping (client_email, client_progress_payment,"
        + " client_progress_refund)"
        + " VALUES (?,?,?)";
        
        String query10 = "insert into progress_Spanish_A2_Shopping (client_email, client_progress_payment)"
        + " VALUES (?,?)";
        
        String query11 = "insert into progress_Spanish_B1_Shopping (client_email, client_progress_payment,"
        + " client_progress_cancel_hair_appointment, client_progress_purchase_computer)"
        + " VALUES (?,?,?,?)";
        
        String query13 = "insert into progress_Spanish_B2_Shopping (client_email, client_progress_phone_purchase)"
        + " VALUES (?,?)";
        
        String query14 = "insert into progress_Spanish_A2_Health (client_email, client_progress_sick_relative,"
        + " client_progress_visiting_patient)"
        + " VALUES (?,?,?)";
        
        String query15 = "insert into progress_Spanish_B1_Housing (client_email, client_progress_delivery_of_package)"
        + " VALUES (?,?)";
        
        String query16 = "insert into progress_Spanish_A2_Introductions (client_email, client_progress_first_day_in_job,"
        + " client_progress_job_offer)"
        + " VALUES (?,?,?)";
        
        String query17 = "insert into progress_Spanish_A1_Appointments (client_email, client_progress_booking,"
        + " client_progress_spelling_name)"
        + " VALUES (?,?,?)";
        
        String query18 = "insert into progress_Spanish_A2_Appointments (client_email, client_progress_dentist,"
        + " client_progress_doctor)"
        + " VALUES (?,?,?)";
        
        String query19 = "insert into progress_Spanish_A1_Invitations (client_email, client_progress_disneyland,"
        + " client_progress_help_with_child_party)"
        + " VALUES (?,?,?)";
        
        String query20 = "insert into progress_Spanish_A2_Invitations (client_email, client_progress_charity,"
        + " client_progress_lunch, client_progress_children_at_wedding, client_progress_wedding_reservation)"
        + " VALUES (?,?,?,?,?)";
        
        String query21 = "insert into progress_Spanish_B1_Invitations (client_email, client_progress_offering_help)"
        + " VALUES (?,?)";
        
        String query22 = "insert into progress_Spanish_A2_Travel (client_email, client_progress_expired_ticket)"
        + " VALUES (?,?)";
        
        String query23 = "insert into progress_Spanish_B1_Travel (client_email, client_progress_eticket)"
        + " VALUES (?,?)";
        
        String query24 = "insert into progress_Spanish_B2_Travel (client_email, client_progress_disneyland)"
        + " VALUES (?,?)";
        
        String query25 = "insert into progress_Spanish_A1_Food_Drink (client_email, client_progress_takeaway,"
        + " client_progress_coffee, client_progress_water_for_table,"
        + " client_progress_reservation, client_progress_cocktails_by_card)"
        + " VALUES (?,?,?,?,?,?)";
        
        String query26 = "insert into progress_Spanish_A2_Food_Drink (client_email, client_progress_vegan_pizza,"
        + " client_progress_reservation, client_progress_delayed_drinks,"
        + "client_progress_qr_code, client_progress_cocktails)"
        + " VALUES (?,?,?,?,?,?)";
        
        String query27 = "insert into progress_Spanish_B1_Food_Drink (client_email, client_progress_cocktails_by_barcode)"
        + " VALUES (?,?)";
        
        String query28 = "insert into progress_Spanish_A1_Socialising (client_email, client_progress_interview)"
        + " VALUES (?,?)";
        
        String query29 = "insert into progress_Spanish_A2_Socialising (client_email, client_progress_family_size,"
        + " client_progress_succelent)"
        + " VALUES (?,?,?)";
        
        String query30 = "insert into progress_Spanish_B1_Socialising (client_email, client_progress_haircut)"
        + " VALUES (?,?)";
        
        String query31 = "insert into progress_Spanish_B2_Socialising (client_email, client_progress_no_show_date)"
        + " VALUES (?,?)";
        
        String query32 = "insert into progress_Spanish_A1_University (client_email, client_progress_study_in_cafe)"
        + " VALUES (?,?)";
        
        String query33 = "insert into progress_Spanish_B1_University (client_email, client_progress_study_plans)"
        + " VALUES (?,?)";
        
        String query34 = "insert into progress_Spanish_A2_Weather (client_email, client_progress_cloathing_for_weather)"
        + " VALUES (?,?)";
        
        String query35 = "insert into progress_Spanish_B1_Weather (client_email, client_progress_rain_in_station)"
        + " VALUES (?,?)";
        
        String query36 = "insert into progress_Spanish_B1_Work (client_email, client_progress_job_offer)"
        + " VALUES (?,?)";
                
        String query37 = "insert into progress_Spanish_B2_Work (client_email, client_progress_meet_for_drinks)"
        + " VALUES (?,?)";
        
        try{
            con = ConnectDB.getConnection();
            int startingValue = 0; // base value for all statistics counter
            System.out.println("Registering user into client_Statistics_Spanish...");
            
            // set all parameters statement 1
            psmt = con.prepareStatement(query);
            psmt.setString(1, email);
            psmt.setInt(2, startingValue);
            psmt.setInt(3, startingValue);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate();
            
            // set all parameters statement 2
            psmt = con.prepareStatement(query2);
            psmt.setString(1, email);
            psmt.setInt(2, startingValue);
            psmt.setInt(3, startingValue);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate();
            
            // set all parameters statement 3
            psmt = con.prepareStatement(query3);
            psmt.setString(1, email);
            psmt.setInt(2, startingValue);
            psmt.setInt(3, startingValue);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate();
            
            // set all parameters statement 4
            psmt = con.prepareStatement(query4);
            psmt.setString(1, email);
            psmt.setInt(2, startingValue);
            psmt.setInt(3, startingValue);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate();
            
            // set all parameters statement 5
            psmt = con.prepareStatement(query5);
            psmt.setString(1, email);
            psmt.setInt(2, startingValue);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate();
            
            // set all parameters statement 6
            psmt = con.prepareStatement(query6);
            psmt.setString(1, email);
            psmt.setInt(2, startingValue);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate();
            
            // set all parameters statement 7
            psmt = con.prepareStatement(query7);
            psmt.setString(1, email);
            psmt.setInt(2, startingValue);
            psmt.setInt(3, startingValue);
            psmt.setInt(4, startingValue);
            psmt.setInt(5, startingValue);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate();
            
           // set all parameters statement 8
            psmt = con.prepareStatement(query8);
            psmt.setString(1, email);
            psmt.setInt(2, startingValue);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate();
            
           // set all parameters statement 9
            psmt = con.prepareStatement(query9);
            psmt.setString(1, email);
            psmt.setInt(2, startingValue);
            psmt.setInt(3, startingValue);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate();
            
           // set all parameters statement 10
            psmt = con.prepareStatement(query10);
            psmt.setString(1, email);
            psmt.setInt(2, startingValue);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate();
            
            // set all parameters statement 11
            psmt = con.prepareStatement(query11);
            psmt.setString(1, email);
            psmt.setInt(2, startingValue);
            psmt.setInt(3, startingValue);
            psmt.setInt(4, startingValue);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate();
            
           // set all parameters statement 13
            psmt = con.prepareStatement(query13);
            psmt.setString(1, email);
            psmt.setInt(2, startingValue);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate();
            
            // set all parameters statement 14
            psmt = con.prepareStatement(query14);
            psmt.setString(1, email);
            psmt.setInt(2, startingValue);
            psmt.setInt(3, startingValue);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate();         
                        
           // set all parameters statement 15
            psmt = con.prepareStatement(query15);
            psmt.setString(1, email);
            psmt.setInt(2, startingValue);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate();
            
            // set all parameters statement 16
            psmt = con.prepareStatement(query16);
            psmt.setString(1, email);
            psmt.setInt(2, startingValue);
            psmt.setInt(3, startingValue);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate();
            
            // set all parameters statement 17
            psmt = con.prepareStatement(query17);
            psmt.setString(1, email);
            psmt.setInt(2, startingValue);
            psmt.setInt(3, startingValue);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate();
            
            // set all parameters statement 18
            psmt = con.prepareStatement(query18);
            psmt.setString(1, email);
            psmt.setInt(2, startingValue);
            psmt.setInt(3, startingValue);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate();
            
            // set all parameters statement 19
            psmt = con.prepareStatement(query19);
            psmt.setString(1, email);
            psmt.setInt(2, startingValue);
            psmt.setInt(3, startingValue);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate();
            
            // set all parameters statement 20
            psmt = con.prepareStatement(query20);
            psmt.setString(1, email);
            psmt.setInt(2, startingValue);
            psmt.setInt(3, startingValue);
            psmt.setInt(4, startingValue);
            psmt.setInt(5, startingValue);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate();
            
           // set all parameters statement 21
            psmt = con.prepareStatement(query21);
            psmt.setString(1, email);
            psmt.setInt(2, startingValue);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate();
            
           // set all parameters statement 22
            psmt = con.prepareStatement(query22);
            psmt.setString(1, email);
            psmt.setInt(2, startingValue);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate();
            
           // set all parameters statement 23
            psmt = con.prepareStatement(query23);
            psmt.setString(1, email);
            psmt.setInt(2, startingValue);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate();
            
           // set all parameters statement 24
            psmt = con.prepareStatement(query24);
            psmt.setString(1, email);
            psmt.setInt(2, startingValue);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate();
            
          // set all parameters statement 25 
            psmt = con.prepareStatement(query25);
            psmt.setString(1, email);
            psmt.setInt(2, startingValue);
            psmt.setInt(3, startingValue);
            psmt.setInt(4, startingValue);
            psmt.setInt(5, startingValue);
            psmt.setInt(6, startingValue);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate();
            
            // set all parameters statement 26 
            psmt = con.prepareStatement(query26);
            psmt.setString(1, email);
            psmt.setInt(2, startingValue);
            psmt.setInt(3, startingValue);
            psmt.setInt(4, startingValue);
            psmt.setInt(5, startingValue);
            psmt.setInt(6, startingValue);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate();
            
          // set all parameters statement 27
            psmt = con.prepareStatement(query27);
            psmt.setString(1, email);
            psmt.setInt(2, startingValue);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate(); 
            
          // set all parameters statement 28
            psmt = con.prepareStatement(query28);
            psmt.setString(1, email);
            psmt.setInt(2, startingValue);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate(); 
            
          // set all parameters statement 29 
            psmt = con.prepareStatement(query29);
            psmt.setString(1, email);
            psmt.setInt(2, startingValue);
            psmt.setInt(3, startingValue);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate();
            
          // set all parameters statement 30
            psmt = con.prepareStatement(query30);
            psmt.setString(1, email);
            psmt.setInt(2, startingValue);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate();
            
          // set all parameters statement 31 
            psmt = con.prepareStatement(query31);
            psmt.setString(1, email);
            psmt.setInt(2, startingValue);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate();
            
          // set all parameters statement 32 
            psmt = con.prepareStatement(query32);
            psmt.setString(1, email);
            psmt.setInt(2, startingValue);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate();
            
          // set all parameters statement 33 
            psmt = con.prepareStatement(query33);
            psmt.setString(1, email);
            psmt.setInt(2, startingValue);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate();
            
          // set all parameters statement 34
            psmt = con.prepareStatement(query34);
            psmt.setString(1, email);
            psmt.setInt(2, startingValue);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate();
            
          // set all parameters statement 35 
            psmt = con.prepareStatement(query35);
            psmt.setString(1, email);
            psmt.setInt(2, startingValue);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate();
            
          // set all parameters statement 36
            psmt = con.prepareStatement(query36);
            psmt.setString(1, email);
            psmt.setInt(2, startingValue);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate();
            
          // set all parameters statement 37 
            psmt = con.prepareStatement(query37);
            psmt.setString(1, email);
            psmt.setInt(2, startingValue);
            
            // execute preparedStatement INSERT
            psmt.executeUpdate();
            
            con.commit();
            System.out.println("registering user into client_Statistics_Spanish completed!");
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
            con = ConnectDB.getConnection();
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
            con = ConnectDB.getConnection();
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
    
    public static int getVocabAssistCount(String email, String language) throws Exception {        
        Connection con = null;
        PreparedStatement psmt = null;
        String query = "SELECT client_statistics_language_vocab_assist FROM client_Statistics_"+ language
                +" WHERE client_email=?";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Retrieving user vocab assist count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setString(1, email);
            
            // execute preparedStatement UPDATE
            ResultSet rs = psmt.executeQuery();
            Integer vocabCount = rs.getInt(1);
            System.out.println("User vocab assist count successfully retrieved!");
            return vocabCount;
            
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
    
    public static void upateVocabAssistCount(Integer newVocabCount, String language) throws Exception {
        if (ApplicationInfo.getUser() == null) {
            return;
        }
        
        Connection con = null;
        PreparedStatement psmt = null;
        String userEmail = ApplicationInfo.getUser().userEmail;
        String query ="UPDATE client_Statistics_"+language
                + " SET client_statistics_language_vocab_assist= ?"
                + " WHERE client_email= ?;";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Updating user vocab assist count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setInt(1, newVocabCount);
            psmt.setString(2, userEmail);
            
            // execute preparedStatement UPDATE
            psmt.executeUpdate();
            con.commit();
            System.out.println("User vocab assist count updated successfully!");
            
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
    
    public static int getTopicDirectionsCount(String email, String language) throws Exception {        
        Connection con = null;
        PreparedStatement psmt = null;
        String query = "SELECT client_statistics_topic_directions FROM client_Statistics_"+language
                +" WHERE client_email=?";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Retrieving user directions topic count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setString(1, email);
            
            // execute preparedStatement UPDATE
            ResultSet rs = psmt.executeQuery();
            Integer amount = rs.getInt(1);
            System.out.println("User directions topic count successfully retrieved!");
            return amount;
            
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
    
    public static void upateTopicDirectionsCount(Integer newVocabCount, String language) throws Exception {
        if (ApplicationInfo.getUser() == null) {
            return;
        }
        
        Connection con = null;
        PreparedStatement psmt = null;
        String userEmail = ApplicationInfo.getUser().userEmail;
        String query ="UPDATE client_Statistics_"+language
                + " SET client_statistics_topic_directions= ?"
                + " WHERE client_email= ?;";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Updating user directions topic count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setInt(1, newVocabCount);
            psmt.setString(2, userEmail);
            
            // execute preparedStatement UPDATE
            psmt.executeUpdate();
            con.commit();
            System.out.println("User directions topic count updated successfully!");
            
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
    
    public static int getTopicEmploymentCount(String email, String language) throws Exception {        
        Connection con = null;
        PreparedStatement psmt = null;
        String query = "SELECT client_statistics_topic_employment FROM client_Statistics_"+language
                +" WHERE client_email=?";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Retrieving user employment topic count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setString(1, email);
            
            // execute preparedStatement UPDATE
            ResultSet rs = psmt.executeQuery();
            Integer amount = rs.getInt(1);
            System.out.println("User employment topic count successfully retrieved!");
            return amount;
            
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
    
    public static void upateTopicEmploymentCount(Integer newVocabCount, String language) throws Exception {
        if (ApplicationInfo.getUser() == null) {
            return;
        }
        
        Connection con = null;
        PreparedStatement psmt = null;
        String userEmail = ApplicationInfo.getUser().userEmail;
        String query ="UPDATE client_Statistics_"+language
                + " SET client_statistics_topic_employment= ?"
                + " WHERE client_email= ?;";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Updating user employment topic count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setInt(1, newVocabCount);
            psmt.setString(2, userEmail);
            
            // execute preparedStatement UPDATE
            psmt.executeUpdate();
            con.commit();
            System.out.println("User employment topic count updated successfully!");
            
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
    
    public static int getTopicCulturalExperiencesCount(String email, String language) throws Exception {        
        Connection con = null;
        PreparedStatement psmt = null;
        String query = "SELECT client_statistics_topic_cultural_experiences FROM client_Statistics_"+language
                + " WHERE client_email=?";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Retrieving user cultural experiences topic count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setString(1, email);
            
            // execute preparedStatement UPDATE
            ResultSet rs = psmt.executeQuery();
            Integer amount = rs.getInt(1);
            System.out.println("User cultural experiences topic count successfully retrieved!");
            return amount;
            
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
    
    public static void upateTopicCulturalExperiencesCount(Integer newVocabCount, String language) throws Exception {
        if (ApplicationInfo.getUser() == null) {
            return;
        }
        
        Connection con = null;
        PreparedStatement psmt = null;
        String userEmail = ApplicationInfo.getUser().userEmail;
        String query ="UPDATE client_Statistics_"+language
                + " SET client_statistics_topic_cultural_experiences= ?"
                + " WHERE client_email= ?;";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Updating user cultural experiences topic count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setInt(1, newVocabCount);
            psmt.setString(2, userEmail);
            
            // execute preparedStatement UPDATE
            psmt.executeUpdate();
            con.commit();
            System.out.println("User cultural experiences topic count updated successfully!");
            
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
    
    public static int getTopicPersonalInfoCount(String email, String language) throws Exception {        
        Connection con = null;
        PreparedStatement psmt = null;
        String query = "SELECT client_statistics_topic_personal_info FROM client_Statistics_"+language
                + " WHERE client_email=?";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Retrieving user personal info topic count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setString(1, email);
            
            // execute preparedStatement UPDATE
            ResultSet rs = psmt.executeQuery();
            Integer amount = rs.getInt(1);
            System.out.println("User personal info topic count successfully retrieved!");
            return amount;
            
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
    
    public static void upateTopicPersonalInfoCount(Integer newVocabCount, String language) throws Exception {
        if (ApplicationInfo.getUser() == null) {
            return;
        }
        
        Connection con = null;
        PreparedStatement psmt = null;
        String userEmail = ApplicationInfo.getUser().userEmail;
        String query ="UPDATE client_Statistics_"+language
                + " SET client_statistics_topic_personal_info= ?"
                + " WHERE client_email= ?;";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Updating user personal info topic count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setInt(1, newVocabCount);
            psmt.setString(2, userEmail);
            
            // execute preparedStatement UPDATE
            psmt.executeUpdate();
            con.commit();
            System.out.println("User personal info topic count updated successfully!");
            
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
    
    public static int getTopicShoppingCount(String email, String language) throws Exception {        
        Connection con = null;
        PreparedStatement psmt = null;
        String query = "SELECT client_statistics_topic_shopping FROM client_Statistics_"+language
                + " WHERE client_email=?";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Retrieving user shopping topic count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setString(1, email);
            
            // execute preparedStatement UPDATE
            ResultSet rs = psmt.executeQuery();
            Integer amount = rs.getInt(1);
            System.out.println("User shopping topic count successfully retrieved!");
            return amount;
            
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
    
    public static void upateTopicShoppingCount(Integer newVocabCount, String language) throws Exception {
        if (ApplicationInfo.getUser() == null) {
            return;
        }
        
        Connection con = null;
        PreparedStatement psmt = null;
        String userEmail = ApplicationInfo.getUser().userEmail;
        String query ="UPDATE client_Statistics_"+language
                + " SET client_statistics_topic_shopping= ?"
                + " WHERE client_email= ?;";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Updating user shopping topic count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setInt(1, newVocabCount);
            psmt.setString(2, userEmail);
            
            // execute preparedStatement UPDATE
            psmt.executeUpdate();
            con.commit();
            System.out.println("User shopping topic count updated successfully!");
            
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
    
    public static int getTopicHealthCount(String email, String language) throws Exception {        
        Connection con = null;
        PreparedStatement psmt = null;
        String query = "SELECT client_statistics_topic_health FROM client_Statistics_"+language
                + " WHERE client_email=?";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Retrieving user health topic count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setString(1, email);
            
            // execute preparedStatement UPDATE
            ResultSet rs = psmt.executeQuery();
            Integer amount = rs.getInt(1);
            System.out.println("User health topic count successfully retrieved!");
            return amount;
            
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
    
    public static void upateTopicHealthCount(Integer newVocabCount, String language) throws Exception {
        if (ApplicationInfo.getUser() == null) {
            return;
        }
        
        Connection con = null;
        PreparedStatement psmt = null;
        String userEmail = ApplicationInfo.getUser().userEmail;
        String query ="UPDATE client_Statistics_"+language
                + " SET client_statistics_topic_health= ?"
                + " WHERE client_email= ?;";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Updating user health topic count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setInt(1, newVocabCount);
            psmt.setString(2, userEmail);
            
            // execute preparedStatement UPDATE
            psmt.executeUpdate();
            con.commit();
            System.out.println("User health topic count updated successfully!");
            
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
    
    public static int getTopicHousingCount(String email, String language) throws Exception {        
        Connection con = null;
        PreparedStatement psmt = null;
        String query = "SELECT client_statistics_topic_housing FROM client_Statistics_"+language
                + " WHERE client_email=?";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Retrieving user housing topic count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setString(1, email);
            
            // execute preparedStatement UPDATE
            ResultSet rs = psmt.executeQuery();
            Integer amount = rs.getInt(1);
            System.out.println("User housing topic count successfully retrieved!");
            return amount;
            
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
    
    public static void upateTopicHousingCount(Integer newVocabCount, String language) throws Exception {
        if (ApplicationInfo.getUser() == null) {
            return;
        }
        
        Connection con = null;
        PreparedStatement psmt = null;
        String userEmail = ApplicationInfo.getUser().userEmail;
        String query ="UPDATE client_Statistics_"+language
                + " SET client_statistics_topic_housing= ?"
                + " WHERE client_email= ?;";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Updating user housing topic count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setInt(1, newVocabCount);
            psmt.setString(2, userEmail);
            
            // execute preparedStatement UPDATE
            psmt.executeUpdate();
            con.commit();
            System.out.println("User housing topic count updated successfully!");
            
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
    
    public static int getTopicIntroductionsCount(String email, String language) throws Exception {        
        Connection con = null;
        PreparedStatement psmt = null;
        String query = "SELECT client_statistics_topic_introductions FROM client_Statistics_"+language
                + " WHERE client_email=?";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Retrieving user introductions topic count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setString(1, email);
            
            // execute preparedStatement UPDATE
            ResultSet rs = psmt.executeQuery();
            Integer amount = rs.getInt(1);
            System.out.println("User introductions topic count successfully retrieved!");
            return amount;
            
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
    
    public static void upateTopicIntroductionsCount(Integer newVocabCount, String language) throws Exception {
        if (ApplicationInfo.getUser() == null) {
            return;
        }
        
        Connection con = null;
        PreparedStatement psmt = null;
        String userEmail = ApplicationInfo.getUser().userEmail;
        String query ="UPDATE client_Statistics_"+language
                + " SET client_statistics_topic_introductions= ?"
                + " WHERE client_email= ?;";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Updating user introductions topic count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setInt(1, newVocabCount);
            psmt.setString(2, userEmail);
            
            // execute preparedStatement UPDATE
            psmt.executeUpdate();
            con.commit();
            System.out.println("User introductions topic count updated successfully!");
            
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
    
    public static int getTopicAppointmentsCount(String email, String language) throws Exception {        
        Connection con = null;
        PreparedStatement psmt = null;
        String query = "SELECT client_statistics_topic_appointments FROM client_Statistics_"+language
                + " WHERE client_email=?";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Retrieving user appointments topic count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setString(1, email);
            
            // execute preparedStatement UPDATE
            ResultSet rs = psmt.executeQuery();
            Integer amount = rs.getInt(1);
            System.out.println("User appointments topic count successfully retrieved!");
            return amount;
            
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
    
    public static void upateTopicAppointmentsCount(Integer newVocabCount, String language) throws Exception {
        if (ApplicationInfo.getUser() == null) {
            return;
        }
        
        Connection con = null;
        PreparedStatement psmt = null;
        String userEmail = ApplicationInfo.getUser().userEmail;
        String query ="UPDATE client_Statistics_"+language
                + " SET client_statistics_topic_appointments= ?"
                + " WHERE client_email= ?;";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Updating user appointments topic count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setInt(1, newVocabCount);
            psmt.setString(2, userEmail);
            
            // execute preparedStatement UPDATE
            psmt.executeUpdate();
            con.commit();
            System.out.println("User appointments topic count updated successfully!");
            
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
    
    public static int getTopicInvitationsCount(String email, String language) throws Exception {        
        Connection con = null;
        PreparedStatement psmt = null;
        String query = "SELECT client_statistics_topic_invitations FROM client_Statistics_"+language
                + " WHERE client_email=?";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Retrieving user invitations topic count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setString(1, email);
            
            // execute preparedStatement UPDATE
            ResultSet rs = psmt.executeQuery();
            Integer amount = rs.getInt(1);
            System.out.println("User invitations topic count successfully retrieved!");
            return amount;
            
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
    
    public static void upateTopicInvitationsCount(Integer newVocabCount, String language) throws Exception {
        if (ApplicationInfo.getUser() == null) {
            return;
        }
        
        Connection con = null;
        PreparedStatement psmt = null;
        String userEmail = ApplicationInfo.getUser().userEmail;
        String query ="UPDATE client_Statistics_"+language
                + " SET client_statistics_topic_invitations= ?"
                + " WHERE client_email= ?;";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Updating user invitations topic count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setInt(1, newVocabCount);
            psmt.setString(2, userEmail);
            
            // execute preparedStatement UPDATE
            psmt.executeUpdate();
            con.commit();
            System.out.println("User invitations topic count updated successfully!");
            
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
    
    public static int getTopicTravelCount(String email, String language) throws Exception {        
        Connection con = null;
        PreparedStatement psmt = null;
        String query = "SELECT client_statistics_topic_travel FROM client_Statistics_"+language
                + " WHERE client_email=?";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Retrieving user travel topic count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setString(1, email);
            
            // execute preparedStatement UPDATE
            ResultSet rs = psmt.executeQuery();
            Integer amount = rs.getInt(1);
            System.out.println("User travel topic count successfully retrieved!");
            return amount;
            
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
    
    public static void upateTopicTravelCount(Integer newVocabCount, String language) throws Exception {
        if (ApplicationInfo.getUser() == null) {
            return;
        }
        
        Connection con = null;
        PreparedStatement psmt = null;
        String userEmail = ApplicationInfo.getUser().userEmail;
        String query ="UPDATE client_Statistics_"+language
                + " SET client_statistics_topic_travel= ?"
                + " WHERE client_email= ?;";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Updating user travel topic count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setInt(1, newVocabCount);
            psmt.setString(2, userEmail);
            
            // execute preparedStatement UPDATE
            psmt.executeUpdate();
            con.commit();
            System.out.println("User travel topic count updated successfully!");
            
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
    
    public static int getTopicFoodAndDrinkCount(String email, String language) throws Exception {        
        Connection con = null;
        PreparedStatement psmt = null;
        String query = "SELECT client_statistics_topic_food_drink FROM client_Statistics_"+language
                + " WHERE client_email=?";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Retrieving user food & drink topic count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setString(1, email);
            
            // execute preparedStatement UPDATE
            ResultSet rs = psmt.executeQuery();
            Integer amount = rs.getInt(1);
            System.out.println("User food & drink  topic count successfully retrieved!");
            return amount;
            
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
    
    public static void upateTopicFoodAndDrinkCount(Integer newVocabCount, String language) throws Exception {
        if (ApplicationInfo.getUser() == null) {
            return;
        }
        
        Connection con = null;
        PreparedStatement psmt = null;
        String userEmail = ApplicationInfo.getUser().userEmail;
        String query ="UPDATE client_Statistics_"+language
                + " SET client_statistics_topic_food_drink= ?"
                + " WHERE client_email= ?;";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Updating user food & drink  topic count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setInt(1, newVocabCount);
            psmt.setString(2, userEmail);
            
            // execute preparedStatement UPDATE
            psmt.executeUpdate();
            con.commit();
            System.out.println("User food & drink  topic count updated successfully!");
            
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
    
    public static int getTopicSocialisingCount(String email, String language) throws Exception {        
        Connection con = null;
        PreparedStatement psmt = null;
        String query = "SELECT client_statistics_topic_socialising FROM client_Statistics_"+language
                + " WHERE client_email=?";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Retrieving user socialising topic count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setString(1, email);
            
            // execute preparedStatement UPDATE
            ResultSet rs = psmt.executeQuery();
            Integer amount = rs.getInt(1);
            System.out.println("User socialising topic count successfully retrieved!");
            return amount;
            
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
    
    public static void upateTopicSocialisingCount(Integer newVocabCount, String language) throws Exception {
        if (ApplicationInfo.getUser() == null) {
            return;
        }
        
        Connection con = null;
        PreparedStatement psmt = null;
        String userEmail = ApplicationInfo.getUser().userEmail;
        String query ="UPDATE client_Statistics_"+language
                + " SET client_statistics_topic_socialising= ?"
                + " WHERE client_email= ?;";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Updating user socialising topic count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setInt(1, newVocabCount);
            psmt.setString(2, userEmail);
            
            // execute preparedStatement UPDATE
            psmt.executeUpdate();
            con.commit();
            System.out.println("User socialising topic count updated successfully!");
            
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
    
    public static int getTopicUniversityCount(String email, String language) throws Exception {        
        Connection con = null;
        PreparedStatement psmt = null;
        String query = "SELECT client_statistics_topic_university FROM client_Statistics_"+language
                + " WHERE client_email=?";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Retrieving user university topic count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setString(1, email);
            
            // execute preparedStatement UPDATE
            ResultSet rs = psmt.executeQuery();
            Integer amount = rs.getInt(1);
            System.out.println("User university topic count successfully retrieved!");
            return amount;
            
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
    
    public static void upateTopicUniversityCount(Integer newVocabCount, String language) throws Exception {
        if (ApplicationInfo.getUser() == null) {
            return;
        }
        
        Connection con = null;
        PreparedStatement psmt = null;
        String userEmail = ApplicationInfo.getUser().userEmail;
        String query ="UPDATE client_Statistics_"+language
                + " SET client_statistics_topic_university= ?"
                + " WHERE client_email= ?;";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Updating user university topic count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setInt(1, newVocabCount);
            psmt.setString(2, userEmail);
            
            // execute preparedStatement UPDATE
            psmt.executeUpdate();
            con.commit();
            System.out.println("User university topic count updated successfully!");
            
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
    
    public static int getTopicWeatherCount(String email, String language) throws Exception {        
        Connection con = null;
        PreparedStatement psmt = null;
        String query = "SELECT client_statistics_topic_weather FROM client_Statistics_"+language
                + " WHERE client_email=?";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Retrieving user weather topic count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setString(1, email);
            
            // execute preparedStatement UPDATE
            ResultSet rs = psmt.executeQuery();
            Integer amount = rs.getInt(1);
            System.out.println("User weather topic count successfully retrieved!");
            return amount;
            
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
    
    public static void upateTopicWeatherCount(Integer newVocabCount, String language) throws Exception {
        if (ApplicationInfo.getUser() == null) {
            return;
        }
        
        Connection con = null;
        PreparedStatement psmt = null;
        String userEmail = ApplicationInfo.getUser().userEmail;
        String query ="UPDATE client_Statistics_"+language
                + " SET client_statistics_topic_weather= ?"
                + " WHERE client_email= ?;";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Updating user weather topic count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setInt(1, newVocabCount);
            psmt.setString(2, userEmail);
            
            // execute preparedStatement UPDATE
            psmt.executeUpdate();
            con.commit();
            System.out.println("User weather topic count updated successfully!");
            
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
    
    public static int getTopicWorkCount(String email, String language) throws Exception {        
        Connection con = null;
        PreparedStatement psmt = null;
        String query = "SELECT client_statistics_topic_work FROM client_Statistics_"+language
                + " WHERE client_email=?";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Retrieving user work topic count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setString(1, email);
            
            // execute preparedStatement UPDATE
            ResultSet rs = psmt.executeQuery();
            Integer amount = rs.getInt(1);
            System.out.println("User work topic count successfully retrieved!");
            return amount;
            
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
    
    public static void upateTopicWorkCount(Integer newVocabCount, String language) throws Exception {
        if (ApplicationInfo.getUser() == null) {
            return;
        }
        
        Connection con = null;
        PreparedStatement psmt = null;
        String userEmail = ApplicationInfo.getUser().userEmail;
        String query ="UPDATE client_Statistics_"+language
                + " SET client_statistics_topic_work= ?"
                + " WHERE client_email= ?;";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Updating user work topic count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setInt(1, newVocabCount);
            psmt.setString(2, userEmail);
            
            // execute preparedStatement UPDATE
            psmt.executeUpdate();
            con.commit();
            System.out.println("User work topic count updated successfully!");
            
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
    
    public static String getUserLastRolePlay(String email, String language) throws Exception {        
        Connection con = null;
        PreparedStatement psmt = null;
        String query = "SELECT client_statistics_last_roleplay FROM client_Statistics_"+language
                + " WHERE client_email=?";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Retrieving user last role play...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setString(1, email);
            
            // execute preparedStatement UPDATE
            ResultSet rs = psmt.executeQuery();
            String lastRolePlay = rs.getString(1);
            System.out.println("User last role play successfully retrieved!");
            return lastRolePlay;
            
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
    
    public static void setUserLastRolePlay(String language) throws Exception {
        if (ApplicationInfo.getUser() == null) {
            return;
        }
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter  df = DateTimeFormatter.ofPattern("dd/MM/YYYY hh:mm:ss:SSS");
        String time = dateTime.format(df);
        String rolePlayStamp = time+" "+RolePlayManager.getRolePlaySettings().getTopicType();
        
        Connection con = null;
        PreparedStatement psmt = null;
        String userEmail = ApplicationInfo.getUser().userEmail;
        String query ="UPDATE client_Statistics_"+language
                + " SET client_statistics_last_roleplay= ?"
                + " WHERE client_email= ?;";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Updating user last role play...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setString(1, rolePlayStamp);
            psmt.setString(2, userEmail);
            
            // execute preparedStatement UPDATE
            psmt.executeUpdate();
            con.commit();
            System.out.println("User last role play updated successfully!");
            
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
   
    public static int getRolePlayCompleteA1(String email, String language) throws Exception {        
        Connection con = null;
        PreparedStatement psmt = null;
        String query = "SELECT client_statistics_language_roleplay_complete_a1 FROM client_Statistics_"+language
                + " WHERE client_email=?";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Retrieving user role play complete A1...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setString(1, email);
            
            // execute preparedStatement UPDATE
            ResultSet rs = psmt.executeQuery();
            int lastRolePlay = rs.getInt(1);
            System.out.println("User role play complete A1 successfully retrieved!");
            return lastRolePlay;
            
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
    
    public static void SetRolePlayCompleteA1(int newCount, String language) throws Exception {
        if (ApplicationInfo.getUser() == null) {
            return;
        }
        
        Connection con = null;
        PreparedStatement psmt = null;
        String userEmail = ApplicationInfo.getUser().userEmail;
        String query ="UPDATE client_Statistics_"+language
                + " SET client_statistics_language_roleplay_complete_a1= ?"
                + " WHERE client_email= ?;";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Updating user role play complete A1...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setInt(1, newCount);
            psmt.setString(2, userEmail);
            
            // execute preparedStatement UPDATE
            psmt.executeUpdate();
            con.commit();
            System.out.println("User role play complete A1 updated successfully!");
            
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
    
    public static int getRolePlayCompleteA2(String email, String language) throws Exception {        
        Connection con = null;
        PreparedStatement psmt = null;
        String query = "SELECT client_statistics_language_roleplay_complete_a2 FROM client_Statistics_"+language
                + " WHERE client_email=?";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Retrieving user role play complete A2...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setString(1, email);
            
            // execute preparedStatement UPDATE
            ResultSet rs = psmt.executeQuery();
            int lastRolePlay = rs.getInt(1);
            System.out.println("User role play complete A2 successfully retrieved!");
            return lastRolePlay;
            
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
    
    public static void SetRolePlayCompleteA2(int newCount, String language) throws Exception {
        if (ApplicationInfo.getUser() == null) {
            return;
        }
        
        Connection con = null;
        PreparedStatement psmt = null;
        String userEmail = ApplicationInfo.getUser().userEmail;
        String query ="UPDATE client_Statistics_"+language
                + " SET client_statistics_language_roleplay_complete_a2= ?"
                + " WHERE client_email= ?;";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Updating user role play complete A2...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setInt(1, newCount);
            psmt.setString(2, userEmail);
            
            // execute preparedStatement UPDATE
            psmt.executeUpdate();
            con.commit();
            System.out.println("User role play complete A2 updated successfully!");
            
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
    
    public static int getRolePlayCompleteB1(String email, String language) throws Exception {        
        Connection con = null;
        PreparedStatement psmt = null;
        String query = "SELECT client_statistics_language_roleplay_complete_b1 FROM client_Statistics_"+language
                + " WHERE client_email=?";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Retrieving user role play complete B1...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setString(1, email);
            
            // execute preparedStatement UPDATE
            ResultSet rs = psmt.executeQuery();
            int lastRolePlay = rs.getInt(1);
            System.out.println("User role play complete B1 successfully retrieved!");
            return lastRolePlay;
            
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
    
    public static void SetRolePlayCompleteB1(int newCount, String language) throws Exception {
        if (ApplicationInfo.getUser() == null) {
            return;
        }
        
        Connection con = null;
        PreparedStatement psmt = null;
        String userEmail = ApplicationInfo.getUser().userEmail;
        String query ="UPDATE client_Statistics_"+language
                + " SET client_statistics_language_roleplay_complete_b1= ?"
                + " WHERE client_email= ?;";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Updating user role play complete B1...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setInt(1, newCount);
            psmt.setString(2, userEmail);
            
            // execute preparedStatement UPDATE
            psmt.executeUpdate();
            con.commit();
            System.out.println("User role play complete B1 updated successfully!");
            
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
    
    public static int getRolePlayCompleteB2(String email, String language) throws Exception {        
        Connection con = null;
        PreparedStatement psmt = null;
        String query = "SELECT client_statistics_language_roleplay_complete_b2 FROM client_Statistics_"+language
                + " WHERE client_email=?";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Retrieving user role play complete B2...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setString(1, email);
            
            // execute preparedStatement UPDATE
            ResultSet rs = psmt.executeQuery();
            int lastRolePlay = rs.getInt(1);
            System.out.println("User role play complete B2 successfully retrieved!");
            return lastRolePlay;
            
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
    
    public static void SetRolePlayCompleteB2(int newCount, String language) throws Exception {
        if (ApplicationInfo.getUser() == null) {
            return;
        }
        
        Connection con = null;
        PreparedStatement psmt = null;
        String userEmail = ApplicationInfo.getUser().userEmail;
        String query ="UPDATE client_Statistics_"+language
                + " SET client_statistics_language_roleplay_complete_b2= ?"
                + " WHERE client_email= ?;";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Updating user role play complete B2...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setInt(1, newCount);
            psmt.setString(2, userEmail);
            
            // execute preparedStatement UPDATE
            psmt.executeUpdate();
            con.commit();
            System.out.println("User role play complete B2 updated successfully!");
            
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
    
    public static int getRolePlayStudent(String email, String language) throws Exception {        
        Connection con = null;
        PreparedStatement psmt = null;
        String query = "SELECT client_statistics_language_roleplay_person_a FROM client_Statistics_"+language
                + " WHERE client_email=?";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Retrieving user role play student count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setString(1, email);
            
            // execute preparedStatement UPDATE
            ResultSet rs = psmt.executeQuery();
            int lastRolePlay = rs.getInt(1);
            System.out.println("User role play student count successfully retrieved!");
            return lastRolePlay;
            
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
    
    public static void setRolePlayStudent(int newCount, String language) throws Exception {
        if (ApplicationInfo.getUser() == null) {
            return;
        }
        
        Connection con = null;
        PreparedStatement psmt = null;
        String userEmail = ApplicationInfo.getUser().userEmail;
        String query ="UPDATE client_Statistics_"+language
                + " SET client_statistics_language_roleplay_person_a= ?"
                + " WHERE client_email= ?;";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Updating user role play student count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setInt(1, newCount);
            psmt.setString(2, userEmail);
            
            // execute preparedStatement UPDATE
            psmt.executeUpdate();
            con.commit();
            System.out.println("User role play student count updated successfully!");
            
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
    
    public static int getRolePlayTeacher(String email, String language) throws Exception {        
        Connection con = null;
        PreparedStatement psmt = null;
        String query = "SELECT client_statistics_language_roleplay_person_b FROM client_Statistics_"+language
                + " WHERE client_email=?";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Retrieving user role play teacher count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setString(1, email);
            
            // execute preparedStatement UPDATE
            ResultSet rs = psmt.executeQuery();
            int lastRolePlay = rs.getInt(1);
            System.out.println("User role play teacher count successfully retrieved!");
            return lastRolePlay;
            
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
    
    public static void setRolePlayTeacher(int newCount, String language) throws Exception {
        if (ApplicationInfo.getUser() == null) {
            return;
        }
        
        Connection con = null;
        PreparedStatement psmt = null;
        String userEmail = ApplicationInfo.getUser().userEmail;
        String query ="UPDATE client_Statistics_"+language
                + " SET client_statistics_language_roleplay_person_b= ?"
                + " WHERE client_email= ?;";
        try {
            con = ConnectDB.getConnection();
            System.out.println("Updating user role play teacher count...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setInt(1, newCount);
            psmt.setString(2, userEmail);
            
            // execute preparedStatement UPDATE
            psmt.executeUpdate();
            con.commit();
            System.out.println("User role play teacher count updated successfully!");
            
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
    
    public static void upateProgress(String table, String column) throws Exception {
        if (ApplicationInfo.getUser() == null) {
            return;
        }
        int newValue = 1;
        String userEmail = ApplicationInfo.getUser().userEmail;
        
        Connection con = null;
        PreparedStatement psmt = null;
        String query ="UPDATE "+table
                + " SET "+column+"= ?"
                + " WHERE client_email= ?;";
        System.out.println(query);
        try {
            con = ConnectDB.getConnection();
            System.out.println("Updating user progress count in table: " +table+ ", key: " +column+ "...");

            // set all parameters
            psmt = con.prepareStatement(query);
            psmt.setInt(1, newValue);
            psmt.setString(2, userEmail);
            
            // execute preparedStatement UPDATE
            psmt.executeUpdate();
            con.commit();
            System.out.println("User progress count in table: " +table+ ", key: " +column+ " updated successfully!");
            
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
    
    public static boolean checkIfTableExists(String tableName) throws Exception {
        Connection con = null;
        try {
            System.out.println("Checking if table exists...");
            con = ConnectDB.getConnection();
            DatabaseMetaData metaData = con.getMetaData();
            ResultSet res = metaData.getTables(null, null, tableName, null);
            if (res.next()) {
              // table exists
              System.out.println("Table exists!");
              return true;
            }
            else {
              // table doesn't exist
              System.out.println("Table doesn't exists!");
              return false;
            }
        }
        catch (SQLException ex) {
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
            }
            catch (SQLException ex) {
                // display error message
                JOptionPane.showMessageDialog(null, "Error!\n"+ex);
                throw new Exception();
            }
        }
    }
    
}
