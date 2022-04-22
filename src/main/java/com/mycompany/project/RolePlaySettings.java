/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author lucas
 */
public class RolePlaySettings {
    private String language;
    private String role;
    private String difficulty;
    private String topicType;
    
    // Setters
    
    public void setLanguage(String newLanguage) {
        this.language = newLanguage;
    }
    
    public void setRole(String newRole) {
        this.role = newRole;
    }
    
    public void setDifficulty(String newDifficulty) {
        this.difficulty = newDifficulty;
    }
    
    public void setTopicType(String newTopicType) {
        this.topicType = newTopicType;
    }
    
    // Getters
    
    public String getLanguage() {
        return this.language;
    }
    
    public String getRole() {
        return this.role;
    }
    
    public String getDifficulty() {
        return this.difficulty;
    }
    
    public String getTopicType() {
        return this.topicType;
    }
}
