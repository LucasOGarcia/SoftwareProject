/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project;

import javax.swing.ImageIcon;

/**
 *
 * @author lucas
 */
public class ConversationLevelSelection extends javax.swing.JFrame {

    /**
     * Creates new form ConversationLevelSelection
     */
    public ConversationLevelSelection() {
        initComponents();
        initPage();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        languagesButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        languageLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        a1Button = new javax.swing.JButton();
        a2Button = new javax.swing.JButton();
        b1Button = new javax.swing.JButton();
        b2Button = new javax.swing.JButton();
        roleIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_icon.png"))); // NOI18N
        homeButton.setText("Home");
        homeButton.setMaximumSize(new java.awt.Dimension(126, 38));
        homeButton.setMinimumSize(new java.awt.Dimension(126, 38));
        homeButton.setPreferredSize(new java.awt.Dimension(126, 38));
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        languagesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/language.png"))); // NOI18N
        languagesButton.setText("Languages");
        languagesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                languagesButtonActionPerformed(evt);
            }
        });

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        languageLabel.setText("Language");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Beginner");

        jLabel5.setText("Beginner");

        jLabel6.setText("Intermediate");

        jLabel7.setText("Intermediate");

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Lucida Console", 0, 22)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("SELECT A DIFFICULTY");

        a1Button.setText("A1");
        a1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ButtonActionPerformed(evt);
            }
        });

        a2Button.setText("A2");
        a2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ButtonActionPerformed(evt);
            }
        });

        b1Button.setText("B1");
        b1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ButtonActionPerformed(evt);
            }
        });

        b2Button.setText("B2");
        b2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(a1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(b1Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                .addComponent(a2Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(b2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backButton)
                            .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addComponent(languagesButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(languageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(roleIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(languagesButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(18, 18, 18)
                        .addComponent(languageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(roleIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // reset role play settings
        RolePlaySettings settings = new RolePlaySettings();
        RolePlayManager.setRolePlaySettings(settings);
        ApplicationInfo.createHomePage();
        ApplicationInfo.changeHomePageVisibility(true);
        ApplicationInfo.changeConversationLevelSelectionPageVisibility(false);
        ApplicationInfo.getConversationLevelSelectionPage().dispose();
    }//GEN-LAST:event_homeButtonActionPerformed

    private void languagesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_languagesButtonActionPerformed
        // reset role play settings
        RolePlaySettings settings = new RolePlaySettings();
        RolePlayManager.setRolePlaySettings(settings);
        ApplicationInfo.createLanguagePage();
        ApplicationInfo.changelanguagePageVisibility(true);
        ApplicationInfo.changeConversationLevelSelectionPageVisibility(false);
        ApplicationInfo.getConversationLevelSelectionPage().dispose();
    }//GEN-LAST:event_languagesButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // reset the selected role in the rolePlaySettings object
        RolePlaySettings settings = RolePlayManager.getRolePlaySettings();
        settings.setRole(null);
        RolePlayManager.setRolePlaySettings(settings);
        ApplicationInfo.createRolePage();
        ApplicationInfo.changeRolePageVisibility(true);
        ApplicationInfo.changeConversationLevelSelectionPageVisibility(false);
        ApplicationInfo.getConversationLevelSelectionPage().dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void a1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ButtonActionPerformed
        String newDifficuly = "A1";
        setSelectedDifficulty(newDifficuly);
    }//GEN-LAST:event_a1ButtonActionPerformed

    private void a2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ButtonActionPerformed
        String newDifficuly = "A2";
        setSelectedDifficulty(newDifficuly);
    }//GEN-LAST:event_a2ButtonActionPerformed

    private void b1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ButtonActionPerformed
        String newDifficuly = "B1";
        setSelectedDifficulty(newDifficuly);
    }//GEN-LAST:event_b1ButtonActionPerformed

    private void b2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ButtonActionPerformed
        String newDifficuly = "B2";
        setSelectedDifficulty(newDifficuly);
    }//GEN-LAST:event_b2ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ConversationLevelSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConversationLevelSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConversationLevelSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversationLevelSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConversationLevelSelection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a1Button;
    private javax.swing.JButton a2Button;
    private javax.swing.JButton b1Button;
    private javax.swing.JButton b2Button;
    private javax.swing.JButton backButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel languageLabel;
    private javax.swing.JButton languagesButton;
    private javax.swing.JLabel roleIcon;
    // End of variables declaration//GEN-END:variables

    private void initPage() {
        jTextField1.setFocusable(false);
        if (RolePlayManager.getRolePlaySettings() != null && RolePlayManager.getRolePlaySettings().getLanguage() != null) {
            String imageName = null;
            //set the langauge label text to the selected language
            languageLabel.setText(RolePlayManager.getRolePlaySettings().getLanguage());
            // set the language label icon according to the selected language
            switch (RolePlayManager.getRolePlaySettings().getLanguage()) {
                case "Spanish":
                    imageName = "Spain";
                    
                case "French":
                    imageName = "France";
                
                case "Portuguese":
                    imageName = "Portugual";
                
                case "German":
                    imageName = "Germany";
                
                case "Italian":
                    imageName = "Italy";
                
                case "Greek":
                    imageName = "Greece";
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
    }

    private void setSelectedDifficulty(String newDifficuly) {
        RolePlaySettings settings = RolePlayManager.getRolePlaySettings();
        settings.setDifficulty(newDifficuly);
        RolePlayManager.setRolePlaySettings(settings);
        ApplicationInfo.createTopicSelectionPage();
        ApplicationInfo.changeTopicSelectionPageVisibility(true);
        ApplicationInfo.changeConversationLevelSelectionPageVisibility(false);
        ApplicationInfo.getConversationLevelSelectionPage().dispose();
    }
}
