package com.mycompany.project;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lucas
 */
public class RolePlayManager {
    private static RolePlaySettings rolePlaySettings;
    private static List<RolePlayTopic> topicsA1;
    private static List<RolePlayTopic> topicsA2;
    private static List<RolePlayTopic> topicsB1;
    private static List<RolePlayTopic> topicsB2;
    // languages
    private static String languageSpanish;
    // difficulties
    private static String difficultyA1;
    private static String difficultyA2;
    private static String difficultyB1;
    private static String difficultyB2;
    // topics
    private static String directions;
    private static String employment;
    private static String culturalExperiences;
    private static String personalInfo;
    private static String shopping;
    private static String health;
    private static String housing;
    private static String introductions;
    private static String appointments;
    private static String invitations;
    private static String travel;
    private static String foodAndDrink;
    private static String socialising;
    private static String university;
    private static String weather;
    private static String work;
    
    public static void setRolePlaySettings(RolePlaySettings newSettings){
        RolePlayManager.rolePlaySettings = newSettings;
    }
    
    public static RolePlaySettings getRolePlaySettings() {
        return RolePlayManager.rolePlaySettings;
    }
    
    public static void initialise() {
        rolePlaySettings = new RolePlaySettings();
        topicsA1 = new ArrayList<>();
        topicsA2 = new ArrayList<>();
        topicsB1 = new ArrayList<>();
        topicsB2 = new ArrayList<>();
        difficultyA1 = "A1";
        difficultyA2 = "A2";
        difficultyB1 = "B1";
        difficultyB2 = "B2";
        languageSpanish = "Spanish";
        directions = "Asking and giving directions";
        employment = "Basic employment issues";
        culturalExperiences = "Cross-cultural experiences";
        personalInfo = "Exchanging personal information";
        shopping = "Going shopping and asking for prices";
        health = "Health";
        housing = "Housing conditions";
        introductions = "Introductions";
        appointments = "Making Appointments";
        invitations = "Making invitations";
        travel = "Making travel arrangements";
        foodAndDrink = "Ordering food and drink";
        socialising = "Socialising";
        university = "University life";
        weather = "Weather";
        work = "Work life";
    }
    
    public static void createTopics() {
        RolePlayTopic A1Exercise1 = new RolePlayTopic();
        // basic role play info
        A1Exercise1.difficulty = difficultyA1;
        A1Exercise1.language = languageSpanish;
        A1Exercise1.topicType = directions;
        A1Exercise1.subTopicType = "Delivery Driver";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise1.personAText = "<html> Hello there. Is this Mary?<br/>"
                + " This is Jhon, the <font color='red'>delivery driver</font>. I am <font color='red'>having trouble</font> finding your apartment. <br/>"
                + " I can't see a statue. Are you sure it's correct?. <br/>"
                + " Oh yes, I see it. I will be there soon. Goodbye!<html>";
        
        // list of vocab words associated with person A
        List<String> personAVocabAssistList = Arrays.asList("conductor, a de reparto", "tengo un problema");
        
        // add to the list in the object
        A1Exercise1.personAVocabAssist = personAVocabAssistList;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise1.personBText = "<html> Hi, yes it is. Who's speaking?<br/> "
                + " Yes it can be a little <font color ='red'>tricky</font>. Go past the big black <font color ='red'>gates</font>, turn left at the statue and you should see my building. I live on the 4th floor so I would <font color ='red'>recommend</font> taking the <font color ='red'>lift</font>.<br/>"
                + " It is a big <font color ='red'>stone statue</font>, <font color ='red'>round</font> and grey in colour.<br/>"
                + " See you soon. Goodbye!<html> ";
        
        // list of vocab words associated with person B
        List<String> personBVocabAssistList = Arrays.asList("complicado", "verjas", "estatua", "recomendaría", "ascensor", "piedra", "redonda");
        
        // add to the list in the object
        A1Exercise1.personBVocabAssist = personBVocabAssistList;
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1Exercise1);
    }
}
