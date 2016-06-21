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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "abasto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Abasto.findAll", query = "SELECT a FROM Abasto a")})
public class Abasto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "caudal")
    private double caudal;
    @Column(name = "circuitoabasto")
    private Integer circuitoabasto;
    @Column(name = "fuenteabasto")
    private Integer fuenteabasto;
    @Column(name = "origenabasto")
    private Integer origenabasto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "purga")
    private Double purga;
    @Size(max = 250)
    @Column(name = "descotrafuente")
    private String descotrafuente;
    @JoinColumn(name = "tipocaudal_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Tipoabasto tipocaudalId;
    @JoinColumn(name = "tipoabasto_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Tipoabasto tipoabastoId;
    @JoinColumn(name = "abastecimiento_id", referencedColumnName = "id")
    @ManyToOne
    private Abastecimiento abastecimientoId;

    public Abasto() {
    }

    public Abasto(Integer id) {
        this.id = id;
    }

    public Abasto(Integer id, double caudal) {
        this.id = id;
        this.caudal = caudal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getCaudal() {
        return caudal;
    }

    public void setCaudal(double caudal) {
        this.caudal = caudal;
    }

    public Integer getCircuitoabasto() {
        return circuitoabasto;
    }

    public void setCircuitoabasto(Integer circuitoabasto) {
        this.circuitoabasto = circuitoabasto;
    }

    public Integer getFuenteabasto() {
        return fuenteabasto;
    }

    public void setFuenteabasto(Integer fuenteabasto) {
        this.fuenteabasto = fuenteabasto;
    }

    public Integer getOrigenabasto() {
        return origenabasto;
    }

    public void setOrigenabasto(Integer origenabasto) {
        this.origenabasto = origenabasto;
    }

    public Double getPurga() {
        return purga;
    }

    public void setPurga(Double purga) {
        this.purga = purga;
    }

    public String getDescotrafuente() {
        return descotrafuente;
    }

    public void setDescotrafuente(String descotrafuente) {
        this.descotrafuente = descotrafuente;
    }

    public Tipoabasto getTipocaudalId() {
        return tipocaudalId;
    }

    public void setTipocaudalId(Tipoabasto tipocaudalId) {
        this.tipocaudalId = tipocaudalId;
    }

    public Tipoabasto getTipoabastoId() {
        return tipoabastoId;
    }

    public void setTipoabastoId(Tipoabasto tipoabastoId) {
        this.tipoabastoId = tipoabastoId;
    }

    public Abastecimiento getAbastecimientoId() {
        return abastecimientoId;
    }

    public void setAbastecimientoId(Abastecimiento abastecimientoId) {
        this.abastecimientoId = abastecimientoId;
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
        if (!(object instanceof Abasto)) {
            return false;
        }
        Abasto other = (Abasto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gob.ambiente.aplicaciones.entities.Abasto[ id=" + id + " ]";
    }
    
}
