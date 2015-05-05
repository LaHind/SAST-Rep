/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author hii
 */
@ManagedBean
@RequestScoped
public class Control {

    private Usuario user;
   
    
    public Control() {
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public void setPro(Profesional pro) {
        (Profesional) ;
    }
    
    
         
    public String PáginaPrincipal()
    {
        if (user == null) 
        {
            return "index.xhtml";
        } 
        else 
        { 
          if()  
            
        }
/////// PIENSO QUITAR EL CONTROL DE SI ES PROFESIONAL O USUARIO DEL OTRO BACKING BEAN Y PONERLO AQUI
    }
    
}
