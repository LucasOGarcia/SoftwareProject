/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
                + "     client_statistics_last_roleplay VARCHAR(254),"
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
                + "     client_Statistics_Spanish (client_email, client_statistics_language_roleplay_complete_a1, client_statistics_language_roleplay_complete_a2,"
                + "     client_statistics_language_roleplay_complete_b1, client_statistics_language_roleplay_complete_b2, client_statistics_language_roleplay_person_a,"
                + "     client_statistics_language_roleplay_person_b, client_statistics_language_vocab_assist, client_statistics_topic_directions,"
                + "     client_statistics_topic_employment, client_statistics_topic_cultural_experiences, client_statistics_topic_personal_info,"
                + "     client_statistics_topic_shopping,  client_statistics_topic_health, client_statistics_topic_housing, client_statistics_topic_introductions,"
                + "     client_statistics_topic_appointments, client_statistics_topic_invitations, client_statistics_topic_travel, client_statistics_topic_food_drink,"
                + "     client_statistics_topic_socialising, client_statistics_topic_university, client_statistics_topic_weather, client_statistics_topic_work) "
                + "     VALUES"
                + "     ('w1783737@my.westminster.ac.uk', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 );";
        String query3 = "INSERT INTO "
                + "     client_Statistics_French (client_email, client_statistics_language_roleplay_complete_a1, client_statistics_language_roleplay_complete_a2,"
                + "     client_statistics_language_roleplay_complete_b1, client_statistics_language_roleplay_complete_b2, client_statistics_language_roleplay_person_a,"
                + "     client_statistics_language_roleplay_person_b, client_statistics_language_vocab_assist, client_statistics_topic_directions,"
                + "     client_statistics_topic_employment, client_statistics_topic_cultural_experiences, client_statistics_topic_personal_info,"
                + "     client_statistics_topic_shopping,  client_statistics_topic_health, client_statistics_topic_housing, client_statistics_topic_introductions,"
                + "     client_statistics_topic_appointments, client_statistics_topic_invitations, client_statistics_topic_travel, client_statistics_topic_food_drink,"
                + "     client_statistics_topic_socialising, client_statistics_topic_university, client_statistics_topic_weather, client_statistics_topic_work) "
                + "     VALUES"
                + "     ('w1783737@my.westminster.ac.uk', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 );";
        String query4 = "INSERT INTO "
                + "     client_Statistics_Portuguese (client_email, client_statistics_language_roleplay_complete_a1, client_statistics_language_roleplay_complete_a2,"
                + "     client_statistics_language_roleplay_complete_b1, client_statistics_language_roleplay_complete_b2, client_statistics_language_roleplay_person_a,"
                + "     client_statistics_language_roleplay_person_b, client_statistics_language_vocab_assist, client_statistics_topic_directions,"
                + "     client_statistics_topic_employment, client_statistics_topic_cultural_experiences, client_statistics_topic_personal_info,"
                + "     client_statistics_topic_shopping,  client_statistics_topic_health, client_statistics_topic_housing, client_statistics_topic_introductions,"
                + "     client_statistics_topic_appointments, client_statistics_topic_invitations, client_statistics_topic_travel, client_statistics_topic_food_drink,"
                + "     client_statistics_topic_socialising, client_statistics_topic_university, client_statistics_topic_weather, client_statistics_topic_work) "
                + "     VALUES"
                + "     ('w1783737@my.westminster.ac.uk', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 );";
        String query5 = "INSERT INTO "
                + "     client_Statistics_German (client_email, client_statistics_language_roleplay_complete_a1, client_statistics_language_roleplay_complete_a2,"
                + "     client_statistics_language_roleplay_complete_b1, client_statistics_language_roleplay_complete_b2, client_statistics_language_roleplay_person_a,"
                + "     client_statistics_language_roleplay_person_b, client_statistics_language_vocab_assist, client_statistics_topic_directions,"
                + "     client_statistics_topic_employment, client_statistics_topic_cultural_experiences, client_statistics_topic_personal_info,"
                + "     client_statistics_topic_shopping,  client_statistics_topic_health, client_statistics_topic_housing, client_statistics_topic_introductions,"
                + "     client_statistics_topic_appointments, client_statistics_topic_invitations, client_statistics_topic_travel, client_statistics_topic_food_drink,"
                + "     client_statistics_topic_socialising, client_statistics_topic_university, client_statistics_topic_weather, client_statistics_topic_work) "
                + "     VALUES"
                + "     ('w1783737@my.westminster.ac.uk', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 );";
        String query6 = "INSERT INTO "
                + "     client_Statistics_Italian (client_email, client_statistics_language_roleplay_complete_a1, client_statistics_language_roleplay_complete_a2,"
                + "     client_statistics_language_roleplay_complete_b1, client_statistics_language_roleplay_complete_b2, client_statistics_language_roleplay_person_a,"
                + "     client_statistics_language_roleplay_person_b, client_statistics_language_vocab_assist, client_statistics_topic_directions,"
                + "     client_statistics_topic_employment, client_statistics_topic_cultural_experiences, client_statistics_topic_personal_info,"
                + "     client_statistics_topic_shopping,  client_statistics_topic_health, client_statistics_topic_housing, client_statistics_topic_introductions,"
                + "     client_statistics_topic_appointments, client_statistics_topic_invitations, client_statistics_topic_travel, client_statistics_topic_food_drink,"
                + "     client_statistics_topic_socialising, client_statistics_topic_university, client_statistics_topic_weather, client_statistics_topic_work) "
                + "     VALUES"
                + "     ('w1783737@my.westminster.ac.uk', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 );";
        String query7 = "INSERT INTO "
                + "     client_Statistics_Greek (client_email, client_statistics_language_roleplay_complete_a1, client_statistics_language_roleplay_complete_a2,"
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
            stmt.executeUpdate(query3);
            stmt.executeUpdate(query4);
            stmt.executeUpdate(query5);
            stmt.executeUpdate(query6);
            stmt.executeUpdate(query7);
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
