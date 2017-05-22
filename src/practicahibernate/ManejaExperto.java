package practicahibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Query;
import java.util.List;
import modelo.*; 

public class ManejaExperto {

    private Session sesion;
    private Transaction tx;

    public ManejaExperto() {
    }

    public void iniciaOperacion() throws HibernateException {
        System.out.println("Comenzando con Hibernate");
        sesion = HibernateUtil.getSessionFactory().openSession(); 
        tx = sesion.beginTransaction(); 
    }

    public void finalizaOperacion() throws HibernateException {
        System.out.println("Finalizando con Hibernate");
        tx.commit();
        sesion.close();
    }

    public void manejaExcepcion(HibernateException he) throws HibernateException {
        tx.rollback();
        System.out.println("Ocurrió un error en la capa de acceso a datos " + he.getMessage());
        System.exit(0);
    }

    public void guardaExperto(Experto experto) {
        try {
            iniciaOperacion();
            sesion.save(experto);
            System.out.println("Experto insertado correctamente");
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            finalizaOperacion();
        }
    }

    public void eliminaExperto(Experto experto) {
        try {
            iniciaOperacion();
            sesion.delete(experto);
            System.out.println("Experto eliminado correctamente.");
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            finalizaOperacion();
        }
    }

    public void actualizaExperto(Experto experto) {
        try {
            iniciaOperacion();
            sesion.update(experto);
            System.out.println("Experto actualizado correctamente.");
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            finalizaOperacion();
        }
    }

    public Experto obtenExperto(String idExperto) {
        this.iniciaOperacion();

        Query query = sesion.createQuery("SELECT e FROM Experto e WHERE codExperto=:idExperto");
        query.setParameter("idExperto", idExperto);
        List<Experto> expertos = query.list();
        this.finalizaOperacion();

        return expertos.get(0);
    }

}
