/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 package test;

import etu2005.framework.ModelView;
import etu2005.framework.Parametre;
import etu2005.framework.AnnotationController;
import etu2005.framework.Url;

/**
 *
 * @author Best
 */
@AnnotationController
public class Classtest {
    String nom;
    Integer phone;
    java.util.Date utilDate;
    java.sql.Date sqlDate;
    String[] genre;

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPhone(Integer phone) {
        this.phone = phone;
    }
    public void setUtilDate(java.util.Date utilDate) {
        this.utilDate = utilDate;
    }
    public void setSqlDate(java.sql.Date sqlDate){
        this.sqlDate = sqlDate;
    }
    public void setGenre(String[] genre){
        this.genre = genre;
    }
    public String getNom() {
        return nom;
    }
    public Integer getPhone() {
        return phone;
    }
    public java.util.Date getUtilDate() {
        return utilDate;
    }
    public java.sql.Date getSqlDate(){
        return sqlDate;
    }
    public String[] getGenre(){
        return genre;
    }
    

    @Url(nom="test")
    public ModelView view(){
        ModelView model = new ModelView();
        model.setView("index.jsp");
        return model;
    } 

    @Url(nom="getValues")
    public ModelView getValues() {
        ModelView model = new ModelView();
        for (int i = 0; i < getGenre().length; i++) {
            System.out.println(getGenre()[i]);
        }
        model.setView("Test.jsp");  
        return model;
    }

    @Url(nom="parametre")
    public ModelView getParametre(@Parametre(parametre = "param") Integer i){
        ModelView model = new ModelView();
        System.out.println(i);
        model.setView("index.jsp");
        return model;
    }
  
}
