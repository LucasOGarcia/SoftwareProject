/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author lucas
 */
public class SubTopicSelection extends javax.swing.JFrame {

    /**
     * Creates new form SubTopicSelection
     */
    public SubTopicSelection() {
        initComponents();
        initPage();
    }
    
    public SubTopicSelection(List<RolePlayTopic> newMatchingSubTopics) {
        initComponents();
        initPage(newMatchingSubTopics);
    }
    
    List<RolePlayTopic> matchingSubTopics;
    List<String> buttonsSubTopicTypes;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        languageLabel = new javax.swing.JLabel();
        roleIcon = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        topicName = new javax.swing.JLabel();
        topic1Button = new javax.swing.JButton();
        topic2Button = new javax.swing.JButton();
        topic3Button = new javax.swing.JButton();
        topic4Button = new javax.swing.JButton();
        topic5Button = new javax.swing.JButton();
        topic6Button = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        languagesButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(363, 655));
        jPanel1.setRequestFocusEnabled(false);

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        backButton.setText("Back");
        backButton.setRequestFocusEnabled(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        languageLabel.setText("Language - Difficulty");
        languageLabel.setFocusable(false);
        languageLabel.setRequestFocusEnabled(false);

        roleIcon.setFocusable(false);
        roleIcon.setRequestFocusEnabled(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setRequestFocusEnabled(false);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Lucida Console", 0, 22)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("CHOOSE A SUB-TOPIC");
        jTextField1.setFocusable(false);
        jTextField1.setRequestFocusEnabled(false);

        topicName.setText("<html><div style='text-align: center;'>TopicName</div></html>");
        topicName.setFocusable(false);
        topicName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        topicName.setRequestFocusEnabled(false);

        topic1Button.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        topic1Button.setText("jButton1");
        topic1Button.setMaximumSize(new java.awt.Dimension(138, 38));
        topic1Button.setMinimumSize(new java.awt.Dimension(138, 38));
        topic1Button.setPreferredSize(new java.awt.Dimension(138, 38));
        topic1Button.setRequestFocusEnabled(false);
        topic1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topic1ButtonActionPerformed(evt);
            }
        });

        topic2Button.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        topic2Button.setText("jButton2");
        topic2Button.setMaximumSize(new java.awt.Dimension(138, 38));
        topic2Button.setMinimumSize(new java.awt.Dimension(138, 38));
        topic2Button.setPreferredSize(new java.awt.Dimension(138, 38));
        topic2Button.setRequestFocusEnabled(false);
        topic2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topic2ButtonActionPerformed(evt);
            }
        });

        topic3Button.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        topic3Button.setText("jButton3");
        topic3Button.setMaximumSize(new java.awt.Dimension(138, 38));
        topic3Button.setMinimumSize(new java.awt.Dimension(138, 38));
        topic3Button.setPreferredSize(new java.awt.Dimension(138, 38));
        topic3Button.setRequestFocusEnabled(false);
        topic3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topic3ButtonActionPerformed(evt);
            }
        });

        topic4Button.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        topic4Button.setText("jButton4");
        topic4Button.setMaximumSize(new java.awt.Dimension(138, 38));
        topic4Button.setMinimumSize(new java.awt.Dimension(138, 38));
        topic4Button.setPreferredSize(new java.awt.Dimension(138, 38));
        topic4Button.setRequestFocusEnabled(false);
        topic4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topic4ButtonActionPerformed(evt);
            }
        });

        topic5Button.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        topic5Button.setText("jButton5");
        topic5Button.setMaximumSize(new java.awt.Dimension(138, 38));
        topic5Button.setMinimumSize(new java.awt.Dimension(138, 38));
        topic5Button.setPreferredSize(new java.awt.Dimension(138, 38));
        topic5Button.setRequestFocusEnabled(false);
        topic5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topic5ButtonActionPerformed(evt);
            }
        });

        topic6Button.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        topic6Button.setText("jButton6");
        topic6Button.setMaximumSize(new java.awt.Dimension(138, 38));
        topic6Button.setMinimumSize(new java.awt.Dimension(138, 38));
        topic6Button.setPreferredSize(new java.awt.Dimension(138, 38));
        topic6Button.setRequestFocusEnabled(false);
        topic6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topic6ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(topic3Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(topic5Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(topic4Button, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(topic6Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(topicName)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(errorLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(topic1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(topic2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(topicName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topic1Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topic2Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topic3Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topic4Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topic5Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topic6Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(errorLabel)
                .addContainerGap())
        );

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo64x.png"))); // NOI18N

        languagesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/language.png"))); // NOI18N
        languagesButton.setText("Languages");
        languagesButton.setRequestFocusEnabled(false);
        languagesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                languagesButtonActionPerformed(evt);
            }
        });

        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_icon.png"))); // NOI18N
        homeButton.setText("Home");
        homeButton.setMaximumSize(new java.awt.Dimension(126, 38));
        homeButton.setMinimumSize(new java.awt.Dimension(126, 38));
        homeButton.setPreferredSize(new java.awt.Dimension(126, 38));
        homeButton.setRequestFocusEnabled(false);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(languagesButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(backButton)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(languageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(roleIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(languagesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(roleIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(languageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(242, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void topic1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topic1ButtonActionPerformed
        int buttonIndex = 0;
        setSelectedSubTopic(buttonIndex);
    }//GEN-LAST:event_topic1ButtonActionPerformed

    private void topic2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topic2ButtonActionPerformed
        int buttonIndex = 1;
        setSelectedSubTopic(buttonIndex);
    }//GEN-LAST:event_topic2ButtonActionPerformed

    private void topic3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topic3ButtonActionPerformed
        int buttonIndex = 2;
        setSelectedSubTopic(buttonIndex);
    }//GEN-LAST:event_topic3ButtonActionPerformed

    private void topic4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topic4ButtonActionPerformed
        int buttonIndex = 3;
        setSelectedSubTopic(buttonIndex);
    }//GEN-LAST:event_topic4ButtonActionPerformed

    private void topic5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topic5ButtonActionPerformed
        int buttonIndex = 4;
        setSelectedSubTopic(buttonIndex);
    }//GEN-LAST:event_topic5ButtonActionPerformed

    private void topic6ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topic6ButtonActionPerformed
        int buttonIndex = 5;
        setSelectedSubTopic(buttonIndex);
    }//GEN-LAST:event_topic6ButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // reset role play settings
        RolePlaySettings settings = new RolePlaySettings();
        RolePlayManager.setRolePlaySettings(settings);
        ApplicationInfo.createHomePage();
        ApplicationInfo.getSubTopicSelectionPage().dispose();
    }//GEN-LAST:event_homeButtonActionPerformed

    private void languagesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_languagesButtonActionPerformed
        // reset role play settings
        RolePlaySettings settings = new RolePlaySettings();
        RolePlayManager.setRolePlaySettings(settings);
        ApplicationInfo.createLanguagePage();
        ApplicationInfo.getSubTopicSelectionPage().dispose();
    }//GEN-LAST:event_languagesButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        RolePlaySettings settings = RolePlayManager.getRolePlaySettings();
        settings.setTopicType(null);
        RolePlayManager.setRolePlaySettings(settings);
        ApplicationInfo.createTopicSelectionPage();
        ApplicationInfo.getSubTopicSelectionPage().dispose();
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SubTopicSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubTopicSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubTopicSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubTopicSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubTopicSelection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel languageLabel;
    private javax.swing.JButton languagesButton;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel roleIcon;
    private javax.swing.JButton topic1Button;
    private javax.swing.JButton topic2Button;
    private javax.swing.JButton topic3Button;
    private javax.swing.JButton topic4Button;
    private javax.swing.JButton topic5Button;
    private javax.swing.JButton topic6Button;
    private javax.swing.JLabel topicName;
    // End of variables declaration//GEN-END:variables

    private void initPage() {
        
        // -------------------showcase user's selections-----------------------
        jTextField1.setFocusable(false);
        jTextField1.setFocusable(false);
        setPageIcon();
        if (RolePlayManager.getRolePlaySettings() != null && RolePlayManager.getRolePlaySettings().getLanguage() != null) {
            String imageName = null;
            //set the langauge label text to the selected language
            if (RolePlayManager.getRolePlaySettings().getDifficulty() != null) {
                // set the language label icon according to the selected language and difficulty
                languageLabel.setText(RolePlayManager.getRolePlaySettings().getLanguage() + " "  + RolePlayManager.getRolePlaySettings().getDifficulty());
            }
            switch (RolePlayManager.getRolePlaySettings().getLanguage()) {
                case "Spanish":
                    imageName = "Spain";
                    break;
                    
                case "French":
                    imageName = "France";
                    break;
                
                case "Portuguese":
                    imageName = "Portugual";
                    break;
                
                case "German":
                    imageName = "Germany";
                    break;
                
                case "Italian":
                    imageName = "Italy";
                    break;
                
                case "Greek":
                    imageName = "Greece";
                    break;
            }
            if (imageName != null) {
                ImageIcon image = new ImageIcon(getClass().getResource("/" + imageName + ".png"));
                languageLabel.setIcon((image));
            }
        }
        // set the correct role icon
        if (RolePlayManager.getRolePlaySettings() != null && RolePlayManager.getRolePlaySettings().getRole() != null) {
            String imageName = RolePlayManager.getRolePlaySettings().getRole();
            ImageIcon image = new ImageIcon(getClass().getResource("/" + imageName + ".png"));
            roleIcon.setIcon((image));
        }
        if (RolePlayManager.getRolePlaySettings() != null && RolePlayManager.getRolePlaySettings().getTopicType() != null) {
            topicName.setText(RolePlayManager.getRolePlaySettings().getTopicType());
        }
        
        // -----------------set buttons and their text-------------------------
        buttonsSubTopicTypes = new ArrayList();
        // add buttons to a list
        List<JButton> buttons = new ArrayList();
        buttons.add(topic1Button);
        buttons.add(topic2Button);
        buttons.add(topic3Button);
        buttons.add(topic4Button);
        buttons.add(topic5Button);
        buttons.add(topic6Button);
        // disable and hide all buttons by default
        for (int i = 0; i < buttons.size(); i++) {
            buttons.get(i).setEnabled(false);
            buttons.get(i).setVisible(false);
        }
        if (RolePlayManager.getRolePlaySettings() != null && RolePlayManager.getRolePlaySettings().getTopicType() != null) {
            List<RolePlayTopic> matchingRolePlays = new ArrayList();
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
            matchingRolePlays = getMatchingRolePlays(matchingRolePlays, rolePlayList);
            matchingSubTopics = matchingRolePlays;
            if (matchingRolePlays.isEmpty()) {
                // the topic has no subtopic for this difficulty
                errorLabel.setText("<html> There are currently no subtopics available<br/> for this difficulty...");
                errorLabel.setForeground(Color.red);
                return;
            }
            // set button text and enable them according to the number of matching sub-topics
            for (int i = 0; i < matchingRolePlays.size(); i++) {
                buttonsSubTopicTypes.add(matchingRolePlays.get(i).subTopicType);
                buttons.get(i).setText(matchingRolePlays.get(i).subTopicType);
                buttons.get(i).setEnabled(true);
                buttons.get(i).setVisible(true);
            }
            
        }
    }
    
    private void initPage(List<RolePlayTopic> newMatchingSubTopics) {
        
        // -------------------showcase user's selections-----------------------
        jTextField1.setFocusable(false);
        jTextField1.setFocusable(false);
        setPageIcon();
        if (RolePlayManager.getRolePlaySettings() != null && RolePlayManager.getRolePlaySettings().getLanguage() != null) {
            String imageName = null;
            //set the langauge label text to the selected language
            if (RolePlayManager.getRolePlaySettings().getDifficulty() != null) {
                // set the language label icon according to the selected language and difficulty
                languageLabel.setText(RolePlayManager.getRolePlaySettings().getLanguage() + " "  + RolePlayManager.getRolePlaySettings().getDifficulty());
            }
            switch (RolePlayManager.getRolePlaySettings().getLanguage()) {
                case "Spanish":
                    imageName = "Spain";
                    break;
                    
                case "French":
                    imageName = "France";
                    break;
                
                case "Portuguese":
                    imageName = "Portugual";
                    break;
                
                case "German":
                    imageName = "Germany";
                    break;
                
                case "Italian":
                    imageName = "Italy";
                    break;
                
                case "Greek":
                    imageName = "Greece";
                    break;
            }
            if (imageName != null) {
                ImageIcon image = new ImageIcon(getClass().getResource("/" + imageName + ".png"));
                languageLabel.setIcon((image));
            }
        }
        // set the correct role icon
        if (RolePlayManager.getRolePlaySettings() != null && RolePlayManager.getRolePlaySettings().getRole() != null) {
            String imageName = RolePlayManager.getRolePlaySettings().getRole();
            ImageIcon image = new ImageIcon(getClass().getResource("/" + imageName + ".png"));
            roleIcon.setIcon((image));
        }
        if (RolePlayManager.getRolePlaySettings() != null && RolePlayManager.getRolePlaySettings().getTopicType() != null) {
            topicName.setText(RolePlayManager.getRolePlaySettings().getTopicType());
        }
        
        // -----------------set buttons and their text-------------------------
        buttonsSubTopicTypes = new ArrayList();
        // add buttons to a list
        List<JButton> buttons = new ArrayList();
        buttons.add(topic1Button);
        buttons.add(topic2Button);
        buttons.add(topic3Button);
        buttons.add(topic4Button);
        buttons.add(topic5Button);
        buttons.add(topic6Button);
        // disable and hide all buttons by default
        for (int i = 0; i < buttons.size(); i++) {
            buttons.get(i).setEnabled(false);
            buttons.get(i).setVisible(false);
        }
        matchingSubTopics = newMatchingSubTopics;
        // set button text and enable them according to the number of matching sub-topics
        for (int i = 0; i < newMatchingSubTopics.size(); i++) {
            buttonsSubTopicTypes.add(newMatchingSubTopics.get(i).subTopicType);
            buttons.get(i).setText(newMatchingSubTopics.get(i).subTopicType);
            buttons.get(i).setEnabled(true);
            buttons.get(i).setVisible(true);
        }
    }
    
    private void setPageIcon(){
        // set window icon for the JFrame
        if (ApplicationInfo.getPageIconName() != null) {
            String imageName = ApplicationInfo.getPageIconName();
            ImageIcon icon = new ImageIcon(getClass().getResource("/" + imageName + ".png"));
            this.setIconImage(icon.getImage());
        }
    }
    
    private List getMatchingRolePlays(List<RolePlayTopic> matchingRolePlays, List<RolePlayTopic> rolePlayList){
        for (int i = 0; i < rolePlayList.size(); i++) {
            // check for roleplays that having a matching topic
            if (rolePlayList.get(i).topicType.equals(RolePlayManager.getRolePlaySettings().getTopicType())) {
                //check for roleplays that have a matching difficulty
                if (rolePlayList.get(i).difficulty.equals(RolePlayManager.getRolePlaySettings().getDifficulty())) {
                    matchingRolePlays.add(rolePlayList.get(i));
                }
            }
        }
        return matchingRolePlays;
    }
    
    public void setSelectedSubTopic(int index) {
        RolePlaySettings settings = RolePlayManager.getRolePlaySettings();
        settings.setSubTopicType(buttonsSubTopicTypes.get(index));
        RolePlayManager.setRolePlaySettings(settings);
        if (!matchingSubTopics.isEmpty()) {
            ApplicationInfo.createRolePlayPage(matchingSubTopics);
        }
        else{
            ApplicationInfo.createRolePlayPage();
        }
        ApplicationInfo.getSubTopicSelectionPage().dispose();
    }
}
