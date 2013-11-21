/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.simplejsf.domain;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author aleksander
 */
@ManagedBean
public class Footballer {
    
    private int id;
    private String name;
    private String lastName;
    private int numberOfCaps;
    private double avarageNumberOfGoals;
    private boolean isInjured;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the numberOfCaps
     */
    public int getNumberOfCaps() {
        return numberOfCaps;
    }

    /**
     * @param numberOfCaps the numberOfCaps to set
     */
    public void setNumberOfCaps(int numberOfCaps) {
        this.numberOfCaps = numberOfCaps;
    }

    /**
     * @return the avarageNumberOfGoals
     */
    public double getAvarageNumberOfGoals() {
        return avarageNumberOfGoals;
    }

    /**
     * @param avarageNumberOfGoals the avarageNumberOfGoals to set
     */
    public void setAvarageNumberOfGoals(double avarageNumberOfGoals) {
        this.avarageNumberOfGoals = avarageNumberOfGoals;
    }

    /**
     * @return the isInjured
     */
    public boolean isIsInjured() {
        return isInjured;
    }

    /**
     * @param isInjured the isInjured to set
     */
    public void setIsInjured(boolean isInjured) {
        this.isInjured = isInjured;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
}
