/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project;

import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


/**
 *
 * @author lucas
 */
public class ApplicationInfo { //keeps track of what user is currently logged in the application and pages
    private static Dimension screenSize;
    private static User user;
    private static String databaseName;
    private static String appName;
    private static String pageIconName;
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
   private static JFrame adminhPage;
    private static JFrame adminPage720;
    private static JFrame adminPage1080;
    private static JFrame progressPage;
    
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
    
    public static void setAdminHomePage(JFrame adminhomePage){
        ApplicationInfo.adminhPage = adminhPage;
    }
    
        public static void setAdminPage720p(JFrame adminPage720){
        ApplicationInfo.adminPage720 = adminPage720;
    }
    
    public static void setAdminPage1080p(JFrame adminPage1080){
        ApplicationInfo.adminPage1080 = adminPage1080;
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
    
    public static void setAppName(String appName) {
        ApplicationInfo.appName = appName;
    }
    
    public static void setPageIconName(String iconName) {
        ApplicationInfo.pageIconName = iconName;
    }
    
    public static void setDatabaseName(String newDatabaseName) {
         ApplicationInfo.databaseName = newDatabaseName;
    }
    
    public static void setProgressPage(JFrame progressPage){
        ApplicationInfo.progressPage = progressPage;
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
    
    public static JFrame getAdminHomePage(){
        return ApplicationInfo.adminhPage;
    }
    
        public static JFrame getAdminPage720p(){
        return ApplicationInfo.adminPage720;
    }
    
        public static JFrame getAdminPage1080p(){
        return ApplicationInfo.adminPage1080;
    }
    
    public static Dimension getScreenSize(){
        return ApplicationInfo.screenSize;
    }
    
    public static String getAppName() {
        return ApplicationInfo.appName;
    }
    
    public static String getPageIconName(){
        return ApplicationInfo.pageIconName;
    }
    
    public static String getDatabaseName() {
        return ApplicationInfo.databaseName;
    }
    
    public static JFrame getProgressPage(){
        return ApplicationInfo.progressPage;
    }
    
    // Other functions
    
    public static double detectScreenWidth(){
            Dimension monitorSize = Toolkit.getDefaultToolkit().getScreenSize();
            double width = monitorSize.getWidth();
            return width;           
    }
    
    public static double detectScreenHeight(){
       Dimension monitorSize = Toolkit.getDefaultToolkit().getScreenSize();
        double height = monitorSize.getHeight();
        return height;
    }
   
    public static void initialise() { // sets all of the application's basic info
        ApplicationInfo.setScreenSize(new Dimension(375, 667));
        ApplicationInfo.setAppName("iLearnIt");
        ApplicationInfo.setPageIconName("logo64x");
        ApplicationInfo.setDatabaseName("coursework.db") ;
    }
   
    public static void createMainPage() { // Creates the main page
        JFrame mainPage = new MainPage();
        mainPage.setTitle(appName);
        mainPage.setPreferredSize(screenSize);
        mainPage.setMaximumSize(screenSize);
        mainPage.setMinimumSize(screenSize);
        mainPage.setResizable(false);
        mainPage.setLocationRelativeTo(null);
        setDefaultCloseMethods(mainPage);
        ApplicationInfo.setMainPage(mainPage);
        mainPage.setVisible(true);
    }
   
    public static void createRegistrationPage() { // Creates the registration page
        JFrame registrationPage = new RegistrationPage();
        registrationPage.setTitle(appName);
        registrationPage.setPreferredSize(screenSize);
        registrationPage.setMaximumSize(screenSize);
        registrationPage.setMinimumSize(screenSize);
        registrationPage.setResizable(false);
        registrationPage.setLocationRelativeTo(null);
        setDefaultCloseMethods(registrationPage);
        ApplicationInfo.setRegistrationPage(registrationPage);
        registrationPage.setVisible(true);
    }
   
    public static void createLoginPage() { // Creates the login page
        JFrame loginPage = new LoginPage();
        loginPage.setTitle(appName);
        loginPage.setPreferredSize(screenSize);
        loginPage.setMaximumSize(screenSize);
        loginPage.setMinimumSize(screenSize);
        loginPage.setResizable(false);
        loginPage.setLocationRelativeTo(null);
        setDefaultCloseMethods(loginPage);
        ApplicationInfo.setLoginPage(loginPage);
        loginPage.setVisible(true);
    }
   
    public static void createHomePage() { // Creates the home page
        JFrame homePage = new HomePage();
        homePage.setTitle(appName);
        homePage.setPreferredSize(screenSize);
        homePage.setMaximumSize(screenSize);
        homePage.setMinimumSize(screenSize);
        homePage.setResizable(false);
        homePage.setLocationRelativeTo(null);
        setDefaultCloseMethods(homePage);
        ApplicationInfo.setHomePage(homePage);
        homePage.setVisible(true);
    }
   
    public static void createLanguagePage() { // Creates the language page
        JFrame languagePage = new Language();
        languagePage.setTitle(appName);
        languagePage.setPreferredSize(screenSize);
        languagePage.setMaximumSize(screenSize);
        languagePage.setMinimumSize(screenSize);
        languagePage.setResizable(false);
        languagePage.setLocationRelativeTo(null);
        setDefaultCloseMethods(languagePage);
        ApplicationInfo.setLanguagePage(languagePage);
        languagePage.setVisible(true);
    }
   
    public static void createRolePage() { // Creates the role page
        JFrame rolePage = new Role();
        rolePage.setTitle(appName);
        rolePage.setPreferredSize(screenSize);
        rolePage.setMaximumSize(screenSize);
        rolePage.setMinimumSize(screenSize);
        rolePage.setResizable(false);
        rolePage.setLocationRelativeTo(null);
        setDefaultCloseMethods(rolePage);
        ApplicationInfo.setRolePage(rolePage);
        rolePage.setVisible(true);
    }
   
    public static void createConversationLevelSelectionPage() { // Creates the conversation Level SelectionPage page
        JFrame conversationLevelSelectionPage = new ConversationLevelSelection();
        conversationLevelSelectionPage.setTitle(appName);
        conversationLevelSelectionPage.setPreferredSize(screenSize);
        conversationLevelSelectionPage.setMaximumSize(screenSize);
        conversationLevelSelectionPage.setMinimumSize(screenSize);
        conversationLevelSelectionPage.setResizable(false);
        conversationLevelSelectionPage.setLocationRelativeTo(null);
        setDefaultCloseMethods(conversationLevelSelectionPage);
        ApplicationInfo.setConversationLevelSelectionPage(conversationLevelSelectionPage);
        conversationLevelSelectionPage.setVisible(true);
        
    }
   
    public static void createTopicSelectionPage() { // Creates the topic selection page
        JFrame topicSelectionPage = new TopicSelection();
        topicSelectionPage.setTitle(appName);
        topicSelectionPage.setPreferredSize(screenSize);
        topicSelectionPage.setMaximumSize(screenSize);
        topicSelectionPage.setMinimumSize(screenSize);
        topicSelectionPage.setResizable(false);
        topicSelectionPage.setLocationRelativeTo(null);
        setDefaultCloseMethods(topicSelectionPage);
        ApplicationInfo.setTopicSelectionPage(topicSelectionPage);
        topicSelectionPage.setVisible(true);
    }
   
    public static void createSubTopicSelectionPage() { // Creates the sub-topic selection page
        JFrame subTopicSelectionPage = new SubTopicSelection();
        subTopicSelectionPage.setTitle(appName);
        subTopicSelectionPage.setPreferredSize(screenSize);
        subTopicSelectionPage.setMaximumSize(screenSize);
        subTopicSelectionPage.setMinimumSize(screenSize);
        subTopicSelectionPage.setResizable(false);
        subTopicSelectionPage.setLocationRelativeTo(null);
        setDefaultCloseMethods(subTopicSelectionPage);
        ApplicationInfo.setSubTopicSelectionPage(subTopicSelectionPage);
        subTopicSelectionPage.setVisible(true);
    }
   
    public static void createRolePlayPage() { // Creates the create role play page
        JFrame rolePlayPage = new RolePlay1();
        rolePlayPage.setTitle(appName);
        rolePlayPage.setPreferredSize(screenSize);
        rolePlayPage.setMaximumSize(screenSize);
        rolePlayPage.setMinimumSize(screenSize);
        rolePlayPage.setResizable(false);
        rolePlayPage.setLocationRelativeTo(null);
        setDefaultCloseMethods(rolePlayPage);
        ApplicationInfo.setRolePlayPage(rolePlayPage);
        rolePlayPage.setVisible(true);
    }
    
        public static void createPerformancePage() { // Creates Performance page
        JFrame performancePage = new Performance();
        performancePage.setTitle(appName);
        performancePage.setPreferredSize(screenSize);
        performancePage.setMaximumSize(screenSize);
        performancePage.setMinimumSize(screenSize);
        performancePage.setResizable(false);
        performancePage.setLocationRelativeTo(null);
        setDefaultCloseMethods(performancePage);
        ApplicationInfo.setPerformancePage(performancePage);
        performancePage.setVisible(true);
    }
        
        public static void createadminHomePage() { // Creates Admin home Page
        JFrame adminhPage = new AdminHomePage();
        adminhPage.setTitle(appName);
        adminhPage.setPreferredSize(screenSize);
        adminhPage.setMaximumSize(screenSize);
        adminhPage.setMinimumSize(screenSize);
        adminhPage.setResizable(false);
        adminhPage.setLocationRelativeTo(null);
        setDefaultCloseMethods(adminhPage);
        ApplicationInfo.setPerformancePage(adminhPage);
        adminhPage.setVisible(true);
    }
        
         public static void createadminPage1080p() { // Admin Page (adjust size)
        JFrame adminPage1080 = new AdminPage();
        adminPage1080.setTitle(appName);
        adminPage1080.setPreferredSize(screenSize);//adjust to detect
        adminPage1080.setMaximumSize(screenSize);//adjust to custom
        adminPage1080.setMinimumSize(screenSize);//adjust to custom
        adminPage1080.setResizable(false);
        adminPage1080.setLocationRelativeTo(null);
        setDefaultCloseMethods(adminPage1080);
        ApplicationInfo.setPerformancePage(adminPage1080);
        adminPage1080.setVisible(true);
        
         }
         
        public static void createadminPage720p() { // Admin Page (adjust size)
        JFrame adminPage720 = new AdminPage720p();
        adminPage720.setTitle(appName);
        adminPage720.setPreferredSize(screenSize);//adjust to custom
        adminPage720.setMaximumSize(screenSize); //adjust to custom
        adminPage720.setMinimumSize(screenSize); //adjust to custom
        adminPage720.setResizable(false);
        adminPage720.setLocationRelativeTo(null);
        setDefaultCloseMethods(adminPage720);
        ApplicationInfo.setPerformancePage(adminPage720);
        adminPage720.setVisible(true);
        
         }
         
        public static void createprogressPage() { // creates Progress Page
        JFrame progressPage = new ProgressPage();
        progressPage.setTitle(appName);
        progressPage.setPreferredSize(screenSize);
        progressPage.setMaximumSize(screenSize);
        progressPage.setMinimumSize(screenSize);
        progressPage.setResizable(false);
        progressPage.setLocationRelativeTo(null);
        setDefaultCloseMethods(progressPage);
        ApplicationInfo.setPerformancePage(progressPage);
        progressPage.setVisible(true);
    } 
    
   
    public static void setDefaultCloseMethods(JFrame page) {
        page.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        page.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event) {
                setLogoutTimeStamp();
                closeApplication(page);
            }
        });
    }
   
    public static void setLogoutTimeStamp() {
        if (ApplicationInfo.user != null) {
            try {
                JdbcCrud.updateClientLogoutTimestamp();
            } catch (Exception ex) {
                Logger.getLogger(ApplicationInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
   
    public static void closeApplication(JFrame page) {
        page.dispose();
        System.exit(0);
    }

   
   
}
