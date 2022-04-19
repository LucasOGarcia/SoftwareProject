/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author lucas
 */
public class ApplicationInfo { //keeps track of what user is currently logged in the application and pages
    private static Dimension screenSize;
    private static User user;
    private static JFrame mainPage;
    private static JFrame registrationPage;
    private static JFrame loginPage;
    private static JFrame homePage;
    private static JFrame languagePage;
    private static JFrame rolePage;
    private static JFrame conversationLevelSelectionPage;
    private static JFrame topicSelectionPage;
    private static JFrame subTopicSelectionPage;
    private static JFrame rolePlayPage;
    private static JFrame performancePage;
    
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
    
    public static void setHomePage(JFrame homePage){
        ApplicationInfo.homePage = homePage;
    }
    
    public static void setLanguagePage(JFrame languagePage){
        ApplicationInfo.languagePage = languagePage;
    }
    
    public static void setRolePage(JFrame rolePage){
        ApplicationInfo.rolePage = rolePage;
    }
    
    public static void setConversationLevelSelectionPage(JFrame conversationLevelSelectionPage){
        ApplicationInfo.conversationLevelSelectionPage = conversationLevelSelectionPage;
    }

    public static void setTopicSelectionPage(JFrame topicSelectionPage){
        ApplicationInfo.topicSelectionPage = topicSelectionPage;
    }
    
    public static void setSubTopicSelectionPage(JFrame subTopicSelectionPage){
        ApplicationInfo.subTopicSelectionPage = subTopicSelectionPage;
    }
    
    public static void setRolePlayPage(JFrame rolePlayPage){
        ApplicationInfo.rolePlayPage = rolePlayPage;
    }
    
    public static void setPerformancePage(JFrame performancePage){
        ApplicationInfo.performancePage = performancePage;
    }
    
    public static void setScreenSize(Dimension screenSize){
        ApplicationInfo.screenSize = screenSize;
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
    
    public static JFrame getHomePage(){
        return ApplicationInfo.homePage;
    }
    
    public static JFrame getLanguagePage(){
        return ApplicationInfo.languagePage;
    }
    
    public static JFrame getRolePage(){
        return ApplicationInfo.rolePage;
    }
    
    public static JFrame getConversationLevelSelectionPage(){
        return ApplicationInfo.conversationLevelSelectionPage;
    }

    public static JFrame getTopicSelectionPage(){
        return ApplicationInfo.topicSelectionPage;
    }
    
    public static JFrame getSubTopicSelectionPage(){
        return ApplicationInfo.subTopicSelectionPage;
    }
    
    public static JFrame getRolePlayPage(){
        return ApplicationInfo.rolePlayPage;
    }
    
    public static JFrame getPerformancePage(){
        return ApplicationInfo.performancePage;
    }
    
    public static Dimension getScreenSize(){
        return ApplicationInfo.screenSize;
    }
    
    // page visibility functions
    
    public static void changeMainPageVisibility(boolean bool){
         ApplicationInfo.mainPage.setVisible(bool);
    }
    
    public static void changeRegistrationPageVisibility(boolean bool){
         ApplicationInfo.registrationPage.setVisible(bool);
    }
    
    public static void changeLoginPageVisibility(boolean bool){
         ApplicationInfo.loginPage.setVisible(bool);
    }
    
    public static void changeHomePageVisibility(boolean bool){
         ApplicationInfo.homePage.setVisible(bool);
    }
    
    public static void changelanguagePageVisibility(boolean bool){
         ApplicationInfo.languagePage.setVisible(bool);
    }
    
    public static void changeRolePageVisibility(boolean bool){
         ApplicationInfo.rolePage.setVisible(bool);
    }
    
    public static void changeConversationLevelSelectionPageVisibility(boolean bool){
         ApplicationInfo.conversationLevelSelectionPage.setVisible(bool);
    }
    
    public static void changeTopicSelectionPageVisibility(boolean bool){
         ApplicationInfo.topicSelectionPage.setVisible(bool);
    }
    
    public static void changeSubTopicSelectionPageVisibility(boolean bool){
         ApplicationInfo.subTopicSelectionPage.setVisible(bool);
    }

    public static void changeRolePlayPageVisibility(boolean bool){
         ApplicationInfo.rolePlayPage.setVisible(bool);
    }
    
   public static void changePerformancePageVisibility(boolean bool){
         ApplicationInfo.performancePage.setVisible(bool);
    }
    
    // Other functions
    
    public static void createPages(){ // creates all pages, set their bounds and store them in a variable for reference
        ApplicationInfo.setScreenSize(new Dimension(375, 667));
        String appName = "iLearn";
        
        // Main page
        JFrame mainPage = new MainPage();
        mainPage.setTitle(appName);
        mainPage.setPreferredSize(screenSize);
        mainPage.setMaximumSize(screenSize);
        mainPage.setMinimumSize(screenSize);
        mainPage.setResizable(false);
        mainPage.setLocationRelativeTo(null);
        ApplicationInfo.setMainPage(mainPage);
        
        // Registration page
        JFrame registrationPage = new RegistrationPage();
        registrationPage.setTitle(appName);
        registrationPage.setPreferredSize(screenSize);
        registrationPage.setMaximumSize(screenSize);
        registrationPage.setMinimumSize(screenSize);
        registrationPage.setResizable(false);
        registrationPage.setLocationRelativeTo(null);
        ApplicationInfo.setRegistrationPage(registrationPage);
        
        // Login page
        JFrame loginPage = new LoginPage();
        loginPage.setTitle(appName);
        loginPage.setPreferredSize(screenSize);
        loginPage.setMaximumSize(screenSize);
        loginPage.setMinimumSize(screenSize);
        loginPage.setResizable(false);
        loginPage.setLocationRelativeTo(null);
        ApplicationInfo.setLoginPage(loginPage);
        
        // Home page
        JFrame homePage = new HomePage();
        homePage.setTitle(appName);
        homePage.setPreferredSize(screenSize);
        homePage.setMaximumSize(screenSize);
        homePage.setMinimumSize(screenSize);
        homePage.setResizable(false);
        homePage.setLocationRelativeTo(null);
        ApplicationInfo.setHomePage(homePage);
        
        // Language page
        JFrame languagePage = new Language();
        languagePage.setTitle(appName);
        languagePage.setPreferredSize(screenSize);
        languagePage.setMaximumSize(screenSize);
        languagePage.setMinimumSize(screenSize);
        languagePage.setResizable(false);
        languagePage.setLocationRelativeTo(null);
        ApplicationInfo.setLanguagePage(languagePage);
        
        // Role page
        JFrame rolePage = new Role();
        rolePage.setTitle(appName);
        rolePage.setPreferredSize(screenSize);
        rolePage.setMaximumSize(screenSize);
        rolePage.setMinimumSize(screenSize);
        rolePage.setResizable(false);
        rolePage.setLocationRelativeTo(null);
        ApplicationInfo.setRolePage(rolePage);
        
        // Conversation level selection page
        JFrame conversationLevelSelectionPage = new ConversationLevelSelection();
        conversationLevelSelectionPage.setTitle(appName);
        conversationLevelSelectionPage.setPreferredSize(screenSize);
        conversationLevelSelectionPage.setMaximumSize(screenSize);
        conversationLevelSelectionPage.setMinimumSize(screenSize);
        conversationLevelSelectionPage.setResizable(false);
        conversationLevelSelectionPage.setLocationRelativeTo(null);
        ApplicationInfo.setConversationLevelSelectionPage(conversationLevelSelectionPage);
        
        // Topic selection page
        JFrame topicSelectionPage = new TopicSelection();
        topicSelectionPage.setTitle(appName);
        topicSelectionPage.setPreferredSize(screenSize);
        topicSelectionPage.setMaximumSize(screenSize);
        topicSelectionPage.setMinimumSize(screenSize);
        topicSelectionPage.setResizable(false);
        topicSelectionPage.setLocationRelativeTo(null);
        ApplicationInfo.setTopicSelectionPage(topicSelectionPage);
        
        // Sub-topic selection page
        JFrame subTopicSelectionPage = new SubTopicSelection();
        subTopicSelectionPage.setTitle(appName);
        subTopicSelectionPage.setPreferredSize(screenSize);
        subTopicSelectionPage.setMaximumSize(screenSize);
        subTopicSelectionPage.setMinimumSize(screenSize);
        subTopicSelectionPage.setResizable(false);
        subTopicSelectionPage.setLocationRelativeTo(null);
        ApplicationInfo.setSubTopicSelectionPage(subTopicSelectionPage);
        
        // Role play page
        JFrame rolePlayPage = new RolePlay();
        rolePlayPage.setTitle(appName);
        rolePlayPage.setPreferredSize(screenSize);
        rolePlayPage.setMaximumSize(screenSize);
        rolePlayPage.setMinimumSize(screenSize);
        rolePlayPage.setResizable(false);
        rolePlayPage.setLocationRelativeTo(null);
        ApplicationInfo.setRolePlayPage(rolePlayPage);
        
        // Performance page
//        JFrame performancePage = new Performance_wireframeV2();
//        performancePage.setTitle(appName);
//        performancePage.setPreferredSize(screenSize);
//        performancePage.setMaximumSize(screenSize);
//        performancePage.setMinimumSize(screenSize);
//        performancePage.setResizable(false);
//        performancePage.setLocationRelativeTo(null);
//        ApplicationInfo.setRolePlayPage(performancePage);

    }
}
