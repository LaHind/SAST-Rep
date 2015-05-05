/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2;

import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import t1.Profesional;
import t1.Usuario;

/**
 *
 * @author hii
 */
@ManagedBean // HAVE A LOOK
@RequestScoped
public class LogIn {
    
   private String usuario;
   private String password;
   private String estado;
   private List<Usuario> usuarios;
   private List<Profesional> profesionales;  
   
   @Inject
   private Control control;


    public LogIn() {
        usuarios=new ArrayList<Usuario>();
        profesionales=new ArrayList<Profesional>();
        for(Usuario u:usuarios)
        {
            usuarios.add(u);
        }
        for(Profesional p:profesionales)
        {
            profesionales.add(p);
        }
        
    }
    
    public String getUsuario() {
        return usuario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String nombre) {
        estado = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String Autenticar()
    {
        
        for(Usuario u:usuarios)
        {
            if(u.getNIF().equals(usuario))
            {
                if(u.getClave().equals(password))  // Hay que añadir
                {
                    
                    control.setUser(u);
                    return control.PaginaPrincipal();
                }
                else
                {
                    //contraseña errónea 
                   FacesContext ctx = FacesContext.getCurrentInstance();
                    ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Contraseña no válida", "Contraseña no válida"));
                    return null;
                }
                
            }
            else 
            {
                FacesContext ctx = FacesContext.getCurrentInstance();
                    ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "El usuario no existe", "El usuario no existe"));
                    return null;
                //Usuario no encontrado
            }
        }
         //AUNQUE HAY UN RETURN EN CADA CCASO DA ERROR PORQUE DICE QUE FALTA EL RETURN Uff
    }
    
}