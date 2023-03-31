/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import etu001958.framework.utilitaire.ModelView;
import etu001958.framework.utilitaire.Url;




/**
 *
 * @author rindra
 */
public class Dept {
  
    @Url(name="dept-findAll")
    public ModelView findAll(){
        ModelView mv =new ModelView();
        mv.setView("listDept.jsp");
        return mv;
    }
    
    @Url(name="dept-addDept")
    public void addDept(){
        
    }
}
