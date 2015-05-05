/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
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
   
   @inject
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
                    for(Profesional p:profesionales)
                    {
                        if(u.getId().equals(p.getUsuario()))
                        {
                           control.setPro(p);
                            return "profesional.xhtml";
                            
                        }
                    }
                    //autenticar (con controlador)
                }
                else
                {
                    //contraseña errónea 
                }
                
            }
            else 
            {
                //Usuario no encontrado
            }
        }
    }
    
}
