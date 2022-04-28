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
    
    public static List getTopicsA1() {
        return RolePlayManager.topicsA1;
    }
    
    public static List getTopicsA2() {
        return RolePlayManager.topicsA1;
    }
    
    public static List getTopicsB1() {
        return RolePlayManager.topicsA1;
    }
    
    public static List getTopicsB2() {
        return RolePlayManager.topicsA1;
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
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
        RolePlayTopic A1Exercise2 = new RolePlayTopic();
        // basic role play info
        A1Exercise2.difficulty = difficultyA1;
        A1Exercise2.language = languageSpanish;
        A1Exercise2.topicType = foodAndDrink;
        A1Exercise2.subTopicType = "Takeaway";
        
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
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise2.personBText = "<html> Good evening. Do you have a <font color ='red'>reservation</font> with us? <br/> "
                + " I'm afraid we're very busy tonight so there are no free tables. Would you like to wait or come back later?<br/>"
                + " It is <font color ='red'>about</font> one hour. I'm sorry about that. Would you like to order your food for <font color ='red'>takeaway</font> instead? <br/>"
                + " No problem. Your food should be here soon. Have a nice evening!<html> ";
        
        // list of vocab words associated with person B
        List<String> personBVocabAssistList2 = Arrays.asList("reservación", "sobre", "llevar");
        
        // add to the list in the object
        A1Exercise2.personBVocabAssist = personBVocabAssistList2;
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1Exercise2);
        
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A1Exercise3 = new RolePlayTopic();
        // basic role play info
        A1Exercise3.difficulty = difficultyA1;
        A1Exercise3.language = languageSpanish;
        A1Exercise3.topicType = personalInfo;
        A1Exercise3.subTopicType = "Social Media";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise3.personAText = "<html> Hi Peter. How was your weekend? <br/>"
                + " Oh really? What is she like? Did you get her Snapchat? <br/>"
                + " I want to see her. What's her name? I'll look her up on Instagram. <br/>"
                + " I found her! Wow, she is beautiful. I'm happy for you! <html>";

        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise3.personBText = "<html> Hi. It was good thank you. I met a nice girl. <br/> "
                + " She doesn't <font color ='red'> use </font> Snapchat. She's very pretty. She has long brown hair and big green eyes. I like her. <br/>"
                + " You can try. Her name is Natalia Black. <br/>"
                + " I am happy too. And thank you. <html> ";
        
        // list of vocab words associated with person B
        List<String> personBVocabAssistList3 = Arrays.asList("usa");
        
        // add to the list in the object
        A1Exercise3.personBVocabAssist = personBVocabAssistList3;
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1Exercise3);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A1Exercise4 = new RolePlayTopic();
        // basic role play info
        A1Exercise4.difficulty = difficultyA1;
        A1Exercise4.language = languageSpanish;
        A1Exercise4.topicType = shopping;
        A1Exercise4.subTopicType = "Payment";
        
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
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise4.personBText = "<html> Hello, yes of course. Your total is £35. Will you be paying by <font color ='red'>cash</font> or <font color ='red'>card</font>? <br/> "
                + " No problem. You can <font color ='red'>insert</font> or <font color ='red'>touch</font> your card to the machine.  <br/>"
                + " I'm sorry your card <font color ='red'>hasn't worked</font>. Can you try again?<br/>"
                + " That is all done. Thank you for shopping with us. Have a good day!<html> ";
        
        // list of vocab words associated with person B
        List<String> personBVocabAssistList4 = Arrays.asList("en efectivo", "con tarjeta", "insertar", "tocar", "no ha funcionado");
        
        // add to the list in the object
        A1Exercise4.personBVocabAssist = personBVocabAssistList4;
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1Exercise4);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A1Exercise5 = new RolePlayTopic();
        // basic role play info
        A1Exercise5.difficulty = difficultyA1;
        A1Exercise5.language = languageSpanish;
        A1Exercise5.topicType = appointments;
        A1Exercise5.subTopicType = "Booking";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise5.personAText = "<html> Hello, can I make an <font color='red'>appointment</font> for tomorrow. <br/>"
                + " 2pm. <br/>"
                + " Sorry, those times aren't good. Do you have 2pm the day after tomorrow? <br/>"
                + " Perfect, thank you.<html>";
        
        // list of vocab words associated with person A
        List<String> personAVocabAssistList5 = Arrays.asList("cita");
        
        // add to the list in the object
        A1Exercise5.personAVocabAssist = personAVocabAssistList5;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise5.personBText = "<html> No problem, what time would you like <font color ='red'>to book</font>? <br/> "
                + " I'm sorry, that time is not <font color ='red'>available</font>. We have 10am and 5pm.<br/>"
                + " Yes, it's available. I will book that for you.<html> ";
        
        // list of vocab words associated with person B
        List<String> personBVocabAssistList5 = Arrays.asList("reservar", "disponible");
        
        // add to the list in the object
        A1Exercise5.personBVocabAssist = personBVocabAssistList5;
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1Exercise5);
        
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A1Exercise6 = new RolePlayTopic();
        // basic role play info
        A1Exercise6.difficulty = difficultyA1;
        A1Exercise6.language = languageSpanish;
        A1Exercise6.topicType = directions;
        A1Exercise6.subTopicType = "Repeat Name";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise6.personAText = "<html> Hello, my name is Danielle. <br/>"
                + " Sorry I didn't hear you, can you <font color ='red'>repeat</font> that? <br/>"
                + " Michael? <br/>"
                + " It's nice to meet you Michael. <html>";
        
        // list of vocab words associated with person A
        List<String> personAVocabAssistList6 = Arrays.asList("repetir");
        
        // add to the list in the object
        A1Exercise6.personAVocabAssist = personAVocabAssistList6;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise6.personBText = "<html> Hello Danielle, my name is Michael.<br/> "
                + " My name is Michael.<br/>"
                + " Yes, it's Michael.<br/>"
                + " It's nice to meet you too. <html> ";
       
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1Exercise6);
        
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A1Exercise7 = new RolePlayTopic();
        // basic role play info
        A1Exercise7.difficulty = difficultyA1;
        A1Exercise7.language = languageSpanish;
        A1Exercise7.topicType = employment;
        A1Exercise7.subTopicType = "Cover";
        
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
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise7.personBText = "<html> They will arrive in an hour, do you want <font color ='red'>to call back</font> or I can <font color ='red'>take a message?</font><br/> "
                + " What's the matter?<br/>"
                + " Did you <font color ='red'>find cover?</font> <br/>"
                + " <font color ='red'>Send a message in the group chat</font>, hopefully someone can cover your <font color ='red'>shift</font>.<br/>"
                + " Well, I hope you get well soon.<br/>"
                + " Goodbye.<html> ";
        
        // list of vocab words associated with person B
        List<String> personBVocabAssistList7 = Arrays.asList("llamar de nuevo", "darle el mensaje", "encontraste una sustitución", "Envía un mensaje al grupo de chat", "turno");
        
        // add to the list in the object
        A1Exercise7.personBVocabAssist = personBVocabAssistList7;
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1Exercise7);
        
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A1Exercise8 = new RolePlayTopic();
        // basic role play info
        A1Exercise8.difficulty = difficultyA1;
        A1Exercise8.language = languageSpanish;
        A1Exercise8.topicType = shopping;
        A1Exercise8.subTopicType = "Refund";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise8.personAText = "<html> Hello there. I would like a <font color ='red'>refund</font> for these <font color ='red'>items</font> please. <br/>"
                + " That will not work. I want my money back. <br/>"
                + " Fine. But I will take this up with your <font color ='red'>manager</font>. <br/>"
                + " Oh. Well, in that case I will just take the gift voucher. Thank you and have a good day. <html>";
        
        // list of vocab words associated with person A
        List<String> personAVocabAssistList8 = Arrays.asList("reembolso", "artículos", "jefe,a");
        
        // add to the list in the object
        A1Exercise8.personAVocabAssist = personAVocabAssistList8;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise8.personBText = "<html> Hi there. <font color ='red'>Unfortunately</font>, these items look like they have been <font color ='red'>used</font>. I can offer an <font color ='red'>exchange</font> or a <font color ='red'>gift voucher</font> instead. <br/> "
                + " We cannot offer a refund for used items. You can exchange it for another item or I can issue you a gift voucher. <br/>"
                + " I am the manager. <br/>"
                + " You too. Bye! <html> ";
        
        // list of vocab words associated with person B
        List<String> personBVocabAssistList8 = Arrays.asList("desgraciadamente", "usados", "intercambio", "vale regalo");
        
        // add to the list in the object
        A1Exercise8.personBVocabAssist = personBVocabAssistList8;
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1Exercise8);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A1Exercise9 = new RolePlayTopic();
        // basic role play info
        A1Exercise9.difficulty = difficultyA1;
        A1Exercise9.language = languageSpanish;
        A1Exercise9.topicType = socialising;
        A1Exercise9.subTopicType = "Interview arrangements";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise9.personAText = "<html> Hi Derreck. How was your weekend? <br/>"
                + " That is great news! Give me all the details. <br/>"
                + " Will it be <font color ='red'>face-to-face</font> or <font color ='red'>online</font>? <br/>"
                + " Good luck, my friend I will be thinking of you. You will do great! <html>";
        
        // list of vocab words associated with person A
        List<String> personAVocabAssistList9 = Arrays.asList("presencial", "en linea");
        
        // add to the list in the object
        A1Exercise9.personAVocabAssist = personAVocabAssistList9;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise9.personBText = "<html> Hi Pete. Well, I actually <font color ='red'>secured a job interview</font> for this <font color ='red'>admin role</font>. I'm so excited! <br/> "
                + " Well, the interview is at 10:00 tomorrow. The <font color ='red'>dress code</font> is <font color ='red'>smart-casual</font> so I need to wear a shirt and jeans.  <br/>"
                + " Face-to-face so I need to be prepared. It's not far from here, <font color ='red'>only 3 stops on the no.32 bus</font>. <br/>"
                + " Thank you! I will <font color ='red'>let you know</font> how it goes. <html> ";
        
        // list of vocab words associated with person B
        List<String> personBVocabAssistList9 = Arrays.asList("conseguido una entrevista de trabajo", "papel administrativo", "código de vestir", "informal", "solo 3 paradas en la línea 32  de autobús", "haré saber");
        
        // add to the list in the object
        A1Exercise9.personBVocabAssist = personBVocabAssistList9;
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1Exercise9);
         
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A1Exercise10 = new RolePlayTopic();
        // basic role play info
        A1Exercise10.difficulty = difficultyA1;
        A1Exercise10.language = languageSpanish;
        A1Exercise10.topicType = foodAndDrink;
        A1Exercise10.subTopicType = "Coffee Order";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise10.personAText = "<html> Could I please have a regular <font color ='red'>decafe latte</font>. <br/>"
                + " That's okay, I'll just have a regular latte then, and could I get that <font color ='red'>iced</font>. <br/>"
                + " And, do you have <font color ='red'>sugar-free syrup</font>? <br/>"
                + " Could I get the sugar-free vanilla please, and could I get that with <font color ='red'>oat milk</font> please. <br/>"
                + " To go please. <html>";
        
        // list of vocab words associated with person A
        List<String> personAVocabAssistList10 = Arrays.asList("descafeinado con leche", "con hielo", "almíbar sin azúcar", "leche de avena");
        
        // add to the list in the object
        A1Exercise10.personAVocabAssist = personAVocabAssistList10;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise10.personBText = "<html> We have no decafe, sorry about that. <br/> "
                + " Yes. <br/>"
                + " We have sugar-free <font color ='red'>caramel</font>, <font color ='red'>vanilla</font> and <font color ='red'>hazelnut</font>. <br/>"
                + " <font color ='red'>Is that to have in or to go</font>? <html> ";
        
        // list of vocab words associated with person B
        List<String> personBVocabAssistList10 = Arrays.asList("caramelo", "vainilla", "avellana", "Es para tomar aquí o para llevar");
        
        // add to the list in the object
        A1Exercise10.personBVocabAssist = personBVocabAssistList10;
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1Exercise10);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A1Exercise11 = new RolePlayTopic();
        // basic role play info
        A1Exercise11.difficulty = difficultyA1;
        A1Exercise11.language = languageSpanish;
        A1Exercise11.topicType = appointments;
        A1Exercise11.subTopicType = "Spelling your name";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise11.personAText = "<html> Hello, can I make an appointment for tomorrow. <br/>"
                + " Can I book for next week Tuesday then? <br/>"
                + " at 10am please. <br/>"
                + " Jessica Taylor <br/>"
                + " Yes, J E S S I C A, T A Y L O R. <br/>"
                + " Thank you, see you then. <html>";
        
        
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
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1Exercise11);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
        RolePlayTopic A1Exercise12 = new RolePlayTopic();
        // basic role play info
        A1Exercise12.difficulty = difficultyA1;
        A1Exercise12.language = languageSpanish;
        A1Exercise12.topicType = employment;
        A1Exercise12.subTopicType = "Inteview";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise12.personAText = "<html> Good afternoon, how can I help you? <br/>"
                + " What time is the interview? <br/>"
                + " With who? <br/>"
                + " Johnathan works in the other building, it's not far. <br/>"
                + " If you go <font color ='red'>right</font> when you leave the building and then <font color ='red'>turn left</font>. Best of luck with the interview. <html>";
        
        // list of vocab words associated with person A
        List<String> personAVocabAssistList12 = Arrays.asList("derecha", "Gire a la izquierda");
        
        // add to the list in the object
        A1Exercise12.personAVocabAssist = personAVocabAssistList12;
        
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
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1Exercise12);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A1Exercise13 = new RolePlayTopic();
        // basic role play info
        A1Exercise13.difficulty = difficultyA1;
        A1Exercise13.language = languageSpanish;
        A1Exercise13.topicType = foodAndDrink;
        A1Exercise13.subTopicType = "Water for table";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise13.personAText = "<html> Good evening, how is it going? <br/>"
                + " Can I get you some drinks while you look at the menu? <br/>"
                + " I'll get that for you now. Is this your daughter? She's beautiful. <br/>"
                + " Of course, excuse me, I'll get your drinks. <html>";
        
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise13.personBText = "<html> Excellent thanks. <br/> "
                + " Yes, can we get <font color ='red'>tap water</font> for the table and two lemonades. <br/>"
                + " Actually, she's my wife. <html> ";
        
        // list of vocab words associated with person B
        List<String> personBVocabAssistList13 = Arrays.asList("agua del grifo");
        
        // add to the list in the object
        A1Exercise13.personBVocabAssist = personBVocabAssistList13;
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1Exercise13);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        RolePlayTopic A1Exercise14 = new RolePlayTopic();
        // basic role play info
        A1Exercise14.difficulty = difficultyA1;
        A1Exercise14.language = languageSpanish;
        A1Exercise14.topicType = foodAndDrink;
        A1Exercise14.subTopicType = "Reservation";
        
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
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1Exercise14);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        
        RolePlayTopic A1Exercise15 = new RolePlayTopic();
        // basic role play info
        A1Exercise15.difficulty = difficultyA1;
        A1Exercise15.language = languageSpanish;
        A1Exercise15.topicType = directions;
        A1Exercise15.subTopicType = "Delivery Driver";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        
        A1Exercise15.personAText = "<html> Hello there. Is this John? <br/>"
                + " This is Anna, the <font color ='red'>delivery driver</font>. I am <font color ='red'>having trouble</font> finding your house. <br/>"
                + " I'm parked outside the train station. The train station is on my left. <br/>"
                + " Oh yes, I see it. I will be there soon. Goodbye! <html>";
        
        // list of vocab words associated with person A
        List<String> personAVocabAssistList15 = Arrays.asList("Conductora de entrega", "teniendo problemas");
        
        // add to the list in the object
        A1Exercise15.personAVocabAssist = personAVocabAssistList15;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A1Exercise15.personBText = "<html> Hi, yes it is. Who's speaking? <br/> "
                + " Where are you right now? <br/>"
                + " Oh, you're close by. Just cross the street, my house is number 12. It has a red door.  <br/>"
                + " See you soon. Goodbye! <html> ";
        
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1Exercise15);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
    }
}
