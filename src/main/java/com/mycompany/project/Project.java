/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.project;

import javax.swing.JFrame;

/**
 *
 * @author lucas
 */
public class Project {

    public static void main(String[] args) {
        ApplicationInfo.initialise();
        RolePlayManager.initialise();
        RolePlayManager.createTopics();
        ApplicationInfo.createMainPage();
        ApplicationInfo.changeMainPageVisibility(true);
    }
}
