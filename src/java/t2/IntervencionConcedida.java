/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import t1.Intervencion;

/**
 *
 * @author hii
 */
@ManagedBean
@RequestScoped
public class IntervencionConcedida {
    
    private List<Intervencion> intervenciones;
    

    /**
     * Creates a new instance of IntervencionConcedida
     */
    public IntervencionConcedida() {
    }
    
}
