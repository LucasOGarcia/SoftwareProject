/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project;

/**
 *
 * @author lucas
 */
public class TopicSelection extends javax.swing.JFrame {

    /**
     * Creates new form SubTopicSelection
     */
    public TopicSelection() {
        initComponents();
        jTextField1.setFocusable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        languagesButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        infoLabel = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        directionsButton = new javax.swing.JButton();
        employmentButton = new javax.swing.JButton();
        crossCulturalButton = new javax.swing.JButton();
        exchangingPersonalInfoButton = new javax.swing.JButton();
        shoppingButton = new javax.swing.JButton();
        healthButton = new javax.swing.JButton();
        housingButton = new javax.swing.JButton();
        introductionsButton = new javax.swing.JButton();
        appointmentButton = new javax.swing.JButton();
        invitationButton = new javax.swing.JButton();
        travelButton = new javax.swing.JButton();
        foodAndDrinkButton = new javax.swing.JButton();
        socialisingButton = new javax.swing.JButton();
        universityButton = new javax.swing.JButton();
        weatherButton = new javax.swing.JButton();
        workButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_icon.png"))); // NOI18N
        homeButton.setText("Home");
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        infoLabel.setText("Language - Difficulty");

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        directionsButton.setText("<html>Asking and giving<br/>\n directions<html>");
        directionsButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        directionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directionsButtonActionPerformed(evt);
            }
        });

        employmentButton.setText("<html>Basic employment<br/> issues<html>");
        employmentButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        employmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employmentButtonActionPerformed(evt);
            }
        });

        crossCulturalButton.setText("<html>Cross-cultural <br/>experiences<html>");
        crossCulturalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crossCulturalButtonActionPerformed(evt);
            }
        });

        exchangingPersonalInfoButton.setText("<html>Exchanging personal <br/>information<html>");
        exchangingPersonalInfoButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exchangingPersonalInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exchangingPersonalInfoButtonActionPerformed(evt);
            }
        });

        shoppingButton.setText("<html>Going shopping and <br/>asking for prices<html>");
        shoppingButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        shoppingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shoppingButtonActionPerformed(evt);
            }
        });

        healthButton.setText("<html>Health<html>");
        healthButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        healthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthButtonActionPerformed(evt);
            }
        });

        housingButton.setText("<html>Housing conditions<html>");
        housingButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        housingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                housingButtonActionPerformed(evt);
            }
        });

        introductionsButton.setText("<html>Introductions<html>");
        introductionsButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        introductionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                introductionsButtonActionPerformed(evt);
            }
        });

        appointmentButton.setText("<html>Making <br/>Appointments<html>");
        appointmentButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        appointmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentButtonActionPerformed(evt);
            }
        });

        invitationButton.setText("<html>Making invitations<html>");
        invitationButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        invitationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invitationButtonActionPerformed(evt);
            }
        });

        travelButton.setText("<html>Making travel <br/>arrangements<html>");
        travelButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        travelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                travelButtonActionPerformed(evt);
            }
        });

        foodAndDrinkButton.setText("<html>Ordering food <br/>and drink<html>");
        foodAndDrinkButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        foodAndDrinkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodAndDrinkButtonActionPerformed(evt);
            }
        });

        socialisingButton.setText("<html>Socialising<html>");
        socialisingButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        socialisingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                socialisingButtonActionPerformed(evt);
            }
        });

        universityButton.setText("<html>University life<html>");
        universityButton.setActionCommand("<html>University life<html>");
        universityButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        universityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                universityButtonActionPerformed(evt);
            }
        });

        weatherButton.setText("<html>Weather<html>");
        weatherButton.setActionCommand("<html>Weather<html>");
        weatherButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        weatherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weatherButtonActionPerformed(evt);
            }
        });

        workButton.setText("<html>Work life<html>");
        workButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        workButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workButtonActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(60, 63, 65));
        jTextField1.setFont(new java.awt.Font("Lucida Console", 0, 22)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("SELECT A TOPIC");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(crossCulturalButton, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(shoppingButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(housingButton, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(appointmentButton, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(travelButton, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(socialisingButton, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(directionsButton)
                            .addComponent(weatherButton, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(employmentButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(exchangingPersonalInfoButton, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(healthButton, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(introductionsButton, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(invitationButton, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(foodAndDrinkButton, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(universityButton, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(workButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jTextField1))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(directionsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(crossCulturalButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exchangingPersonalInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(shoppingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(healthButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                        .addComponent(housingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(appointmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                        .addComponent(introductionsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(invitationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(travelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foodAndDrinkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(universityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(socialisingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(weatherButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(workButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        backButton.setText("back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(infoLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(languagesButton))
                            .addComponent(backButton, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(languagesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeButtonActionPerformed

    private void directionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directionsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_directionsButtonActionPerformed

    private void shoppingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shoppingButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shoppingButtonActionPerformed

    private void exchangingPersonalInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exchangingPersonalInfoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exchangingPersonalInfoButtonActionPerformed

    private void healthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_healthButtonActionPerformed

    private void employmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employmentButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employmentButtonActionPerformed

    private void crossCulturalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crossCulturalButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crossCulturalButtonActionPerformed

    private void housingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_housingButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_housingButtonActionPerformed

    private void introductionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_introductionsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_introductionsButtonActionPerformed

    private void appointmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_appointmentButtonActionPerformed

    private void invitationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invitationButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invitationButtonActionPerformed

    private void travelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_travelButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_travelButtonActionPerformed

    private void foodAndDrinkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodAndDrinkButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foodAndDrinkButtonActionPerformed

    private void socialisingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_socialisingButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_socialisingButtonActionPerformed

    private void universityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_universityButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_universityButtonActionPerformed

    private void weatherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weatherButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weatherButtonActionPerformed

    private void workButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_workButtonActionPerformed

    private void languagesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_languagesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_languagesButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(TopicSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TopicSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TopicSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TopicSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TopicSelection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton appointmentButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton crossCulturalButton;
    private javax.swing.JButton directionsButton;
    private javax.swing.JButton employmentButton;
    private javax.swing.JButton exchangingPersonalInfoButton;
    private javax.swing.JButton foodAndDrinkButton;
    private javax.swing.JButton healthButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton housingButton;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JButton introductionsButton;
    private javax.swing.JButton invitationButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton languagesButton;
    private javax.swing.JButton shoppingButton;
    private javax.swing.JButton socialisingButton;
    private javax.swing.JButton travelButton;
    private javax.swing.JButton universityButton;
    private javax.swing.JButton weatherButton;
    private javax.swing.JButton workButton;
    // End of variables declaration//GEN-END:variables
}
