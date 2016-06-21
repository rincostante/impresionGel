/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.gob.ambiente.aplicaciones.entities;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "cantpersonaldec")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cantpersonaldec.findAll", query = "SELECT c FROM Cantpersonaldec c")})
public class Cantpersonaldec implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipopers")
    private int tipopers;
    @JoinColumn(name = "declaracion_id", referencedColumnName = "id")
    @ManyToOne
    private Declaracionjurada declaracionId;

    public Cantpersonaldec() {
    }

    public Cantpersonaldec(Integer id) {
        this.id = id;
    }

    public Cantpersonaldec(Integer id, int cantidad, int tipopers) {
        this.id = id;
        this.cantidad = cantidad;
        this.tipopers = tipopers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTipopers() {
        return tipopers;
    }

    public void setTipopers(int tipopers) {
        this.tipopers = tipopers;
    }

    public Declaracionjurada getDeclaracionId() {
        return declaracionId;
    }

    public void setDeclaracionId(Declaracionjurada declaracionId) {
        this.declaracionId = declaracionId;
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
        if (!(object instanceof Cantpersonaldec)) {
            return false;
        }
        Cantpersonaldec other = (Cantpersonaldec) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gob.ambiente.aplicaciones.entities.Cantpersonaldec[ id=" + id + " ]";
    }
    
}
