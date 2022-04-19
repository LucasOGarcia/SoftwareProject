/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.project;

import java.awt.Dimension;

/**
 *
 * @author lucas
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
        initPage();
        profilePicture.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminButton = new javax.swing.JButton();
        languagesButton = new javax.swing.JButton();
        profilePicture = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        userEmailLabel = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        adminButton.setText("Admin");
        adminButton.setMaximumSize(new java.awt.Dimension(123, 38));
        adminButton.setMinimumSize(new java.awt.Dimension(123, 38));
        adminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButtonActionPerformed(evt);
            }
        });

        languagesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/language.png"))); // NOI18N
        languagesButton.setText("Languages");
        languagesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                languagesButtonActionPerformed(evt);
            }
        });

        profilePicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/profileLarge.png"))); // NOI18N

        userNameLabel.setText("user name");

        userEmailLabel.setText("user email");

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(adminButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(languagesButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(145, Short.MAX_VALUE)
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 18, Short.MAX_VALUE)))
                .addGap(122, 122, 122))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(profilePicture)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userNameLabel)
                    .addComponent(userEmailLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(languagesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(adminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(profilePicture)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(userEmailLabel)
                .addGap(26, 26, 26)
                .addComponent(userNameLabel)
                .addGap(24, 24, 24)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        logout();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void languagesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_languagesButtonActionPerformed
        // TODO add your handling code here:
        ApplicationInfo.changelanguagePageVisibility(true);
        ApplicationInfo.changeHomePageVisibility(false);
        profilePicture.requestFocus();
    }//GEN-LAST:event_languagesButtonActionPerformed

    private void adminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButtonActionPerformed
        if (ApplicationInfo.getUser().accountType != 1) {
            return;
        }
        // send to admin page
    }//GEN-LAST:event_adminButtonActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminButton;
    private javax.swing.JButton languagesButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel profilePicture;
    private javax.swing.JLabel userEmailLabel;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables

    private void initPage() {
        if (ApplicationInfo.getUser() != null){
            User user = ApplicationInfo.getUser();
            userNameLabel.setText("User: " + user.userFirstName + " " + user.userLastname);
            userEmailLabel.setText("Email: " + user.userEmail);
            // disable admin button if user has a regular account
            if (user.accountType != 1) {
                adminButton.setEnabled(false);
                adminButton.setVisible(false);
            }
            else{
                adminButton.setEnabled(true);
                adminButton.setVisible(true);
            }
        }
    }
    
    private void resetPage(){
        adminButton.setEnabled(false);
        adminButton.setVisible(false);
        userNameLabel.setText(null);
        userEmailLabel.setText(null);
        profilePicture.requestFocus();
    }

    private void logout() {
        User nullUser = new User();
        if (nullUser == null){
            System.out.println("user is null");
        }
        ApplicationInfo.setUser(nullUser);
        ApplicationInfo.changeMainPageVisibility(true);
        ApplicationInfo.changeHomePageVisibility(false);
        resetPage();
    }
}
