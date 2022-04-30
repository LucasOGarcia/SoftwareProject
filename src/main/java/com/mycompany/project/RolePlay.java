package com.mycompany.project;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 44793
 */
public class RolePlay extends javax.swing.JFrame {

    /**
     * Creates new form RolePlay
     */
    public RolePlay() {
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

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        completeButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Profile");

        jLabel1.setText("Languages (Logo/Icon)");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Home");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Settings");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Key Vocabulary ?");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Person A (Conversation with Customer & Employee) ");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("-A: Hi There. Do you have a table for 2?\n-B: ...\n-A: I'm sorry I don't \n-B: ...\n-A: How long is the **wait** for the table? I am very hungry\n-B: ...\n-A: Yes please. I will have two burgers & two portions of fires. \nOh & 2 large drinks. \nThank you very much.\n-B: ...\n-A: You too\n");
        jScrollPane1.setViewportView(jTextArea1);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Person B (Conversation with Customer & Employee)");

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("- A: ...\n- B: Good Evening. Do you have a **reservation** \nwith us?\n- A: ...\n- B: I'm afraid we're very busy tonight so there are no free tables.\nWould you like to wait or come back later?\n- A: ...\n- B: It is **about** one hour. \nI’m sorry about that.\n Would you like to order your food for **takeaway** instead?\n- A: ...\n- B: No problem. \nYour food should be there soon. Have a nice evening!\n- A: ...");
        jScrollPane3.setViewportView(jTextArea3);

        completeButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        completeButton.setText("COMPLETE !");
        completeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeButtonActionPerformed(evt);
            }
        });

        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Reservation: ");

        jTextField1.setText("Réservation");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTextField1))
        );

        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("About: ");

        jTextField2.setText("Attendez");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 37, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Wait: ");

        jTextField3.setText("à propos");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jLabel6.setText("Takeaway:");

        jTextField4.setText("À emporter");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jRadioButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jRadioButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton2)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton3)
                    .addComponent(jLabel4)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton4)
                    .addComponent(jLabel6)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(completeButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jLabel1)
                        .addGap(54, 54, 54)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(completeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton4.isSelected()){
            jPanel13.setVisible(true);
        }

        else {
            jPanel13.setVisible(false);

        }
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton3.isSelected()){
            jPanel10.setVisible(true);
        }

        else {
            jPanel10.setVisible(false);

        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton2.isSelected()){
            jPanel12.setVisible(true);
        }

        else {
            jPanel12.setVisible(false);

        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:

        if(jRadioButton1.isSelected()){
            jPanel6.setVisible(true);
        }

        else {
            jPanel6.setVisible(false);

        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void completeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeButtonActionPerformed
//        increaseRolePlayTopicCount();
//        increaseRolePlayDifficultyCounter();
//        increaseRolePlayRoleCounter();
//        lastRolePlayTimeStamp();
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
            java.util.logging.Logger.getLogger(RolePlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RolePlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RolePlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RolePlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RolePlay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton completeButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

    private void initPage() {
        jPanel6.setVisible(false); 
        jPanel12.setVisible(false);         
        jPanel10.setVisible(false);         
        jPanel13.setVisible(false);
        
        // add all radio buttons and labels to two seperate lists, do a for loop to disable all radio buttons and make the labels invisble and set their text to blank
        
        //use if statements to filter through role play lists within the rolePlayManger based on the difficulty the user selected to see which role play object matches the user's selections
        
        List<String> vocabAssist = new ArrayList();
        //if statement to see if a user is student or teacher, retrieve vocab list  from the role Play Object equivalent and assign to vocabAssit list
        
        // enable radio buttons based on the size of the vocab list retrieved assign all the labels text to respective indexes and keep label invisible
        
        // assign role play text to scrollable panel within the page based if the user is student or teacher
    }
    
    
    // CRUD operations functions
    
//    private void increaseVocabAssistCount() {
//        try {
//            int newAssistCount  = JdbcCrud.getVocabAssistCount(ApplicationInfo.getUser().userEmail)+1;
//            JdbcCrud.upateVocabAssistCount(newAssistCount);
//        } catch (Exception ex) {
//            Logger.getLogger(RolePlay.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    
//    private void increaseRolePlayTopicCount() {
//        if (RolePlayManager.getRolePlaySettings().getTopicType() == null){
//            return;
//        }
//        if (ApplicationInfo.getUser().userEmail == null) {
//            return;
//        }
//        String userEmail = ApplicationInfo.getUser().userEmail;
//        Integer newCount;
//        try{
//            switch (RolePlayManager.getRolePlaySettings().getTopicType()) {
//                case "Asking and giving directions":
//                    newCount = JdbcCrud.getTopicDirectionsCount(userEmail) +1;
//                    JdbcCrud.upateTopicDirectionsCount(newCount);
//                    break;
//                    
//                case "Basic employment issues":
//                    newCount = JdbcCrud.getTopicEmploymentCount(userEmail) +1;
//                    JdbcCrud.upateTopicEmploymentCount(newCount);
//                    break;
//                    
//                case "Cross-cultural experiences":
//                    newCount = JdbcCrud.getTopicCulturalExperiencesCount(userEmail) +1;
//                    JdbcCrud.upateTopicCulturalExperiencesCount(newCount);
//                    break;
//                    
//                case "Exchanging personal information":
//                    newCount = JdbcCrud.getTopicPersonalInfoCount(userEmail) +1;
//                    JdbcCrud.upateTopicPersonalInfoCount(newCount);
//                    break;
//                    
//                case "Going shopping and asking for prices":
//                    newCount = JdbcCrud.getTopicShoppingCount(userEmail) +1;
//                    JdbcCrud.upateTopicShoppingCount(newCount);
//                    break;
//                    
//                case "Health":
//                    newCount = JdbcCrud.getTopicHealthCount(userEmail) +1;
//                    JdbcCrud.upateTopicHealthCount(newCount);
//                    break;
//                    
//                case "Housing conditions":
//                    newCount = JdbcCrud.getTopicHousingCount(userEmail) +1;
//                    JdbcCrud.upateTopicHousingCount(newCount);
//                    break;
//                    
//                case "Introductions":
//                    newCount = JdbcCrud.getTopicIntroductionsCount(userEmail) +1;
//                    JdbcCrud.upateTopicIntroductionsCount(newCount);
//                    break;
//                    
//                case "Making Appointments":
//                    newCount = JdbcCrud.getTopicAppointmentsCount(userEmail) +1;
//                    JdbcCrud.upateTopicAppointmentsCount(newCount);
//                    break;
//                    
//                case "Making invitations":
//                    newCount = JdbcCrud.getTopicInvitationsCount(userEmail) +1;
//                    JdbcCrud.upateTopicInvitationsCount(newCount);
//                    break;
//                    
//                case "Making travel arrangements":
//                    newCount = JdbcCrud.getTopicTravelCount(userEmail) +1;
//                    JdbcCrud.upateTopicTravelCount(newCount);
//                    break;
//                    
//                case "Ordering food and drink":
//                    newCount = JdbcCrud.getTopicFoodAndDrinkCount(userEmail) +1;
//                    JdbcCrud.upateTopicFoodAndDrinkCount(newCount);
//                    break;
//                    
//                case "Socialising":
//                    newCount = JdbcCrud.getTopicSocialisingCount(userEmail) +1;
//                    JdbcCrud.upateTopicSocialisingCount(newCount);
//                    break;
//                    
//                case "University life":
//                    newCount = JdbcCrud.getTopicUniversityCount(userEmail) +1;
//                    JdbcCrud.upateTopicUniversityCount(newCount);
//                    break;
//                    
//                case "Weather":
//                    newCount = JdbcCrud.getTopicWeatherCount(userEmail) +1;
//                    JdbcCrud.upateTopicWeatherCount(newCount);
//                    break;
//                    
//                case "Work life":
//                    newCount = JdbcCrud.getTopicWorkCount(userEmail) +1;
//                    JdbcCrud.upateTopicWorkCount(newCount);
//                    break;
//            }
//        }
//        catch (Exception ex) {
//            Logger.getLogger(RolePlay.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    
//    private void lastRolePlayTimeStamp() {
//        try {
//            JdbcCrud.setUserLastRolePlay();
//        } catch (Exception ex) {
//            Logger.getLogger(RolePlay.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    
//    private void increaseRolePlayDifficultyCounter() {
//        if (RolePlayManager.getRolePlaySettings() == null){
//            return;
//        }
//       if (ApplicationInfo.getUser().userEmail == null) {
//            return;
//        }
//        String userEmail = ApplicationInfo.getUser().userEmail;
//        Integer newCount;
//        
//        try{
//            switch (RolePlayManager.getRolePlaySettings().getDifficulty()){
//                case "A1":
//                    newCount = JdbcCrud.getRolePlayCompleteA1(userEmail) +1;
//                    JdbcCrud.SetRolePlayCompleteA1(newCount);
//                    break;
//                    
//                case "A2":
//                    newCount = JdbcCrud.getRolePlayCompleteA2(userEmail) +1;
//                    JdbcCrud.SetRolePlayCompleteA2(newCount);
//                    break;
//                    
//                case "B1":
//                    newCount = JdbcCrud.getRolePlayCompleteB1(userEmail) +1;
//                    JdbcCrud.SetRolePlayCompleteB1(newCount);
//                    break;
//                    
//                case "B2":
//                    newCount = JdbcCrud.getRolePlayCompleteB2(userEmail) +1;
//                    JdbcCrud.SetRolePlayCompleteB2(newCount);
//                    break;
//            }
//        }
//        catch (Exception ex) {
//            Logger.getLogger(RolePlay.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    
//    private void increaseRolePlayRoleCounter() {
//        if (RolePlayManager.getRolePlaySettings() == null){
//            return;
//        }
//       if (ApplicationInfo.getUser().userEmail == null) {
//            return;
//        }
//        String userEmail = ApplicationInfo.getUser().userEmail;
//        Integer newCount;
//        
//        try{
//            switch (RolePlayManager.getRolePlaySettings().getRole()){
//                case "Student":
//                    newCount = JdbcCrud.getRolePlayStudent(userEmail) +1;
//                    JdbcCrud.setRolePlayStudent(newCount);
//                    break;
//                    
//                case "Teacher":
//                    newCount = JdbcCrud.getRolePlayTeacher(userEmail) +1;
//                    JdbcCrud.setRolePlayTeacher(newCount);
//                    break;
//            }
//        }
//        catch (Exception ex) {
//            Logger.getLogger(RolePlay.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }


}
