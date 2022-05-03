/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class CreateTable {
    
    public static void initialise(){
        createClientInfoTable();
        List<String> languages = new ArrayList();
        String spanish = "Spanish";
        String french = "French";
        String portuguese = "Portuguese";
        String german = "German";
        String italian = "Italian";
        String greek = "Greek";
        languages.add(spanish);
        languages.add(french);
        languages.add(portuguese);
        languages.add(german);
        languages.add(italian);
        languages.add(greek);
        for (int i = 0; i < languages.size(); i++) {
            createClientStatisticsTable(languages.get(i));
        }
        createSpanishProgressTable();
        
        createTestStudent();
        createTestTeacher();
        createTestAdmin();
    }
   
    public static void createClientInfoTable() {
        Connection con = ConnectDB.getConnection();
        System.out.println("creating client_Info table...");
        Statement stmt = null;
        String query;
        query = "Create TABLE if not exists client_Info \n("
                + "     client_email VARCHAR(254) not null PRIMARY KEY,"
                + "     client_forename VARCHAR(32) not null,"
                + "     client_surname VARCHAR(32) not null,"
                + "     client_salt VARCHAR(254) not null,"
                + "     client_encrypted_password VARCHAR(50) not null,"
                + "     client_last_login TIMESTAMP,"
                + "     client_last_logout TIMESTAMP,"
                + "     client_account_type INTEGER not null\n" + ");";
        try {
            stmt = con.createStatement();
            stmt.executeUpdate(query);
            con.commit();
            System.out.println("Client_Info table created");
        }
         catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
        }
        finally {
            if (stmt != null) {
                try {
                    stmt.close();
                }
                catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
                }
            }
            if (con != null) {
                try {
                    con.close();
                }
                catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
                }
            }
        }
    }
    
    public static void createClientStatisticsTable(String language) {
        Connection con = ConnectDB.getConnection();
        System.out.println("creating client_Statistics_"+language+"...");
        Statement stmt = null;
        String query;
        query = "Create TABLE if not exists client_Statistics_"+language+"("
                + "     client_email VARCHAR(254) not null,"
                + "     client_statistics_language_roleplay_complete_a1 INTEGER not null,"
                + "     client_statistics_language_roleplay_complete_a2 INTEGER not null,"
                + "     client_statistics_language_roleplay_complete_b1 INTEGER not null,"
                + "     client_statistics_language_roleplay_complete_b2 INTEGER not null,"
                + "     client_statistics_language_roleplay_person_a INTEGER not null,"
                + "     client_statistics_language_roleplay_person_b INTEGER not null,"
                + "     client_statistics_language_vocab_assist INTEGER not null,"
                + "     client_statistics_topic_directions INTEGER not null,"
                + "     client_statistics_topic_employment INTEGER not null,"
                + "     client_statistics_topic_cultural_experiences INTEGER not null,"
                + "     client_statistics_topic_personal_info INTEGER not null,"
                + "     client_statistics_topic_shopping INTEGER not null,"
                + "     client_statistics_topic_health INTEGER not null,"
                + "     client_statistics_topic_housing INTEGER not null,"
                + "     client_statistics_topic_introductions INTEGER not null,"
                + "     client_statistics_topic_appointments INTEGER not null,"
                + "     client_statistics_topic_invitations INTEGER not null,"
                + "     client_statistics_topic_travel INTEGER not null,"
                + "     client_statistics_topic_food_drink INTEGER not null,"
                + "     client_statistics_topic_socialising INTEGER not null,"
                + "     client_statistics_topic_university INTEGER not null,"
                + "     client_statistics_topic_weather INTEGER not null,"
                + "     client_statistics_topic_work INTEGER not null,"
                + "     client_statistics_last_roleplay VARCHAR(254),"
                + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";
        try {
            stmt = con.createStatement();
            stmt.executeUpdate(query);
            con.commit();
            System.out.println("client_Statistics_"+language+" table created");
        }
        catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
        }
        finally {
            if (stmt != null) {
                try {
                    stmt.close();
                }
                catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
                }
            }
            if (con != null) {
                try {
                    con.close();
                }
                catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
                }
            }
        }
    }
    
    public static void createSpanishProgressTable() {
        Connection con = ConnectDB.getConnection();
        System.out.println("creating client_Info table...");
        Statement stmt = null;
        String query1 = "Create TABLE if not exists progress_Spanish_A1_Directions \n("
                + "     client_email VARCHAR(254) not null,"
                + "     client_progress_repeat_name INTEGER not null,"
                + "     client_progress_delivery_driver INTEGER not null,"
                + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";
        
        String query2 = "Create TABLE if not exists progress_Spanish_A2_Directions \n("
                + "     client_email VARCHAR(254) not null,"
                + "     client_progress_delivery_driver INTEGER not null,"
                + "     client_progress_hospital_visit INTEGER not null,"
                + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";
        
        String query3 = "Create TABLE if not exists progress_Spanish_B2_Directions \n("
                + "     client_email VARCHAR(254) not null,"
                + "     client_progress_delivery_driver INTEGER not null,"
                + "     client_progress_hospital_visit INTEGER not null,"
                + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";
        
        String query4 = "Create TABLE if not exists progress_Spanish_A1_Employment \n("
                + "     client_email VARCHAR(254) not null,"
                + "     client_progress_cover INTEGER not null,"
                + "     client_progress_interview INTEGER not null,"
                + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";
        
        String query5 = "Create TABLE if not exists progress_Spanish_A1_Cultural_Experiences \n("
                + "     client_email VARCHAR(254) not null,"
                + "     client_progress_international_food INTEGER not null,"
                + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";
        
        String query6 = "Create TABLE if not exists progress_Spanish_A2_Cultural_Experiences \n("
                + "     client_email VARCHAR(254) not null,"
                + "     client_progress_omelette INTEGER not null,"
                + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";
        
        String query7 = "Create TABLE if not exists progress_Spanish_A1_Personal_Info \n("
                + "     client_email VARCHAR(254) not null,"
                + "     client_progress_social_media INTEGER not null,"
                + "     client_progress_instagram INTEGER not null,"
                + "     client_progress_neighbours_parcel INTEGER not null,"
                + "     client_progress_description_of_town INTEGER not null,"
                + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";
        
        String query8 = "Create TABLE if not exists progress_Spanish_A2_Personal_Info \n("
                + "     client_email VARCHAR(254) not null,"
                + "     client_progress_age_restricted INTEGER not null,"
                + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";
        
        String query9 = "Create TABLE if not exists progress_Spanish_A1_Shopping \n("
                + "     client_email VARCHAR(254) not null,"
                + "     client_progress_payment INTEGER not null,"
                + "     client_progress_refund INTEGER not null,"
                + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";
        
        String query10 = "Create TABLE if not exists progress_Spanish_A2_Shopping \n("
                + "     client_email VARCHAR(254) not null,"
                + "     client_progress_payment INTEGER not null,"
                + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";
        
        String query11 = "Create TABLE if not exists progress_Spanish_B1_Shopping \n("
                + "     client_email VARCHAR(254) not null,"
                + "     client_progress_payment INTEGER not null,"
                + "     client_progress_cancel_hair_appointment INTEGER not null,"
                + "     client_progress_purchase_computer INTEGER not null,"
                + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";
        
        String query12 = "Create TABLE if not exists progress_Spanish_B2_Shopping \n("
                + "     client_email VARCHAR(254) not null,"
                + "     client_progress_phone_purchase INTEGER not null,"
                + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";
        
        String query13 = "Create TABLE if not exists progress_Spanish_A2_Health \n("
                + "     client_email VARCHAR(254) not null,"
                + "     client_progress_sick_relative INTEGER not null,"
                + "     client_progress_visiting_patient INTEGER not null,"
                + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";
        
        String query14 = "Create TABLE if not exists progress_Spanish_B1_Housing \n("
                + "     client_email VARCHAR(254) not null,"
                + "     client_progress_delivery_of_package INTEGER not null,"
                + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";
        
        String query15 = "Create TABLE if not exists progress_Spanish_A2_Introductions \n("
                + "     client_email VARCHAR(254) not null,"
                + "     client_progress_first_day_in_job INTEGER not null,"
                + "     client_progress_job_offer INTEGER not null,"
                + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";
        
        String query16 = "Create TABLE if not exists progress_Spanish_A1_Appointments \n("
                + "     client_email VARCHAR(254) not null,"
                + "     client_progress_booking INTEGER not null,"
                + "     client_progress_spelling_name INTEGER not null,"
                + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";
        
        String query17 = "Create TABLE if not exists progress_Spanish_A2_Appointments \n("
                + "     client_email VARCHAR(254) not null,"
                + "     client_progress_dentist INTEGER not null,"
                + "     client_progress_doctor INTEGER not null,"
                + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";
        
        String query18 = "Create TABLE if not exists progress_Spanish_A1_Invitations \n("
                + "     client_email VARCHAR(254) not null,"
                + "     client_progress_disneyland INTEGER not null,"
                + "     client_progress_help_with_child_party INTEGER not null,"
                + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";
        
        String query19 = "Create TABLE if not exists progress_Spanish_A2_Invitations \n("
                + "     client_email VARCHAR(254) not null,"
                + "     client_progress_charity INTEGER not null,"
                + "     client_progress_lunch INTEGER not null,"
                + "     client_progress_children_at_wedding INTEGER not null,"
                + "     client_progress_wedding_reservation INTEGER not null,"
                + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";
        
        String query20 = "Create TABLE if not exists progress_Spanish_B1_Invitations \n("
                + "     client_email VARCHAR(254) not null,"
                + "     client_progress_offering_help INTEGER not null,"
                + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";
        
        String query21 = "Create TABLE if not exists progress_Spanish_A2_Travel \n("
                + "     client_email VARCHAR(254) not null,"
                + "     client_progress_expired_ticket INTEGER not null,"
                + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";
        
        String query22 = "Create TABLE if not exists progress_Spanish_B1_Travel \n("
                + "     client_email VARCHAR(254) not null,"
                + "     client_progress_eticket INTEGER not null,"
                + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";
        
        String query23 = "Create TABLE if not exists progress_Spanish_B2_Travel \n("
                + "     client_email VARCHAR(254) not null,"
                + "     client_progress_disneyland INTEGER not null,"
                + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";
        
        String query24 = "Create TABLE if not exists progress_Spanish_A1_Food_Drink \n("
                + "     client_email VARCHAR(254) not null,"
                + "     client_progress_takeaway INTEGER not null,"
                + "     client_progress_coffee INTEGER not null,"
                + "     client_progress_water_for_table INTEGER not null,"
                + "     client_progress_reservation INTEGER not null,"
                + "     client_progress_cocktails_by_card INTEGER not null,"
                + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";
        
        String query25 = "Create TABLE if not exists progress_Spanish_A2_Food_Drink \n("
                + "     client_email VARCHAR(254) not null,"
                + "     client_progress_vegan_pizza INTEGER not null,"
                + "     client_progress_reservation INTEGER not null,"
                + "     client_progress_delayed_drinks INTEGER not null,"
                + "     client_progress_qr_code INTEGER not null,"
                + "     client_progress_cocktails INTEGER not null,"
                + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";
        
        String query26 = "Create TABLE if not exists progress_Spanish_B1_Food_Drink \n("
                + "     client_email VARCHAR(254) not null,"
                + "     client_progress_cocktails_by_barcode INTEGER not null,"
                + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";
        
        String query27 = "Create TABLE if not exists progress_Spanish_A1_Socialising \n("
                + "     client_email VARCHAR(254) not null,"
                + "     client_progress_interview INTEGER not null,"
                + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";
        
        String query28 = "Create TABLE if not exists progress_Spanish_A2_Socialising \n("
                + "     client_email VARCHAR(254) not null,"
                + "     client_progress_family_size INTEGER not null,"
                + "     client_progress_succelent INTEGER not null,"
                + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";
        
        String query29 = "Create TABLE if not exists progress_Spanish_B1_Socialising \n("
                + "     client_email VARCHAR(254) not null,"
                + "     client_progress_haircut INTEGER not null,"
                + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";
        
        String query30 = "Create TABLE if not exists progress_Spanish_A1_University \n("
                + "     client_email VARCHAR(254) not null,"
                + "     client_progress_study_in_cafe INTEGER not null,"
                + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";
        
        String query31 = "Create TABLE if not exists progress_Spanish_B1_University \n("
                + "     client_email VARCHAR(254) not null,"
                + "     client_progress_study_plans INTEGER not null,"
                + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";
        
        String query32 = "Create TABLE if not exists progress_Spanish_A2_Weather \n("
                + "     client_email VARCHAR(254) not null,"
                + "     client_progress_cloathing_for_weather INTEGER not null,"
                + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";
        
        String query33 = "Create TABLE if not exists progress_Spanish_B1_Weather \n("
            + "     client_email VARCHAR(254) not null,"
            + "     client_progress_rain_in_station INTEGER not null,"
            + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";

        String query34 = "Create TABLE if not exists progress_Spanish_B1_Work \n("
            + "     client_email VARCHAR(254) not null,"
            + "     client_progress_job_offer INTEGER not null,"
            + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";

        String query35 = "Create TABLE if not exists progress_Spanish_B2_Work \n("
            + "     client_email VARCHAR(254) not null,"
            + "     client_progress_meet_for_drinks INTEGER not null,"
            + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";
        
        String query36 = "Create TABLE if not exists progress_Spanish_B2_Socialising \n("
                + "     client_email VARCHAR(254) not null,"
                + "     client_progress_no_show_date INTEGER not null,"
                + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";
        
        try {
            stmt = con.createStatement();
            stmt.executeUpdate(query1);
            stmt.executeUpdate(query2);
            stmt.executeUpdate(query3);
            stmt.executeUpdate(query4);
            stmt.executeUpdate(query5);
            stmt.executeUpdate(query6);
            stmt.executeUpdate(query7);
            stmt.executeUpdate(query8);
            stmt.executeUpdate(query9);
            stmt.executeUpdate(query10);
            stmt.executeUpdate(query11);
            stmt.executeUpdate(query12);
            stmt.executeUpdate(query13);
            stmt.executeUpdate(query14);
            stmt.executeUpdate(query15);
            stmt.executeUpdate(query16);
            stmt.executeUpdate(query17);
            stmt.executeUpdate(query18);
            stmt.executeUpdate(query19);
            stmt.executeUpdate(query20);
            stmt.executeUpdate(query21);
            stmt.executeUpdate(query22);
            stmt.executeUpdate(query23);
            stmt.executeUpdate(query24);
            stmt.executeUpdate(query25);
            stmt.executeUpdate(query26);
            stmt.executeUpdate(query27);
            stmt.executeUpdate(query28);
            stmt.executeUpdate(query29);
            stmt.executeUpdate(query30);
            stmt.executeUpdate(query31);
            stmt.executeUpdate(query32);
            stmt.executeUpdate(query33);
            stmt.executeUpdate(query34);
            stmt.executeUpdate(query35);
            stmt.executeUpdate(query36);
            
            con.commit();
            System.out.println("progress_Spanish* table created");
        }
         catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
        }
        finally {
            if (stmt != null) {
                try {
                    stmt.close();
                }
                catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
                }
            }
            if (con != null) {
                try {
                    con.close();
                }
                catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage());
                }
            }
        }
    }
    
    public static void createTestStudent() {
        System.out.println("resgisterating student \n--------------------------");
        String client_email = "student@my.westminster.ac.uk";
        String client_forename = "Student";
        String client_surname = "Test";
        String client_password = "Test12345@";
        String client_salt = null;
        String client_encrypted_password = null;
        int client_account_type = 0;
                
        //generate password
        int saltLength = 254;
        client_salt = PasswordManager.generateSalt(saltLength);
        client_encrypted_password = PasswordManager.generateSecurePassword(client_password, client_salt);
        
        //register account
        registerUser(client_email, client_forename, client_surname, client_salt, client_encrypted_password, client_account_type);
    }
    
    public static void createTestTeacher() {
        System.out.println("resgisterating teacher \n--------------------------");
        String client_email = "teacher@my.westminster.ac.uk";
        String client_forename = "Teacher";
        String client_surname = "Test";
        String client_password = "Test12345@";
        String client_salt = null;
        String client_encrypted_password = null;
        int client_account_type = 2;
                
        //generate password
        int saltLength = 254;
        client_salt = PasswordManager.generateSalt(saltLength);
        client_encrypted_password = PasswordManager.generateSecurePassword(client_password, client_salt);
        
        //register account
        registerUser(client_email, client_forename, client_surname, client_salt, client_encrypted_password, client_account_type);
    }
    
    public static void createTestAdmin() {
        System.out.println("resgisterating admin \n--------------------------");
        String client_email = "admin@my.westminster.ac.uk";
        String client_forename = "Admin";
        String client_surname = "Test";
        String client_password = "Test12345@";
        String client_salt = null;
        String client_encrypted_password = null;
        int client_account_type = 1;
                
        //generate password
        int saltLength = 254;
        client_salt = PasswordManager.generateSalt(saltLength);
        client_encrypted_password = PasswordManager.generateSecurePassword(client_password, client_salt);
        
        //register account
        registerUser(client_email, client_forename, client_surname, client_salt, client_encrypted_password, client_account_type);
    }
    
    public static void registerUser(String email, String firstName, String lastName, String salt, String password, int accountType) {
        List<String> languages = new ArrayList();
        String spanish = "Spanish";
        String french = "French";
        String portuguese = "Portuguese";
        String german = "German";
        String italian = "Italian";
        String greek = "Greek";
        languages.add(spanish);
        languages.add(french);
        languages.add(portuguese);
        languages.add(german);
        languages.add(italian);
        languages.add(greek);
        try {
            registerUserClientInfo(email, firstName, lastName, salt, password, accountType);
            for (int i = 0; i < languages.size(); i++) {
                registerUserClienStatistics(email, languages.get(i));
            }
            registerUserSpanishProgress(email);
        } catch (Exception ex) {
            Logger.getLogger(RegistrationPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
// Registers user to the client_Info table in the database
    public static void registerUserClientInfo(String email, String firstName, String lastName, String salt, String password, int accountType) throws Exception{
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
}
