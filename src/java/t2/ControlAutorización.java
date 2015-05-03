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
public class ControlAutorización {

    private Usuario user;
    
    public ControlAutorización() {
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
    
    public String PáginaPrincipal()
    {
        if (user == null) 
        {
            return "index.xhtml";
        } 
        else 
        { /////// PIENSO QUITAR EL CONTROL DE SI ES PROFESIONAL O USUARIO DEL OTRO BACKING BEAN Y PONERLO AQUI
    }
    
}
