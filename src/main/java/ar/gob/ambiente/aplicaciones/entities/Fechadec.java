/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.gob.ambiente.aplicaciones.entities;

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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "fechadec")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fechadec.findAll", query = "SELECT f FROM Fechadec f")})
public class Fechadec implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipofecha")
    private int tipofecha;
    @JoinColumn(name = "declaracion_id", referencedColumnName = "id")
    @ManyToOne
    private Declaracionjurada declaracionId;

    public Fechadec() {
    }

    public Fechadec(Integer id) {
        this.id = id;
    }

    public Fechadec(Integer id, Date fecha, int tipofecha) {
        this.id = id;
        this.fecha = fecha;
        this.tipofecha = tipofecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getTipofecha() {
        return tipofecha;
    }

    public void setTipofecha(int tipofecha) {
        this.tipofecha = tipofecha;
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
        if (!(object instanceof Fechadec)) {
            return false;
        }
        Fechadec other = (Fechadec) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gob.ambiente.aplicaciones.entities.Fechadec[ id=" + id + " ]";
    }
    
}
