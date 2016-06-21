/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.gob.ambiente.aplicaciones.entities;

import java.io.Serializable;
import java.util.Collection;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "operador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Operador.findAll", query = "SELECT o FROM Operador o")})
public class Operador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cuit")
    private long cuit;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idsimel")
    private long idsimel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "razonsocial")
    private String razonsocial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 13)
    @Column(name = "ussimel")
    private String ussimel;
    @OneToMany(mappedBy = "operadorId")
    private Collection<Vuelco> vuelcoCollection;
    @JoinColumn(name = "admin_id", referencedColumnName = "id")
    @ManyToOne
    private Adminentidad adminId;

    public Operador() {
    }

    public Operador(Integer id) {
        this.id = id;
    }

    public Operador(Integer id, long cuit, long idsimel, String razonsocial, String ussimel) {
        this.id = id;
        this.cuit = cuit;
        this.idsimel = idsimel;
        this.razonsocial = razonsocial;
        this.ussimel = ussimel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public long getIdsimel() {
        return idsimel;
    }

    public void setIdsimel(long idsimel) {
        this.idsimel = idsimel;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public String getUssimel() {
        return ussimel;
    }

    public void setUssimel(String ussimel) {
        this.ussimel = ussimel;
    }

    @XmlTransient
    public Collection<Vuelco> getVuelcoCollection() {
        return vuelcoCollection;
    }

    public void setVuelcoCollection(Collection<Vuelco> vuelcoCollection) {
        this.vuelcoCollection = vuelcoCollection;
    }

    public Adminentidad getAdminId() {
        return adminId;
    }

    public void setAdminId(Adminentidad adminId) {
        this.adminId = adminId;
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
        if (!(object instanceof Operador)) {
            return false;
        }
        Operador other = (Operador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gob.ambiente.aplicaciones.entities.Operador[ id=" + id + " ]";
    }
    
}
