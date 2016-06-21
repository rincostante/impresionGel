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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "dia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dia.findAll", query = "SELECT d FROM Dia d")})
public class Dia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "coddia")
    private Integer coddia;
    @Column(name = "mininicdesc")
    private Integer mininicdesc;
    @Column(name = "horasfindesc")
    private Integer horasfindesc;
    @Column(name = "minfindesc")
    private Integer minfindesc;
    @Column(name = "horasinicdesc")
    private Integer horasinicdesc;
    @OneToMany(mappedBy = "diaId")
    private Collection<Turno> turnoCollection;
    @JoinColumn(name = "horario_id", referencedColumnName = "id")
    @ManyToOne
    private Horario horarioId;

    public Dia() {
    }

    public Dia(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCoddia() {
        return coddia;
    }

    public void setCoddia(Integer coddia) {
        this.coddia = coddia;
    }

    public Integer getMininicdesc() {
        return mininicdesc;
    }

    public void setMininicdesc(Integer mininicdesc) {
        this.mininicdesc = mininicdesc;
    }

    public Integer getHorasfindesc() {
        return horasfindesc;
    }

    public void setHorasfindesc(Integer horasfindesc) {
        this.horasfindesc = horasfindesc;
    }

    public Integer getMinfindesc() {
        return minfindesc;
    }

    public void setMinfindesc(Integer minfindesc) {
        this.minfindesc = minfindesc;
    }

    public Integer getHorasinicdesc() {
        return horasinicdesc;
    }

    public void setHorasinicdesc(Integer horasinicdesc) {
        this.horasinicdesc = horasinicdesc;
    }

    @XmlTransient
    public Collection<Turno> getTurnoCollection() {
        return turnoCollection;
    }

    public void setTurnoCollection(Collection<Turno> turnoCollection) {
        this.turnoCollection = turnoCollection;
    }

    public Horario getHorarioId() {
        return horarioId;
    }

    public void setHorarioId(Horario horarioId) {
        this.horarioId = horarioId;
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
        if (!(object instanceof Dia)) {
            return false;
        }
        Dia other = (Dia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gob.ambiente.aplicaciones.entities.Dia[ id=" + id + " ]";
    }
    
}
