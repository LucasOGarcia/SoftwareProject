/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class CreateTable {
   
    public static void createTables() {
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
        con = ConnectDB.getConnection();
        stmt = null;
        System.out.println("Creating client_Statistics table...");
        String query2 = null;
        query2 = "Create TABLE if not exists client_Statistics \n("
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
                + "     FOREIGN KEY (client_email) references client_Info(client_email)\n" + ");";
        try {
            stmt = con.createStatement();
            stmt.executeUpdate(query2);
            con.commit();
            System.out.println("Client_Statistics table created");
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
    
    public static void createTestAdmin() {
        Connection con = ConnectDB.getConnection();
        System.out.println("creating admin user...");
        Statement stmt = null;
        String query;
        query = "INSERT INTO "
                + "     client_Info(client_email, client_forename, client_surname, client_salt, client_encrypted_password, client_account_type)"
                + "     VALUES"
                + "     ('test@my.westminster.ac.uk',"
                + "     'Test',"
                + "     'Account',"
                + "     'z&cU2eA7nYf�E&6GQLvA6jfUSx�SWdy7ojr@mSpOivicTAqBfR!OZUUMT^efck6sZl!9bnve&jJ�7vLcJ8Di#QS!RBrLCN3wd5gWRjQt*�sHQBpyrK*LqkPC29Jpk3FF*Emgava4klU^0aR0e!dPfXoinha!n7bqLX&9jChQLTZp4vZpQy@w4@Ot#R37lc4@ufJY^8q#dLe12EoEz4Zgbz0eM65PRwiO1id^7B7tM9k6MvyGM3i!s2FYVGQ#aL',"
                + "     '6/4l9GiJx+5lgIe8ep9pCyD645jJdPvt7g==',"
                + "     1" + ");";
        String query2;
        query2 = "INSERT INTO "
                + "     client_Statistics (client_email, client_statistics_language_roleplay_complete_a1, client_statistics_language_roleplay_complete_a2,"
                + "     client_statistics_language_roleplay_complete_b1, client_statistics_language_roleplay_complete_b2, client_statistics_language_roleplay_person_a,"
                + "     client_statistics_language_roleplay_person_b, client_statistics_language_vocab_assist, client_statistics_topic_directions,"
                + "     client_statistics_topic_employment, client_statistics_topic_cultural_experiences, client_statistics_topic_personal_info,"
                + "     client_statistics_topic_shopping,  client_statistics_topic_health, client_statistics_topic_housing, client_statistics_topic_introductions,"
                + "     client_statistics_topic_appointments, client_statistics_topic_invitations, client_statistics_topic_travel, client_statistics_topic_food_drink,"
                + "     client_statistics_topic_socialising, client_statistics_topic_university, client_statistics_topic_weather, client_statistics_topic_work) "
                + "     VALUES"
                + "     ('w1783737@my.westminster.ac.uk', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 );";
        try {
            stmt = con.createStatement();
            stmt.executeUpdate(query);
            stmt.executeUpdate(query2);
            con.commit();
            System.out.println("Admin user created");
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
}
