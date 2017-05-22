package modelo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class CasoPolicial  implements java.io.Serializable {


     private String codcaso;
     private String nombre;
     private Date fechaInicio;
     private Date fechaFin;
     private Set colaboras = new HashSet(0);

    public CasoPolicial() {
    }

	
    public CasoPolicial(String codcaso) {
        this.codcaso = codcaso;
    }
    public CasoPolicial(String codcaso, String nombre, Date fechaInicio, Date fechaFin, Set colaboras) {
       this.codcaso = codcaso;
       this.nombre = nombre;
       this.fechaInicio = fechaInicio;
       this.fechaFin = fechaFin;
       this.colaboras = colaboras;
    }
   
    public String getCodcaso() {
        return this.codcaso;
    }
    
    public void setCodcaso(String codcaso) {
        this.codcaso = codcaso;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Date getFechaInicio() {
        return this.fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public Date getFechaFin() {
        return this.fechaFin;
    }
    
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    public Set getColaboras() {
        return this.colaboras;
    }
    
    public void setColaboras(Set colaboras) {
        this.colaboras = colaboras;
    }




}


