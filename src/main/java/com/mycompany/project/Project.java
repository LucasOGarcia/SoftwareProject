/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.project;

import java.io.File;

/**
 *
 * @author lucas
 */
public class Project { 

    // admin account credentials:   email: test@my.westminster.ac.uk  password: Test12345@
    public static void main(String[] args) {
        ApplicationInfo.initialise();
        RolePlayManager.initialise();
        checkIfDatabaseExists();
        ApplicationInfo.createMainPage();
    }
    
    public static void checkIfDatabaseExists() {
        String dbName = ApplicationInfo.getDatabaseName();
        File file = new File (dbName);
        if(!file.exists()) {
            System.out.println("Database doesn't exist. Creating database now...");
            CreateDatabase.createDB();
            CreateTable.createTables();
            CreateTable.createTestAdmin();
            System.out.println("Database successfully created!");
        }
    }
}
