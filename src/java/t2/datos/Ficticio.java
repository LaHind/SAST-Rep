/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2.datos;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import t1.entidades.*;

/**
 *
 * @author Michael
 */
public class Ficticio implements Serializable {
    

    protected List<Profesional> profesionales;
    protected List<Intervencion> intervenciones;
    protected List<Expediente> expedientes;
    protected List<Usuario> usuarios;
    protected List<Cita> citas;
    protected List<Formulario> formularios;
    
    
    public Ficticio() {
        profesionales = new ArrayList<>();
        intervenciones  = new ArrayList<>();
        expedientes  = new ArrayList<>();
        usuarios  = new ArrayList<>();
        citas = new ArrayList<>();
        formularios  = new ArrayList<>();
        rellenar();
    }
    
    private void rellenar(){
        Usuario u0=new Usuario();
        usuarios.add(u0);
        Usuario u1=new Usuario();
        usuarios.add(u1);
        Usuario u2=new Usuario();
        usuarios.add(u2);
        
        Expediente e0=new Expediente();
        expedientes.add(e0);
        Expediente e1=new Expediente();
        expedientes.add(e1);
        Expediente e2=new Expediente();
        expedientes.add(e2);
        
        Profesional p0=new Profesional();
        profesionales.add(p0);
        
        Formulario f0=new Formulario();
        formularios.add(f0);
        Formulario f1=new Formulario();
        formularios.add(f1);
        
        Cita c0=new Cita();
        citas.add(c0);
        
        
        u0.setId(1834L);
        u0.setNombre("Fulanito");
        u0.setApellido1("Elito");
        u0.setApellido2("Domingo");
        u0.setNIF("74849596P");
        u0.setClave("1234");
        u0.setCorreo("fulanito@gmail.com");
        u0.setSexo(Usuario.SexoEnum.Hombre);
        u0.setFecha_Nacimiento(null);
        u0.setTutor(null);
        
            e0.setId(11L);
            e0.setDireccion1("Avenida Carlos Benavente, nº9, 28082, Madrid, España");
            e0.setDireccion2(null);
            e0.setFecha_apertura(null);
            e0.setCond_hab("lo que sea");
            e0.setNum_Habit(4);
            e0.setObservaciones("Nada destacable");
            e0.setTelf("655 542 325");
            e0.setEquipamiento("lo tiene todo");
            e0.setUsuario(u0);
            
            f0.setId(324L);
            f0.setUsuario(u0);
            f0.setFecha(null);
            f0.setTema("Necesito hablar");
            f0.setComentario("Ya he puesto un formulario, pero quiero insistir y hablarlo en persona con un profesional.");
            f0.setAtendido(Boolean.FALSE);
            f0.setProfesional(null);
            f0.setRespuesta(null);

        
        u2.setId(7L);
        u2.setNombre("Pepito");
        u2.setApellido1("Mando");
        u2.setApellido2("Tynes");
        u2.setNIF("11248562P");
        u2.setClave("432156");
        u2.setCorreo("pepito@gmail.com");
        u2.setSexo(Usuario.SexoEnum.Hombre);
        u2.setFecha_Nacimiento(null);
        u2.setTutor(null);
        
            e2.setId(68L);
            e2.setDireccion1("Edificio Torres Ágora, Calle Serrano Galvache, 26");
            e2.setDireccion2("28071, Madrid, España");
            e2.setFecha_apertura(null);
            e2.setCond_hab("Buenas");
            e2.setNum_Habit(3);
            e2.setObservaciones("Una habitacion sin uso");
            e2.setTelf("653 220 187");
            e2.setEquipamiento("Falta nevera");
            e2.setUsuario(u2);
            
            f1.setId(79L);
            f1.setUsuario(u2);
            f1.setFecha(null);
            f1.setTema("Duda");
            f1.setComentario("Preguntas..");
            f1.setAtendido(Boolean.TRUE);
            f1.setProfesional(p0);
            f1.setRespuesta("Respuesta");
            
            c0.setId(2L);
            c0.setUsuario(u2);
            c0.setFecha(null);
            c0.setHora(null);
            c0.setMotivo("Atencion personalizada");
            c0.setProfesional(null);
            c0.setOnline(Boolean.TRUE);
            c0.setEstado_Cita(Cita.Estado.Pendiente);

            
        u1.setId(124L);
        u1.setNombre("Meganito");
        u1.setApellido1("Fhena");
        u1.setApellido2("Taint");
        u1.setNIF("99123745A");
        u1.setClave("22222225");
        u1.setCorreo("megafhena@gmail.com");
        u1.setSexo(Usuario.SexoEnum.Mujer);
        u1.setFecha_Nacimiento(null);
        u1.setTutor(null);
        
            e1.setId(12L);
            e1.setDireccion1("Teatinos, 29003, Malaga, España");
            e1.setDireccion2(null);
            e1.setFecha_apertura(null);
            e1.setCond_hab("lo que sea");
            e1.setNum_Habit(1);
            e1.setObservaciones("Nada destacable");
            e1.setTelf("651 480 210");
            e1.setEquipamiento("casi nada");
            e1.setUsuario(u1);
        
                p0.setId(1L);
                p0.setCargo("Gestion");
                p0.setCorreo_Profes("megaprofesional@servicios.com");
                p0.setDespacho("B031");
                p0.setTelefono("901 157 772");
                p0.setUsuario(u1);
    }
    
    public List<Usuario> usuarios() {
        return usuarios;
    }    

    public List<Profesional> profesionales() {
        return profesionales;
    }
    
    public List<Cita> citas() {
        return citas;
    }

    public List<Expediente> expedientes() {
        return expedientes;
    }
    
    public List<Intervencion> intervenciones() {
        return intervenciones;
    }
    
    public List<Formulario> formularios() {
        return formularios;
    }
}