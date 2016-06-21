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
import javax.persistence.ManyToMany;
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
@Table(name = "producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p")})
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidadanual")
    private double cantidadanual;
    @Size(max = 255)
    @Column(name = "descripcion")
    private String descripcion;
    @ManyToMany(mappedBy = "productoCollection")
    private Collection<Materia> materiaCollection;
    @OneToMany(mappedBy = "productoId")
    private Collection<Materia> materiaCollection1;
    @JoinColumn(name = "unidad_id", referencedColumnName = "id")
    @ManyToOne
    private Unidad unidadId;
    @JoinColumn(name = "declaracion_id", referencedColumnName = "id")
    @ManyToOne
    private Declaracionjurada declaracionId;

    public Producto() {
    }

    public Producto(Integer id) {
        this.id = id;
    }

    public Producto(Integer id, double cantidadanual) {
        this.id = id;
        this.cantidadanual = cantidadanual;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getCantidadanual() {
        return cantidadanual;
    }

    public void setCantidadanual(double cantidadanual) {
        this.cantidadanual = cantidadanual;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public Collection<Materia> getMateriaCollection() {
        return materiaCollection;
    }

    public void setMateriaCollection(Collection<Materia> materiaCollection) {
        this.materiaCollection = materiaCollection;
    }

    @XmlTransient
    public Collection<Materia> getMateriaCollection1() {
        return materiaCollection1;
    }

    public void setMateriaCollection1(Collection<Materia> materiaCollection1) {
        this.materiaCollection1 = materiaCollection1;
    }

    public Unidad getUnidadId() {
        return unidadId;
    }

    public void setUnidadId(Unidad unidadId) {
        this.unidadId = unidadId;
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
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gob.ambiente.aplicaciones.entities.Producto[ id=" + id + " ]";
    }
    
}
