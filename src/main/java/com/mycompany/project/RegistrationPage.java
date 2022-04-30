/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;

/**
 *
 * @author lucas
 */
public class RegistrationPage extends javax.swing.JFrame {

    /**
     * Creates new form RegistrationPage
     */
    public RegistrationPage() {
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

        jPanel1 = new javax.swing.JPanel();
        returnButton = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        tfFirstName = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        tfLastName = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        jpPassword = new javax.swing.JPasswordField();
        passwordLabel2 = new javax.swing.JLabel();
        jpPasswordConfirm = new javax.swing.JPasswordField();
        registerButton = new javax.swing.JButton();
        passwordAssistLabel = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jPanel1.setPreferredSize(new java.awt.Dimension(363, 655));

        returnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        returnButton.setText("Back");
        returnButton.setMaximumSize(new java.awt.Dimension(50, 50));
        returnButton.setMinimumSize(new java.awt.Dimension(50, 50));
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo128x.png"))); // NOI18N

        firstNameLabel.setText("First name");

        tfFirstName.setPreferredSize(new java.awt.Dimension(210, 22));

        lastNameLabel.setText("Last name");

        tfLastName.setPreferredSize(new java.awt.Dimension(210, 22));

        emailLabel.setText("Email");

        tfEmail.setPreferredSize(new java.awt.Dimension(210, 22));

        passwordLabel.setText("Password");

        jpPassword.setPreferredSize(new java.awt.Dimension(210, 22));
        jpPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jpPasswordFocusLost(evt);
            }
        });

        passwordLabel2.setText("Confirm password");

        jpPasswordConfirm.setPreferredSize(new java.awt.Dimension(210, 22));
        jpPasswordConfirm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpPasswordConfirmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jpPasswordConfirmFocusLost(evt);
            }
        });

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        errorLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logo)
                .addGap(110, 110, 110))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lastNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(firstNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfLastName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfFirstName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(passwordLabel)
                                .addComponent(passwordLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jpPasswordConfirm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jpPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(passwordAssistLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(logo)
                .addGap(18, 18, 18)
                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordAssistLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel2))
                .addGap(18, 18, 18)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        registerUser();
    }//GEN-LAST:event_registerButtonActionPerformed

    private void jpPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpPasswordFocusGained
        // shows label that guides the user on passsword requirements //todo make the label's default state invisible
        passwordAssistLabel.setText("<html>Password must: <br/>Be between 8-12 char, contain one number,<br/>  "
                + "one upper and lower case letter and one special char<html>");
        passwordAssistLabel.setVisible(true);
    }//GEN-LAST:event_jpPasswordFocusGained

    private void jpPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpPasswordFocusLost
        // hides label that guides the user on passsword requirements
        passwordAssistLabel.setVisible(false);
    }//GEN-LAST:event_jpPasswordFocusLost

    private void jpPasswordConfirmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpPasswordConfirmFocusGained
        passwordAssistLabel.setText("<html>Password must: <br/>Be between 8-12 char, contain one number,<br/>  "
                + "one upper and lower case letter and one special char<html>");
        passwordAssistLabel.setVisible(true);
    }//GEN-LAST:event_jpPasswordConfirmFocusGained

    private void jpPasswordConfirmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpPasswordConfirmFocusLost
        // hides label that guides the user on passsword requirements
        passwordAssistLabel.setVisible(false);
    }//GEN-LAST:event_jpPasswordConfirmFocusLost

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        ApplicationInfo.createMainPage();
        ApplicationInfo.getRegistrationPage().dispose();
    }//GEN-LAST:event_returnButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationPage().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jpPassword;
    private javax.swing.JPasswordField jpPasswordConfirm;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel passwordAssistLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel passwordLabel2;
    private javax.swing.JButton registerButton;
    private javax.swing.JButton returnButton;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFirstName;
    private javax.swing.JTextField tfLastName;
    // End of variables declaration//GEN-END:variables
    
    
    private void registerUser() {
        //reset the errorLabel in case a mistake was made before
        errorLabel.setText("");
        //extract information from fields
        String firstName = tfFirstName.getText().toLowerCase().trim();
        String lastName = tfLastName.getText().toLowerCase().trim();
        String email = tfEmail.getText().toLowerCase().trim();
        String password = String.valueOf(jpPassword.getPassword());
        String passwordConfirm = String.valueOf(jpPasswordConfirm.getPassword());
        
        // Check if any of the fields are empty and if yes, display an error messages accordingly
        if(!checkIfFieldsAreEmpty(firstName, lastName, email, password, passwordConfirm)){
            //exit function if any of the fields has a mistake
            return;
        }
        
        // Check length of the fields
        if (!checkLength(firstName, lastName, email, password)){
            //exit function if any of the fields has a mistake
            return;
        }
        
        // Verify password meets standards
        if(!checkIfValidPassword(password)){
            //exit function since password doesn't meet specs
            return;
        }
        
        // Confirm passwords match
        if (!checkIfPasswordsMatch(password, passwordConfirm)){
            //Exit since passwords don't match
            return;
        }
        
        // Verify email format
        if(!checkIfValidEmail(email)){
            //Exit since email isn't in the right format
            return;
        }
        
        // Check if email is already in the database
        if (checkIfEmailInDataBase(email)) {
            //Exit the function to avoid a registration error
            return;
        }
        
        // Change name strings into desired format
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
        
        // Create variables to generate a secure password
        String salt = null;
        String securePassword = null;
        
        // Generate a secure password
        salt = getSalt(salt);
        securePassword = getSecurePassword(password, salt);
        
        // Register user to database
        
        if (!registerUser(email, firstName, lastName, salt, securePassword)){
            // error inputing data into Database
            return;
        }
        
        // Create user object and assign to variable in ApplicationInfo class
        createUserObject(email, firstName, lastName);
        
        // set user login timestamp in the  database
        userLoginTimestamp();
        
        // Redirect to home page
        startHomePage();
    }
    
    private void initPage() {
        passwordAssistLabel.setVisible(false);
        firstNameLabel.requestFocus();
        setPageIcon();
    }
    
    private void setPageIcon(){
        // set window icon for the JFrame
        if (ApplicationInfo.getPageIconName() != null) {
            String imageName = ApplicationInfo.getPageIconName();
            ImageIcon icon = new ImageIcon(getClass().getResource("/" + imageName + ".png"));
            this.setIconImage(icon.getImage());
        }
    }

    private boolean checkIfFieldsAreEmpty(String firstName, String lastName, String email, String password, String passwordConfirm) {
        if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || password.isEmpty() || passwordConfirm.isEmpty()) {
            String errorMessage = "<html>Error!<br/>";
            if (firstName.isEmpty()){
                errorMessage += "<html>Please fill the first name field <br/>";
            }
            if (lastName.isEmpty()){
                errorMessage += "Please fill the last name field <br/>";
            }
            if (email.isEmpty()){
                errorMessage += "Please fill the email field <br/>";
            }
            if (password.isEmpty()){
                errorMessage += "Please fill the password field <br/>";
            }
            if (passwordConfirm.isEmpty()){
                errorMessage += "Please fill the password confirmation field <br/>";
            }
            errorMessage += "</html>";
            errorLabel.setText(errorMessage);
            errorLabel.setForeground(Color.red);
            
            return false;
        }
        return true;
    }
    
    // get length of the fields
    private boolean checkLength(String firstName, String lastName, String email, String password) {
        boolean result = true;
        String errorMessage = "<html>Error!<br/>";
        int maxFirstNameLength = 32;
        int maxSurnameNameLength = 32;
        int maxEmailLength = 254;
        int minPasswordLength = 8;
        int maxPasswordLength = 12;
        
        if (firstName.length() > maxFirstNameLength){
            errorMessage += "The first name entered is too long <br/>";
            result = false;
        }
        if (lastName.length() > maxSurnameNameLength){
            errorMessage += "The last name entered is too long <br/>";
            result = false;
        }
        if (email.length() > maxEmailLength){
            errorMessage += "The email field is too long <br/>";
            result = false;
        }
        if (password.length() > maxPasswordLength){
            errorMessage += "The password field is too long <br/>";
            result = false;
        }
        else if (password.length() < minPasswordLength){
            errorMessage += "The password field is too short <br/>";
            result = false;
        }
        errorMessage += "</html>";
        if (!result){
            errorLabel.setText(errorMessage);
            errorLabel.setForeground(Color.red);
        }
        return result;
    }
    
    //check if password follows specs
    private boolean checkIfValidPassword(String password) {
        boolean result = true;
        String errorMessage = "<html>Error!<br/>";
        
        Pattern lowerLetters = Pattern.compile("[a-z]");
        Pattern upperLetters = Pattern.compile("[A-Z]");
        Pattern digits = Pattern.compile("[0-9]");
        Pattern specialChars = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");

        Matcher hasLowerLetter = lowerLetters.matcher(password);
        Matcher hasUpperLetter = upperLetters.matcher(password);
        Matcher hasDigit = digits.matcher(password);
        Matcher hasSpecial = specialChars.matcher(password);
        if(!hasLowerLetter.find()){
           errorMessage += "The password must contain at least one lower case char <br/>";
           result = false;
        }
        if(!hasUpperLetter.find()){
           errorMessage += "The password must contain at least one upper case char <br/>";
           result = false;
        }
        if(!hasDigit.find()){
            errorMessage += "The  password must contain a number <br/>";
            result = false;
        }
        if(!hasSpecial.find()){
            errorMessage += "The password must contain a special char <br/>";
            result = false;
        }
        errorMessage += "</html>";
        if (!result){
            errorLabel.setText(errorMessage);
            errorLabel.setForeground(Color.red);
        }
        return result;
    }
    
    private boolean checkIfPasswordsMatch(String password, String passwordConfirmation) {
        if(!password.equals(passwordConfirmation)){
            System.out.println("password match error");
            String errorMessage = "<html>Error!<br/>";
            errorMessage += "Passwords don't match </html>";
            errorLabel.setText(errorMessage);
            errorLabel.setForeground(Color.red);
            return false;
        }
        return true;
    }
    
    private boolean checkIfValidEmail(String email){
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +  // local part
                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern emailPattern = Pattern.compile(emailRegex);
        boolean result = emailPattern.matcher(email).matches();
        
        if(!result){
            System.out.println("email error");
            String errorMessage = "<html>Error!<br/>";
            errorMessage += "Email is invalid </html>";
            errorLabel.setText(errorMessage);
            errorLabel.setForeground(Color.red);
        }
        return result;
    }
    
    private String getSalt(String salt) {
        // generate salt
        int saltLength = 254;
        salt = PasswordManager.generateSalt(saltLength);
        return salt;
    }
    
    private String getSecurePassword(String password, String salt) {
        //add encyption to password+salt
        String result = PasswordManager.generateSecurePassword(password, salt);
        return result;
    }
    
    private boolean checkIfEmailInDataBase(String email) {
        boolean result = JdbcCrud.checkIfEmailExists(email);
        if (result){
            System.out.println("email error");
            String errorMessage = "<html>Error!<br/>";
            errorMessage += "Email already in use </html>";
            errorLabel.setText(errorMessage);
            errorLabel.setForeground(Color.red);
        }
        return result;
    }

    private boolean registerUser(String email, String firstName, String lastName, String salt, String password) {
        List<String> languages = new ArrayList();
        String spanish = "Spanish";
        String french = "French";
        String portuguese = "Portuguese";
        String german = "German";
        String italian = "Italian";
        String greek = "Greek";
        languages.add(spanish);
        languages.add(french);
        languages.add(portuguese);
        languages.add(german);
        languages.add(italian);
        languages.add(greek);
        
        try {
            JdbcCrud.registerUserClientInfo(email, firstName, lastName, salt, password);
            for (int i = 0; i < languages.size(); i++) {
                JdbcCrud.registerUserClienStatistics(email, languages.get(i));
            }
            return true;
        } catch (Exception ex) {
            String errorMessage = "<html>Error!<br/>";
            errorMessage += "<html>Error!<br/> Unable to connect to the server, try again later... </html>";
            errorLabel.setText(errorMessage);
            errorLabel.setForeground(Color.red);
            Logger.getLogger(RegistrationPage.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    private void createUserObject(String email, String firstName, String lastName) {
        int accountType = 0;
        double width = ApplicationInfo.detectScreenWidth();
        double height = ApplicationInfo.detectScreenHeight();
        User user = new User(email, firstName, lastName, accountType, width, height);
        ApplicationInfo.setUser(user);
    }
    
    public void startHomePage(){ //restarts the user homepage with the user object info
        ApplicationInfo.createHomePage();
        ApplicationInfo.getRegistrationPage().dispose();
    }

    private void userLoginTimestamp() {
        try {
            JdbcCrud.updateClientLoginTimestamp();
        } catch (Exception ex) {
            String errorMessage = "<html>Error!<br/>";
            errorMessage += "<html>Error!<br/> Unable to connect to the server, try again later... </html>";
            Logger.getLogger(RegistrationPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}