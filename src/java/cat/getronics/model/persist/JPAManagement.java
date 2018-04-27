/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.getronics.model.persist;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 *
 * @author emanuel
 */
public class JPAManagement {
    
    private static JPAManagement jpaManagement;
    EntityManagerFactory emf;
    EntityManager em;
    private JPAManagement(){
        Logger myLogger = Logger.getLogger("org.eclipse");
        myLogger.setLevel(Level.OFF);
        Logger.getGlobal().setLevel(Level.OFF);
        emf = Persistence.createEntityManagerFactory("AppRegistPU");
        em = emf.createEntityManager();
    }
    
    public static JPAManagement getInstance(){
        if(jpaManagement == null){
            return new JPAManagement();
        }
        return jpaManagement;
    }
    
    public EntityManager getEntity(){
        return em;
    }
}