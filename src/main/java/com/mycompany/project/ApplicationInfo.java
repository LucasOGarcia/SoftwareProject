/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project;

import javax.swing.JFrame;

/**
 *
 * @author lucas
 */
public class ApplicationInfo { //keeps track of what user is currently logged in the application and pages
    private static User user;
    private static JFrame mainPage;
    private static JFrame registrationPage;
    private static JFrame loginPage;
    
    // Setters
    
    public static void setUser(User user){
        ApplicationInfo.user = user;
    }
    
    public static void setMainPage(JFrame mainPage){
        ApplicationInfo.mainPage = mainPage;
    }
    
    public static void setRegistrationPage(JFrame registrationPage){
        ApplicationInfo.registrationPage = registrationPage;
    }
    
    public static void setLoginPage(JFrame loginPage){
        ApplicationInfo.loginPage = loginPage;
    }
    
    
    // Getters
    
    public static User getUser(){
        return ApplicationInfo.user;
    }
    
    public static JFrame getMainPage(){
        return ApplicationInfo.mainPage;
    }

    public static JFrame getRegistrationPage(){
        return ApplicationInfo.registrationPage;
    }
    
    public static JFrame getLoginPage(){
        return ApplicationInfo.loginPage;
    }
    
    // functions
    
    public static void changeMainPageVisibility(boolean bool){
         ApplicationInfo.mainPage.setVisible(bool);
    }
    
    public static void changeRegistrationPageVisibility(boolean bool){
         ApplicationInfo.registrationPage.setVisible(bool);
    }
    
    public static void changeLoginPageVisibility(boolean bool){
         ApplicationInfo.loginPage.setVisible(bool);
    }
    
    public static void createPages(){ // creates all pages for the application and stores them in a variable for reference
        JFrame mainPage = new MainPage();
        ApplicationInfo.setMainPage(mainPage);
        
        JFrame registrationPage = new RegistrationPage();
        ApplicationInfo.setRegistrationPage(registrationPage);
        
        JFrame loginPage = new LoginPage();
         ApplicationInfo.setLoginPage(loginPage);
    }
}
