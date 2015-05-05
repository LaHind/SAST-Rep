/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2;

import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import t1.Usuario;

/**
 *
 * @author hii
 */
@ManagedBean
@RequestScoped
public class DarAltaUsuario implements Serializable {
    
    
    private List<Usuario> usuarios;

   
   
    /**
     * Creates a new instance of DarAltaUsuario
     */
    public DarAltaUsuario() {
      
    }
    
    public void darDeAlta(Usuario user)
    {
          for(Usuario u: usuarios)
        {
            if (u.getNIF().equals(user.getNIF()))
            {
                FacesContext ctx = FacesContext.getCurrentInstance();
                    ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Usuario existente", "Usuario existente"));
            }
            else 
            {
                usuarios.add(user);
            }
        }
    }
    
}
