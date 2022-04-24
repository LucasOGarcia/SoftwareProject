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
                + "     ('w1783737@my.westminster.ac.uk',"
                + "     'Lucas',"
                + "     'Garcia',"
                + "     'SjYuSVdMX81KlhzAZieWwjCwPIFxG#P@Y!G#33j7MTKnNo7&RB08gX0LLRi8dic6VrZsKk^81yIGts@4j^B4oAn0H&ZS2bbYRKpG#cAw@mkg#Yc6Fbx#WZ!rIkMb8CiQ8Tc6#5D3Of&*b0tFsd^!iI#tUYo9VHBWwN�GXRmqQx#tm7QuakcBPi4lTj7K84k6#a�XLy4rPfzw0#bGSnyiPY5MMtbDJTdLaD@3b4db19siLQh@R2#LE*GeBW63sL',"
                + "     'Aqpgwmk9r8t2/+4DkUEE1tK8wUaV/RCJ+Q==',"
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
