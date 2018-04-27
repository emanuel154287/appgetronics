/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.getronics.model;

import cat.getronics.model.persist.AccessResumDAO;
import cat.getronics.model.persist.UserDAO;
import java.util.List;

/**
 *
 * @author emanuel
 */
public class Model {
    
    private UserDAO usrDAO;
    private AccessResumDAO accessDAO;
    
    public Model(){
        usrDAO = new UserDAO();
        accessDAO = new AccessResumDAO();
    }
    
    /* User */
    public boolean login(User us){
        return usrDAO.findUser(us);
    }
    
    public void insertUser(User us){
        usrDAO.insertUser(us);
    }
    
    public boolean findUser(User us){
        return usrDAO.findUser(us);
    }
    
    public User getUserByEmail(User us){
        return usrDAO.getUserByEmail(us);
    }
    
  
    /* AccessResum */
    public List<AccessResum> getAllAccess(){
        return accessDAO.getAllAccess();
    }
    
    public void insertAccess(AccessResum acs){
        accessDAO.insertAccess(acs);
    }
    
    
    
    
}
