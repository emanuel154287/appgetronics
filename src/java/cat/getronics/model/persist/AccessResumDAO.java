/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.getronics.model.persist;

import cat.getronics.model.AccessResum;
import cat.getronics.model.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 *
 * @author emanuel
 */
public class AccessResumDAO {
    
    private final JPAManagement jpaManagement;
    EntityManager em;
    
    public AccessResumDAO(){
        jpaManagement = JPAManagement.getInstance();
        em = jpaManagement.getEntity();
    }
    
    public List<AccessResum> getAllAccess(){
        Query query = em.createNamedQuery("AccessResum.findAndOrder");
        List<AccessResum> list = query.getResultList();
        return list;
    }
    
    public void insertAccess(AccessResum acs){
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(acs);
        tx.commit();
    }
}
