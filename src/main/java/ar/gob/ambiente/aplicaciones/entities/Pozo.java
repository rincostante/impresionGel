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
@Table(name = "pozo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pozo.findAll", query = "SELECT p FROM Pozo p")})
public class Pozo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "diasfunc")
    private int diasfunc;
    @Column(name = "enservicio")
    private Boolean enservicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "horasfunc")
    private double horasfunc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero")
    private int numero;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "rendimiento")
    private Double rendimiento;
    @Column(name = "tipobomba")
    private Integer tipobomba;
    @Column(name = "potenciabomba")
    private Double potenciabomba;
    @Basic(optional = false)
    @NotNull
    @Column(name = "profundidad")
    private double profundidad;
    @JoinColumn(name = "abastecimiento_id", referencedColumnName = "id")
    @ManyToOne
    private Abastecimiento abastecimientoId;

    public Pozo() {
    }

    public Pozo(Integer id) {
        this.id = id;
    }

    public Pozo(Integer id, int diasfunc, double horasfunc, int numero, double profundidad) {
        this.id = id;
        this.diasfunc = diasfunc;
        this.horasfunc = horasfunc;
        this.numero = numero;
        this.profundidad = profundidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getDiasfunc() {
        return diasfunc;
    }

    public void setDiasfunc(int diasfunc) {
        this.diasfunc = diasfunc;
    }

    public Boolean getEnservicio() {
        return enservicio;
    }

    public void setEnservicio(Boolean enservicio) {
        this.enservicio = enservicio;
    }

    public double getHorasfunc() {
        return horasfunc;
    }

    public void setHorasfunc(double horasfunc) {
        this.horasfunc = horasfunc;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Double getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(Double rendimiento) {
        this.rendimiento = rendimiento;
    }

    public Integer getTipobomba() {
        return tipobomba;
    }

    public void setTipobomba(Integer tipobomba) {
        this.tipobomba = tipobomba;
    }

    public Double getPotenciabomba() {
        return potenciabomba;
    }

    public void setPotenciabomba(Double potenciabomba) {
        this.potenciabomba = potenciabomba;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
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
        if (!(object instanceof Pozo)) {
            return false;
        }
        Pozo other = (Pozo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gob.ambiente.aplicaciones.entities.Pozo[ id=" + id + " ]";
    }
    
}
