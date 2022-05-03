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
 * @author Najeeha
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
    
    public static List getTopicsA1() {
        return RolePlayManager.topicsA1;
    }
    
    public static List getTopicsA2() {
        return RolePlayManager.topicsA2;
    }
    
    public static List getTopicsB1() {
        return RolePlayManager.topicsB1;
    }
    
    public static List getTopicsB2() {
        return RolePlayManager.topicsB2;
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
        createTopics();
    }
    
    public static void createTopics() {
        RolePlayTopic A1Exercise = new RolePlayTopic();
        // basic role play info
        A1Exercise.difficulty = difficultyA1;
        A1Exercise.language = languageSpanish;
        A1Exercise.topicType = culturalExperiences;
        A1Exercise.subTopicType = "International Food";
        A1Exercise.subTopicKey = "international_food";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        A1Exercise.personAText = "<html> What is this? <br/>"
                + " What kind of tea? <br/>"
                + " Yes, I like it. I want to make it at home. <br/>"
                + " How do I make it? <br/>"
                + " Can you <font color ='red'>text</font> it to me so I don't forget. <br/>"
                + " Thank you. <html>";
        
        // list of vocab words associated with person A
        List<String> personAVocabAssistList = Arrays.asList("texto");
        
        
        // add to the list in the object
        A1Exercise.personAVocabAssist = personAVocabAssistList;
        
        
        List<String> personAVocabEnglish = Arrays.asList("text");
        A1Exercise.personAVocabEnglish = personAVocabEnglish;
         
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise.personBText = "<html> It's tea. <br/> "
                + " Chai tea. It's made with black tea, milk and <font color ='red'>spices</font>. Do you like it? <br/>"
                + " You can buy the spices at the supermarket. <br/>"
                + " First you <font color ='red'>boil</font> the milk, then you add the teabag and spices. <br/>"
                + " No problem, I'll do it now. <html> ";
        
        // list of vocab words associated with person B
        List<String> personBVocabAssistList1 = Arrays.asList("especias", "hervir");
        
        // add to the list in the object
        A1Exercise.personBVocabAssist = personBVocabAssistList1;
        
        
        
        List<String> personBVocabEnglish1= Arrays.asList("spices", "boil");
        A1Exercise.personBVocabEnglish = personBVocabEnglish1; 
        
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1Exercise);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
        RolePlayTopic A1Exercise2 = new RolePlayTopic();
        // basic role play info
        A1Exercise2.difficulty = difficultyA1;
        A1Exercise2.language = languageSpanish;
        A1Exercise2.topicType = foodAndDrink;
        A1Exercise2.subTopicType = "Takeaway";
        A1Exercise2.subTopicKey = "takeaway";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise2.personAText = "<html> Hi there. Do you have a table for 2? <br/>"
                + " I'm sorry I don't. <br/>"
                + " How long is the  <font color ='red'> wait </font> for a table? I am very hungry. <br/>"
                + " Yes please. I will have two burgers and two portions of fries. Oh and two large drinks. Thank you very much. <br/>"
                + " You too. <html>";
        
        // list of vocab words associated with person A
        List<String> personAVocabAssistList2 = Arrays.asList("espera");
        
        
        // add to the list in the object
        A1Exercise2.personAVocabAssist = personAVocabAssistList2;
        
        List<String> personAVocabEnglish2= Arrays.asList("wait");
        A1Exercise2.personAVocabEnglish = personAVocabEnglish2;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise2.personBText = "<html> Good evening. Do you have a <font color ='red'>reservation</font> with us? <br/> "
                + " I'm afraid we're very busy tonight so there are no free tables. Would you like to wait or come back later?<br/>"
                + " It is <font color ='red'>about</font> one hour. I'm sorry about that. Would you like to order your food for <font color ='red'>takeaway</font> instead? <br/>"
                + " No problem. Your food should be here soon. Have a nice evening!<html> ";
        
        // list of vocab words associated with person B
        List<String> personBVocabAssistList2 = Arrays.asList("reservación", "sobre", "llevar");
        
        // add to the list in the object
        A1Exercise2.personBVocabAssist = personBVocabAssistList2;
        
        List<String> personBVocabEnglish2= Arrays.asList("reservation", "about", "takeaway");
        A1Exercise2.personBVocabEnglish = personBVocabEnglish2;
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1Exercise2);
        
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A1Exercise3 = new RolePlayTopic();
        // basic role play info
        A1Exercise3.difficulty = difficultyA1;
        A1Exercise3.language = languageSpanish;
        A1Exercise3.topicType = personalInfo;
        A1Exercise3.subTopicType = "Social Media";
        A1Exercise3.subTopicKey = "social_media";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise3.personAText = "<html> Hi Peter. How was your weekend? <br/>"
                + " Oh really? What is she like? Did you get her Snapchat? <br/>"
                + " I want to see her. What's her name? I'll look her up on Instagram. <br/>"
                + " I found her! Wow, she is beautiful. I'm happy for you! <html>";

        // list of vocab words associated with person A
        List<String> personAVocabAssistList3 = Arrays.asList();
        
        
        // add to the list in the object
        A1Exercise3.personAVocabAssist = personAVocabAssistList3;
        
        
        List<String> personAVocabEnglish3= Arrays.asList();
        A1Exercise3.personAVocabEnglish = personAVocabEnglish3;
        
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise3.personBText = "<html> Hi. It was good thank you. I met a nice girl. <br/> "
                + " She doesn't <font color ='red'> use </font> Snapchat. She's very pretty. She has long brown hair and big green eyes. I like her. <br/>"
                + " You can try. Her name is Natalia Black. <br/>"
                + " I am happy too. And thank you. <html> ";
        
        // list of vocab words associated with person B
        List<String> personBVocabAssistList3 = Arrays.asList("usa");
        
        // add to the list in the object
        A1Exercise3.personBVocabAssist = personBVocabAssistList3;
        
        List<String> personBVocabEnglish3= Arrays.asList("use");
        A1Exercise3.personBVocabEnglish = personBVocabEnglish3;
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1Exercise3);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A1Exercise4 = new RolePlayTopic();
        // basic role play info
        A1Exercise4.difficulty = difficultyA1;
        A1Exercise4.language = languageSpanish;
        A1Exercise4.topicType = shopping;
        A1Exercise4.subTopicType = "Payment";
        A1Exercise4.subTopicKey = "payment";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise4.personAText = "<html> Hi there. May I pay for these items please? <br/>"
                + " Card, please. <br/>"
                + " Thank you.  <br/>"
                + " I'm sorry about that. I will use my <font color ='red'>PIN</font>. <br/>"
                + " Have a good day! Goodbye. <html>";
        
        // list of vocab words associated with person A
        List<String> personAVocabAssistList4 = Arrays.asList("PIN");
        
        // add to the list in the object
        A1Exercise4.personAVocabAssist = personAVocabAssistList4;
        
        List<String> personAVocabEnglish4= Arrays.asList("PIN");
        A1Exercise4.personAVocabEnglish = personAVocabEnglish4;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise4.personBText = "<html> Hello, yes of course. Your total is £35. Will you be paying by <font color ='red'>cash</font> or <font color ='red'>card</font>? <br/> "
                + " No problem. You can <font color ='red'>insert</font> or <font color ='red'>touch</font> your card to the machine.  <br/>"
                + " I'm sorry your card <font color ='red'>hasn't worked</font>. Can you try again?<br/>"
                + " That is all done. Thank you for shopping with us. Have a good day!<html> ";
        
        // list of vocab words associated with person B
        List<String> personBVocabAssistList4 = Arrays.asList("en efectivo", "con tarjeta", "insertar", "tocar", "no ha funcionado");
        
        // add to the list in the object
        A1Exercise4.personBVocabAssist = personBVocabAssistList4;
        
        
        
        List<String> personBVocabEnglish4= Arrays.asList("cash", "card", "insert", "touch", "hasn't worked");
        A1Exercise4.personBVocabEnglish = personBVocabEnglish4;
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1Exercise4);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A1Exercise5 = new RolePlayTopic();
        // basic role play info
        A1Exercise5.difficulty = difficultyA1;
        A1Exercise5.language = languageSpanish;
        A1Exercise5.topicType = appointments;
        A1Exercise5.subTopicType = "Booking";
        A1Exercise5.subTopicKey = "booking";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise5.personAText = "<html> Hello, can I make an <font color='red'>appointment</font> for tomorrow. <br/>"
                + " 2pm. <br/>"
                + " Sorry, those times aren't good. Do you have 2pm the day after tomorrow? <br/>"
                + " Perfect, thank you.<html>";
        
        // list of vocab words associated with person A
        List<String> personAVocabAssistList5 = Arrays.asList("cita");
        
        // add to the list in the object
        A1Exercise5.personAVocabAssist = personAVocabAssistList5;
        
        List<String> personAVocabEnglish5= Arrays.asList("appointment");
        A1Exercise5.personAVocabEnglish = personAVocabEnglish5;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise5.personBText = "<html> No problem, what time would you like <font color ='red'>to book</font>? <br/> "
                + " I'm sorry, that time is not <font color ='red'>available</font>. We have 10am and 5pm.<br/>"
                + " Yes, it's available. I will book that for you.<html> ";
        
        // list of vocab words associated with person B
        List<String> personBVocabAssistList5 = Arrays.asList("reservar", "disponible");
        
        // add to the list in the object
        A1Exercise5.personBVocabAssist = personBVocabAssistList5;
        
        
        
        List<String> personBVocabEnglish5= Arrays.asList("to book", "available");
        A1Exercise5.personBVocabEnglish = personBVocabEnglish5;
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1Exercise5);
        
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A1Exercise6 = new RolePlayTopic();
        // basic role play info
        A1Exercise6.difficulty = difficultyA1;
        A1Exercise6.language = languageSpanish;
        A1Exercise6.topicType = directions;
        A1Exercise6.subTopicType = "Repeat Name";
        A1Exercise6.subTopicKey = "repeat_name";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise6.personAText = "<html> Hello, my name is Danielle. <br/>"
                + " Sorry I didn't hear you, can you <font color ='red'>repeat</font> that? <br/>"
                + " Michael? <br/>"
                + " It's nice to meet you Michael. <html>";
        
        // list of vocab words associated with person A
        List<String> personAVocabAssistList6 = Arrays.asList("repetir");
        
        // add to the list in the object
        A1Exercise6.personAVocabAssist = personAVocabAssistList6;
        
        
        List<String> personAVocabEnglish6= Arrays.asList("repeat");
        A1Exercise6.personAVocabEnglish = personAVocabEnglish6;
        
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise6.personBText = "<html> Hello Danielle, my name is Michael.<br/> "
                + " My name is Michael.<br/>"
                + " Yes, it's Michael.<br/>"
                + " It's nice to meet you too. <html> ";
        
        // list of vocab words associated with person B
        List<String> personBVocabAssistList6 = Arrays.asList();
        
        // add to the list in the object
        A1Exercise6.personBVocabAssist = personBVocabAssistList6;
        
        List<String> personBVocabEnglish6= Arrays.asList();
        A1Exercise6.personBVocabEnglish = personBVocabEnglish6;
       
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1Exercise6);
        
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A1Exercise7 = new RolePlayTopic();
        // basic role play info
        A1Exercise7.difficulty = difficultyA1;
        A1Exercise7.language = languageSpanish;
        A1Exercise7.topicType = employment;
        A1Exercise7.subTopicType = "Cover";
        A1Exercise7.subTopicKey = "cover";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise7.personAText = "<html> Hello, is the <font color ='red'>manager</font> there? <br/>"
                + " Can you tell them that I am sick and can't come to work today. <br/>"
                + " <font color ='red'>I've got a cold</font>. <br/>"
                + " Not yet. <br/>"
                + " I will do that now, thank you. <br/>"
                + " Thank you, speak to you soon. Goodbye. <html>";
        
        // list of vocab words associated with person A
        List<String> personAVocabAssistList7 = Arrays.asList("jefe,a", "Tengo un resfriado");
        
        // add to the list in the object
        A1Exercise7.personAVocabAssist = personAVocabAssistList7;
        
        List<String> personAVocabEnglish7= Arrays.asList("manager", "I've got a cold");
        A1Exercise7.personAVocabEnglish = personAVocabEnglish7;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise7.personBText = "<html> They will arrive in an hour, do you want <font color ='red'>to call back</font> or I can <font color ='red'>take a message</font>?<br/> "
                + " What's the matter?<br/>"
                + " Did you <font color ='red'>find cover</font>? <br/>"
                + " <font color ='red'>Send a message in the group chat</font>, hopefully someone can cover your <font color ='red'>shift</font>.<br/>"
                + " Well, I hope you get well soon.<br/>"
                + " Goodbye.<html> ";
        
        // list of vocab words associated with person B
        List<String> personBVocabAssistList7 = Arrays.asList("llamar de nuevo", "darle el mensaje", "encontraste una sustitución", "<html>Envía un mensaje <br/>al grupo de chat<html>", "turno");
        
        // add to the list in the object
        A1Exercise7.personBVocabAssist = personBVocabAssistList7;
        
        
        
        List<String> personBVocabEnglish7= Arrays.asList("to call back", "take a message", "find cover", "<html>Send a message in <br/>the group chat<html>", "shift");
        A1Exercise7.personBVocabEnglish = personBVocabEnglish7;
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1Exercise7);
        
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A1Exercise8 = new RolePlayTopic();
        // basic role play info
        A1Exercise8.difficulty = difficultyA1;
        A1Exercise8.language = languageSpanish;
        A1Exercise8.topicType = shopping;
        A1Exercise8.subTopicType = "Refund";
        A1Exercise8.subTopicKey = "refund";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise8.personAText = "<html> Hello there. I would like a <font color ='red'>refund</font> for these <font color ='red'>items</font> please. <br/>"
                + " That will not work. I want my money back. <br/>"
                + " Fine. But I will take this up with your <font color ='red'>manager</font>. <br/>"
                + " Oh. Well, in that case I will just take the gift voucher. Thank you and have a good day. <html>";
        
        // list of vocab words associated with person A
        List<String> personAVocabAssistList8 = Arrays.asList("reembolso", "artículos", "gerente");
        
        // add to the list in the object
        A1Exercise8.personAVocabAssist = personAVocabAssistList8;
        
        List<String> personAVocabEnglish8= Arrays.asList("refund", "items", "manager");
        A1Exercise8.personAVocabEnglish = personAVocabEnglish8;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise8.personBText = "<html> Hi there. <font color ='red'>Unfortunately</font>, these items look like they have been <font color ='red'>used</font>. I can offer an <font color ='red'>exchange</font> or a <font color ='red'>gift voucher</font> instead. <br/> "
                + " We cannot offer a refund for used items. You can exchange it for another item or I can issue you a gift voucher. <br/>"
                + " I am the manager. <br/>"
                + " You too. Bye! <html> ";
        
        // list of vocab words associated with person B
        List<String> personBVocabAssistList8 = Arrays.asList("desgraciadamente", "usados", "intercambio", "vale regalo");
        
        // add to the list in the object
        A1Exercise8.personBVocabAssist = personBVocabAssistList8;
        
       
        
        List<String> personBVocabEnglish8= Arrays.asList("Unfortunately", "used", "exchange", "gift voucher");
        A1Exercise8.personBVocabEnglish = personBVocabEnglish8;
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1Exercise8);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A1Exercise9 = new RolePlayTopic();
        // basic role play info
        A1Exercise9.difficulty = difficultyA1;
        A1Exercise9.language = languageSpanish;
        A1Exercise9.topicType = socialising;
        A1Exercise9.subTopicType = "Interview arrangements";
        A1Exercise9.subTopicKey = "interview";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise9.personAText = "<html> Hi Derreck. How was your weekend? <br/>"
                + " That is great news! Give me all the details. <br/>"
                + " Will it be <font color ='red'>face-to-face</font> or <font color ='red'>online</font>? <br/>"
                + " Good luck, my friend I will be thinking of you. You will do great! <html>";
        
        // list of vocab words associated with person A
        List<String> personAVocabAssistList9 = Arrays.asList("presencial", "en linea");
        
        // add to the list in the object
        A1Exercise9.personAVocabAssist = personAVocabAssistList9;
        
        List<String> personAVocabEnglish9= Arrays.asList("face-to-face", "online");
        A1Exercise9.personAVocabEnglish = personAVocabEnglish9;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise9.personBText = "<html> Hi Pete. Well, I actually <font color ='red'>secured a job interview</font> for this <font color ='red'>admin role</font>. I'm so excited! <br/> "
                + " Well, the interview is at 10:00 tomorrow. The <font color ='red'>dress code</font> is <font color ='red'>smart-casual</font> so I need to wear a shirt and jeans.  <br/>"
                + " Face-to-face so I need to be prepared. It's not far from here, <font color ='red'>only 3 stops on the no.32 bus</font>. <br/>"
                + " Thank you! I will <font color ='red'>let you know</font> how it goes. <html> ";
        
        // list of vocab words associated with person B
        List<String> personBVocabAssistList9 = Arrays.asList("<html>conseguido una <br/>entrevista de trabajo<html>", "papel administrativo", "código de vestir", "informal", "<html>solo 3 paradas en la <br/>línea 32  de autobús<html>", "haré saber");
        
        // add to the list in the object
        A1Exercise9.personBVocabAssist = personBVocabAssistList9;
        
        
        List<String> personBVocabEnglish9= Arrays.asList("<html>secured a <br/>job interview<html>", "admin role", "dress code", "smart-casual", "<html>only 3 stops on <br/>the no.32 bus<html>", "let you know");
        A1Exercise9.personBVocabEnglish = personBVocabEnglish9;
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1Exercise9);
         
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A1Exercise10 = new RolePlayTopic();
        // basic role play info
        A1Exercise10.difficulty = difficultyA1;
        A1Exercise10.language = languageSpanish;
        A1Exercise10.topicType = foodAndDrink;
        A1Exercise10.subTopicType = "Coffee Order";
        A1Exercise10.subTopicKey = "coffee";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise10.personAText = "<html> Could I please have a regular <font color ='red'>decafe latte</font>. <br/>"
                + " That's okay, I'll just have a regular latte then, and could I get that <font color ='red'>iced</font>. <br/>"
                + " And, do you have <font color ='red'>sugar-free syrup</font>? <br/>"
                + " Could I get the sugar-free vanilla please, and could I get that with <font color ='red'>oat milk</font> please. <br/>"
                + " To go please. <html>";
        
        // list of vocab words associated with person A
        List<String> personAVocabAssistList10 = Arrays.asList("<html>descafeinado <br/>con leche<html>", "con hielo", "<html>almíbar sin <br/>azúcar<html>", "leche de avena");
        
        // add to the list in the object
        A1Exercise10.personAVocabAssist = personAVocabAssistList10;
        
        List<String> personAVocabEnglish10= Arrays.asList("decafe latte", "iced", "<html>sugar-free <br/>syrup<html>", "oat milk");
        A1Exercise10.personAVocabEnglish = personAVocabEnglish10;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise10.personBText = "<html> We have no decafe, sorry about that. <br/> "
                + " Yes. <br/>"
                + " We have sugar-free <font color ='red'>caramel</font>, <font color ='red'>vanilla</font> and <font color ='red'>hazelnut</font>. <br/>"
                + " <font color ='red'>Is that to have in or to go</font>? <html> ";
        
        // list of vocab words associated with person B
        List<String> personBVocabAssistList10 = Arrays.asList("caramelo", "vainilla", "avellana", "<html>Es para <br/>tomar aquí o <br/>para llevar<html>");
        
        // add to the list in the object
        A1Exercise10.personBVocabAssist = personBVocabAssistList10;
        
        
        
        List<String> personBVocabEnglish10= Arrays.asList("caramel", "vanilla", "hazelnut", "<html>Is that <br/>to have in <br/>or to go<html>");
        A1Exercise10.personBVocabEnglish = personBVocabEnglish10;
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1Exercise10);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A1Exercise11 = new RolePlayTopic();
        // basic role play info
        A1Exercise11.difficulty = difficultyA1;
        A1Exercise11.language = languageSpanish;
        A1Exercise11.topicType = appointments;
        A1Exercise11.subTopicType = "Spelling your name";
        A1Exercise11.subTopicKey = "spelling_name";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise11.personAText = "<html> Hello, can I make an appointment for tomorrow. <br/>"
                + " Can I book for next week Tuesday then? <br/>"
                + " at 10am please. <br/>"
                + " Jessica Taylor <br/>"
                + " Yes, J E S S I C A, T A Y L O R. <br/>"
                + " Thank you, see you then. <html>";
        
        List<String> personAVocabAssistList11 = Arrays.asList();
        
        // add to the list in the object
        A1Exercise11.personAVocabAssist = personAVocabAssistList11;
        
        
        List<String> personAVocabEnglish11= Arrays.asList();
        A1Exercise11.personAVocabEnglish = personAVocabEnglish11;
        
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise11.personBText = "<html> <font color ='red'> We're booked </font> for the next week unfortunately. <br/> "
                + " Of course, what time? <br/>"
                + " What's your name? <br/>"
                + " Can you spell that for me? <br/>"
                + " That's all done for you, see you next week. <html> ";
        
        // list of vocab words associated with person B
        List<String> personBVocabAssistList11 = Arrays.asList("hemos reservado");
        
        // add to the list in the object
        A1Exercise11.personBVocabAssist = personBVocabAssistList11;
        
        
        List<String> personBVocabEnglish11= Arrays.asList("We're booked");
        A1Exercise11.personBVocabEnglish = personBVocabEnglish11;
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1Exercise11);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
        RolePlayTopic A1Exercise12 = new RolePlayTopic();
        // basic role play info
        A1Exercise12.difficulty = difficultyA1;
        A1Exercise12.language = languageSpanish;
        A1Exercise12.topicType = employment;
        A1Exercise12.subTopicType = "Inteview";
        A1Exercise12.subTopicKey = "interview";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise12.personAText = "<html> Good afternoon, how can I help you? <br/>"
                + " What time is the interview? <br/>"
                + " With who? <br/>"
                + " Johnathan works in the other building, it's not far. <br/>"
                + " If you go <font color ='red'>right</font> when you leave the building and then <font color ='red'>turn left</font>. Best of luck with the interview. <html>";
        
        // list of vocab words associated with person A
        List<String> personAVocabAssistList12 = Arrays.asList("derecha", "<html>Gire a la <br/>izquierda<html>");
        
        // add to the list in the object
        A1Exercise12.personAVocabAssist = personAVocabAssistList12;
        
        List<String> personAVocabEnglish12= Arrays.asList("right", "turn left");
        A1Exercise12.personAVocabEnglish = personAVocabEnglish12;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise12.personBText = "<html> Good afternoon, I have an <font color ='red'>interview</font> here today. <br/> "
                + " at 13:30. <br/>"
                + " it's with Johnathan. <br/>"
                + " How do I get there? <br/>"
                + " Thank you very much. <html> ";
        
        // list of vocab words associated with person B
        List<String> personBVocabAssistList12 = Arrays.asList("entrevista");
        
        // add to the list in the object
        A1Exercise12.personBVocabAssist = personBVocabAssistList12;
        
        
        
        List<String> personBVocabEnglish12= Arrays.asList("interview");
        A1Exercise12.personBVocabEnglish = personBVocabEnglish12;
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1Exercise12);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A1Exercise13 = new RolePlayTopic();
        // basic role play info
        A1Exercise13.difficulty = difficultyA1;
        A1Exercise13.language = languageSpanish;
        A1Exercise13.topicType = foodAndDrink;
        A1Exercise13.subTopicType = "Water for table";
        A1Exercise13.subTopicKey = "water_for_table";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise13.personAText = "<html> Good evening, how is it going? <br/>"
                + " Can I get you some drinks while you look at the menu? <br/>"
                + " I'll get that for you now. Is this your daughter? She's beautiful. <br/>"
                + " Of course, excuse me, I'll get your drinks. <html>";
        
        // list of vocab words associated with person B
        List<String> personAVocabAssistList13 = Arrays.asList();
        
        // add to the list in the object
        A1Exercise13.personAVocabAssist = personAVocabAssistList13;
        
        List<String> personAVocabEnglish13= Arrays.asList();
        A1Exercise13.personAVocabEnglish = personAVocabEnglish13;
        
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise13.personBText = "<html> Excellent thanks. <br/> "
                + " Yes, can we get <font color ='red'>tap water</font> for the table and two lemonades. <br/>"
                + " Actually, she's my wife. <html> ";
        
        // list of vocab words associated with person B
        List<String> personBVocabAssistList13 = Arrays.asList("agua del grifo");
        
        // add to the list in the object
        A1Exercise13.personBVocabAssist = personBVocabAssistList13;
        
        
        
        List<String> personBVocabEnglish13= Arrays.asList("tap water");
        A1Exercise13.personBVocabEnglish = personBVocabEnglish13;
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1Exercise13);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A1Exercise14 = new RolePlayTopic();
        // basic role play info
        A1Exercise14.difficulty = difficultyA1;
        A1Exercise14.language = languageSpanish;
        A1Exercise14.topicType = foodAndDrink;
        A1Exercise14.subTopicType = "Reservation";
        A1Exercise14.subTopicKey = "reservation";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        A1Exercise14.personAText = "<html> Hi there. Do you have a table for 4? <br/>"
                + " I'm sorry I don't. <br/>"
                + " How long is the <font color ='red'>wait</font> for a table?  <br/>"
                + " Yes, no problem at all. We know this restaurant is popular. <br/>"
                + " Smith. <html>";
        
        // list of vocab words associated with person A
        List<String> personAVocabAssistList14 = Arrays.asList("Espere");
        
        // add to the list in the object
        A1Exercise14.personAVocabAssist = personAVocabAssistList14;
        
        
        List<String> personAVocabEnglish14= Arrays.asList("wait");
        A1Exercise14.personAVocabEnglish = personAVocabEnglish14;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise14.personBText = "<html> Good evening. Do you have a <font color ='red'>reservation</font> with us? <br/> "
                + " I'm afraid we're very busy tonight so there are no free tables. Would you like to wait or come back later? <br/>"
                + " It is <font color ='red'>about</font> one hour. I'm sorry about that. Are you happy to wait at the bar?  <br/>"
                + " I need to book you in. What is your name? <br/>"
                + " Great. You are booked in for 9 o'clock. The bar is over there. I will call you when your table is ready. <html> ";
        
        // list of vocab words associated with person B
        List<String> personBVocabAssistList14 = Arrays.asList("reserva", "acerca de");
        
        // add to the list in the object
        A1Exercise14.personBVocabAssist = personBVocabAssistList14;
        
        
        List<String> personBVocabEnglish14= Arrays.asList("reservation", "about");
        A1Exercise14.personBVocabEnglish = personBVocabEnglish14;
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1Exercise14);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
        RolePlayTopic A1Exercise15 = new RolePlayTopic();
        // basic role play info
        A1Exercise15.difficulty = difficultyA1;
        A1Exercise15.language = languageSpanish;
        A1Exercise15.topicType = directions;
        A1Exercise15.subTopicType = "Delivery Driver";
        A1Exercise15.subTopicKey = "delivery_driver";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        A1Exercise15.personAText = "<html> Hello there. Is this John? <br/>"
                + " This is Anna, the <font color ='red'>delivery driver</font>. I am <font color ='red'>having trouble</font> finding your house. <br/>"
                + " I'm parked outside the train station. The train station is on my left. <br/>"
                + " Oh yes, I see it. I will be there soon. Goodbye! <html>";
        
        // list of vocab words associated with person A
        List<String> personAVocabAssistList15 = Arrays.asList("<html>Conductora <br/>de entrega<html>", "<html>teniendo <br/>problemas<html>");
        
        // add to the list in the object
        A1Exercise15.personAVocabAssist = personAVocabAssistList15;
        
        
        List<String> personAVocabEnglish15= Arrays.asList("<html>delivery <br/>driver<html>", "<html>having <br/>trouble<html>");
        A1Exercise15.personAVocabEnglish = personAVocabEnglish15;
        
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise15.personBText = "<html> Hi, yes it is. Who's speaking? <br/> "
                + " Where are you right now? <br/>"
                + " Oh, you're close by. Just cross the street, my house is number 12. It has a red door.  <br/>"
                + " See you soon. Goodbye! <html> ";
        
        // list of vocab words associated with person B
        List<String> personBVocabAssistList15 = Arrays.asList();
        
        // add to the list in the object
        A1Exercise15.personBVocabAssist = personBVocabAssistList15;
        
        
        List<String> personBVocabEnglish15= Arrays.asList();
        A1Exercise15.personBVocabEnglish = personBVocabEnglish15;
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1Exercise15);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        RolePlayTopic A1Exercise16 = new RolePlayTopic();
        // basic role play info
        A1Exercise16.difficulty = difficultyA1;
        A1Exercise16.language = languageSpanish; 
        A1Exercise16.topicType = personalInfo;
        A1Exercise16.subTopicType = "Instagram";
        A1Exercise16.subTopicKey = "instagram";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        A1Exercise16.personAText = "<html> It's getting late, I think I'm gonna <font color ='red'>head off</font>. <br/>"
                + " I know. But I have to work. <br/>"
                + " Well, bye. <br/>"
                + " Sorry, I don't <font color ='red'>give out</font> my number. <br/>"
                + " Sure, <font color ='red'>I suppose</font>. <html>";
        
        // list of vocab words associated with person A
        List<String> personAVocabAssistList16 = Arrays.asList("distraer", "repartir", "Supongo");
        
        // add to the list in the object
        A1Exercise16.personAVocabAssist = personAVocabAssistList16;
        
        List<String> personAVocabEnglish16= Arrays.asList("head off", "give out", "I suppose");
        A1Exercise16.personAVocabEnglish = personAVocabEnglish16;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise16.personBText = "<html> That's a shame, it was nice getting to know you. <br/> "
                + " I understand. I work too. <br/>"
                + " Oh, can I get your number? <br/>"
                + " What about your instagram? <br/>"
                + " What's your <font color ='red'>username</font>? <html> ";
        
        // list of vocab words associated with person B
        List<String> personBVocabAssistList16 = Arrays.asList("nombre de usuario");
        
        // add to the list in the object
        A1Exercise16.personBVocabAssist = personBVocabAssistList16;
        
        
        
        List<String> personBVocabEnglish16= Arrays.asList("username");
        A1Exercise16.personBVocabEnglish = personBVocabEnglish16;
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1Exercise16);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
        RolePlayTopic A1Exercise17 = new RolePlayTopic();
        // basic role play info
        A1Exercise17.difficulty = difficultyA1;
        A1Exercise17.language = languageSpanish;
        A1Exercise17.topicType = personalInfo;
        A1Exercise17.subTopicType = "Neighbour's Parcel";
        A1Exercise17.subTopicKey = "neighbours_parcel";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        A1Exercise17.personAText = "<html> Hello there, how can I help? <br/>"
                + " Sure, no problem. Which neighbour? <br/>"
                + " All done. <br/>"
                + " Sarah Smith. And that's S-A-R-A-H with a H at the end. <br/>"
                + " You too, bye. <html>";
        
        List<String> personAVocabAssistList17 = Arrays.asList();
        
        // add to the list in the object
        A1Exercise17.personAVocabAssist = personAVocabAssistList17;
        
        List<String> personAVocabEnglish17= Arrays.asList();
        A1Exercise17.personAVocabEnglish = personAVocabEnglish17;
        
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise17.personBText = "<html> Hi I have a <font color ='red'>parcel</font> for your <font color ='red'>neighbour</font>, but they're not home, can I leave it with you? <br/> "
                + " Number 17, down the <font color ='red'>corridor</font>, on the left. Would you mind <font color ='red'>signing</font> here? <br/>"
                + " And just to confirm, what is your name? <br/>"
                + " Thanks Sarah. Have a good day! <html> ";
        
        // list of vocab words associated with person B
        List<String> personBVocabAssistList17 = Arrays.asList("terreno", "vecina", "corredora", "firma");
        
        // add to the list in the object
        A1Exercise17.personBVocabAssist = personBVocabAssistList17;
        
        
        
        List<String> personBVocabEnglish17= Arrays.asList("parcel", "neighbour", "corridor", "signing");
        A1Exercise17.personBVocabEnglish = personBVocabEnglish17;
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1Exercise17);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
        RolePlayTopic A1Exercise18 = new RolePlayTopic();
        // basic role play info
        A1Exercise18.difficulty = difficultyA1;
        A1Exercise18.language = languageSpanish;
        A1Exercise18.topicType = foodAndDrink;
        A1Exercise18.subTopicType = "Cocktails by card payment";
        A1Exercise18.subTopicKey = "cocktails_by_card";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        A1Exercise18.personAText = "<html> Hi there we would like to order 2 cocktails please. <br/>"
                + " Start a tab please. <br/>"
                + " Our table is number 17 and here are my details. <br/>"
                + " Great thanks! <html>";
        
        List<String> personAVocabAssistList18 = Arrays.asList();
        
        // add to the list in the object
        A1Exercise18.personAVocabAssist = personAVocabAssistList18;
        
        List<String> personAVocabEnglish18= Arrays.asList();
        A1Exercise18.personAVocabEnglish = personAVocabEnglish18;
        
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise18.personBText = "<html> Good evening. Would you like to start a tab for your table or pay now? <br/> "
                + " Great I will just need your card details and table number please. <br/>"
                + " Thank you. Just to let you know we have a 2 for 1 offer on cocktails all night and <font color ='red'>free refills</font> on <font color ='red'>soft drinks</font>. <br/>"
                + " Thank you that is all done. Enjoy your night! <html> ";
        
        // list of vocab words associated with person B
        List<String> personBVocabAssistList18 = Arrays.asList("recargas gratis", "<html>bebidas sin <br/>alcohol<html>");
        
        // add to the list in the object
        A1Exercise18.personBVocabAssist = personBVocabAssistList18;
        
        
        List<String> personBVocabEnglish18= Arrays.asList("free refills", "soft drinks");
        A1Exercise18.personBVocabEnglish = personBVocabEnglish18;
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1Exercise18);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
        RolePlayTopic A1Exercise19 = new RolePlayTopic();
        // basic role play info
        A1Exercise19.difficulty = difficultyA1;
        A1Exercise19.language = languageSpanish;
        A1Exercise19.topicType = invitations;
        A1Exercise19.subTopicType = "Disneyland";
        A1Exercise19.subTopicKey = "disneyland";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        A1Exercise19.personAText = "<html> Hi John did you get my letter? <br/>"
                + " Yeah that one. <br/>"
                + " A trip to Disneyland? Your kids are <font color ='red'>lucky</font>. Have fun and take lots of pictures! <br/>"
                + " That's okay. Have a good one! <html>";
        
        // list of vocab words associated with person A
        List<String> personAVocabAssistList19 = Arrays.asList("suerte");
        
        
        // add to the list in the object
        A1Exercise19.personAVocabAssist = personAVocabAssistList19;
        
        List<String> personAVocabEnglish19= Arrays.asList("lucky");
        A1Exercise19.personAVocabEnglish = personAVocabEnglish19;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise19.personBText = "<html> About your son's birthday party next week?  <br/> "
                + " Ah, unfortunately we won't be able to come. My wife planned a trip to Disneyland for the whole family and so we're going to be away all week. <br/>"
                + " Thanks I will. And sorry again for not being able to come. <br/>"
                + " You too. <html> ";
        
        List<String> personBVocabAssistList19 = Arrays.asList();
        
        
        // add to the list in the object
        A1Exercise19.personBVocabAssist = personBVocabAssistList19;
        
        List<String> personBVocabEnglish19= Arrays.asList();
        A1Exercise19.personBVocabEnglish = personBVocabEnglish19;
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1Exercise19);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A1Exercise20 = new RolePlayTopic();
        // basic role play info
        A1Exercise20.difficulty = difficultyA1;
        A1Exercise20.language = languageSpanish;
        A1Exercise20.topicType = invitations;
        A1Exercise20.subTopicType = "Help with child's birthday party";
        A1Exercise20.subTopicKey = "help_with_child_party";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        A1Exercise20.personAText = "<html> Hi Mary did you get my letter? <br/>"
                + " Yes that one. <br/>"
                + " The party starts at 14:00. <br/>"
                + " I actually do. It's not easy organising a party for 30 kids. <br/>"
                + " That would be great.  See you then. <html>";
        
        List<String> personAVocabEnglish20= Arrays.asList();
        A1Exercise20.personAVocabEnglish = personAVocabEnglish20;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise20.personBText = "<html> Hi! About your son's birthday next week? <br/> "
                + " Of course! Me and the kids would be delighted. What time does it start?<br/>"
                + " Do you need help <font color ='red'>setting up</font>? <br/>"
                + " I will come over at 12:00 then. <br/>"
                + " See you then! <html> ";
        
        // list of vocab words associated with person B
        List<String> personBVocabAssistList20 = Arrays.asList("configurando");
        
        // add to the list in the object
        A1Exercise20.personBVocabAssist = personBVocabAssistList20;
        
        
        
        List<String> personBVocabEnglish20= Arrays.asList("setting up");
        A1Exercise20.personBVocabEnglish = personBVocabEnglish20;
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1Exercise20);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
        RolePlayTopic A1Exercise21 = new RolePlayTopic();
        // basic role play info
        A1Exercise21.difficulty = difficultyA1;
        A1Exercise21.language = languageSpanish;
        A1Exercise21.topicType = personalInfo;
        A1Exercise21.subTopicType = "Description of town";
        A1Exercise21.subTopicKey = "description_of_town";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        A1Exercise21.personAText = "<html> Hi, my name is Claire. <br/>"
                + " Nice to meet you too, where are you from? <br/>"
                + " I'm from Cardigan. <br/>"
                + " It's a small town in the north of Wales. <br/>"
                + " It is a town <font color ='red'>close to the beach</font>. It's also got a lovely river. You should visit sometime. <br/>"
                + " Hm, there's an <font color ='red'>ancient</font> castle, they have <font color ='red'>festivals</font> there in the summertime. There is also a market, a museum and a theatre. <html>";
        
        // list of vocab words associated with person A
        List<String> personAVocabAssistList21 = Arrays.asList("<html>cerca de<br/>la playa<html>", "antigua", "festivales");
        
        // add to the list in the object
        A1Exercise21.personAVocabAssist = personAVocabAssistList21;
        
        
        List<String> personAVocabEnglish21= Arrays.asList("<html>close to <br/>the beach<html>", "ancient", "festivals");
        A1Exercise21.personAVocabEnglish = personAVocabEnglish21;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise21.personBText = "<html> Nice to meet you, I'm Robert. <br/> "
                + " I'm from London, how about you? <br/>"
                + " Oh, where is that? I've never heard of it. <br/>"
                + " What is it like? <br/>"
                + " I don't like going to the beach because I don't like sand. Is there anything else there to see? <br/>"
                + " That does sound like a nice place, maybe I will visit sometime. <html> ";
        
        
        List<String> personBVocabEnglish21= Arrays.asList();
        A1Exercise21.personBVocabEnglish = personBVocabEnglish21;
        
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1Exercise21);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
        RolePlayTopic A1Exercise22 = new RolePlayTopic();
        // basic role play info
        A1Exercise22.difficulty = difficultyA1;
        A1Exercise22.language = languageSpanish;
        A1Exercise22.topicType = university;
        A1Exercise22.subTopicType = "Study in cafe";
        A1Exercise22.subTopicKey = "study_in_cafe";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        A1Exercise22.personAText = "<html> Hey, good to see you. <br/>"
                + " Not good, I'm stressed. <br/>"
                + " I have two <font color ='red'>assignments</font> on Monday. I can't do them both. <br/>"
                + " I don't know. I don't like the library, it's too quiet. <br/>"
                + " Actually that would be nice, should we go today after class? <br/>"
                + " Okay, see you then! <html>";
        
        // list of vocab words associated with person A
        List<String> personAVocabAssistList22 = Arrays.asList("asignaciones");
        
        // add to the list in the object
        A1Exercise22.personAVocabAssist = personAVocabAssistList22;
        
        
        List<String> personAVocabEnglish22= Arrays.asList("assignments");
        A1Exercise22.personAVocabEnglish = personAVocabEnglish22;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise22.personBText = "<html> Hey, how's things? <br/> "
                + " What's happening? <br/>"
                + " Well, I have the same assignments, let's study together in the library? <br/>"
                + " Let's study in a cafe then, we can drink coffee and study. <br/>"
                + " I'm free after class, let's meet at the cafe <font color ='red'>next door</font>. <br/>"
                + " See you later! <html> ";
        
        // list of vocab words associated with person B
        List<String> personBVocabAssistList22 = Arrays.asList("al lado");
        
        // add to the list in the object
        A1Exercise22.personBVocabAssist = personBVocabAssistList22;
        
        
        List<String> personBVocabEnglish22= Arrays.asList("next door");
        A1Exercise22.personBVocabEnglish = personBVocabEnglish22;
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1Exercise22);
        
       
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////       
       
        RolePlayTopic A2Exercise1 = new RolePlayTopic();
        // basic role play info
        A2Exercise1.difficulty = difficultyA2;
        A2Exercise1.language = languageSpanish;
        A2Exercise1.topicType = directions;
        A2Exercise1.subTopicType = "Delivery Driver";
        A2Exercise1.subTopicKey = "delivery_driver";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        A2Exercise1.personAText = "<html> Hello there. Is this Mary?<br/>"
                + " This is Jhon, the <font color='red'>delivery driver</font>. I am <font color='red'>having trouble</font> finding your apartment. <br/>"
                + " I can't see a statue. Are you sure it's correct?. <br/>"
                + " Oh yes, I see it. I will be there soon. Goodbye!<html>";
        
        // list of vocab words associated with person A
        List<String> personA2VocabAssistList1 = Arrays.asList("<html>conductor, a <br/>de reparto<html>", "<html>tengo un <br/>problema<html>");
        
        // add to the list in the object
        A2Exercise1.personAVocabAssist = personA2VocabAssistList1;
        
        List<String> personA2VocabEnglish1= Arrays.asList("<html>delivery <br/>driver<html>", "having trouble");
        A2Exercise1.personAVocabEnglish = personA2VocabEnglish1;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A2Exercise1.personBText = "<html> Hi, yes it is. Who's speaking?<br/> "
                + " Yes it can be a little <font color ='red'>tricky</font>. Go past the big black <font color ='red'>gates</font>, turn left at the <font color ='red'>statue</font> and you should see my building. I live on the 4th floor so I would <font color ='red'>recommend</font> taking the <font color ='red'>lift</font>.<br/>"
                + " It is a big <font color ='red'>stone statue</font>, <font color ='red'>round</font> and grey in colour.<br/>"
                + " See you soon. Goodbye!<html> ";
        
        // list of vocab words associated with person B
        List<String> personB2VocabAssistList1 = Arrays.asList("complicado", "verjas", "estatua", "recomendaría", "ascensor", "piedra", "redonda");
        
        // add to the list in the object
        A2Exercise1.personBVocabAssist = personB2VocabAssistList1;
        
        
        
        List<String> personB2VocabEnglish1= Arrays.asList("tricky", "gates", "statue", "recommend", "lift", "stone statue", "round");
        A2Exercise1.personBVocabEnglish = personB2VocabEnglish1;
        
        // add object to a list of topic based on the difficulty
        topicsA2.add(A2Exercise1);
        
         
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A2Exercise2 = new RolePlayTopic();
        // basic role play info
        A2Exercise2.difficulty = difficultyA2;
        A2Exercise2.language = languageSpanish;
        A2Exercise2.topicType = foodAndDrink;
        A2Exercise2.subTopicType = "Vegan pizza";
        A2Exercise2.subTopicKey = "vegan_pizza";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        A2Exercise2.personAText = "<html> Hi excuse me? I think I have the <font color ='red'>wrong order</font>.  <br/>"
                + " I asked for a <font color ='red'>vegan</font> pizza and this seems to have cheese and meat all over it. <br/>"
                + " <font color ='red'>That is not good enough</font>. My friends and I have been <font color ='red'>waiting over</font> an hour already. I want a new pizza and my money back.<br/>"
                + " Apology accepted. Now please <font color ='red'>hurry up</font>, I am <font color ='red'>starving</font>. <br/>"
                + " Thank you. <html>";
        
        // list of vocab words associated with person A
        List<String> personA2VocabAssistList2 = Arrays.asList("pedido incorrecto", "vegana", "Eso no es suficiente", "esperando sobre", "dese prisa" ,"muerto,a de hambre");
        
        // add to the list in the object
        A2Exercise2.personAVocabAssist = personA2VocabAssistList2;
        
        
        List<String> personA2VocabEnglish2= Arrays.asList("wrong order", "vegan", "That is not good enough", "waiting over", "hurry up" ,"starving");
        A2Exercise2.personAVocabEnglish = personA2VocabEnglish2;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A2Exercise2.personBText = "<html> Hi there, what seems to be the problem? <br/> "
                + " I'm so sorry about that there must have been a <font color ='red'>mix up</font>. I will bring you a new one immediately. <br/>"
                + " I will see if I can get that done for you. And please <font color ='red'>accept our sincere apologies</font>. <br/>"
                + " I will let the <font color ='red'>kitchen</font> know and your pizza should be with you as soon as possible. <html> ";
        
        // list of vocab words associated with person B
        List<String> personB2VocabAssistList2 = Arrays.asList("confusión", "<html>acepte nuestras más <br/>sinceras disculpas<html>", "cocina");
        
        // add to the list in the object
        A2Exercise2.personBVocabAssist = personB2VocabAssistList2;
        
        
        List<String> personB2VocabEnglish2= Arrays.asList("mix up", "<html>accept our <br/>sincere apologies<html>", "kitchen");
        A2Exercise2.personBVocabEnglish = personB2VocabEnglish2;
        
        // add object to a list of topic based on the difficulty
        topicsA2.add(A2Exercise2);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A2Exercise3 = new RolePlayTopic();
        // basic role play info
        A2Exercise3.difficulty = difficultyA2;
        A2Exercise3.language = languageSpanish;
        A2Exercise3.topicType = appointments;
        A2Exercise3.subTopicType = "Dentist";
        A2Exercise3.subTopicKey = "dentist";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        A2Exercise3.personAText = "<html> Hi there. I would like to book an appointment with my dentist, Clara.  <br/>"
                + " Clara has <font color ='red'>done my teeth</font> for the past 10 years. She is very professional and I <font color ='red'>trust</font> her. Where is she? <br/>"
                + " That is too long to wait. Do you not have anything <font color ='red'>sooner</font>?<br/>"
                + " Yes please. Thank you for that. I will see you then. Bye! <html>";
        
        // list of vocab words associated with person A
        List<String> personA2VocabAssistList3 = Arrays.asList("cuidado mis dientes", "confío", "antes");
        
        // add to the list in the object
        A2Exercise3.personAVocabAssist = personA2VocabAssistList3;
        
        
        List<String> personA2VocabEnglish3= Arrays.asList("done my teeth", "trust", "sooner");
        A2Exercise3.personAVocabEnglish = personA2VocabEnglish3;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A2Exercise3.personBText = "<html> Hi there, I'm sorry but Clara is not available at the moment. Could I <font color ='red'>put you down </font>with someone else? <br/> "
                + " She is on holiday until the 22nd. I can book you in with Clara on the 30th. <br/>"
                + " Let me check for you. There is a <font color ='red'>cancellation</font> on the 25th at 13:00. Would you like this <font color ='red'>appointment</font>? <br/>"
                + " No problem, Clara will see you then. Goodbye! <html> ";
        
        // list of vocab words associated with person B
        List<String> personB2VocabAssistList3 = Arrays.asList("darle cita", "cancelación", "cita");
        
        // add to the list in the object
        A2Exercise3.personBVocabAssist = personB2VocabAssistList3;
        
        
        List<String> personB2VocabEnglish3= Arrays.asList("put you down", "cancellation", "appointment");
        A2Exercise3.personBVocabEnglish = personB2VocabEnglish3;
        
        // add object to a list of topic based on the difficulty
        topicsA2.add(A2Exercise3);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        RolePlayTopic A2Exercise4 = new RolePlayTopic();
        // basic role play info
        A2Exercise4.difficulty = difficultyA2;
        A2Exercise4.language = languageSpanish;
        A2Exercise4.topicType = foodAndDrink;
        A2Exercise4.subTopicType = "Reservation";
        A2Exercise4.subTopicKey = "reservation";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        A2Exercise4.personAText = "<html> Hi there. Do you have a table for 4? <br/>"
                + " Yes, I do, for 8 pm <br/>"
                + " It's Jones. <br/>"
                + " I'm sorry, but I booked the table for 8pm - and it is now 8pm. <br/>"
                + " Well, I suggest that you ask them to hurry up. We are going to sit down. <br/>"
                + " Ha! That's a typical trick! You <font color ='red'>delay</font> the table and ask me to wait in the bar so that I have to buy some drinks! <br/>"
                + " That sounds more like it. <html>";
        
        // list of vocab words associated with person A
        List<String> personA2VocabAssistList4 = Arrays.asList("demora");
        
        // add to the list in the object
        A2Exercise4.personAVocabAssist = personA2VocabAssistList4;
        
        List<String> personA2VocabEnglish4= Arrays.asList("delay");
        A2Exercise4.personAVocabEnglish = personA2VocabEnglish4;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A2Exercise4.personBText = "<html> Good evening. Do you have a <font color ='red'>reservation</font> with us? <br/> "
                + " What is your name? <br/>"
                + " Ok, I can see your booking. I am sorry, the table isn't ready yet. It will be about 30 minutes. <br/>"
                + " I do understand, but the people who booked the table at 6pm have not finished their meal. <br/>"
                + " May I ask you to wait in the bar while I get your table ready. <br/>"
                + " That is not what I <font color ='red'>intended</font>. I am sorry that your table is not ready. Please can you wait in the bar. May I get you a drink <font color ='red'>on the house</font>? <html> ";
        
        // list of vocab words associated with person B
        List<String> personB2VocabAssistList4 = Arrays.asList("reserva", "en la casa");
        
        // add to the list in the object
        A2Exercise4.personBVocabAssist = personB2VocabAssistList4;
        
        
        
        List<String> personB2VocabEnglish4= Arrays.asList("reservation", "intended");
        A2Exercise4.personBVocabEnglish = personB2VocabEnglish4;
        
        // add object to a list of topic based on the difficulty
        topicsA2.add(A2Exercise4);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A2Exercise5 = new RolePlayTopic();
        // basic role play info
        A2Exercise5.difficulty = difficultyA2;
        A2Exercise5.language = languageSpanish;
        A2Exercise5.topicType = shopping;
        A2Exercise5.subTopicType = "Payment";
        A2Exercise5.subTopicKey = "payment";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        A2Exercise5.personAText = "<html> Hi there. May I pay for these items please? <br/>"
                + " Card, please. <br/>"
                + " Thank you. <br/>"
                + " Let me try another card. Here it is! <br/>"
                + " How embarassing. I will go and get some cash from the bank. <br/>"
                + " I will be back as soon as possible. <html>";
        
        
        List<String> personA2VocabEnglish5= Arrays.asList();
        A2Exercise5.personAVocabEnglish = personA2VocabEnglish5;
        
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A2Exercise5.personBText = "<html> Hello, yes of course. Your total is £35. Will you be paying by <font color ='red'>cash</font> or <font color ='red'>card</font>? <br/> "
                + " No problem. You can <font color ='red'>insert</font> or <font color ='red'>touch</font> your card to the machine. <br/>"
                + " I'm sorry your card <font color ='red'>hasn't worked</font>. Can you try again? <br/>"
                + " I'm sorry, but this card hasn't worked either. <br/>"
                + " Ok. No problem. I can hold onto your shopping for 30 minutes. <html> ";
        
        // list of vocab words associated with person B
        List<String> personB2VocabAssistList5 = Arrays.asList("dinero en efectivo", "tarjeta", "insertar", "toque", "no ha funcionado");
        
        // add to the list in the object
        A2Exercise5.personBVocabAssist = personB2VocabAssistList5;
        
        
        List<String> personB2VocabEnglish5= Arrays.asList("cash", "card", "insert", "touch", "hasn't worked");
        A2Exercise5.personBVocabEnglish = personB2VocabEnglish5;
        
        // add object to a list of topic based on the difficulty
        topicsA2.add(A2Exercise5);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        RolePlayTopic A2Exercise6 = new RolePlayTopic();
        // basic role play info
        A2Exercise6.difficulty = difficultyA2;
        A2Exercise6.language = languageSpanish;
        A2Exercise6.topicType = health;
        A2Exercise6.subTopicType = "Sick relative";
        A2Exercise6.subTopicKey = "sick_relative";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        A2Exercise6.personAText = "<html> Hey, what are your plans for Saturday night? <br/>"
                + " Oh no, I didn't know that. When will you return? <br/>"
                + " I hope she gets well soon. <br/>"
                + " Let me know if you want to talk about it, okay. <br/>"
                + " Take care. <html>";
        
        
        List<String> personA2VocabEnglish6= Arrays.asList();
        A2Exercise6.personAVocabEnglish = personA2VocabEnglish6;
        
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A2Exercise6.personBText = "<html> I'm in Italy, didn't you know? <br/> "
                + " I meant to stay for 2 weeks but my grandma is <font color ='red'>unwell</font>, so I am staying another week. <br/>"
                + " Thank you, it seems as if she will. <br/>"
                + " I will, thank you for offering. Take care, speak soon. <html> ";
        
        // list of vocab words associated with person B
        List<String> personB2VocabAssistList6 = Arrays.asList("indispuesta");
        
        // add to the list in the object
        A2Exercise6.personBVocabAssist = personB2VocabAssistList6;
        
        
        List<String> personB2VocabEnglish6= Arrays.asList("unwell");
        A2Exercise6.personBVocabEnglish = personB2VocabEnglish6;
        
        // add object to a list of topic based on the difficulty
        topicsA2.add(A2Exercise6);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        RolePlayTopic A2Exercise7 = new RolePlayTopic();
        // basic role play info
        A2Exercise7.difficulty = difficultyA2;
        A2Exercise7.language = languageSpanish;
        A2Exercise7.topicType = invitations;
        A2Exercise7.subTopicType = "Charity";
        A2Exercise7.subTopicKey = "charity";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        A2Exercise7.personAText = "<html> Good morning sir, can I speak with you for a moment? <br/>"
                + " It will just take a second. <br/>"
                + " I just wanted to speak to you about our <font color ='red'>charitable organisation</font>. <br/>"
                + " So you <font color ='red'>don't give to charity</font>? <br/>"
                + " But sir, if you give me your email then you can <font color ='red'>choose</font> to <font color ='red'>sign up</font> or not in your own time. <html>";
        
        // list of vocab words associated with person A
        List<String> personA2VocabAssistList7 = Arrays.asList("<html>organización <br/>caritativa<html>", "<html>no des a <br/>la caridad<html>", "escoger", "inscribirse");
        
        // add to the list in the object
        A2Exercise7.personAVocabAssist = personA2VocabAssistList7;
        
        
        List<String> personA2VocabEnglish7= Arrays.asList("<html>charitable <br/>organisation<html>", "<html>don't give <br/>to charity<html>", "choose", "sign up");
        A2Exercise7.personAVocabEnglish = personA2VocabEnglish7;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A2Exercise7.personBText = "<html> No, I am busy. <br/> "
                + " I am going to work. <br/>"
                + " I am not interested. <br/>"
                + " Stop following me. <br/>"
                + " <font color ='red'>Leave me alone</font>. <html> ";
        
        // list of vocab words associated with person B
        List<String> personB2VocabAssistList7 = Arrays.asList("Déjame en paz");
        
        // add to the list in the object
        A2Exercise7.personBVocabAssist = personB2VocabAssistList7;
        
        
        List<String> personB2VocabEnglish7= Arrays.asList("Leave me alone");
        A2Exercise7.personBVocabEnglish = personB2VocabEnglish7;
        
        // add object to a list of topic based on the difficulty
        topicsA2.add(A2Exercise7);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A2Exercise8 = new RolePlayTopic();
        // basic role play info
        A2Exercise8.difficulty = difficultyA2;
        A2Exercise8.language = languageSpanish;
        A2Exercise8.topicType = invitations;
        A2Exercise8.subTopicType = "Lunch";
        A2Exercise8.subTopicKey = "lunch";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        A2Exercise8.personAText = "<html> Do you want <font color ='red'>to go for lunch</font> at the weekend? <br/>"
                + " Which <font color ='red'>days do you have off</font> next week? <br/>"
                + " I go to University on those days unfortunately. <br/>"
                + " I am also free on Monday morning. How about we meet at 10 at the cafe near your house. <br/>"
                + " See you then! <html>";
        
        // list of vocab words associated with person A
        List<String> personA2VocabAssistList8 = Arrays.asList("ir a almorzar", "<html>días tienes <br/>libre<html>");
        
        // add to the list in the object
        A2Exercise8.personAVocabAssist = personA2VocabAssistList8;
        
        
        List<String> personA2VocabEnglish8= Arrays.asList("<html>to go <br/>for lunch<html>", "<html>days do you<br/>have off<html>");
        A2Exercise8.personAVocabEnglish = personA2VocabEnglish8;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A2Exercise8.personBText = "<html> <font color ='red'>I'm afraid not</font>, I work on weekends. <br/> "
                + " I am <font color ='red'>free</font> on Tuesday and Wednesday <br/>"
                + " <font color ='red'>That's a shame</font>, what about on Monday morning? <br/>"
                + " Perfect, see you on Monday. <html> ";
        
        // list of vocab words associated with person B
        List<String> personB2VocabAssistList8 = Arrays.asList("Me temo que no", "gratis", "Es una pena");
        
        // add to the list in the object
        A2Exercise8.personBVocabAssist = personB2VocabAssistList8;
        
        
        List<String> personB2VocabEnglish8= Arrays.asList("I'm afraid not", "free", "That's a shame");
        A2Exercise8.personBVocabEnglish = personB2VocabEnglish8;
        
        // add object to a list of topic based on the difficulty
        topicsA2.add(A2Exercise8);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A2Exercise9 = new RolePlayTopic();
        // basic role play info
        A2Exercise9.difficulty = difficultyA2;
        A2Exercise9.language = languageSpanish;
        A2Exercise9.topicType = foodAndDrink;
        A2Exercise9.subTopicType = "Delayed drinks order";
        A2Exercise9.subTopicKey = "delayed_drinks";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        A2Exercise9.personAText = "<html> Excuse me, where is my coffee. I've been waiting over 20 minutes. <br/>"
                + " This is unacceptable, I am very busy this morning. Some people who ordered after me have already got their drinks. <br/>"
                + " Thank you, I ordered a mocha. <br/>"
                + " Thank you very much. <html>";
        
        // list of vocab words associated with person A
        List<String> personA2VocabAssistList9 = Arrays.asList();
        
        // add to the list in the object
        A2Exercise9.personAVocabAssist = personA2VocabAssistList9;
        
        
        List<String> personA2VocabEnglish9= Arrays.asList();
        A2Exercise9.personAVocabEnglish = personA2VocabEnglish9;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A2Exercise9.personBText = "<html> We're really busy, they are making the drinks as fast as they can, can you wait a little longer? <br/> "
                + " I'm sorry, I will check how long it will be. What did you order? <br/>"
                + " Sorry there was a <font color ='red'>mix up</font>, I will make it for you right away. <html> ";
        
        // list of vocab words associated with person B
        List<String> personB2VocabAssistList9 = Arrays.asList("mezclar");
        
        // add to the list in the object
        A2Exercise9.personBVocabAssist = personB2VocabAssistList9;
        
        
        List<String> personB2VocabEnglish9= Arrays.asList("mix up");
        A2Exercise9.personBVocabEnglish = personB2VocabEnglish9;
        
        // add object to a list of topic based on the difficulty
        topicsA2.add(A2Exercise9);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A2Exercise10 = new RolePlayTopic();
        // basic role play info
        A2Exercise10.difficulty = difficultyA2;
        A2Exercise10.language = languageSpanish;
        A2Exercise10.topicType = socialising;
        A2Exercise10.subTopicType = "Family size";
        A2Exercise10.subTopicKey = "family_size";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        A2Exercise10.personAText = "<html> Who were you chatting to in the cafe? <br/>"
                + " How do you know each other? <br/>"
                + " Really? But you don't look alike. <br/>"
                + " No, I'm an <font color ='red'>only child</font>. <br/>"
                + " I think you are lucky. How nice to have a big family. <br/>"
                + " No, my mum hates animals. <br/>"
                + " Yes, it was very quiet. But I had many good friends.  <html>";
        
        // list of vocab words associated with person A
        List<String> personA2VocabAssistList10 = Arrays.asList("Hija única");
        
        // add to the list in the object
        A2Exercise10.personAVocabAssist = personA2VocabAssistList10;
        
        
        List<String> personA2VocabEnglish10= Arrays.asList("only child");
        A2Exercise10.personAVocabEnglish = personA2VocabEnglish10;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A2Exercise10.personBText = "<html> Oh, that's Suzanna. <br/> "
                + " She's my sister. <br/>"
                + " Yes, she's my <font color ='red'>half sister</font>  actually. Do you have any siblings? <br/>"
                + " You are lucky!  I have five sisters - it is very <font color ='red'>noisy</font> at home. <br/>"
                + " Yes, we are. And we also have 3 dogs and 2 cats. How about you? <br/>"
                + " Must have been very quiet at home then! <html> ";
        
        // list of vocab words associated with person B
        List<String> personB2VocabAssistList10 = Arrays.asList("media hermana", "ruidosa");
        
        // add to the list in the object
        A2Exercise10.personBVocabAssist = personB2VocabAssistList10;
        
        
        List<String> personB2VocabEnglish10= Arrays.asList("half sister", "noisy");
        A2Exercise10.personBVocabEnglish = personB2VocabEnglish10;
        
        // add object to a list of topic based on the difficulty
        topicsA2.add(A2Exercise10);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A2Exercise11 = new RolePlayTopic();
        // basic role play info
        A2Exercise11.difficulty = difficultyA2;
        A2Exercise11.language = languageSpanish;
        A2Exercise11.topicType = foodAndDrink;
        A2Exercise11.subTopicType = "QR Code";
        A2Exercise11.subTopicKey = "qr_code";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        A2Exercise11.personAText = "<html> Good morning, can I get a large <font color ='red'>almond</font> milk latte please? <br/>"
                + " In that case I'll just have a <font color ='red'>peppermint</font> tea. <br/>"
                + " No, thank you. <br/>"
                + " I have a <font color ='red'>subscription</font> with you. <br/>"
                + " No problem. <br/>"
                + " You too! <html>";
        
        // list of vocab words associated with person A
        List<String> personA2VocabAssistList11 = Arrays.asList("almendra", "menta", "suscripción");
        
        // add to the list in the object
        A2Exercise11.personAVocabAssist = personA2VocabAssistList11;
        
        
        List<String> personA2VocabEnglish11= Arrays.asList("almond", "peppermint", "subscription");
        A2Exercise11.personAVocabEnglish = personA2VocabEnglish11;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A2Exercise11.personBText = "<html> Sorry about this but, we are all out of almond milk. We do have <font color ='red'>oat</font> milk or <font color ='red'>soya</font> milk though.  <br/> "
                + " Sorry about that, can I get you anything else?<br/>"
                + " That'll be 2.40 please. <br/>"
                + " Can you <font color ='red'>scan</font> the QR code for me? <br/>"
                + " Thank you. Have a nice day. <html> ";
        
        
        // list of vocab words associated with person B
        List<String> personB2VocabAssistList11 = Arrays.asList("avena", "soja", "escanear");
        
        // add to the list in the object
        A2Exercise11.personBVocabAssist = personB2VocabAssistList11;
        
        
        List<String> personB2VocabEnglish11= Arrays.asList("oat", "soya", "scan");
        A2Exercise11.personBVocabEnglish = personB2VocabEnglish11;
        
        // add object to a list of topic based on the difficulty
        topicsA2.add(A2Exercise11);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
        RolePlayTopic A2Exercise12 = new RolePlayTopic();
        // basic role play info
        A2Exercise12.difficulty = difficultyA2;
        A2Exercise12.language = languageSpanish;
        A2Exercise12.topicType = appointments;
        A2Exercise12.subTopicType = "Doctor";
        A2Exercise12.subTopicKey = "doctor";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        A2Exercise12.personAText = "<html> Good Morning, I'd like to make an appointment with Dr Tiberal. <br/>"
                + " 27th of June 1989 <br/>"
                + " It's Jane Brown. <br/>"
                + " I have had an <font color ='red'>earache</font> for the last two days and I would like to see the doctor. <br/>"
                + " Can I have 14:45 please. <br/>"
                + " Actually, I would prefer to do it another time. <br/>"
                + " I will, goodbye. <html>";
        
        // list of vocab words associated with person A
        List<String> personA2VocabAssistList12 = Arrays.asList("dolor de oidos");
        
        // add to the list in the object
        A2Exercise12.personAVocabAssist = personA2VocabAssistList12;
        
        
        List<String> personA2VocabEnglish12= Arrays.asList("earache");
        A2Exercise12.personAVocabEnglish = personA2VocabEnglish12;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A2Exercise12.personBText = "<html> What's your date of birth? <br/>"
                + " And your name? <br/>"
                + " Thank you. So, Ms Brown, what's the problem? <br/>"
                + " Okay, we have nothing today. However, we have appointments tomorrow at 10:00 or 14:45. <br/>"
                + " Of course, and I can also see from your record that you need a flu jab. Can I book you in for that too? <br/>"
                + " That's fine, but please book for your <font color ='red'>flu jab</font> soon. <br/>"
                + " Goodbye.<html>";
        
        // list of vocab words associated with person B
        List<String> personB2VocabAssistList12 = Arrays.asList("<html>vacuna de <br/>la gripe<html>");
        
        // add to the list in the object
        A2Exercise12.personBVocabAssist = personB2VocabAssistList12;
        
        
        List<String> personB2VocabEnglish12= Arrays.asList("flu jab");
        A2Exercise12.personBVocabEnglish = personB2VocabEnglish12;
        
        // add object to a list of topic based on the difficulty
        topicsA2.add(A2Exercise12);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A2Exercise13 = new RolePlayTopic();
        // basic role play info
        A2Exercise13.difficulty = difficultyA2;
        A2Exercise13.language = languageSpanish;
        A2Exercise13.topicType = travel;
        A2Exercise13.subTopicType = "Expired Ticket";
        A2Exercise13.subTopicKey = "expired_ticket";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        A2Exercise13.personAText = "<html> Good morning, tickets please.  <br/>"
                + " Your ticket isn't <font color ='red'>valid</font> for this part of the journey. You can pay the rest by card now.  <br/>"
                + " I'm sorry you must have <font color ='red'>misunderstood</font>. Your ticket expired 3 stops ago so you have to pay up or I'm going to have to ask you to get off at the next station. <br/>"
                + " £3.20 please. <br/>"
                + " Thank you. Have a good day.  <html>";
        
        // list of vocab words associated with person A
        List<String> personA2VocabAssistList13 = Arrays.asList("válida", "incomprendida");
        
        // add to the list in the object
        A2Exercise13.personAVocabAssist = personA2VocabAssistList13;
        
        
        List<String> personA2VocabEnglish13= Arrays.asList("valid", "misunderstood");
        A2Exercise13.personAVocabEnglish = personA2VocabEnglish13;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A2Exercise13.personBText = "<html> Good morning, here you go.  <br/> "
                + " But the lady at the ticket office told me it will be okay for the whole journey. <br/>"
                + " Fine. How much is the <font color ='red'>outstanding</font> amount? <br/>"
                + " Here's my card. <br/>"
                + " You too. <html> ";
        
        // list of vocab words associated with person B
        List<String> personB2VocabAssistList13 = Arrays.asList("pendiente");
        
        // add to the list in the object
        A2Exercise13.personBVocabAssist = personB2VocabAssistList13;
        
        
        List<String> personB2VocabEnglish13= Arrays.asList("outstanding");
        A2Exercise13.personBVocabEnglish = personB2VocabEnglish13;
        
        // add object to a list of topic based on the difficulty
        topicsA2.add(A2Exercise13);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        RolePlayTopic A2Exercise14 = new RolePlayTopic();
        // basic role play info
        A2Exercise14.difficulty = difficultyA2;
        A2Exercise14.language = languageSpanish;
        A2Exercise14.topicType = personalInfo;
        A2Exercise14.subTopicType = "Age restricted";
        A2Exercise14.subTopicKey = "age_restricted";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        A2Exercise14.personAText = "<html> Hi there, I have a package for Ms. Anna Smith? <br/>"
                + " Ms. Smith can I see some ID please as the item you have ordered is <font color ='red'>age restricted</font>. <br/>"
                + " I believe the package contains a set of kitchen knives. <br/>"
                + " Thank you. <br/>"
                + " Can you confirm your birthday for me? <br/>"
                + " Thank you, here's your item. Have a good day! <html>";
        
        // list of vocab words associated with person A
        List<String> personA2VocabAssistList14 = Arrays.asList("edad restringida");
        
        // add to the list in the object
        A2Exercise14.personAVocabAssist = personA2VocabAssistList14;
        
                
        List<String> personA2VocabEnglish14= Arrays.asList("age restricted");
        A2Exercise14.personAVocabEnglish = personA2VocabEnglish14;
        
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A2Exercise14.personBText = "<html> Hi, that's me, thanks.  <br/> "
                + " Oh? I don't remember ordering anything dangerous. <br/>"
                + " Oh yes of course! Sorry, I will get my ID right away. <br/>"
                + " Here you go. <br/>"
                + " 17th of May 1989. <br/>"
                + " Thank you, have a good day. <html> ";
        
        // list of vocab words associated with person B
        List<String> personB2VocabAssistList14 = Arrays.asList();
        
        // add to the list in the object
        A2Exercise14.personBVocabAssist = personB2VocabAssistList14;

        
        List<String> personB2VocabEnglish14= Arrays.asList();
        A2Exercise14.personBVocabEnglish = personB2VocabEnglish14;
        
        // add object to a list of topic based on the difficulty
        topicsA2.add(A2Exercise14);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A2Exercise15 = new RolePlayTopic();
        // basic role play info
        A2Exercise15.difficulty = difficultyA2;
        A2Exercise15.language = languageSpanish;
        A2Exercise15.topicType = introductions;
        A2Exercise15.subTopicType = "1st day in job";
        A2Exercise15.subTopicKey = "first_day_in_job";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        A2Exercise15.personAText = "<html> Hi, how's it going? <br/>"
                + " I'm great. Is it your first day today? <br/>"
                + " Don't be nervous we were all new once. I'm Claire by the way, it's nice to meet you. <br/>"
                + " Oh a long time. Over 5 years. How are you finding the job so far? <br/>"
                + " You will get used to it don't worry. <html>";
        
        // list of vocab words associated with person A
        List<String> personA2VocabAssistList15 = Arrays.asList();
        
        // add to the list in the object
        A2Exercise15.personAVocabAssist = personA2VocabAssistList15;
        
        
        List<String> personA2VocabEnglish15= Arrays.asList();
        A2Exercise15.personAVocabEnglish = personA2VocabEnglish15;
        
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A2Exercise15.personBText = "<html> Good thanks, how are you? <br/> "
                + " Yes it is. I am quite nervous. <br/>"
                + " Nice to meet you too. I'm Lucy. How long have you worked for the company? <br/>"
                + " <font color ='red'>Exhausting but rewarding</font>. <html> ";
        
        // list of vocab words associated with person B
        List<String> personB2VocabAssistList15 = Arrays.asList("<html>Agotadora pero<br/>gratificante<html>");
        
        // add to the list in the object
        A2Exercise15.personBVocabAssist = personB2VocabAssistList15;
        
        
        List<String> personB2VocabEnglish15= Arrays.asList("<html>Exhausting but<br/>rewarding<html>");
        A2Exercise15.personBVocabEnglish = personB2VocabEnglish15;
        
        // add object to a list of topic based on the difficulty
        topicsA2.add(A2Exercise15);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A2Exercise16 = new RolePlayTopic();
        // basic role play info
        A2Exercise16.difficulty = difficultyA2;
        A2Exercise16.language = languageSpanish;
        A2Exercise16.topicType = introductions;
        A2Exercise16.subTopicType = "Job offer";
        A2Exercise16.subTopicKey = "job_offer";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        A2Exercise16.personAText = "<html> Good morning, am I speaking to Lucy? <br/>"
                + " Hi Lucy. I'm calling from H&M, <font color ='red'>following</font> your interview we are delighted to offer you a <font color ='red'>position</font>. When can you start? <br/>"
                + " That's perfect. When you come in to the shop, just ask for me, my name is Tim Brown. Can you please bring your passport so we can get the necessary <font color ='red'>paperwork</font> done. <br/>"
                + " How about 10am? <br/>"
                + " Great I will see you Monday at 10 am. Bye now! <html>";
        
        // list of vocab words associated with person A
        List<String> personA2VocabAssistList16 = Arrays.asList("siguiente", "posición", "papeleo");
        
        // add to the list in the object
        A2Exercise16.personAVocabAssist = personA2VocabAssistList16;
        
        
        List<String> personA2VocabEnglish16= Arrays.asList("following", "position", "paperwork");
        A2Exercise16.personAVocabEnglish = personA2VocabEnglish16;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A2Exercise16.personBText = "<html> Hi, yes that's me.  <br/> "
                + " That's brilliant news! I am busy this weekend but I can start as soon as Monday. <br/>"
                + " Yes I will do. Thank you so much again. What time should we meet? <br/>"
                + " That's perfect. See you then! <br/>"
                + " Bye-bye! <html> ";
        
        // list of vocab words associated with person B
        List<String> personB2VocabAssistList16 = Arrays.asList();
        
        // add to the list in the object
        A2Exercise16.personBVocabAssist = personB2VocabAssistList16;
        
        
        List<String> personB2VocabEnglish16= Arrays.asList();
        A2Exercise16.personBVocabEnglish = personB2VocabEnglish16;
        
        // add object to a list of topic based on the difficulty
        topicsA2.add(A2Exercise16);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        RolePlayTopic A2Exercise17 = new RolePlayTopic();
        // basic role play info
        A2Exercise17.difficulty = difficultyA2;
        A2Exercise17.language = languageSpanish;
        A2Exercise17.topicType = directions;
        A2Exercise17.subTopicType = "Hospital Visit";
        A2Exercise17.subTopicKey = "hospital_visit";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        A2Exercise17.personAText = "<html> Hi there I'm here too see Mr. Smith.  <br/>"
                + " David Smith, he was <font color ='red'>admitted</font> yesterday around 9pm. <br/>"
                + " I'm his wife. <br/>"
                + " Here you go.  <br/>"
                + " Thank you very much for your help. Have a good day! <html>";
        
        // list of vocab words associated with person A
        List<String> personA2VocabAssistList17 = Arrays.asList("admitted");
        
        // add to the list in the object
        A2Exercise17.personAVocabAssist = personA2VocabAssistList17;
        
        
        List<String> personA2VocabEnglish17= Arrays.asList("text");
        A2Exercise17.personAVocabEnglish = personA2VocabEnglish17;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A2Exercise17.personBText = "<html> Good morning, I need the full name of the <font color ='red'>patient</font> and the time he was taken in. <br/> "
                + " We are only accepting close relatives of Mr. Smith for visits at the moment. What is your relation to the patient?  <br/>"
                + " Great Mrs. Smith I just need to see some ID. <br/>"
                + " Thank you. His <font color ='red'>ward</font> is the second door on the left at the end of the corridor. <br/>"
                + " Thanks, you too. <html> ";
        
        // list of vocab words associated with person B
        List<String> personB2VocabAssistList17 = Arrays.asList("paciente", "pabellón");
        
        // add to the list in the object
        A2Exercise17.personBVocabAssist = personB2VocabAssistList17;
        
        
        List<String> personB2VocabEnglish17= Arrays.asList("patient", "ward");
        A2Exercise17.personBVocabEnglish = personB2VocabEnglish17;
        
        // add object to a list of topic based on the difficulty
        topicsA2.add(A2Exercise17);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A2Exercise18 = new RolePlayTopic();
        // basic role play info
        A2Exercise18.difficulty = difficultyA2;
        A2Exercise18.language = languageSpanish;
        A2Exercise18.topicType = foodAndDrink;
        A2Exercise18.subTopicType = "Cocktails";
        A2Exercise18.subTopicKey = "cocktails";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        A2Exercise18.personAText = "<html> Hi there we would like to order 2 cocktails please. <br/>"
                + " Pay now please. <br/>"
                + " I thought cocktails were on a <font color ='red'>2 for 1 offer</font>? <br/>"
                + " Well it didn’t say that anywhere. We will leave it for now, thank you. <br/>"
                + " Thanks, you too. <html>";
        
        // list of vocab words associated with person A
        List<String> personA2VocabAssistList18 = Arrays.asList("2 por 1 oferta");
        
        // add to the list in the object
        A2Exercise18.personAVocabAssist = personA2VocabAssistList18;
        
        
        List<String> personA2VocabEnglish18= Arrays.asList("2 for 1 offer");
        A2Exercise18.personAVocabEnglish = personA2VocabEnglish18;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A2Exercise18.personBText = "<html> Coming right up. Would you like to start <font color ='red'>a tab</font> for your table or pay now? <br/> "
                + " Okay your total is £22.50 please. <br/>"
                + " That deal is only <font color ='red'>valid</font> from Monday to Thursday I’m afraid. <br/>"
                + " I’m sorry to hear that. I hope you have a good night. <html> ";
        
        // list of vocab words associated with person B
        List<String> personB2VocabAssistList18 = Arrays.asList("una pestaña", "válida");
        
        // add to the list in the object
        A2Exercise18.personBVocabAssist = personB2VocabAssistList18;
        
        
        List<String> personB2VocabEnglish18= Arrays.asList("a tab", "valid");
        A2Exercise18.personBVocabEnglish = personB2VocabEnglish18;
        
        // add object to a list of topic based on the difficulty
        topicsA2.add(A2Exercise18);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A2Exercise19 = new RolePlayTopic();
        // basic role play info
        A2Exercise19.difficulty = difficultyA2;
        A2Exercise19.language = languageSpanish;
        A2Exercise19.topicType = socialising;
        A2Exercise19.subTopicType = "Succulent";
        A2Exercise19.subTopicKey = "succelent";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        A2Exercise19.personAText = "<html> Is this plant real? <br/>"
                + " What kind of plant is it? <br/>"
                + " What is that? <br/>"
                + " Do you have any other plants? <br/>"
                + " I have many hobbies. I like painting the most. <br/>"
                + " Yes, I have them on tiktok. Do you want to see? <html>";
        
        // list of vocab words associated with person A
        List<String> personA2VocabAssistList19 = Arrays.asList();
        
        // add to the list in the object
        A2Exercise19.personAVocabAssist = personA2VocabAssistList19;
        
        
        List<String> personA2VocabEnglish19= Arrays.asList();
        A2Exercise19.personAVocabEnglish = personA2VocabEnglish19;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A2Exercise19.personBText = "<html> Yes, it's real. <br/> "
                + " It's a <font color ='red'>succulent</font>. <br/>"
                + " It's a <font color ='red'>tropical</font> plant that doesn't need much water but needs a lot of <font color ='red'>sunlight</font>. <br/>"
                + " Yes I have a lot of other plants, it's my hobby. Do you have a hobby? <br/>"
                + " Do you have any pictures? I want to see them. <br/>"
                + " Can I follow you? Send me the <font color ='red'>link</font>. <html> ";
        
        // list of vocab words associated with person B
        List<String> personB2VocabAssistList19 = Arrays.asList("suculenta", "tropical", "luz del sol", "Enlace");
        
        // add to the list in the object
        A2Exercise19.personBVocabAssist = personB2VocabAssistList19;
        
        
        List<String> personB2VocabEnglish19= Arrays.asList("succulent", "tropical", "sunlight", "link");
        A2Exercise19.personBVocabEnglish = personB2VocabEnglish19;
        
        // add object to a list of topic based on the difficulty
        topicsA2.add(A2Exercise19);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A2Exercise20 = new RolePlayTopic();
        // basic role play info
        A2Exercise20.difficulty = difficultyA2;
        A2Exercise20.language = languageSpanish;
        A2Exercise20.topicType = invitations;
        A2Exercise20.subTopicType = "Children at wedding";
        A2Exercise20.subTopicKey = "children_at_wedding";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        A2Exercise20.personAText = "<html> Hey Bill, did you get my <font color ='red'>wedding</font> invitation? <br/>"
                + " I didn't recieve your <font color ='red'>RSVP</font> yet. <br/>"
                + " So sorry to hear that, hopefully we can all get together another time. <br/>"
                + " That's okay. Have a good one! <html>";
        
        // list of vocab words associated with person A
        List<String> personA2VocabAssistList20 = Arrays.asList("boda", "RSVP");
        
        // add to the list in the object
        A2Exercise20.personAVocabAssist = personA2VocabAssistList20;
        
        
        List<String> personA2VocabEnglish20= Arrays.asList("wedding", "RSVP");
        A2Exercise20.personAVocabEnglish = personA2VocabEnglish20;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A2Exercise20.personBText = "<html> I did, yes. <br/> "
                + " Unfortunately, we won't be able to come, the invitation said that it's adults only but there won't be anyone to look after our daughter. <br/>"
                + " Congratulations and thank you for inviting us anyway. <br/>"
                + " You too. <html> ";
        
        // list of vocab words associated with person B
        List<String> personB2VocabAssistList20 = Arrays.asList();
        
        // add to the list in the object
        A2Exercise20.personBVocabAssist = personB2VocabAssistList20;
        
        
        List<String> personB2VocabEnglish20= Arrays.asList();
        A2Exercise20.personBVocabEnglish = personB2VocabEnglish20;
        
        // add object to a list of topic based on the difficulty
        topicsA2.add(A2Exercise20);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A2Exercise21 = new RolePlayTopic();
        // basic role play info
        A2Exercise21.difficulty = difficultyA2;
        A2Exercise21.language = languageSpanish;
        A2Exercise21.topicType = invitations;
        A2Exercise21.subTopicType = "Wedding RSVP";
        A2Exercise21.subTopicKey = "wedding_reservation";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        A2Exercise21.personAText = "<html> Hi Rachel, did you get my wedding invitation? <br/>"
                + " I didn't recieve your RSVP yet. <br/>"
                + " I'm booking the <font color ='red'>catering</font> next week, so can you get back to me as soon as possible? <br/>"
                + " March 18th. <br/>"
                + " While I have you, which meal would you like? <br/>"
                + " Thanks so much, see you soon! <html>";
        
        // list of vocab words associated with person A
        List<String> personA2VocabAssistList21 = Arrays.asList("abastecimiento");
        
        // add to the list in the object
        A2Exercise21.personAVocabAssist = personA2VocabAssistList21;
        
        
        List<String> personA2VocabEnglish21= Arrays.asList("catering");
        A2Exercise21.personAVocabEnglish = personA2VocabEnglish21;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A2Exercise21.personBText = "<html> I did, yes. <br/> "
                + " I don't know if I can make it yet, I have to travel a lot for work. <br/>"
                + " Let me check my <font color ='red'>schedule</font>, what was the date again? <br/>"
                + " That fits perfectly actually/ It may well be possible/ I have to check <br/>"
                + " I'll have the <font color ='red'>vegetarian</font> options please, if you don't mind. <br/>"
                + " Look forward to it! <html> ";
        
        // list of vocab words associated with person B
        List<String> personB2VocabAssistList21 = Arrays.asList("calendario", "vegetariana");
        
        // add to the list in the object
        A2Exercise21.personBVocabAssist = personB2VocabAssistList21;
        
        
        List<String> personB2VocabEnglish21= Arrays.asList("schedule", "vegetarian");
        A2Exercise21.personBVocabEnglish = personB2VocabEnglish21;
        
        // add object to a list of topic based on the difficulty
        topicsA2.add(A2Exercise21);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A2Exercise22 = new RolePlayTopic();
        // basic role play info
        A2Exercise22.difficulty = difficultyA2;
        A2Exercise22.language = languageSpanish;
        A2Exercise22.topicType = culturalExperiences;
        A2Exercise22.subTopicType = "Omelette";
        A2Exercise22.subTopicKey = "omelette";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        A2Exercise22.personAText = "<html> What is this? <br/>"
                + " It looks like an <font color ='red'>omelette</font>. <br/>"
                + " Yes I do. How do you make it? <br/>"
                + " Oh, that would be lovely. Remind me to return your container next time I come over. <br/>"
                + " Excellent, is it <font color ='red'>recycleable</font>? <html>";
        
        // list of vocab words associated with person A
        List<String> personA2VocabAssistList22 = Arrays.asList("tortilla", "reciclable");
        
        // add to the list in the object
        A2Exercise22.personAVocabAssist = personA2VocabAssistList22;
        
        
        List<String> personA2VocabEnglish22= Arrays.asList("omelette", "recycleable");
        A2Exercise22.personAVocabEnglish = personA2VocabEnglish22;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A2Exercise22.personBText = "<html> It's a Tortilla. <br/> "
                + " Yes, it's an egg and potato omelette. Do you like it? <br/>"
                + " I didn't make it, my mum made it  for me. Would you like to take some home? I can put a piece in a container. <br/>"
                + " Don't worry, it's just an old <font color ='red'>takeaway box</font>. It's clean. <br/>"
                + " I think so, but you must check. <html> ";
        
        // list of vocab words associated with person B
        List<String> personB2VocabAssistList22 = Arrays.asList("caja para llevar");
        
        // add to the list in the object
        A2Exercise22.personBVocabAssist = personB2VocabAssistList22;
        
        
        List<String> personB2VocabEnglish22= Arrays.asList("takeaway box");
        A2Exercise22.personBVocabEnglish = personB2VocabEnglish22;
        
        // add object to a list of topic based on the difficulty
        topicsA2.add(A2Exercise22);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A2Exercise24 = new RolePlayTopic();
        // basic role play info
        A2Exercise24.difficulty = difficultyA2;
        A2Exercise24.language = languageSpanish;
        A2Exercise24.topicType = health;
        A2Exercise24.subTopicType = "Visiting patient";
        A2Exercise24.subTopicKey = "visiting_patient";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        A2Exercise24.personAText = "<html> Hi there I'm here to see Mr. Smith.  <br/>"
                + " David Smith, he was admitted yesterday around 9pm. <br/>"
                + " I'm his wife. <br/>"
                + " Here you go. <br/>"
                + " How is he doing? Is he eating normally? <html>";
        
        // list of vocab words associated with person A
        List<String> personA2VocabAssistList24 = Arrays.asList();
        
        // add to the list in the object
        A2Exercise24.personAVocabAssist = personA2VocabAssistList24;
        
        
        List<String> personA2VocabEnglish24= Arrays.asList();
        A2Exercise24.personAVocabEnglish = personA2VocabEnglish24;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A2Exercise24.personBText = "<html> Good morning, I need the full name of the patient and the time he was taken in. <br/> "
                + " We are only accepting close relatives of Mr. Smith for visits at the moment. What is your relationship to the patient? <br/>"
                + " Great Mrs. Smith I just need to see some ID. <br/>"
                + " Thank you. His room is the second door on the left at the end of the corridor.  <br/>"
                + " Yes, he had his breakfast this morning everything seems good. The doctor is just <font color ='red'>making his rounds</font> so you will be able to talk to him about this in more detail. <html> ";
        
        // list of vocab words associated with person B
        List<String> personB2VocabAssistList24 = Arrays.asList("haciendo sus rondas");
        
        // add to the list in the object
        A2Exercise24.personBVocabAssist = personB2VocabAssistList24;
        
        
        List<String> personB2VocabEnglish24= Arrays.asList("making his rounds");
        A2Exercise24.personBVocabEnglish = personB2VocabEnglish24;
        
        // add object to a list of topic based on the difficulty
        topicsA2.add(A2Exercise24);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A2Exercise25 = new RolePlayTopic();
        // basic role play info
        A2Exercise25.difficulty = difficultyA2;
        A2Exercise25.language = languageSpanish;
        A2Exercise25.topicType = weather;
        A2Exercise25.subTopicType = "Clothing for weather";
        A2Exercise25.subTopicKey = "cloathing_for_weather";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        A2Exercise25.personAText = "<html> Hello, I'm back. <br/>"
                + " You should wear a jacket, it's cold today. <br/>"
                + " The sky is clear but it's very windy. <br/>"
                + " Where are you going? <br/>"
                + " We don't have any milk, can you get some. <html>";
        
        // list of vocab words associated with person A
        List<String> personA2VocabAssistList25 = Arrays.asList();
        
        // add to the list in the object
        A2Exercise25.personAVocabAssist = personA2VocabAssistList25;
        
        
        List<String> personA2VocabEnglish25= Arrays.asList();
        A2Exercise25.personAVocabEnglish = personA2VocabEnglish25;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A2Exercise25.personBText = "<html> Welcome home. <font color ='red'>Just in time</font>, I'm about to leave now. <br/> "
                + " Is it? But it is sunny. <br/>"
                + " I'll bring a <font color ='red'>scarf</font> too. <br/>"
                + " I'm going to the supermarket, do you want anything? <br/>"
                + " Sure, see you in a bit.<html> ";
        
        // list of vocab words associated with person B
        List<String> personB2VocabAssistList25 = Arrays.asList("justo a tiempo", "bufanda");
        
        // add to the list in the object
        A2Exercise25.personBVocabAssist = personB2VocabAssistList25;
        
        
        List<String> personB2VocabEnglish25= Arrays.asList("Just in time", "scarf");
        A2Exercise25.personBVocabEnglish = personB2VocabEnglish25;
        
        // add object to a list of topic based on the difficulty
        topicsA2.add(A2Exercise25);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic B1Exercise1 = new RolePlayTopic();
        // basic role play info
        B1Exercise1.difficulty = difficultyB1;
        B1Exercise1.language = languageSpanish;
        B1Exercise1.topicType = shopping;
        B1Exercise1.subTopicType = "Payment";
        B1Exercise1.subTopicKey = "payment";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        B1Exercise1.personAText = "<html> Hi there. May I pay for these items please? <br/>"
                + " £255! Are you sure? <br/>"
                + " Oh. That is too much. I will only buy one of the pairs of trousers. <br/>"
                + " The blue. I'm so sorry about this. <br/>"
                + " Ok. Here's my card. <br/>"
                + " Oh dear. I think I'll leave it. Bye. <html>";
        
        // list of vocab words associated with person A
        List<String> personA3VocabAssistList1 = Arrays.asList();
        
        // add to the list in the object
        B1Exercise1.personAVocabAssist = personA3VocabAssistList1;
        
        
        List<String> personA3VocabEnglish1= Arrays.asList();
        B1Exercise1.personAVocabEnglish = personA3VocabEnglish1;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        B1Exercise1.personBText = "<html> Hello, yes of course. Your total is £255. Will you be paying by <font color ='red'>cash</font> or <font color ='red'>card</font>? <br/> "
                + " Yes. You have bought 2 pairs of trousers at £65 each, and a jumper - that's £125. That's £255 in total. <br/>"
                + " Which one - the blue or the black. <br/>"
                + " Not a problem. Right, so, that's one pair of trousers at £65 and a jumper at £125. So, £190 please. <br/>"
                + " Right, please can you insert your card. Oh, I'm sorry, the payment has not been <font color ='red'>authorised</font>. <html> ";
        
        // list of vocab words associated with person B
        List<String> personB3VocabAssistList1 = Arrays.asList("dinero en efectivo", "tarjeta", "autorizada");
        
        // add to the list in the object
        B1Exercise1.personBVocabAssist = personB3VocabAssistList1;
        
        
        List<String> personB3VocabEnglish1= Arrays.asList("cash", "card", "authorised");
        B1Exercise1.personBVocabEnglish = personB3VocabEnglish1;
        
        // add object to a list of topic based on the difficulty
        topicsB1.add(B1Exercise1);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic B1Exercise2 = new RolePlayTopic();
        // basic role play info
        B1Exercise2.difficulty = difficultyB1;
        B1Exercise2.language = languageSpanish;
        B1Exercise2.topicType = university;
        B1Exercise2.subTopicType = "Study plans";
        B1Exercise2.subTopicKey = "study_plans";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        B1Exercise2.personAText = "<html> How are you? <br/>"
                + " I'm stressed. <br/>"
                + " I have two <font color ='red'>assignments</font> and they are both <font color ='red'>due</font> next Monday. It's just too much! <br/>"
                + " It's hard for me to study with other people, because I get <font color ='red'>distracted</font>.<br/>"
                + " That would be really helpful. But I know that I can't sit in the library for hours. <br/>"
                + " That would be really helpful, thank you. <html>";
        
        // list of vocab words associated with person A
        List<String> personA3VocabAssistList2 = Arrays.asList("asignaciones", "vencer", "distraído");
        
        // add to the list in the object
        B1Exercise2.personAVocabAssist = personA3VocabAssistList2;
        
        
        List<String> personA3VocabEnglish2= Arrays.asList("assignments", "due", "distracted");
        B1Exercise2.personAVocabEnglish = personA3VocabEnglish2;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        B1Exercise2.personBText = "<html> I'm doing okay, you? <br/> "
                + " Why are you stressed? <br/>"
                + " Well, I have the same assignments, why don't we meet in the library and study together? <br/>"
                + " Well, I don't get distracted. Look, we can talk about the <font color ='red'>structure</font> and share some ideas. <br/>"
                + " You're not meant to. We will take a short break every couple of hours - that's the way to <font color ='red'>maintain</font> focus!<html> ";
        
        // list of vocab words associated with person B
        List<String> personB3VocabAssistList2 = Arrays.asList("estructura", "mantener");
        
        // add to the list in the object
        B1Exercise2.personBVocabAssist = personB3VocabAssistList2;
        
        
        List<String> personB3VocabEnglish2= Arrays.asList("structure", "maintain");
        B1Exercise2.personBVocabEnglish = personB3VocabEnglish2;
        
        // add object to a list of topic based on the difficulty
        topicsB1.add(B1Exercise2);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic B1Exercise3 = new RolePlayTopic();
        // basic role play info
        B1Exercise3.difficulty = difficultyB1;
        B1Exercise3.language = languageSpanish;
        B1Exercise3.topicType = travel;
        B1Exercise3.subTopicType = "E.ticket";
        B1Exercise3.subTopicKey = "eticket";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        B1Exercise3.personAText = "<html> Good morning, tickets please.  <br/>"
                + " Would you like to buy one now? <br/>"
                + " if you can't find the paper copy, the ticket is also available on your phone sir. <br/>"
                + " Just show me the <font color ='red'>QR code</font>. Thank you. Now, I see you have a <font color ='red'>rail card</font>. Please may I see it? <br/>"
                + " Thank you that is all done. Have a nice day! <html>";
        
        // list of vocab words associated with person A
        List<String> personA3VocabAssistList3 = Arrays.asList("Código QR", "tarjeta de tren");
        
        // add to the list in the object
        B1Exercise3.personAVocabAssist = personA3VocabAssistList3;
        
        List<String> personA3VocabEnglish3= Arrays.asList("QR code", "rail card");
        B1Exercise3.personAVocabEnglish = personA3VocabEnglish3;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        B1Exercise3.personBText = "<html> Good morning. Oh no..I think I forgot my ticket. Can you wait a moment? <br/> "
                + " No, I'm sure I have it somewhere just give me a minute. I printed off a copy yesterday evening. <br/>"
                + " You're right, it's right here. What do I do now?  <br/>"
                + " Here it is. I know that this is stored on my phone. <br/>"
                + " Have a good day! <html> ";
        
        // list of vocab words associated with person B
        List<String> personB3VocabAssistList3 = Arrays.asList();
        
        // add to the list in the object
        B1Exercise3.personBVocabAssist = personB3VocabAssistList3;
        
        
        List<String> personB3VocabEnglish3= Arrays.asList();
        B1Exercise3.personBVocabEnglish = personB3VocabEnglish3;
        
        // add object to a list of topic based on the difficulty
        topicsB1.add(B1Exercise3);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic B1Exercise4 = new RolePlayTopic();
        // basic role play info
        B1Exercise4.difficulty = difficultyB1;
        B1Exercise4.language = languageSpanish;
        B1Exercise4.topicType = shopping;
        B1Exercise4.subTopicType = "Cancel hair appointment";
        B1Exercise4.subTopicKey = "cancel_hair_appointment";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        B1Exercise4.personAText = "<html> Good morning, how can I help? <br/>"
                + " When is your appointment? <br/>"
                + " We require 24 hours <font color ='red'>notice</font> to cancel appointments, otherwise there's a <font color ='red'>cancellation charge</font> of £20. <br/>"
                + " Because our salon is very popular and we are often booked in advance and we don't do <font color ='red'>walk-ins</font>. Next time, please book at time that you can make.<br/>"
                + " Unfortunately, that's the agreement you made when making the appointment. <html>";
        
        // list of vocab words associated with person A
        List<String> personA3VocabAssistList4 = Arrays.asList("darse cuenta", "cargo de cancelación", "<html>visitas sin <br/>cita previa<html>");
        
        // add to the list in the object
        B1Exercise4.personAVocabAssist = personA3VocabAssistList4;
        
        
        List<String> personA3VocabEnglish4= Arrays.asList("notice", "cancellation charge", "walk-ins");
        B1Exercise4.personAVocabEnglish = personA3VocabEnglish4;
        
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        B1Exercise4.personBText = "<html> Good morning, I'd like to cancel my appointment please. <br/> "
                + " Today at 4pm. <br/>"
                + " Why do I have to pay to cancel my appointment? <br/>"
                + " I have to work <font color ='red'>last minute</font> and can't make it at 4pm anymore, I can't afford to pay for a haircut that I didn't get. <br/>"
                + " Well, I will not be coming back here again. <html> ";
        
        // list of vocab words associated with person B
        List<String> personB3VocabAssistList4 = Arrays.asList("último minuto");
        
        // add to the list in the object
        B1Exercise4.personBVocabAssist = personB3VocabAssistList4;
        
        List<String> personB3VocabEnglish4= Arrays.asList("last minute");
        B1Exercise4.personBVocabEnglish = personB3VocabEnglish4;
        
        // add object to a list of topic based on the difficulty
        topicsB1.add(B1Exercise4);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic B1Exercise5 = new RolePlayTopic();
        // basic role play info
        B1Exercise5.difficulty = difficultyB1;
        B1Exercise5.language = languageSpanish;
        B1Exercise5.topicType = shopping;
        B1Exercise5.subTopicType = "Purchase of computer";
        B1Exercise5.subTopicKey = "purchase_computer";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        B1Exercise5.personAText = "<html> Hi, can I buy this laptop? <br/>"
                + " Thank you. <br/>"
                + " I was hoping for a more neutral colour. <br/>"
                + " No thank you, I have already travelled 40 minutes to come here. Are there any other <font color ='red'>similar</font> laptops you can <font color ='red'></font>recommend to me? <br/>"
                + " It's £50 outside of my price range. <br/>"
                + " That's perfect, can I buy this one? <br/>"
                + " Thank you very much. <html>";
        
        // list of vocab words associated with person A
        List<String> personA3VocabAssistList5 = Arrays.asList("similar");
        
        // add to the list in the object
        B1Exercise5.personAVocabAssist = personA3VocabAssistList5;
        
        
        List<String> personA3VocabEnglish5= Arrays.asList("similar");
        B1Exercise5.personAVocabEnglish = personA3VocabEnglish5;
        
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        B1Exercise5.personBText = "<html> That one is quite popular, let me check if it's <font color ='red'>in stock</font>. <br/> "
                + " I've had a look and we don't have the black or grey in stock, however we do have the pink avaliable. <br/>"
                + " Unfortunately this one is very popular, the black is avaliable in another store half an hour away. Would you like me to reserve it for you? <br/>"
                + " There is one here in grey, that has more <font color ='red'>memory</font> and a better <font color ='red'>processor</font> but it's more expensive. <br/>"
                + " Are you a student? Because we have a student <font color ='red'>discount</font> and that will make it £40 cheaper. <br/>"
                + " Of course, I'll put it behind the till for you. <html> ";
        
        // list of vocab words associated with person B
        List<String> personB3VocabAssistList5 = Arrays.asList("en stock", "memoria", "processor", "descuento");
        
        // add to the list in the object
        B1Exercise5.personBVocabAssist = personB3VocabAssistList5;
        
        List<String> personB3VocabEnglish5= Arrays.asList("in stock", "memory", "processor", "discount");
        B1Exercise5.personBVocabEnglish = personB3VocabEnglish5;
        
        // add object to a list of topic based on the difficulty
        topicsB1.add(B1Exercise5);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic B1Exercise6 = new RolePlayTopic();
        // basic role play info
        B1Exercise6.difficulty = difficultyB1;
        B1Exercise6.language = languageSpanish;
        B1Exercise6.topicType = socialising;
        B1Exercise6.subTopicType = "Haircut";
        B1Exercise6.subTopicKey = "haircut";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        B1Exercise6.personAText = "<html> Hiya, long time no see! <br/>"
                + " I've been good, yourself? You look great by the way, did you change your hair? <br/>"
                + " Where is it? <br/>"
                + " Let me write that down, I might just check it out. How much was it? <br/>"
                + " £200! That's too expensive. <br/>"
                + " Thank you for saying that, but I dye my hair at home on my own. It's about £10 at the drugstore. <br/>"
                + " You as well, bye. <html>";
        
        // list of vocab words associated with person A
        List<String> personA3VocabAssistList6 = Arrays.asList();
        
        // add to the list in the object
        B1Exercise6.personAVocabAssist = personA3VocabAssistList6;
        
        
        List<String> personA3VocabEnglish6= Arrays.asList();
        B1Exercise6.personAVocabEnglish = personA3VocabEnglish6;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        B1Exercise6.personBText = "<html> Hi, yeah, it's been ages. How are you getting on? <br/> "
                + " Thanks for noticing, I found this excellent new hairdresser. <br/>"
                + " It's not far from my house? Maybe 20 minutes by bus. It's called Serenity Salon. <br/>"
                + " I had a cut and <font color ='red'>blowdry</font> and a full head of colour so it was £200. <br/>"
                + " Well it is worth to have good colour. Your hair is lovely natural anyway, you don't need an expensive colour. <br/>"
                + " I couldn't even tell, it looks amazing. Anyway I've got to run. It was lovely seeing you. <html> ";
        
        // list of vocab words associated with person B
        List<String> personB3VocabAssistList6 = Arrays.asList("golpe a secas");
        
        // add to the list in the object
        B1Exercise6.personBVocabAssist = personB3VocabAssistList6;
        
        
        List<String> personB3VocabEnglish6= Arrays.asList("blowdry");
        B1Exercise6.personBVocabEnglish = personB3VocabEnglish6;
        
        // add object to a list of topic based on the difficulty
        topicsB1.add(B1Exercise6);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic B1Exercise7 = new RolePlayTopic();
        // basic role play info
        B1Exercise7.difficulty = difficultyB1;
        B1Exercise7.language = languageSpanish;
        B1Exercise7.topicType = weather;
        B1Exercise7.subTopicType = "Rain in station";
        B1Exercise7.subTopicKey = "rain_in_station";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        B1Exercise7.personAText = "<html> Hey why weren't you at class this morning? <br/>"
                + " Tell me about it. It was meant to be sunny, so I didn't bring an umbrella and got completely <font color ='red'>soaked</font>. <br/>"
                + " Anyway, do you want the notes from the class this morning? <br/>"
                + " I will take a picture and send it to you later. I have to run now but it was nice talking you! <br/>"
                + " Bye. And good luck for your journey home. <html>";
        
        // list of vocab words associated with person A
        List<String> personA3VocabAssistList7 = Arrays.asList("soaked");
        
        // add to the list in the object
        B1Exercise7.personAVocabAssist = personA3VocabAssistList7;
        
        
        List<String> personA3VocabEnglish7= Arrays.asList("text");
        B1Exercise7.personAVocabEnglish = personA3VocabEnglish7;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        B1Exercise7.personBText = "<html> Hi! Well because of the rain my station was completely <font color ='red'>flooded</font>. I had to get a <font color ='red'>replacement bus</font>  which was 30 minutes late.  <br/> "
                + " This is why I always carry an umbrella. You never know. <br/>"
                + " Yes please, that would be great. <br/>"
                + " Same here. See you later! <br/>"
                + " Thanks, bye! <html> ";
        
        // list of vocab words associated with person B
        List<String> personB3VocabAssistList7 = Arrays.asList("Inundada", "autobús de reemplazo");
        
        // add to the list in the object
        B1Exercise7.personBVocabAssist = personB3VocabAssistList7;
        
        
        List<String> personB3VocabEnglish7= Arrays.asList("flooded", "replacement bus");
        B1Exercise7.personBVocabEnglish = personB3VocabEnglish7;
        
        // add object to a list of topic based on the difficulty
        topicsB1.add(B1Exercise7);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic B1Exercise8 = new RolePlayTopic();
        // basic role play info
        B1Exercise8.difficulty = difficultyB1;
        B1Exercise8.language = languageSpanish;
        B1Exercise8.topicType = foodAndDrink;
        B1Exercise8.subTopicType = "Ordering cocktails by barcode";
        B1Exercise8.subTopicKey = "cocktails_by_barcode";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        B1Exercise8.personAText = "<html> Hi there, can we order some cocktails please? <br/>"
                + " We have already waited half an hour for a table. Can't I just pay you and have my drinks? <br/>"
                + " I understand that but it will be another hour until we get our drinks and I'm not willing to wait that long. <br/>"
                + " We will see about that. <html>";
        
        // list of vocab words associated with person A
        List<String> personA3VocabAssistList8 = Arrays.asList();
        
        // add to the list in the object
        B1Exercise8.personAVocabAssist = personA3VocabAssistList8;
        
        
        List<String> personA3VocabEnglish8= Arrays.asList();
        B1Exercise8.personAVocabEnglish = personA3VocabEnglish8;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        B1Exercise8.personBText = "<html> Good evening, I'm sorry but we're only taking orders through our app at the moment. If you take a seat at your table you can <font color ='red'>scan the barcode</font> and your drinks will be delivered right to your table.  <br/> "
                + " Unfortunately, not. It is a Friday night, we're extremely busy and this <font color ='red'>system ensures</font> everyone gets their orders on time.  <br/>"
                + " You're welcome to go somewhere else, but I can <font color ='red'>assure</font> you all bars operate under the same <font color ='red'>policy</font> at the moment. <html> ";
        
        // list of vocab words associated with person B
        List<String> personB3VocabAssistList8 = Arrays.asList("<html>escanear el <br/>código de barras<html>", "el sistema asegura", "asegurar", "política");
        
        // add to the list in the object
        B1Exercise8.personBVocabAssist = personB3VocabAssistList8;
        
        
        List<String> personB3VocabEnglish8= Arrays.asList("scan the barcode", "system ensures", "assure", "policy");
        B1Exercise8.personBVocabEnglish = personB3VocabEnglish8;
        
        // add object to a list of topic based on the difficulty
        topicsB1.add(B1Exercise8);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic B1Exercise9 = new RolePlayTopic();
        // basic role play info
        B1Exercise9.difficulty = difficultyB1;
        B1Exercise9.language = languageSpanish;
        B1Exercise9.topicType = invitations;
        B1Exercise9.subTopicType = "Offering help for Pink Unicorn Party";
        B1Exercise9.subTopicKey = "offering_help";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        B1Exercise9.personAText = "<html> Hi Mary did you get my letter? <br/>"
                + " Yes that one.  <br/>"
                + " The party starts at 14:00. <br/>"
                + " I actually do. It's not easy organising a party for 20 kids. <br/>"
                + " My daughter wanted a <font color ='red'>pink, unicorn theme</font> so if you have any pink decorations that would be great. <br/>"
                + " Yeah, that will give us enough time. Thank you so much for this.  <html>";
        
        // list of vocab words associated with person A
        List<String> personA3VocabAssistList9 = Arrays.asList("<html>rosa, tema <br/>de unicornio<html>");
        
        // add to the list in the object
        B1Exercise9.personAVocabAssist = personA3VocabAssistList9;
        
        
        List<String> personA3VocabEnglish9= Arrays.asList("pink, unicorn theme");
        B1Exercise9.personAVocabEnglish = personA3VocabEnglish9;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        B1Exercise9.personBText = "<html> Hi! About your daughter's birthday party next week? <br/>"
                + " Of course! Me and the kids would be delighted to attend. What time does it start? <br/>"
                + " Do you need help setting up? <br/>"
                + " Yeah I know, it's hard work. Do you need me to bring anything? Food, decorations? <br/>"
                + " I will see what I can do. Shall I meet you at your place at 12? <br/>"
                + " Oh, don't mention it! See you soon. <html>";
        // list of vocab words associated with person B
        List<String> personB3VocabAssistList9 = Arrays.asList();
        
        // add to the list in the object
        B1Exercise9.personBVocabAssist = personB3VocabAssistList9;
        
        
        List<String> personB3VocabEnglish9= Arrays.asList();
        B1Exercise9.personBVocabEnglish = personB3VocabEnglish9;
        
        // add object to a list of topic based on the difficulty
        topicsB1.add(B1Exercise9);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic B1Exercise10 = new RolePlayTopic();
        // basic role play info
        B1Exercise10.difficulty = difficultyB1;
        B1Exercise10.language = languageSpanish;
        B1Exercise10.topicType = work;
        B1Exercise10.subTopicType = "Job offer";
        B1Exercise10.subTopicKey = "job_offer";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        B1Exercise10.personAText = "<html> Good morning, am I speaking to Lucy? <br/>"
                + " Hi Lucy. I'm calling from H&M head office, following your interview we are delighted to offer you a position. Would you be able to start on Monday? <br/>"
                + " That's perfect. When you come in ask for me at <font color ='red'>reception</font>, my name is Tim Brown. Can you please bring your passport so we can get the necessary paperwork done. <br/>"
                + " How about 10 am? <br/>"
                + " If you have an insurance <font color ='red'>card/national insurance number</font> bring that along too. There's no uniform but dress smartly. Blazer, black trousers, basic office <font color ='red'>attire</font>. <br/>"
                + " My pleasure Lucy, welcome to the team. Bye! <html>";
        
        // list of vocab words associated with person A
        List<String> personA3VocabAssistList10 = Arrays.asList("recepción", "<html>número de tarjeta/<br/>seguro nacional<html>", "atuendo");
        
        // add to the list in the object
        B1Exercise10.personAVocabAssist = personA3VocabAssistList10;
        
        
        List<String> personA3VocabEnglish10= Arrays.asList("reception", "<html>card/national <br/>insurance number<html>", "attire");
        B1Exercise10.personAVocabEnglish = personA3VocabEnglish10;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        B1Exercise10.personBText = "<html> Hi, yes that's me.  <br/> "
                + " That's brilliant news! I had to give 2 weeks <font color ='red'>notice</font> at work, so I can start on Monday in 2 weeks. <br/>"
                + " Yes I will do. Thank you so much again. What time should we meet? <br/>"
                + " That's perfect. Is there anything else I should bring? And is there a <font color ='red'>dress code</font> or <font color ='red'>uniform</font>? <br/>"
                + " Okay, thank you so much. See you soon! <html> ";
        
        // list of vocab words associated with person B
        List<String> personB3VocabAssistList10 = Arrays.asList("darse cuenta", "<html>código de <br/>vestimenta<html>", "uniforme");
        
        // add to the list in the object
        B1Exercise10.personBVocabAssist = personB3VocabAssistList10;
        
        
        List<String> personB3VocabEnglish10= Arrays.asList("notice", "dress code", "uniform");
        B1Exercise10.personBVocabEnglish = personB3VocabEnglish10;
        
        // add object to a list of topic based on the difficulty
        topicsB1.add(B1Exercise10);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic B1Exercise11 = new RolePlayTopic();
        // basic role play info
        B1Exercise11.difficulty = difficultyB1;
        B1Exercise11.language = languageSpanish;
        B1Exercise11.topicType = housing;
        B1Exercise11.subTopicType = "Delivery of packages";
        B1Exercise11.subTopicKey = "delivery_of_package";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        B1Exercise11.personAText = "<html> Hello? who is it? <br/>"
                + " Oh right, is everything okay? <br/>"
                + " I don't have any packages for anyone at the moment, no. <br/>"
                + " Those are my feet, but I don't have that package, when was it? <br/>"
                + " I do remember that package, but number 8 came and collected it. <br/>"
                + " Since I work from home, I collect the packages for the whole apartment block. I get <font color ='red'>at least</font> two for her a week. I'm not sure why she didn't deliver it to you when she saw it wasn't hers. I'm really sorry about that. <br/>"
                + " I hope you find it, I'll be more <font color ='red'>careful</font> next time. <html>";
        
        // list of vocab words associated with person A
        List<String> personA3VocabAssistList11= Arrays.asList("al menos", "cuidado");
        
        // add to the list in the object
        B1Exercise11.personAVocabAssist = personA3VocabAssistList11;
        
        
        List<String> personA3VocabEnglish11= Arrays.asList("at least", "careful");
        B1Exercise11.personAVocabEnglish = personA3VocabEnglish11;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        B1Exercise11.personBText = "<html> Hi, it's your neighbour from number 5. <br/> "
                + " Yeah, a few weeks ago my package was delivered here, do you have it? <br/>"
                + " It says here on the delivery email that it was delivered here, and this picture shows it at your door. <br/>"
                + " About two weeks ago. <br/>"
                + " Why would she collect my package? <br/>"
                + " Okay, thank you for telling me. I'll go to her door and ask. <html> ";
        
        // list of vocab words associated with person B
        List<String> personB3VocabAssistList11 = Arrays.asList();
        
        // add to the list in the object
        B1Exercise11.personBVocabAssist = personB3VocabAssistList11;
        
        
        List<String> personB3VocabEnglish11= Arrays.asList();
        B1Exercise11.personBVocabEnglish = personB3VocabEnglish11;
        
        // add object to a list of topic based on the difficulty
        topicsB1.add(B1Exercise11);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic B2Exercise1 = new RolePlayTopic();
        // basic role play info
        B2Exercise1.difficulty = difficultyB2;
        B2Exercise1.language = languageSpanish;
        B2Exercise1.topicType = shopping;
        B2Exercise1.subTopicType = "Phone purchase";
        B2Exercise1.subTopicKey = "phone_purchase";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        B2Exercise1.personAText = "<html> Hi, can I buy this phone? <br/>"
                + " No, I didn't. <br/>"
                + " No, that's way too long to wait to buy a phone. <br/>"
                + " Fine, I will make the reservation. But is there anything you can offer me in return for my having to wait?<html>";
        
        // list of vocab words associated with person A
        List<String> personA4VocabAssistList1 = Arrays.asList();
        
        // add to the list in the object
        B2Exercise1.personAVocabAssist = personA4VocabAssistList1;
        
        
        List<String> personA4VocabEnglish1= Arrays.asList();
        B2Exercise1.personAVocabEnglish = personA4VocabEnglish1;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        B2Exercise1.personBText = "<html> Did you make a reservation? <br/> "
                + " You need a reservation, I can make one for you but it will be in about 30 minutes. Is that okay? <br/>"
                + " Well, unfortunately, we are extremely busy because of the <font color ='red'>launch</font> of our newest phone, and two <font color ='red'>models</font> have sold out already today. So if you can wait a little while we can get you a <font color ='red'>slot</font>. Is that okay?<br/>"
                + " I'm afraid not, we have to do reservations today because we are so busy. Next time you should book online to avoid the wait.<html> ";
        
        // list of vocab words associated with person B
        List<String> personB4VocabAssistList1 = Arrays.asList("lanzar", "modelos", "ranura");
        
        // add to the list in the object
        B2Exercise1.personBVocabAssist = personB4VocabAssistList1;
        
        
        List<String> personB4VocabEnglish1= Arrays.asList("launch", "models", "slot");
        B2Exercise1.personBVocabEnglish = personB4VocabEnglish1;
        
        // add object to a list of topic based on the difficulty
        topicsB2.add(B2Exercise1);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
        RolePlayTopic B2Exercise2 = new RolePlayTopic();
        // basic role play info
        B2Exercise2.difficulty = difficultyB2;
        B2Exercise2.language = languageSpanish;
        B2Exercise2.topicType = work;
        B2Exercise2.subTopicType = "Meet for drinks";
        B2Exercise2.subTopicKey = "meet_for_drinks";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        B2Exercise2.personAText = "<html> Hi I haven't seen you around, are you new? <br/>"
                + " <font color ='red'>No kidding</font>! How are you finding it so far? <br/>"
                + " Yeah, it's <font color ='red'>decent</font> for the money. I'm Clare by the way, nice to meet you.  <br/>"
                + " So hey, some of us are going for drinks on Friday, would you like to join us? <br/>"
                + " 8pm at the bar down the road. They have 2 for 1 cocktails all night so we're going to have fun! <br/>"
                + " Awesome, see you there Lucy! <html>";
        
        // list of vocab words associated with person A
        List<String> personA4VocabAssistList2 = Arrays.asList("En serio", "decente");
        
        // add to the list in the object
        B2Exercise2.personAVocabAssist = personA4VocabAssistList2;
        
        
        List<String> personA4VocabEnglish2= Arrays.asList("No kidding", "decent");
        B2Exercise2.personAVocabEnglish = personA4VocabEnglish2;
        
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        B2Exercise2.personBText = "<html> Hi, yeah I am! Yesterday was my first day. <br/> "
                + " Pretty good. Everyone is really nice and the <font color ='red'>workload</font> is <font color ='red'>managable</font>. <br/>"
                + " Nice to meet you too. I'm Lucy. <br/>"
                + " Sure, what time? <br/>"
                + " Oh great! I will see you guys there. <html> ";
        
        // list of vocab words associated with person B
        List<String> personB4VocabAssistList2 = Arrays.asList("carga de trabajo", "manejable");
        
        // add to the list in the object
        B2Exercise2.personBVocabAssist = personB4VocabAssistList2;
        
        List<String> personB4VocabEnglish2= Arrays.asList("workload", "managable");
        B2Exercise2.personBVocabEnglish = personB4VocabEnglish2;
        
        // add object to a list of topic based on the difficulty
        topicsB2.add(B2Exercise2);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic B2Exercise3 = new RolePlayTopic();
        // basic role play info
        B2Exercise3.difficulty = difficultyB2;
        B2Exercise3.language = languageSpanish;
        B2Exercise3.topicType = travel;
        B2Exercise3.subTopicType = "Disneyland";
        B2Exercise3.subTopicKey = "disneyland";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        B2Exercise3.personAText = "<html> Hi John did you get my letter? <br/>"
                + " Yeah that one. <br/>"
                + " A trip to Disneyland? In the middle of summer? You must have got a good deal. <br/>"
                + " Ah, I've heard the parking can be <font color ='red'>tricky</font> if you're not staying inside the <font color ='red'>resort</font> though. <br/>"
                + " Wow, you really thought about everything! Well, have a good time and I will see you when you're back. <html>";
        
        // list of vocab words associated with person A
        List<String> personA4VocabAssistList3 = Arrays.asList("difícil", "complejo");
        
        // add to the list in the object
        B2Exercise3.personAVocabAssist = personA4VocabAssistList3;
        
        
        List<String> personA4VocabEnglish3= Arrays.asList("tricky", "resort");
        B2Exercise3.personAVocabEnglish = personA4VocabEnglish3;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        B2Exercise3.personBText = "<html> About your son's birthday party next week?  <br/> "
                + " Ah, unfortunately we won't be able to come. My wife planned a trip to Disneyland for the whole family, so we're going to be away all week. <br/>"
                + " We did!  Kids under the age of 8 get free entry and we're staying in an <font color ='red'>Airbnb</font> so we're saving a lot on food and <font color ='red'>accomodation</font> too. <br/>"
                + " No need for parking, the Airbnb is actually only a 15 minute walk from the park! <br/>"
                + " Thanks, we will. See you later! <html> ";
        
        // list of vocab words associated with person B
        List<String> personB4VocabAssistList3 = Arrays.asList("airbnb", "alojamiento");
        
        // add to the list in the object
        B2Exercise3.personBVocabAssist = personB4VocabAssistList3;
        
        
        List<String> personB4VocabEnglish3= Arrays.asList("Airbnb", "accomodation");
        B2Exercise3.personBVocabEnglish = personB4VocabEnglish3;
        
        // add object to a list of topic based on the difficulty
        topicsB2.add(B2Exercise3);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic B2Exercise4 = new RolePlayTopic();
        // basic role play info
        B2Exercise4.difficulty = difficultyB2;
        B2Exercise4.language = languageSpanish;
        B2Exercise4.topicType = socialising;
        B2Exercise4.subTopicType = "No show date";
        B2Exercise4.subTopicKey = "no_show_date";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        B2Exercise4.personAText = "<html> Hi Peter. How was your weekend? <br/>"
                + " What happened? <br/>"
                + " That's awful. <br/>"
                + " Do you have a picture of her? <br/>"
                + " Oh wow, she looks like a model. Are you sure she wasn't a catfish. <br/>"
                + " Best to just forget about it, <font color ='red'>there's plenty more fish in the sea</font>. <html>";
        
        // list of vocab words associated with person A
        List<String> personA4VocabAssistList4 = Arrays.asList("<html>hay muchos más<br/>peces en el mar<html>");
        
        // add to the list in the object
        B2Exercise4.personAVocabAssist = personA4VocabAssistList4;
        
        
        List<String> personA4VocabEnglish4= Arrays.asList("<html>there's plenty more<br/>fish in the sea<html>");
        B2Exercise4.personAVocabEnglish = personA4VocabEnglish4;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        B2Exercise4.personBText = "<html> Could have been better. <br/> "
                + " I was supposed to go on <font color ='red'>a date</font> but she <font color ='red'>ghosted</font> me. <br/>"
                + " She seemed <font color ='red'>keen</font>keen but then on the day I just didn't hear from her at all. <font color ='red'>Such a shame</font> because we really clicked, we like the same music and we had a lot to talk about. <br/>"
                + " Here <br/>"
                + " I didn't think about it, I guessed she was real when she agreed to meet up. You could be right. <html> ";
        
        // list of vocab words associated with person B
        List<String> personB4VocabAssistList4 = Arrays.asList("una fecha", "me desertó", "entusiasta", "Una pena");
        
        // add to the list in the object
        B2Exercise4.personBVocabAssist = personB4VocabAssistList4;
        
        
        List<String> personB4VocabEnglish4= Arrays.asList("a date", "ghosted", "keen", "Such a shame");
        B2Exercise4.personBVocabEnglish = personB4VocabEnglish4;
        
        // add object to a list of topic based on the difficulty
        topicsB2.add(B2Exercise4);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
    }
}
