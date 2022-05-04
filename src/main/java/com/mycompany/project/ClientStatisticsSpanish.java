/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author Gabriel
 */
public class ClientStatisticsSpanish {
        private String client_email, client_statistics_last_roleplay;
        private int client_statistics_language_roleplay_complete_a1,client_statistics_language_roleplay_complete_a2,client_statistics_language_roleplay_complete_b1, client_statistics_language_roleplay_complete_b2,
client_statistics_language_roleplay_person_a,
client_statistics_language_roleplay_person_b,
client_statistics_language_vocab_assist,
client_statistics_topic_directions,
client_statistics_topic_employment,
client_statistics_topic_cultural_experiences,
client_statistics_topic_personal_info,
client_statistics_topic_shopping,
client_statistics_topic_health,
client_statistics_topic_housing,
client_statistics_topic_introductions,
client_statistics_topic_appointments,
client_statistics_topic_invitations,
client_statistics_topic_travel,
client_statistics_topic_food_drink,
client_statistics_topic_socialising,
client_statistics_topic_university,
client_statistics_topic_weather,
client_statistics_topic_work;
    
    public ClientStatisticsSpanish(String client_email, int client_statistics_language_roleplay_complete_a1, int client_statistics_language_roleplay_complete_a2, int client_statistics_language_roleplay_complete_b1,
            int client_statistics_language_roleplay_complete_b2,int client_statistics_language_roleplay_person_a,int client_statistics_language_roleplay_person_b,int client_statistics_language_vocab_assist,
            int client_statistics_topic_directions,int client_statistics_topic_employment,int client_statistics_topic_cultural_experiences,int client_statistics_topic_personal_info,int client_statistics_topic_shopping,
            int client_statistics_topic_health,int client_statistics_topic_housing,int client_statistics_topic_introductions,int client_statistics_topic_appointments,int client_statistics_topic_invitations,
            int client_statistics_topic_travel,int client_statistics_topic_food_drink,int client_statistics_topic_socialising,int client_statistics_topic_university,int client_statistics_topic_weather,int client_statistics_topic_work,
            String client_statistics_last_roleplay){
        
        this.client_email = client_email;
        this.client_statistics_language_roleplay_complete_a1 = client_statistics_language_roleplay_complete_a1;
        this.client_statistics_language_roleplay_complete_a2 = client_statistics_language_roleplay_complete_a2;
        this.client_statistics_language_roleplay_complete_b1 = client_statistics_language_roleplay_complete_b1;
        this.client_statistics_language_roleplay_complete_b2 = client_statistics_language_roleplay_complete_b2;
        this.client_statistics_language_roleplay_person_a = client_statistics_language_roleplay_person_a;
        this.client_statistics_language_roleplay_person_b = client_statistics_language_roleplay_person_b;
        this.client_statistics_language_vocab_assist = client_statistics_language_vocab_assist;
        this.client_statistics_topic_directions = client_statistics_topic_directions;
        this.client_statistics_topic_employment = client_statistics_topic_employment;
        this.client_statistics_topic_cultural_experiences = client_statistics_topic_cultural_experiences;
        this.client_statistics_topic_personal_info = client_statistics_topic_personal_info;
        this.client_statistics_topic_shopping = client_statistics_topic_shopping;
        this.client_statistics_topic_health = client_statistics_topic_health;
        this.client_statistics_topic_housing = client_statistics_topic_housing;
        this.client_statistics_topic_introductions = client_statistics_topic_introductions;
        this.client_statistics_topic_appointments = client_statistics_topic_appointments;
        this.client_statistics_topic_invitations = client_statistics_topic_invitations;
        this.client_statistics_topic_travel = client_statistics_topic_travel;
        this.client_statistics_topic_food_drink = client_statistics_topic_food_drink;
        this.client_statistics_topic_socialising = client_statistics_topic_socialising;
        this.client_statistics_topic_university = client_statistics_topic_university;
        this.client_statistics_topic_weather = client_statistics_topic_weather;
        this.client_statistics_topic_work = client_statistics_topic_work;
        this. client_statistics_last_roleplay = client_statistics_last_roleplay;
    }
    
    public String getemail(){
        return client_email;
    }
    public int geta1(){
        return client_statistics_language_roleplay_complete_a1;
    }
    public  int geta2(){
        return client_statistics_language_roleplay_complete_a2;
    }
    public int getb1(){
        return client_statistics_language_roleplay_complete_b1;
    }
    public int getb2(){
        return client_statistics_language_roleplay_complete_b2;
    }
    public int getpersona(){
        return client_statistics_language_roleplay_person_a;
    }
    public int getpersonb(){
        return client_statistics_language_roleplay_person_b;
    }
    public int getassist(){
        return client_statistics_language_vocab_assist;
    }
    public int getdirections(){
        return client_statistics_topic_directions;
    }
    public int getemployment(){
        return client_statistics_topic_employment;
    }
    public int getcultural(){
        return client_statistics_topic_cultural_experiences;
    }  
    public int getinfo(){
        return client_statistics_topic_personal_info;
    }
    public int getshopping(){
        return client_statistics_topic_shopping;
    }
    public int gethealth(){
        return client_statistics_topic_health;
    }
    public int gethousing(){
        return client_statistics_topic_housing;
    }
    public int getintroductions(){
        return client_statistics_topic_introductions;
    }
    public int getappointments(){
        return client_statistics_topic_appointments;
    }
    public int getinvitations(){
        return client_statistics_topic_invitations;
    }
    public int gettravel(){
        return client_statistics_topic_travel;
    }
    public int getfooddrink(){
        return client_statistics_topic_food_drink;
    }
    public int getsocialise(){
        return client_statistics_topic_socialising;
    }
    public int getuniversity(){
        return client_statistics_topic_university;
    }
    public int getweather(){
        return client_statistics_topic_weather;
    }
    public int getwork(){
        return client_statistics_topic_work;
    }
    public String getlastroleplay(){
        return client_statistics_last_roleplay;
    }
    
}
