/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.gob.ambiente.aplicaciones.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "estabdrp")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estabdrp.findAll", query = "SELECT e FROM Estabdrp e")})
public class Estabdrp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Long id;
    @Column(name = "caafechavenc")
    @Temporal(TemporalType.DATE)
    private Date caafechavenc;
    @Column(name = "caanum")
    private Integer caanum;
    @Column(name = "caavigente")
    private Boolean caavigente;
    @Size(max = 255)
    @Column(name = "descdrp")
    private String descdrp;
    @Column(name = "expanio")
    private Integer expanio;
    @Column(name = "expnum")
    private Integer expnum;
    @Size(max = 255)
    @Column(name = "nombredrp")
    private String nombredrp;
    @Size(max = 255)
    @Column(name = "tipodrp")
    private String tipodrp;
    @Size(max = 255)
    @Column(name = "usdrp")
    private String usdrp;
    @OneToMany(mappedBy = "transpdrpId")
    private Collection<Barro> barroCollection;
    @OneToMany(mappedBy = "operadordrpId")
    private Collection<Barro> barroCollection1;

    public Estabdrp() {
    }

    public Estabdrp(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCaafechavenc() {
        return caafechavenc;
    }

    public void setCaafechavenc(Date caafechavenc) {
        this.caafechavenc = caafechavenc;
    }

    public Integer getCaanum() {
        return caanum;
    }

    public void setCaanum(Integer caanum) {
        this.caanum = caanum;
    }

    public Boolean getCaavigente() {
        return caavigente;
    }

    public void setCaavigente(Boolean caavigente) {
        this.caavigente = caavigente;
    }

    public String getDescdrp() {
        return descdrp;
    }

    public void setDescdrp(String descdrp) {
        this.descdrp = descdrp;
    }

    public Integer getExpanio() {
        return expanio;
    }

    public void setExpanio(Integer expanio) {
        this.expanio = expanio;
    }

    public Integer getExpnum() {
        return expnum;
    }

    public void setExpnum(Integer expnum) {
        this.expnum = expnum;
    }

    public String getNombredrp() {
        return nombredrp;
    }

    public void setNombredrp(String nombredrp) {
        this.nombredrp = nombredrp;
    }

    public String getTipodrp() {
        return tipodrp;
    }

    public void setTipodrp(String tipodrp) {
        this.tipodrp = tipodrp;
    }

    public String getUsdrp() {
        return usdrp;
    }

    public void setUsdrp(String usdrp) {
        this.usdrp = usdrp;
    }

    @XmlTransient
    public Collection<Barro> getBarroCollection() {
        return barroCollection;
    }

    public void setBarroCollection(Collection<Barro> barroCollection) {
        this.barroCollection = barroCollection;
    }

    @XmlTransient
    public Collection<Barro> getBarroCollection1() {
        return barroCollection1;
    }

    public void setBarroCollection1(Collection<Barro> barroCollection1) {
        this.barroCollection1 = barroCollection1;
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
        if (!(object instanceof Estabdrp)) {
            return false;
        }
        Estabdrp other = (Estabdrp) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gob.ambiente.aplicaciones.entities.Estabdrp[ id=" + id + " ]";
    }
    
}
