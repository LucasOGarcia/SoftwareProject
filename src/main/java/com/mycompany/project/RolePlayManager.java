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
    private static List<RolePlayTopic> topicsA1;
    private static List<RolePlayTopic> topicsA2;
    private static List<RolePlayTopic> topicsB1;
    private static List<RolePlayTopic> topicsB2;
    
    
    public static void createTopics() {
        RolePlayTopic A1exercise1 = new RolePlayTopic();
        // basic role play info
        A1exercise1.difficulty = "A1";
        A1exercise1.language = "Spanish";
        A1exercise1.topic = "Asking and giving directions";
        A1exercise1.subTopic = "Delivery Driver";
        
        //text for person A with html tags for new lines and highlights for eligible vocab assist words
        A1exercise1.personAText = "<html> Hello there. Is this Mary?<br/>"
                + " This is Jhon, the <font color='red'>delivery driver</font>. I am <font color='red'>having trouble</font> finding your apartment. <br/>"
                + " I can't see a statue. Are you sure it's correct?. <br/>"
                + " Oh yes, I see it. I will be there soon. Goodbye!<html>";
        
        // list of vocab words associated with person A
        List<String> personAVocabAssistList = Arrays.asList("conductor, a de reparto", "tengo un problema");
        
        // add to the list within the object
        A1exercise1.personAVocabAssist = personAVocabAssistList;
        
        //text for person B with html tags for new lines and highlights for eligible vocab assist words
        A1exercise1.personBText = "<html> Hi, yes it is. Who's speaking?<br/> "
                + " Yes it can be a little <font color ='red'>tricky</font>. Go past the big black <font color ='red'>gates</font>, turn left at the statue and you should see my building. I live on the 4th floor so I would <font color ='red'>recommend</font> taking the <font color ='red'>lift</font>.<br/>"
                + " It is a big <font color ='red'>stone statue</font>, <font color ='red'>round</font> and grey in colour.<br/>"
                + " See you soon. Goodbye!<html> ";
        
        // list of vocab words associated with person B
        List<String> personBVocabAssistList = Arrays.asList("complicado", "verjas", "estatua", "recomendaría", "ascensor", "piedra", "redonda");
        
        // add to the list within the object
        A1exercise1.personBVocabAssist = personBVocabAssistList;
        
        // add object to a list of topic based on the difficulty
        topicsA1.add(A1exercise1);
    }
}
