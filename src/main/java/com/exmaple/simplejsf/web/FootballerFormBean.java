/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.exmaple.simplejsf.web;

import com.example.simplejsf.domain.Footballer;
import com.example.simplejsf.service.FootballerManager;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author aleksander
 */

@SessionScoped
@Named("footballerBean") 
public class FootballerFormBean implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private Footballer footballer = new Footballer();
    private ListDataModel<Footballer> footballers = new ListDataModel<>();
    
    @Inject
    private FootballerManager footballerManager;
 
    public Footballer getFootballer() {
        return footballer;
    }
    
    public void setFootballer(Footballer footballer) {
        this.footballer = footballer;
    }

    public ListDataModel<Footballer> getFootballers() {
        footballers.setWrappedData(footballerManager.getFootballers());
        return footballers;
    }
    
    public String addFootballer() {
        footballerManager.addFootballer(footballer);
        return "show";
    }
    
    public String deleteFootballer() {
        footballerManager.deleteFootballer(footballer);
        return null;
    }
}
