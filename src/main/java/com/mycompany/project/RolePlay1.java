package com.mycompany.project;


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JRadioButton;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Najeeha
 */
public class RolePlay1 extends javax.swing.JFrame {

    /**
     * Creates new form RolePlay1
     */
    public RolePlay1() {
        initComponents();
        Page(); 
        initPage();
        
        Button1.setVisible(false); 
        Button2.setVisible(false);
        Button3.setVisible(false);
        Button4.setVisible(false);
        Button5.setVisible(false);
        
        text1.setText("helloo");
        
    }
    
    List<String> buttonsVocabs;
    List<String> radioVocabs;
    
    private void Page() {
        
        /*if (RolePlayManager.getRolePlaySettings() != null 
            && RolePlayManager.getRolePlaySettings().getLanguage() != null
            && RolePlayManager.getRolePlaySettings().getRole()!= null  
            && RolePlayManager.getRolePlaySettings().getDifficulty()!= null 
            && RolePlayManager.getRolePlaySettings().getTopicType()!= null 
            && RolePlayManager.getRolePlaySettings().getSubTopicType()!= null) {*/
        
        //get users previous selections:    
        
            if (RolePlayManager.getRolePlaySettings() != null 
            && RolePlayManager.getRolePlaySettings().getLanguage() != null){
            //language
            
            switch (RolePlayManager.getRolePlaySettings().getLanguage()) {
                case "Spanish":
                    
                    break;
                    
                case "French":
                    break;
                
                case "Portuguese":
                    break;
                
                case "German":
                    break;
                
                case "Italian":
                    break;
                
                case "Greek":
                    break;
            }
            }
            
            //role
            if (RolePlayManager.getRolePlaySettings() != null 
            && RolePlayManager.getRolePlaySettings().getRole()!= null){
            
            switch (RolePlayManager.getRolePlaySettings().getRole()){
                case "StudentRadioButton":
                    
                    break; 
                
                case "TeacherRadioButton":
                    break;
            }
            }
            
            //difficulty 
            if (RolePlayManager.getRolePlaySettings() != null 
            && RolePlayManager.getRolePlaySettings().getDifficulty()!= null){
                
                //to get the selected Difficulty
                List<RolePlayTopic>rolePlayList = new ArrayList();
                
                switch (RolePlayManager.getRolePlaySettings().getDifficulty()){
                case "A1":
                    rolePlayList = RolePlayManager.getTopicsA1(); 
                    break;
                    
                case "A2":
                    rolePlayList = RolePlayManager.getTopicsA2();
                    break;
                    
                case "B1":
                    rolePlayList = RolePlayManager.getTopicsB1();
                    break;
                    
                case "B2":
                    rolePlayList = RolePlayManager.getTopicsB2(); 
                    break;
            }
            }
                
            //topic
            if (RolePlayManager.getRolePlaySettings() != null 
            && RolePlayManager.getRolePlaySettings().getTopicType()!= null){
                
                switch (RolePlayManager.getRolePlaySettings().getTopicType()){
                case "appointmentButton":
                    break;
                case "crossCulturalButton":
                    break;
                case "directionsButton":
                    break;
                case "employmentButton":
                    break;
                case "exchangingPersonalInfoButton":
                    break;
                case "foodAndDrinkButton":
                    break;
                case "healthButton":
                    break;  
                case "housingButton":
                    break;
                case "introductionsButton":
                    break;
                case "invitationButton":
                    break;
                case "shoppingButton":
                    break;
                case "socialisingButton":
                    break;  
                case "travelButton":
                    break;
                case "universityButton":
                    break;
                case "weatherButton":
                    break;
                case "workButton":
                    break;
            }
            }
    }
    
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        RadioButton1 = new javax.swing.JRadioButton();
        RadioButton2 = new javax.swing.JRadioButton();
        RadioButton3 = new javax.swing.JRadioButton();
        RadioButton4 = new javax.swing.JRadioButton();
        RadioButton5 = new javax.swing.JRadioButton();
        Button2 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        Button1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        text1 = new javax.swing.JLabel();
        completeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        RadioButton1.setText("jRadioButton1");
        RadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButton1ActionPerformed(evt);
            }
        });

        RadioButton2.setText("jRadioButton2");
        RadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButton2ActionPerformed(evt);
            }
        });

        RadioButton3.setText("jRadioButton3");
        RadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButton3ActionPerformed(evt);
            }
        });

        RadioButton4.setText("jRadioButton4");
        RadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButton4ActionPerformed(evt);
            }
        });

        RadioButton5.setText("jRadioButton5");
        RadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButton5ActionPerformed(evt);
            }
        });

        Button2.setBackground(new java.awt.Color(242, 242, 242));
        Button2.setText("jButton2");
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        Button3.setBackground(new java.awt.Color(242, 242, 242));
        Button3.setText("jButton3");
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        Button4.setBackground(new java.awt.Color(242, 242, 242));
        Button4.setText("jButton4");
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        Button5.setBackground(new java.awt.Color(242, 242, 242));
        Button5.setText("jButton5");
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });

        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("Key Vocabulary:");

        Button1.setBackground(new java.awt.Color(242, 242, 242));
        Button1.setText("jButton1");
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RadioButton5)
                    .addComponent(RadioButton4)
                    .addComponent(RadioButton3)
                    .addComponent(RadioButton2)
                    .addComponent(RadioButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button2)
                    .addComponent(Button3)
                    .addComponent(Button4)
                    .addComponent(Button5)
                    .addComponent(Button1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButton1)
                    .addComponent(Button1))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButton2)
                    .addComponent(Button2))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButton3)
                    .addComponent(Button3))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButton4)
                    .addComponent(Button4))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButton5)
                    .addComponent(Button5))
                .addGap(0, 23, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jButton7.setBackground(new java.awt.Color(242, 242, 242));
        jButton7.setText("jButton7");

        jTextField3.setBackground(new java.awt.Color(242, 242, 242));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Person B");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jButton6.setBackground(new java.awt.Color(242, 242, 242));
        jButton6.setText("jButton6");

        jTextField2.setBackground(new java.awt.Color(242, 242, 242));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Person A");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        text1.setText("jLabel1");

        completeButton.setText("Complete");
        completeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(text1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(completeButton)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(completeButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButton1ActionPerformed
        // TODO add your handling code here:
         if(RadioButton1.isSelected()){
            Button1.setVisible(true);
        }
        
        increaseVocabAssistCount(); 
        
        int buttonIndex = 0;
    }//GEN-LAST:event_RadioButton1ActionPerformed

    private void RadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButton2ActionPerformed
        // TODO add your handling code here:
        if(RadioButton2.isSelected()){
            Button2.setVisible(true);
        }
        
        increaseVocabAssistCount(); 
        
        int buttonIndex = 1;
        
    }//GEN-LAST:event_RadioButton2ActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        // TODO add your handling code here:
        //int buttonIndex = 0;
        
        int buttonIndex = 0;
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        // TODO add your handling code here:
      //  int buttonIndex = 1;
        //setPersonAVocab(buttonIndex); 
        
        int buttonIndex = 1;
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        // TODO add your handling code here:
      //  int buttonIndex = 2;
        //setPersonAVocab(buttonIndex); 
        int buttonIndex = 2;
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        // TODO add your handling code here:
       // int buttonIndex = 3;
       // setPersonAVocab(buttonIndex); 
       
       int buttonIndex = 3;
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        // TODO add your handling code here:
        //int buttonIndex = 4;
       // setPersonAVocab(buttonIndex); 
       
       int buttonIndex = 4;
    }//GEN-LAST:event_Button5ActionPerformed

    private void RadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButton3ActionPerformed
        // TODO add your handling code here:
        if(RadioButton3.isSelected()){
            Button3.setVisible(true);
        }
        
        increaseVocabAssistCount(); 
        int buttonIndex = 2;

    }//GEN-LAST:event_RadioButton3ActionPerformed

    private void RadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButton4ActionPerformed
        // TODO add your handling code here:
        if(RadioButton4.isSelected()){
            Button4.setVisible(true);
        }

        increaseVocabAssistCount(); 
        
        int buttonIndex = 3;
        
    }//GEN-LAST:event_RadioButton4ActionPerformed

    private void RadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButton5ActionPerformed
        // TODO add your handling code here:
        if(RadioButton5.isSelected()){
            Button5.setVisible(true);
        }
        
        increaseVocabAssistCount(); 
        int buttonIndex = 4;

    }//GEN-LAST:event_RadioButton5ActionPerformed

    private void completeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeButtonActionPerformed
        // TODO add your handling code here:
        increaseRolePlayTopicCount();
        increaseRolePlayDifficultyCounter();
        increaseRolePlayRoleCounter();
        lastRolePlayTimeStamp();
        ApplicationInfo.createHomePage();
        ApplicationInfo.getRolePlayPage().dispose();
    }//GEN-LAST:event_completeButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RolePlay1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RolePlay1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RolePlay1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RolePlay1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RolePlay1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JRadioButton RadioButton1;
    private javax.swing.JRadioButton RadioButton2;
    private javax.swing.JRadioButton RadioButton3;
    private javax.swing.JRadioButton RadioButton4;
    private javax.swing.JRadioButton RadioButton5;
    private javax.swing.JButton completeButton;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel text1;
    // End of variables declaration//GEN-END:variables

    private void initPage() {
        Button1.setVisible(false); 
        Button2.setVisible(false);         
        Button3.setVisible(false);         
        Button4.setVisible(false);
        Button5.setVisible(false);
        
        // add all radio buttons and labels to two seperate lists, do a for loop to disable all radio buttons and make the labels invisble and set their text to blank
        List<JRadioButton> radioButtons = new ArrayList();
        radioButtons.add(RadioButton1); 
        radioButtons.add(RadioButton2); 
        radioButtons.add(RadioButton3); 
        radioButtons.add(RadioButton4); 
        radioButtons.add(RadioButton5); 
        
        //to disable the radio butons:
        for (int i = 0; i < radioButtons.size(); i++) {
            radioButtons.get(i).setEnabled(false);
            radioButtons.get(i).setVisible(false);
        }
        
        List<JButton> buttons = new ArrayList();
        buttons.add(Button1);
        buttons.add(Button2);
        buttons.add(Button3);
        buttons.add(Button4);
        buttons.add(Button5);
        
        //to disable the butons:
        for (int i = 0; i < buttons.size(); i++) {
            buttons.get(i).setEnabled(false);
            buttons.get(i).setVisible(false);
        }
        
        //use if statements to filter through role play lists within the rolePlayManger based on the difficulty the user selected to see which role play object matches the user's selections
        
        if (RolePlayManager.getRolePlaySettings() != null && RolePlayManager.getRolePlaySettings().getTopicType() != null) {
            RolePlayTopic matchingRolePlay = new RolePlayTopic();
            List<RolePlayTopic> rolePlayList = new ArrayList();
            // check which difficulty the user has selected and get the list associated with that difficulty
            switch (RolePlayManager.getRolePlaySettings().getDifficulty()){
                case "A1":
                    rolePlayList = RolePlayManager.getTopicsA1();
                    break;
                case "A2":
                    rolePlayList = RolePlayManager.getTopicsA2();
                    break;
                case "B1":
                    rolePlayList = RolePlayManager.getTopicsB1();
                    break;
                case "B2":
                    rolePlayList = RolePlayManager.getTopicsB2();
                    break;
            }
            //get matching roleplays
            matchingRolePlay = getMatchingRolePlay(matchingRolePlay, rolePlayList);
            if (matchingRolePlay == null) {
                return;
            }
            if (RolePlayManager.getRolePlaySettings().getRole().equals("Teacher")) {
                buttonsVocabs = matchingRolePlay.personBVocabAssist;
                radioVocabs = matchingRolePlay.personBVocabEnglish;
            }
            else{
                buttonsVocabs = matchingRolePlay.personAVocabAssist;
                radioVocabs = matchingRolePlay.personAVocabEnglish;
            }
            if (!buttonsVocabs.isEmpty()) {
                for (int i = 0; i < buttonsVocabs.size(); i++) {
                    radioButtons.get(i).setEnabled(true);
                    radioButtons.get(i).setEnabled(true);
                    buttons.get(i).setEnabled(true);
                    buttons.get(i).setVisible(true);
                    radioButtons.get(i).setText(radioVocabs.get(i));
                    buttons.get(i).setText(buttonsVocabs.get(i));
                }
            }
        }
        
        
        
        
        buttonsVocabs = new ArrayList();
        
        
        //how to get the key vocab and enable the buttons -- because person A and B key vocab is not set in settings page. 
        /*for (int i = 0; i < radioButtons.size(); i++) {
                buttonsVocabs.add(radioButtons.get(i).subTopicType);
                buttons.get(i).setText(radioButtons.get(i).subTopicType);
                buttons.get(i).setEnabled(true);
                buttons.get(i).setVisible(true);
            }*/
        
        List<String> vocabAssist = new ArrayList();
        //if statement to see if a user is student or teacher, retrieve vocab list  from the role Play Object equivalent and assign to vocabAssit list
        
        // enable radio buttons based on the size of the vocab list retrieved assign all the labels text to respective indexes and keep label invisible
        
        // assign role play text to scrollable panel within the page based if the user is student or teacher
    }
    
    private RolePlayTopic getMatchingRolePlay(RolePlayTopic matchingRolePlays, List<RolePlayTopic> rolePlayList){
        for (int i = 0; i < rolePlayList.size(); i++) {
            // check for roleplays that having a matching topic
            if (rolePlayList.get(i).topicType.equals(RolePlayManager.getRolePlaySettings().getTopicType())) {
                //check for roleplays that have a matching difficulty
                if (rolePlayList.get(i).difficulty.equals(RolePlayManager.getRolePlaySettings().getDifficulty())) {
                    //check for roleplays that have a matching sub-topic
                    if (rolePlayList.get(i).subTopicType.equals(RolePlayManager.getRolePlaySettings().getSubTopicType())) {
                        //check for roleplays that have a matching langauge
                        if (rolePlayList.get(i).language.equals(RolePlayManager.getRolePlaySettings().getLanguage())) {
                            matchingRolePlays = rolePlayList.get(i);
                        }
                        
                    }

                }
            }
        }
        return matchingRolePlays;
    }


    public void setKeyVocab(int index) {
        
    }
    
    
    // CRUD operations functions
    
    private void increaseVocabAssistCount() {
        try {
            int newAssistCount  = JdbcCrud.getVocabAssistCount(ApplicationInfo.getUser().userEmail)+1;
            JdbcCrud.upateVocabAssistCount(newAssistCount);
        } catch (Exception ex) {
            Logger.getLogger(RolePlay.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void increaseRolePlayTopicCount() {
        if (RolePlayManager.getRolePlaySettings().getTopicType() == null){
            return;
        }
        if (ApplicationInfo.getUser().userEmail == null) {
            return;
        }
        String userEmail = ApplicationInfo.getUser().userEmail;
        Integer newCount;
        try{
            switch (RolePlayManager.getRolePlaySettings().getTopicType()) {
                case "Asking and giving directions":
                    newCount = JdbcCrud.getTopicDirectionsCount(userEmail) +1;
                    JdbcCrud.upateTopicDirectionsCount(newCount);
                    break;
                    
                case "Basic employment issues":
                    newCount = JdbcCrud.getTopicEmploymentCount(userEmail) +1;
                    JdbcCrud.upateTopicEmploymentCount(newCount);
                    break;
                    
                case "Cross-cultural experiences":
                    newCount = JdbcCrud.getTopicCulturalExperiencesCount(userEmail) +1;
                    JdbcCrud.upateTopicCulturalExperiencesCount(newCount);
                    break;
                    
                case "Exchanging personal information":
                    newCount = JdbcCrud.getTopicPersonalInfoCount(userEmail) +1;
                    JdbcCrud.upateTopicPersonalInfoCount(newCount);
                    break;
                    
                case "Going shopping and asking for prices":
                    newCount = JdbcCrud.getTopicShoppingCount(userEmail) +1;
                    JdbcCrud.upateTopicShoppingCount(newCount);
                    break;
                    
                case "Health":
                    newCount = JdbcCrud.getTopicHealthCount(userEmail) +1;
                    JdbcCrud.upateTopicHealthCount(newCount);
                    break;
                    
                case "Housing conditions":
                    newCount = JdbcCrud.getTopicHousingCount(userEmail) +1;
                    JdbcCrud.upateTopicHousingCount(newCount);
                    break;
                    
                case "Introductions":
                    newCount = JdbcCrud.getTopicIntroductionsCount(userEmail) +1;
                    JdbcCrud.upateTopicIntroductionsCount(newCount);
                    break;
                    
                case "Making Appointments":
                    newCount = JdbcCrud.getTopicAppointmentsCount(userEmail) +1;
                    JdbcCrud.upateTopicAppointmentsCount(newCount);
                    break;
                    
                case "Making invitations":
                    newCount = JdbcCrud.getTopicInvitationsCount(userEmail) +1;
                    JdbcCrud.upateTopicInvitationsCount(newCount);
                    break;
                    
                case "Making travel arrangements":
                    newCount = JdbcCrud.getTopicTravelCount(userEmail) +1;
                    JdbcCrud.upateTopicTravelCount(newCount);
                    break;
                    
                case "Ordering food and drink":
                    newCount = JdbcCrud.getTopicFoodAndDrinkCount(userEmail) +1;
                    JdbcCrud.upateTopicFoodAndDrinkCount(newCount);
                    break;
                    
                case "Socialising":
                    newCount = JdbcCrud.getTopicSocialisingCount(userEmail) +1;
                    JdbcCrud.upateTopicSocialisingCount(newCount);
                    break;
                    
                case "University life":
                    newCount = JdbcCrud.getTopicUniversityCount(userEmail) +1;
                    JdbcCrud.upateTopicUniversityCount(newCount);
                    break;
                    
                case "Weather":
                    newCount = JdbcCrud.getTopicWeatherCount(userEmail) +1;
                    JdbcCrud.upateTopicWeatherCount(newCount);
                    break;
                    
                case "Work life":
                    newCount = JdbcCrud.getTopicWorkCount(userEmail) +1;
                    JdbcCrud.upateTopicWorkCount(newCount);
                    break;
            }
        }
        catch (Exception ex) {
            Logger.getLogger(RolePlay.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void lastRolePlayTimeStamp() {
        try {
            JdbcCrud.setUserLastRolePlay();
        } catch (Exception ex) {
            Logger.getLogger(RolePlay.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void increaseRolePlayDifficultyCounter() {
        if (RolePlayManager.getRolePlaySettings() == null){
            return;
        }
       if (ApplicationInfo.getUser().userEmail == null) {
            return;
        }
        String userEmail = ApplicationInfo.getUser().userEmail;
        Integer newCount;
        
        try{
            switch (RolePlayManager.getRolePlaySettings().getDifficulty()){
                case "A1":
                    newCount = JdbcCrud.getRolePlayCompleteA1(userEmail) +1;
                    JdbcCrud.SetRolePlayCompleteA1(newCount);
                    break;
                    
                case "A2":
                    newCount = JdbcCrud.getRolePlayCompleteA2(userEmail) +1;
                    JdbcCrud.SetRolePlayCompleteA2(newCount);
                    break;
                    
                case "B1":
                    newCount = JdbcCrud.getRolePlayCompleteB1(userEmail) +1;
                    JdbcCrud.SetRolePlayCompleteB1(newCount);
                    break;
                    
                case "B2":
                    newCount = JdbcCrud.getRolePlayCompleteB2(userEmail) +1;
                    JdbcCrud.SetRolePlayCompleteB2(newCount);
                    break;
            }
        }
        catch (Exception ex) {
            Logger.getLogger(RolePlay.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void increaseRolePlayRoleCounter() {
        if (RolePlayManager.getRolePlaySettings() == null){
            return;
        }
       if (ApplicationInfo.getUser().userEmail == null) {
            return;
        }
        String userEmail = ApplicationInfo.getUser().userEmail;
        Integer newCount;
        
        try{
            switch (RolePlayManager.getRolePlaySettings().getRole()){
                case "Student":
                    newCount = JdbcCrud.getRolePlayStudent(userEmail) +1;
                    JdbcCrud.setRolePlayStudent(newCount);
                    break;
                    
                case "Teacher":
                    newCount = JdbcCrud.getRolePlayTeacher(userEmail) +1;
                    JdbcCrud.setRolePlayTeacher(newCount);
                    break;
            }
        }
        catch (Exception ex) {
            Logger.getLogger(RolePlay.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



}
