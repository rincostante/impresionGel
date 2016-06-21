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
@Table(name = "historialdeclaraciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Historialdeclaraciones.findAll", query = "SELECT h FROM Historialdeclaraciones h")})
public class Historialdeclaraciones implements Serializable {

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
    @Column(name = "activa")
    private Boolean activa;
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    @ManyToOne
    private Usuarioexterno usuarioId;
    @JoinColumn(name = "establecimiento_id", referencedColumnName = "id")
    @ManyToOne
    private Establecimiento establecimientoId;
    @JoinColumn(name = "declaracionjuradaant_id", referencedColumnName = "id")
    @ManyToOne
    private Declaracionjurada declaracionjuradaantId;
    @JoinColumn(name = "declaracionjurada_id", referencedColumnName = "id")
    @ManyToOne
    private Declaracionjurada declaracionjuradaId;

    public Historialdeclaraciones() {
    }

    public Historialdeclaraciones(Integer id) {
        this.id = id;
    }

    public Historialdeclaraciones(Integer id, Date fecha) {
        this.id = id;
        this.fecha = fecha;
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

    public Boolean getActiva() {
        return activa;
    }

    public void setActiva(Boolean activa) {
        this.activa = activa;
    }

    public Usuarioexterno getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuarioexterno usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Establecimiento getEstablecimientoId() {
        return establecimientoId;
    }

    public void setEstablecimientoId(Establecimiento establecimientoId) {
        this.establecimientoId = establecimientoId;
    }

    public Declaracionjurada getDeclaracionjuradaantId() {
        return declaracionjuradaantId;
    }

    public void setDeclaracionjuradaantId(Declaracionjurada declaracionjuradaantId) {
        this.declaracionjuradaantId = declaracionjuradaantId;
    }

    public Declaracionjurada getDeclaracionjuradaId() {
        return declaracionjuradaId;
    }

    public void setDeclaracionjuradaId(Declaracionjurada declaracionjuradaId) {
        this.declaracionjuradaId = declaracionjuradaId;
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
        if (!(object instanceof Historialdeclaraciones)) {
            return false;
        }
        Historialdeclaraciones other = (Historialdeclaraciones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gob.ambiente.aplicaciones.entities.Historialdeclaraciones[ id=" + id + " ]";
    }
    
}
