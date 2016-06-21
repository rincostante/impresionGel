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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "abastecimiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Abastecimiento.findAll", query = "SELECT a FROM Abastecimiento a")})
public class Abastecimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "tieneabastos")
    private Boolean tieneabastos;
    @OneToMany(mappedBy = "abastecimientoId")
    private Collection<Declaracionjurada> declaracionjuradaCollection;
    @OneToMany(mappedBy = "abastecimientoId")
    private Collection<Pozo> pozoCollection;
    @OneToMany(mappedBy = "abastecimientoId")
    private Collection<Abasto> abastoCollection;

    public Abastecimiento() {
    }

    public Abastecimiento(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getTieneabastos() {
        return tieneabastos;
    }

    public void setTieneabastos(Boolean tieneabastos) {
        this.tieneabastos = tieneabastos;
    }

    @XmlTransient
    public Collection<Declaracionjurada> getDeclaracionjuradaCollection() {
        return declaracionjuradaCollection;
    }

    public void setDeclaracionjuradaCollection(Collection<Declaracionjurada> declaracionjuradaCollection) {
        this.declaracionjuradaCollection = declaracionjuradaCollection;
    }

    @XmlTransient
    public Collection<Pozo> getPozoCollection() {
        return pozoCollection;
    }

    public void setPozoCollection(Collection<Pozo> pozoCollection) {
        this.pozoCollection = pozoCollection;
    }

    @XmlTransient
    public Collection<Abasto> getAbastoCollection() {
        return abastoCollection;
    }

    public void setAbastoCollection(Collection<Abasto> abastoCollection) {
        this.abastoCollection = abastoCollection;
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
        if (!(object instanceof Abastecimiento)) {
            return false;
        }
        Abastecimiento other = (Abastecimiento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gob.ambiente.aplicaciones.entities.Abastecimiento[ id=" + id + " ]";
    }
    
}
