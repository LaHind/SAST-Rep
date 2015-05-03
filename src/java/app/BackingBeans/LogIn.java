/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.BackingBeans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

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
  //  @inject //


    public LogIn() {
        usuarios=new ArrayList<Usuario>;
        profesionales=new ArrayList<Profesional>;
        for(Usuarios u:usuarios)
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
            if(usuario.getNif().equals(usuario))
            {
                if(u.getPassword().equals(password))  // Hay que añadir
                {
                    for(Profesional p:profesional)
                    {
                        if(id_usuario.equals(p.get(id_profesional)))
                        {
                            //mostrar profesional
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
