/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project;

import static com.mycompany.project.ConnectDB.url;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 *
 */
public final class ProgressPage extends javax.swing.JFrame {

    private static Connection ConnectDb() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Connection connection = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    DefaultTableModel dtablemodel = new DefaultTableModel();
    /**
     * Creates new form StudentMS (Student Data Management System)
     */
    public ProgressPage() {
        initComponents();
        
        Object col[] = {"Email", "Difficulty","Spanish", "German", "French","Italian",
            "Greek","Porteuguese", "TotalScore", "Average","Ranking"};
        dtablemodel.setColumnIdentifiers(col);
        jTableProgressRecord.setModel(dtablemodel);
      
        
        updateTable();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgress = new javax.swing.JPanel();
        jComboBoxDifficulty = new javax.swing.JComboBox<>();
        jtxtSpanish = new javax.swing.JTextField();
        jtxtGerman = new javax.swing.JTextField();
        jtxtFrench = new javax.swing.JTextField();
        jtxtItalian = new javax.swing.JTextField();
        jtxtGreek = new javax.swing.JTextField();
        jtxtPorteuguese = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jtxtEmail = new javax.swing.JTextField();
        jLabelLastName = new javax.swing.JLabel();
        jtxtLastName = new javax.swing.JTextField();
        jLabelFirstName = new javax.swing.JLabel();
        jtxtFirstName = new javax.swing.JTextField();
        jLabelRanking = new javax.swing.JLabel();
        jtxtTotalScore = new javax.swing.JTextField();
        jtxtAverage = new javax.swing.JTextField();
        jtxtRanking = new javax.swing.JTextField();
        jLabelDifficulty = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelSpanish = new javax.swing.JLabel();
        jLabelGerman = new javax.swing.JLabel();
        jLabelFrench = new javax.swing.JLabel();
        jLabelItalian = new javax.swing.JLabel();
        jLabelGreek = new javax.swing.JLabel();
        jLabelPorteuguese = new javax.swing.JLabel();
        jLabelTotalScore = new javax.swing.JLabel();
        jLabelAverage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaRecord = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProgressRecord = new javax.swing.JTable();
        jbtnResult = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();
        jbtnRecord = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jProgress.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBoxDifficulty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxDifficulty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beginner", "Intermediate", "Expert", "Professional"}));
        jComboBoxDifficulty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDifficultyActionPerformed(evt);
            }
        });
        jProgress.add(jComboBoxDifficulty, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 150, 30));

        jtxtSpanish.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtSpanish.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtSpanishKeyTyped(evt);
            }
        });
        jProgress.add(jtxtSpanish, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 150, 30));

        jtxtGerman.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtGerman.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtGermanKeyTyped(evt);
            }
        });
        jProgress.add(jtxtGerman, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 150, 30));

        jtxtFrench.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtFrench.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtFrenchKeyTyped(evt);
            }
        });
        jProgress.add(jtxtFrench, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 150, 30));

        jtxtItalian.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtItalian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtItalianKeyTyped(evt);
            }
        });
        jProgress.add(jtxtItalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 150, 30));

        jtxtGreek.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtGreek.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtGreekKeyTyped(evt);
            }
        });
        jProgress.add(jtxtGreek, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 150, 30));

        jtxtPorteuguese.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtPorteuguese.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtPorteugueseKeyTyped(evt);
            }
        });
        jProgress.add(jtxtPorteuguese, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 150, 30));

        jLabelEmail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelEmail.setText("Email:");
        jProgress.add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jtxtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtEmailActionPerformed(evt);
            }
        });
        jProgress.add(jtxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 150, 30));

        jLabelLastName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelLastName.setText("Last Name:");
        jProgress.add(jLabelLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jtxtLastName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jProgress.add(jtxtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 150, 30));

        jLabelFirstName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelFirstName.setText("First Name:");
        jProgress.add(jLabelFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jtxtFirstName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jProgress.add(jtxtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 150, 30));

        jLabelRanking.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelRanking.setText("Ranking:");
        jProgress.add(jLabelRanking, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        jtxtTotalScore.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jProgress.add(jtxtTotalScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 150, 30));

        jtxtAverage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jProgress.add(jtxtAverage, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 150, 30));

        jtxtRanking.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jProgress.add(jtxtRanking, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 150, 30));

        jLabelDifficulty.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelDifficulty.setText("Difficulty");
        jProgress.add(jLabelDifficulty, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));
        jProgress.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 310, -1));

        jLabelSpanish.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelSpanish.setText("Spanish:");
        jProgress.add(jLabelSpanish, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        jLabelGerman.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelGerman.setText("German:");
        jProgress.add(jLabelGerman, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        jLabelFrench.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelFrench.setText("French:");
        jProgress.add(jLabelFrench, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        jLabelItalian.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelItalian.setText("Italian:");
        jProgress.add(jLabelItalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        jLabelGreek.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelGreek.setText("Greek:");
        jProgress.add(jLabelGreek, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, -1, -1));

        jLabelPorteuguese.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelPorteuguese.setText("Porteuguese:");
        jProgress.add(jLabelPorteuguese, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, -1, -1));

        jLabelTotalScore.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTotalScore.setText("Total Score:");
        jProgress.add(jLabelTotalScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabelAverage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelAverage.setText("Average:");
        jProgress.add(jLabelAverage, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Progress");
        jProgress.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jLabel2.setText("Label/Icon");
        jProgress.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        getContentPane().add(jProgress, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 490));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextAreaRecord.setColumns(20);
        jTextAreaRecord.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextAreaRecord.setRows(5);
        jScrollPane2.setViewportView(jTextAreaRecord);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 430, 420));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Record");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 470, 490));

        jTableProgressRecord.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Email", "Difficulty", "Spanish", "German", "French", "Italian", "Greek", "Porteuguese", "Total_Score", "Average", "Ranking"
            }
        ));
        jScrollPane1.setViewportView(jTableProgressRecord);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 1160, 200));

        jbtnResult.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnResult.setText("Result");
        jbtnResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResultActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 700, 150, 40));

        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 700, 150, 40));

        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 700, 150, 40));

        jbtnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnDelete.setText("Delete");
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 700, 150, 40));

        jbtnRecord.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnRecord.setText("Record");
        jbtnRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRecordActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 700, 150, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        this.getContentPane().setBackground(new java.awt.Color(176, 224, 230));
    }//GEN-LAST:event_formWindowActivated

    //-------------------------------BUTTON-------------------------------------//
    private void jbtnResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResultActionPerformed
        
        int[] Result = new int[14];
        Result[0] = Integer.parseInt(jtxtSpanish.getText());
        Result[1] = Integer.parseInt(jtxtGerman.getText());
        Result[2] = Integer.parseInt(jtxtFrench.getText());
        Result[3] = Integer.parseInt(jtxtItalian.getText());
        Result[4] = Integer.parseInt(jtxtGreek.getText());
        Result[5] = Integer.parseInt(jtxtPorteuguese.getText());
        
        
        // TotalScore
        Result[6] = (Result[0]+Result[1]+Result[2]+Result[3]+Result[4]+Result[5]);
        // Average
        Result[8] = (Result[0]+Result[1]+Result[2]+Result[3]+Result[4]+Result[5]+Result[6]) / 7;
        
        // Store result to jtxtTotalScore text field
        String TotalScore = String.format("%d", Result[8]);
        jtxtTotalScore.setText(TotalScore);
        
        // Store result to jtxtAverage text field
        String Average = String.format("%d", Result[9]);
        jtxtAverage.setText(Average);
        
        // --------------------Ranking if/else Statement--------------------------//
        if (Result[9] >= 90 && Result[9] <= 100) {
             jtxtRanking.setText("1st");
        } else if (Result[9] >= 70 && Result[9] <= 89) {
                    jtxtRanking.setText("2nd");
        } else if (Result[9] >= 60 && Result[9] <= 69) {
                    jtxtRanking.setText("3rd");
        } else if (Result[9] >= 0 && Result[9] <= 59) {
                    jtxtRanking.setText("FAIL");
        }
        //----------------------------------------DATABASE------------------------------------------------------//
        String sql = "INSERT INTO \"StudentData\" (\"Email\", \"Difficulty\", \"Spanish\", \"German\", "
                + "\"French\", \"Italian\", \"Greek\", \"Porteuguese\",\"TotalScore\", "
                + "\"Average\", \"Ranking\") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            //PreparedStatement
            pst = connection.prepareStatement(sql);
            pst.setString(1, jtxtEmail.getText());
            pst.setString(2, (String) jComboBoxDifficulty.getSelectedItem());
            pst.setInt(3, Integer.parseInt(jtxtSpanish.getText()));
            pst.setInt(4, Integer.parseInt(jtxtGerman.getText()));
            pst.setInt(5, Integer.parseInt(jtxtFrench.getText()));
            pst.setInt(6, Integer.parseInt(jtxtItalian.getText()));
            pst.setInt(8, Integer.parseInt(jtxtGreek.getText()));
            pst.setInt(9, Integer.parseInt(jtxtPorteuguese.getText()));
            pst.setInt(11, Integer.parseInt(jtxtTotalScore.getText()));
            pst.setInt(12, Integer.parseInt(jtxtAverage.getText()));
            pst.setString(13, jtxtRanking.getText());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "System Update Completed");
            //rs = ResultSet
            rs.close();
            pst.close();
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        updateTable();
    }//GEN-LAST:event_jbtnResultActionPerformed

    private void jtxtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtEmailActionPerformed

//---------------------------------SUBJECT FIELDS-----------------------------------//
    private void jtxtSpanishKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtSpanishKeyTyped
        // field will only accept numbers for score
        char iNumber = evt.getKeyChar();
        if (Character.isDigit(iNumber)
            &&  iNumber != KeyEvent.VK_BACKSPACE
                    && iNumber != KeyEvent.VK_DELETE) {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtSpanishKeyTyped

    private void jtxtGermanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtGermanKeyTyped
        // field will only accept numbers for score
        char iNumber = evt.getKeyChar();
        if (!(Character.isDigit(iNumber))
            ||  (iNumber == KeyEvent.VK_BACKSPACE)
                    || (iNumber == KeyEvent.VK_DELETE)) {
        evt.consume();
        }
    }//GEN-LAST:event_jtxtGermanKeyTyped

    private void jtxtFrenchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtFrenchKeyTyped
        // field will only accept numbers for score
        char iNumber = evt.getKeyChar();
        if (!(Character.isDigit(iNumber))
            ||  (iNumber == KeyEvent.VK_BACKSPACE)
                    || (iNumber == KeyEvent.VK_DELETE)) {
        evt.consume();
        }
    }//GEN-LAST:event_jtxtFrenchKeyTyped

    private void jtxtItalianKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtItalianKeyTyped
        // field will only accept numbers for score
        char iNumber = evt.getKeyChar();
        if (!(Character.isDigit(iNumber))
            ||  (iNumber == KeyEvent.VK_BACKSPACE)
                    || (iNumber == KeyEvent.VK_DELETE)) {
        evt.consume();
        }
    }//GEN-LAST:event_jtxtItalianKeyTyped

    private void jtxtGreekKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtGreekKeyTyped
        /// field will only accept numbers for score
        char iNumber = evt.getKeyChar();
        if (!(Character.isDigit(iNumber))
            ||  (iNumber == KeyEvent.VK_BACKSPACE)
                    || (iNumber == KeyEvent.VK_DELETE)) {
        evt.consume();
        }
    }//GEN-LAST:event_jtxtGreekKeyTyped

    private void jtxtPorteugueseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtPorteugueseKeyTyped
        // field will only accept numbers for score
        char iNumber = evt.getKeyChar();
        if (!(Character.isDigit(iNumber))
            ||  (iNumber == KeyEvent.VK_BACKSPACE)
                    || (iNumber == KeyEvent.VK_DELETE)) {
        evt.consume();
        }
    }//GEN-LAST:event_jtxtPorteugueseKeyTyped

//---------------------------------------BUTTONS------------------------------------//
private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit ProgressRecordMS?", "Data Management System",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        JTextField temp=null;
        for (Component c:jProgress.getComponents()) {
            if(c.getClass().toString().contains("javax.swing.JTextField")) {
                temp=(JTextField) c;
                temp.setText(null);
            }
        }
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRecordActionPerformed
        jTextAreaRecord.append("Student Result Recording System\n"
                + "Full Name: " + jtxtFirstName.getText() + " " +  jtxtLastName.getText() + "\t ID: " + jtxtEmail.getText()
                + "\n===============================\n"
                + "Spanish:\t\t" + jtxtSpanish.getText() + "\n"
                + "German:\t\t" + jtxtGerman.getText() + "\n"
                + "French:\t\t" + jtxtFrench.getText() + "\n"
                + "Italian:\t\t" + jtxtItalian.getText() + "\n"
                + "Greek:\t\t" + jtxtGreek.getText() + "\n"
                + "Porteuguese:\t\t" + jtxtPorteuguese.getText() + "\n"
                + "===============================\n"
                + "Total Score:\t\t" + jtxtTotalScore.getText() + "\n"
                + "Average:\t\t" + jtxtAverage.getText() + "\n"
                + "Ranking:\t\t" + jtxtRanking.getText() + "\n"
        );
    }//GEN-LAST:event_jbtnRecordActionPerformed

    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed
        DefaultTableModel dtablemodel = (DefaultTableModel) jTableProgressRecord.getModel();
        if (jTableProgressRecord.getSelectedRow() == -1) {
            if (jTableProgressRecord.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "No data to delete", "Data Management System", JOptionPane.OK_OPTION);
            } else {
                JOptionPane.showMessageDialog(null, "Select a row to delete", "Data Management System", JOptionPane.OK_OPTION);
            }
        } else {
            dtablemodel.removeRow(jTableProgressRecord.getSelectedRow());
            //int row = jTableStudentRecord.getSelectedRow();
            //String deleteLineRecord = jTableProgressRecord.getModel().getValueAt(row, 0).toString();
            //String sql = "DELETE FROM \"ProgressData\" WHERE \"Email\" = " + row;

            try {
                //pst = connection.prepareStatement(sql);
                //pst.execute();
                JOptionPane.showMessageDialog(null, "Deleted Successfully");
            } catch (HeadlessException e) {
                JOptionPane.showConfirmDialog(null, e);
            }
        }
    }//GEN-LAST:event_jbtnDeleteActionPerformed

    private void jComboBoxDifficultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDifficultyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDifficultyActionPerformed

    // add new student data to table
    public void updateTable() {
        
        connection = ProgressPage.ConnectDb();
        if (connection != null) {
        
            String sql = "SELECT \"Email\", \"Difficulty\", \"Spanish\", \"German\", "
                    + "\"French\", \"Italian\", \"Greek\", \"Porteuguese\", \"TotalScore\", "
                    + "\"Average\", \"Ranking\" FROM \"ProgressData\"";

            try {
                pst = connection.prepareStatement(sql);
                rs = pst.executeQuery();
                Object[] columnData = new Object[13];

                while(rs.next()) {
                    columnData [0] =rs.getString("Email");
                    columnData [1] =rs.getString("Difficulty");
                    columnData [2] =rs.getInt("Spanish");
                    columnData [3] =rs.getInt("German");
                    columnData [4] =rs.getInt("French");
                    columnData [5] =rs.getInt("Italian");
                    columnData [6] =rs.getInt("Greek");
                    columnData [7] =rs.getInt("Porteuguese");
                    columnData [8] =rs.getInt("TotalScore");
                    columnData [9] =rs.getInt("Average");
                    columnData [10] =rs.getString("Ranking"); 
                    // DefaultTableModel instance is created as dtablemodel
                    dtablemodel.addRow(columnData);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    
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
            java.util.logging.Logger.getLogger(ProgressPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProgressPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProgressPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProgressPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ProgressPage().setVisible(true);
            }
        });
    }
    
    public static Connection getConnection() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection(url);
            con.setAutoCommit(false);
            JOptionPane.showMessageDialog(null, "Connection Established");
            return con;
        } catch (SQLException  | ClassNotFoundException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxDifficulty;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelAverage;
    private javax.swing.JLabel jLabelDifficulty;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelFrench;
    private javax.swing.JLabel jLabelGerman;
    private javax.swing.JLabel jLabelGreek;
    private javax.swing.JLabel jLabelItalian;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelPorteuguese;
    private javax.swing.JLabel jLabelRanking;
    private javax.swing.JLabel jLabelSpanish;
    private javax.swing.JLabel jLabelTotalScore;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jProgress;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableProgressRecord;
    private javax.swing.JTextArea jTextAreaRecord;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnRecord;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnResult;
    private javax.swing.JTextField jtxtAverage;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtFirstName;
    private javax.swing.JTextField jtxtFrench;
    private javax.swing.JTextField jtxtGerman;
    private javax.swing.JTextField jtxtGreek;
    private javax.swing.JTextField jtxtItalian;
    private javax.swing.JTextField jtxtLastName;
    private javax.swing.JTextField jtxtPorteuguese;
    private javax.swing.JTextField jtxtRanking;
    private javax.swing.JTextField jtxtSpanish;
    private javax.swing.JTextField jtxtTotalScore;
    // End of variables declaration//GEN-END:variables
}
