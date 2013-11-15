/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.simplejsf.service;

import com.example.simplejsf.domain.Footballer;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author aleksander
 */
@ApplicationScoped
public class FootballerManager {
    private List<Footballer> footballers;
    
    public FootballerManager() {
        footballers = new ArrayList<>();
    }
    
    public void addFootballer(Footballer footballer) {
        Footballer newFootballer = new Footballer();
        newFootballer.setId(footballer.getId());
        newFootballer.setName(footballer.getName());
        newFootballer.setLastName(footballer.getLastName());
        newFootballer.setNumberOfCaps(footballer.getNumberOfCaps());
        newFootballer.setAvarageNumberOfGoals(footballer.getAvarageNumberOfGoals());
        newFootballer.setIsInjured(footballer.isIsInjured());
        footballers.add(newFootballer);
    }
    
    public void deleteFootballer(Footballer footballer) {
        Footballer toDeleteFootballer = null;
        for (Footballer f: footballers) {
            if (f.getId() == footballer.getId()) {
                toDeleteFootballer = f;
                break;
            }
        }
        footballers.remove(toDeleteFootballer);
    }
    
    public List<Footballer> getFootballers() {
        return footballers;
    }
}
