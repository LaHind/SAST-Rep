/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import t1.Profesional;
import t1.Usuario;

/**
 *
 * @author hii
 */
@ManagedBean
@SessionScoped
public class Control {

    private Usuario user;
    private Profesional pro;
   private List<Profesional> profesionales; 
    
    public Control() {
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public Profesional getPro() {
        return pro;
    }

    public void setPro(Profesional pro) {
        this.pro = pro;
    }

   
    
    
         
    public String PaginaPrincipal()
    {
        if (user == null) 
        {
            return "index.xhtml";
        } 
        else 
        { 
          for(Profesional p:profesionales)
                    {
                        if(u.getId().equals(p.getUsuario()))
                        {
                            
                          setPro((Profesional)u);
                            return "profesional.xhtml";
                            
                        }
                        else
                        {
                            setUser(u);
                            return control.PaginaPrincipal();
                        }
                    })  
            
        }
/////// PIENSO QUITAR EL CONTROL DE SI ES PROFESIONAL O USUARIO DEL OTRO BACKING BEAN Y PONERLO AQUI
    }
    
}
