/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.project;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Gabriel
 */
public class Progress extends javax.swing.JFrame {

    /**
     * Creates new form Progress
     */
    public Progress() {
        initComponents();
        initialisePage();
        emailBox();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        emailComboBox = new javax.swing.JComboBox<>();
        difficultyComboBox = new javax.swing.JComboBox<>();
        languageComboBox = new javax.swing.JComboBox<>();
        colourPanel = new javax.swing.JPanel();
        percentageLabel = new javax.swing.JLabel();
        progressLabel = new javax.swing.JLabel();
        numberOutOfLabel = new javax.swing.JLabel();
        topicComboBox = new javax.swing.JComboBox<>();
        confirmButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Progress ");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo64x.png"))); // NOI18N

        emailComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Email" }));
        emailComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailComboBoxActionPerformed(evt);
            }
        });

        difficultyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Difficulty", "A1", "A2", "B1", "B2" }));

        languageComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Language", "Spanish", "French", "Italian", "German", "Portuguese", "Greek" }));
        languageComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                languageComboBoxActionPerformed(evt);
            }
        });

        colourPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        percentageLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        percentageLabel.setMaximumSize(new java.awt.Dimension(100, 36));
        percentageLabel.setMinimumSize(new java.awt.Dimension(100, 36));
        percentageLabel.setPreferredSize(new java.awt.Dimension(100, 36));

        javax.swing.GroupLayout colourPanelLayout = new javax.swing.GroupLayout(colourPanel);
        colourPanel.setLayout(colourPanelLayout);
        colourPanelLayout.setHorizontalGroup(
            colourPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, colourPanelLayout.createSequentialGroup()
                .addContainerGap(484, Short.MAX_VALUE)
                .addComponent(percentageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(423, 423, 423))
        );
        colourPanelLayout.setVerticalGroup(
            colourPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, colourPanelLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(percentageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        progressLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        progressLabel.setText("Check an user's progress in the chosen language's difficulty");
        progressLabel.setMaximumSize(new java.awt.Dimension(368, 76));
        progressLabel.setMinimumSize(new java.awt.Dimension(368, 76));
        progressLabel.setPreferredSize(new java.awt.Dimension(368, 76));

        numberOutOfLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        numberOutOfLabel.setMaximumSize(new java.awt.Dimension(230, 36));
        numberOutOfLabel.setMinimumSize(new java.awt.Dimension(230, 36));
        numberOutOfLabel.setPreferredSize(new java.awt.Dimension(230, 36));

        topicComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Topic", "Asking and giving directions", "Basic employment issues", "Cross-cultural experiences", "Exchanging personal information", "Going shopping and asking for prices", "Health", "Housing conditions", "Introductions", "Making Appointments", "Making invitations", "Making travel arrangements", "Ordering food and drink", "Socialising", "University life", "Weather", "Work life" }));
        topicComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topicComboBoxActionPerformed(evt);
            }
        });

        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(403, 403, 403)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(30, 30, 30)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(emailComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(difficultyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(languageComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(topicComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 52, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(colourPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(progressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(numberOutOfLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(346, 346, 346))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(backButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(difficultyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(languageComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(topicComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(progressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(colourPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(numberOutOfLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailComboBoxActionPerformed

    private void topicComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topicComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_topicComboBoxActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        getProgress();
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void languageComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_languageComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_languageComboBoxActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        ApplicationInfo.createadminHomePage();
        ApplicationInfo.getProgressPage().dispose();
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
            java.util.logging.Logger.getLogger(Progress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Progress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Progress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Progress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Progress().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPanel colourPanel;
    private javax.swing.JButton confirmButton;
    private javax.swing.JComboBox<String> difficultyComboBox;
    private javax.swing.JComboBox<String> emailComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> languageComboBox;
    private javax.swing.JLabel numberOutOfLabel;
    private javax.swing.JLabel percentageLabel;
    private javax.swing.JLabel progressLabel;
    private javax.swing.JComboBox<String> topicComboBox;
    // End of variables declaration//GEN-END:variables

    private void initialisePage() {
        // set window icon for the JFrame
        if (ApplicationInfo.getPageIconName() != null) {
            String imageName = ApplicationInfo.getPageIconName();
            ImageIcon icon = new ImageIcon(getClass().getResource("/" + imageName + ".png"));
            this.setIconImage(icon.getImage());
        }
    }
    
    private void emailBox(){
            emailComboBox.removeAllItems();
            Connection con = null;
            try{
                ConnectDB connectDB = new ConnectDB();
                con = connectDB.getConnection();
                String query = "SELECT client_email FROM client_Info";
                PreparedStatement pst = con.prepareStatement(query);
                ResultSet rs = pst.executeQuery();

                while(rs.next()){
                    String abs = rs.getString(1);
                     emailComboBox.addItem(abs);
                }               
                con.close();
                pst.close();
                rs.close();
            }
            catch(Exception e){
                e.printStackTrace();
            }    
    }

/*
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
*/

    private void getProgress() {
        progressLabel.setText("Check an user's progress in the chosen language's difficulty");
        percentageLabel.setText("");
        numberOutOfLabel.setText("");
        colourPanel.setBackground(null);
        String email = emailComboBox.getItemAt(emailComboBox.getSelectedIndex());
        String difficulty = difficultyComboBox.getItemAt(difficultyComboBox.getSelectedIndex());
        String language = languageComboBox.getItemAt(languageComboBox.getSelectedIndex());
        String topic = topicComboBox.getItemAt(topicComboBox.getSelectedIndex());
        //check if the combo boxes aren't the default values
        System.out.println("Selected combo box options:");
        System.out.println("language "+language);
        System.out.println("difficulty "+difficulty);
        System.out.println("language "+language);
        System.out.println("topic "+topic);
        System.out.println("----------------------");
        if (checkIfComboBoxesDefault(email, difficulty, language, topic)) {
            numberOutOfLabel.setText("No data found");
            return;
        }
        if (!language.equals("Spanish")) {
            numberOutOfLabel.setText("No data found");
            return;
        }
        //check if table is present in the database
        String table = "progress_"+language+ "_"+difficulty+ "_"+ getTable(topic);;
        System.out.println(table);
        if (!checkIfTableExists(table)) {
            numberOutOfLabel.setText("No data found");
            return;
        }
        // extract column count from table
        Integer columnCount = getColumnCount(table);
        System.out.println("column count "+ columnCount);
        
        //get column name
        List<String> columnNames = getColumnNames(table, columnCount);
        for (int i = 0; i < columnNames.size(); i++) {
            System.out.println(columnNames.get(i));
        }
        List<Integer> columnValues = getValuesFromColumns(email, table, columnNames);
        Integer completedRolePlays = null; 
        if (!columnValues.isEmpty()) {
            completedRolePlays = columnValues.size();
            for (int i = 0; i < columnValues.size(); i++) {
                System.out.println(columnValues.get(i));
            }
        }
        else{
            completedRolePlays = 0;
        }
        System.out.println("completed role plays "+ completedRolePlays);
        
        Double rolePlayCount = completedRolePlays.doubleValue();
        Double totalRolePlays = columnCount.doubleValue()-1;
        
        Double percentageCompleted = (rolePlayCount/totalRolePlays)* 100.0;
        System.out.println(percentageCompleted+"% completed!");
        progressLabel.setText(email+" progress in "+language+" difficulty "+difficulty);
        percentageLabel.setText(percentageCompleted+"%");
        numberOutOfLabel.setText(completedRolePlays + "/" + (columnCount-1)+" roleplays");
        setPanelColour(percentageCompleted);

    }
    
    private boolean checkIfComboBoxesDefault(String email, String difficulty, String language, String topic) {
        // check if the user has selecte values for all combo boxes
        boolean result = false;
        if (email.isEmpty()) {
            result = true;
        }
        
        if (difficulty.equalsIgnoreCase("Select Difficulty")) {
            result = true;
        }
        
        if (language.equalsIgnoreCase("Select Language")) {
            result = true;
        }
        
        if (topic.equalsIgnoreCase("Select Topic")) {
            result = true;
        }
        return result;
    }
    
    private String getTable(String topic) {
        String table = null;
        switch (topic) {
            case "Asking and giving directions":
                table = "Directions";
                break;
                
            case "Basic employment issues":
                table = "Employment";
                break;
                
            case "Cross-cultural experiences":
                table = "Cultural_Experiences";
                break; 
                
            case "Exchanging personal information":
                table = "Personal_Info";
                break;
                
            case "Going shopping and asking for prices":
                table = "Shopping";
                break;
                
            case "Health":
                table = "Health";
                break;
                
            case "Housing conditions":
                table = "Housing";
                break;
                
            case "Introductions":
                table = "Introductions";
                break;
                
            case "Making Appointments":
                table = "Appointments";
                break;
                
            case "Making invitations":
                table = "Invitations";
                break;
                
            case "Making travel arrangements":
                table = "Travel";
                break;
                
            case "Ordering food and drink":
                table = "Food_Drink";
                break;
                
            case "Socialising":
                table = "Socialising";
                break;
                
            case "University life":
                table = "University";
                break;
                
            case "Weather":
                table = "Weather";
                break;
                
            case "Work life":
                table = "Work";
                break;
        }
        return table;
    }

    private boolean checkIfTableExists(String table) {
        boolean result = false;
        try {
            result = JdbcCrud.checkIfTableExists(table);
        } catch (Exception ex) {
            Logger.getLogger(Progress.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    private int getColumnCount(String tableName) {
        try {
            return JdbcCrud.getColumnCount(tableName);
        } 
        catch (Exception ex) {
            Logger.getLogger(Progress.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    private List getColumnNames(String tableName, int columnCount) {
        List<String> names = new ArrayList();
        try {
            names = JdbcCrud.getColumnNames(tableName, columnCount);
            return names;
        } catch (Exception ex) {
            Logger.getLogger(Progress.class.getName()).log(Level.SEVERE, null, ex);
        }
        return names;
    }

    private List<Integer> getValuesFromColumns(String email, String tableName, List<String> columnNames) {
        List values = new ArrayList();
        for (int i = 0; i < columnNames.size(); i++) {
            try {
                Integer result = JdbcCrud.getColumnValue(email ,tableName, columnNames.get(i));
                if (result == 1) {
                values.add(result);
            }
            } catch (Exception ex) {
                Logger.getLogger(Progress.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return values;
    }

    private void setPanelColour(Double percentageCompleted) {
        if (percentageCompleted == 100.0){
            Color green = new Color(44, 155, 81);
            colourPanel.setBackground(green);
            return;
        }
        if (percentageCompleted >= 66.0){
            Color orange = new Color(233, 124, 0);
            colourPanel.setBackground(orange);
            
            return;
        }
        if (percentageCompleted >= 33.0){
            Color yellow = new Color(233, 202, 0);
            colourPanel.setBackground(yellow);
            return;
        }
        if (percentageCompleted < 33.0){
            Color red = new Color(233, 70, 0);
            colourPanel.setBackground(Color.red);
            return;
        }
    }
}
