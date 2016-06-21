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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "turno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Turno.findAll", query = "SELECT t FROM Turno t")})
public class Turno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "numorden")
    private Integer numorden;
    @Column(name = "horasinicio")
    private Integer horasinicio;
    @Column(name = "mininicio")
    private Integer mininicio;
    @Column(name = "horasfin")
    private Integer horasfin;
    @Column(name = "minfin")
    private Integer minfin;
    @JoinColumn(name = "dia_id", referencedColumnName = "id")
    @ManyToOne
    private Dia diaId;

    public Turno() {
    }

    public Turno(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumorden() {
        return numorden;
    }

    public void setNumorden(Integer numorden) {
        this.numorden = numorden;
    }

    public Integer getHorasinicio() {
        return horasinicio;
    }

    public void setHorasinicio(Integer horasinicio) {
        this.horasinicio = horasinicio;
    }

    public Integer getMininicio() {
        return mininicio;
    }

    public void setMininicio(Integer mininicio) {
        this.mininicio = mininicio;
    }

    public Integer getHorasfin() {
        return horasfin;
    }

    public void setHorasfin(Integer horasfin) {
        this.horasfin = horasfin;
    }

    public Integer getMinfin() {
        return minfin;
    }

    public void setMinfin(Integer minfin) {
        this.minfin = minfin;
    }

    public Dia getDiaId() {
        return diaId;
    }

    public void setDiaId(Dia diaId) {
        this.diaId = diaId;
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
        if (!(object instanceof Turno)) {
            return false;
        }
        Turno other = (Turno) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gob.ambiente.aplicaciones.entities.Turno[ id=" + id + " ]";
    }
    
}
