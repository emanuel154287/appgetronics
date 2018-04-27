/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.getronics.model.persist;

import cat.getronics.model.User;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 *
 * @author emanuel
 */
public class UserDAO {
    
    private final JPAManagement jpaManagement;
    EntityManager em;
    
    public UserDAO(){
        jpaManagement = JPAManagement.getInstance();
        em = jpaManagement.getEntity();
    }
    
    public boolean findUser(User us){
        Query query = em.createNamedQuery("User.findByEmail");
        query.setParameter("email",us.getEmail());
        List<User> list = new ArrayList<>();
        list = query.getResultList();
        return list.size()>0;
    }
    
    public void insertUser(User us){
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(us);
        tx.commit();
    }
    
    public User getUserByEmail(User us){
        Query query = em.createNamedQuery("User.findByEmail");
        query.setParameter("email",us.getEmail());
        List<User> usList = query.getResultList(); 
        return usList.get(0);
    }
 
    
}
