/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.getronics.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author emanuel
 */
@Entity
@Table(name = "access_resum")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AccessResum.findAll", query = "SELECT a FROM AccessResum a")
    , @NamedQuery(name = "AccessResum.findById", query = "SELECT a FROM AccessResum a WHERE a.id = :id")
    , @NamedQuery(name = "AccessResum.findAndOrder", query = "SELECT a FROM AccessResum a ORDER BY a.dateAccess DESC")
    , @NamedQuery(name = "AccessResum.findByDateAccess", query = "SELECT a FROM AccessResum a WHERE a.dateAccess = :dateAccess")})
public class AccessResum implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "date_access")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAccess;
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ManyToOne
    private User userId;

    public AccessResum() {
    }

    public AccessResum(Integer id) {
        this.id = id;
    }

    public AccessResum(Integer id, Date dateAccess) {
        this.id = id;
        this.dateAccess = dateAccess;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateAccess() {
        return dateAccess;
    }

    public void setDateAccess(Date dateAccess) {
        this.dateAccess = dateAccess;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccessResum)) {
            return false;
        }
        AccessResum other = (AccessResum) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cat.getronics.controllers.AccessResum[ id=" + id + " ]";
    }
    
}
