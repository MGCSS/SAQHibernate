package practicahibernate;

import modelo.CasoPolicial;
import modelo.Experto;


public class PracticaHibernate {

       public static void main(String[] args) {
        
        ManejaExperto me=new ManejaExperto();
        Experto experto=new Experto("1", "mj", "esp", "a");
        me.guardaExperto(experto);
        
    }
    
}
