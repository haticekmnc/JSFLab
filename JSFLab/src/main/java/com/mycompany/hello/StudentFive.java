/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hello;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author hatice.kemence
 */
@ManagedBean
public class StudentFive {
    
    private String firstName;
    private String lastName;
    private String favoriteLanguage;
    
    // non-arg constructor
    public StudentFive(){
        
        // pre-populate the bean
        firstName= "Mary";
        lastName= "Public";
        favoriteLanguage = "Ruby";
        
    }
    
    // getter/setter methods

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }
    
    
}
