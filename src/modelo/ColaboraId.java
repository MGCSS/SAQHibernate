package modelo;
import java.util.Date;

public class ColaboraId  implements java.io.Serializable {


     private String codexperto;
     private String codcaso;
     private Date fecha;

    public ColaboraId() {
    }

    public ColaboraId(String codexperto, String codcaso, Date fecha) {
       this.codexperto = codexperto;
       this.codcaso = codcaso;
       this.fecha = fecha;
    }
   
    public String getCodexperto() {
        return this.codexperto;
    }
    
    public void setCodexperto(String codexperto) {
        this.codexperto = codexperto;
    }
    public String getCodcaso() {
        return this.codcaso;
    }
    
    public void setCodcaso(String codcaso) {
        this.codcaso = codcaso;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ColaboraId) ) return false;
		 ColaboraId castOther = ( ColaboraId ) other; 
         
		 return ( (this.getCodexperto()==castOther.getCodexperto()) || ( this.getCodexperto()!=null && castOther.getCodexperto()!=null && this.getCodexperto().equals(castOther.getCodexperto()) ) )
 && ( (this.getCodcaso()==castOther.getCodcaso()) || ( this.getCodcaso()!=null && castOther.getCodcaso()!=null && this.getCodcaso().equals(castOther.getCodcaso()) ) )
 && ( (this.getFecha()==castOther.getFecha()) || ( this.getFecha()!=null && castOther.getFecha()!=null && this.getFecha().equals(castOther.getFecha()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCodexperto() == null ? 0 : this.getCodexperto().hashCode() );
         result = 37 * result + ( getCodcaso() == null ? 0 : this.getCodcaso().hashCode() );
         result = 37 * result + ( getFecha() == null ? 0 : this.getFecha().hashCode() );
         return result;
   }   


}


