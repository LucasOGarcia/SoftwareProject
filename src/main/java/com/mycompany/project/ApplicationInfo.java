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
public class ApplicationInfo { //keeps track of what user is currently logged in the application
    private static User user;
    
    public static void setUser(User user){
        ApplicationInfo.user = user;
    }
}
