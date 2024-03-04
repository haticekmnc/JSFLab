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
public class StudentFour {
    
    private String firstName;
    private String lastName;
    
    
    //since the user can select multiple languages
    //we need an array of strings
    private String[] favouriteLanguages;
    
    // non-arg constructor
    public StudentFour(){
        
    }
    
    // getter/setter methods

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLstname() {
        return lastName;
    }

    public void setLstname(String lstname) {
        this.lastName = lstname;
    }

    public String[] getFavouriteLanguages() {
        return favouriteLanguages;
    }

    public void setFavouriteLanguages(String[] favouriteLanguages) {
        this.favouriteLanguages = favouriteLanguages;
    }

    
    
    
    
}
