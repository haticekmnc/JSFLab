/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hello;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author hatice.kemence
 */
@ManagedBean
public class StudentTwo {
    private String firstname;
    private String lastname;
    private String country;
    
    // list of countries for the drop-down list
    List<String> countryOptions;
    
    
    // non-arg constructor
    public StudentTwo(){
        // populate the list of countries
        countryOptions = new ArrayList<>();
        
        countryOptions.add("Brazil");
        countryOptions.add("France");
        countryOptions.add("Germany");
        countryOptions.add("India");
        countryOptions.add("Turkey");
        countryOptions.add("United Kingdom");
        countryOptions.add("United States");
        
        
        
    }
     
    public List<String> getCountryOptions() {
        return countryOptions;
    }

    // getter/setter methods
    // need to add a getter method for country options
    public void setCountryOptions(List<String> countryOptions) {    
        this.countryOptions = countryOptions;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    
    
}
