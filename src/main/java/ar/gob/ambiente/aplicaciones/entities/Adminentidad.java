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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "adminentidad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Adminentidad.findAll", query = "SELECT a FROM Adminentidad a")})
public class Adminentidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "fechaalta")
    @Temporal(TemporalType.DATE)
    private Date fechaalta;
    @Column(name = "fechabaja")
    @Temporal(TemporalType.DATE)
    private Date fechabaja;
    @Column(name = "fechamodif")
    @Temporal(TemporalType.DATE)
    private Date fechamodif;
    @Column(name = "habilitado")
    private Boolean habilitado;
    @OneToMany(mappedBy = "adminId")
    private Collection<Recibo> reciboCollection;
    @OneToMany(mappedBy = "adminId")
    private Collection<Usuario> usuarioCollection;
    @OneToMany(mappedBy = "adminId")
    private Collection<Firmante> firmanteCollection;
    @OneToMany(mappedBy = "adminId")
    private Collection<Establecimiento> establecimientoCollection;
    @OneToMany(mappedBy = "adminId")
    private Collection<Declaracionjurada> declaracionjuradaCollection;
    @JoinColumn(name = "usextmodif_id", referencedColumnName = "id")
    @ManyToOne
    private Usuarioexterno usextmodifId;
    @JoinColumn(name = "usextbaja_id", referencedColumnName = "id")
    @ManyToOne
    private Usuarioexterno usextbajaId;
    @JoinColumn(name = "usextalta_id", referencedColumnName = "id")
    @ManyToOne
    private Usuarioexterno usextaltaId;
    @JoinColumn(name = "usmodif_id", referencedColumnName = "id")
    @ManyToOne
    private Usuario usmodifId;
    @JoinColumn(name = "usbaja_id", referencedColumnName = "id")
    @ManyToOne
    private Usuario usbajaId;
    @JoinColumn(name = "usalta_id", referencedColumnName = "id")
    @ManyToOne
    private Usuario usaltaId;
    @OneToMany(mappedBy = "adminId")
    private Collection<Operador> operadorCollection;
    @OneToMany(mappedBy = "adminId")
    private Collection<Usuarioexterno> usuarioexternoCollection;
    @OneToMany(mappedBy = "adminentidadId")
    private Collection<Rol> rolCollection;

    public Adminentidad() {
    }

    public Adminentidad(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaalta() {
        return fechaalta;
    }

    public void setFechaalta(Date fechaalta) {
        this.fechaalta = fechaalta;
    }

    public Date getFechabaja() {
        return fechabaja;
    }

    public void setFechabaja(Date fechabaja) {
        this.fechabaja = fechabaja;
    }

    public Date getFechamodif() {
        return fechamodif;
    }

    public void setFechamodif(Date fechamodif) {
        this.fechamodif = fechamodif;
    }

    public Boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }

    @XmlTransient
    public Collection<Recibo> getReciboCollection() {
        return reciboCollection;
    }

    public void setReciboCollection(Collection<Recibo> reciboCollection) {
        this.reciboCollection = reciboCollection;
    }

    @XmlTransient
    public Collection<Usuario> getUsuarioCollection() {
        return usuarioCollection;
    }

    public void setUsuarioCollection(Collection<Usuario> usuarioCollection) {
        this.usuarioCollection = usuarioCollection;
    }

    @XmlTransient
    public Collection<Firmante> getFirmanteCollection() {
        return firmanteCollection;
    }

    public void setFirmanteCollection(Collection<Firmante> firmanteCollection) {
        this.firmanteCollection = firmanteCollection;
    }

    @XmlTransient
    public Collection<Establecimiento> getEstablecimientoCollection() {
        return establecimientoCollection;
    }

    public void setEstablecimientoCollection(Collection<Establecimiento> establecimientoCollection) {
        this.establecimientoCollection = establecimientoCollection;
    }

    @XmlTransient
    public Collection<Declaracionjurada> getDeclaracionjuradaCollection() {
        return declaracionjuradaCollection;
    }

    public void setDeclaracionjuradaCollection(Collection<Declaracionjurada> declaracionjuradaCollection) {
        this.declaracionjuradaCollection = declaracionjuradaCollection;
    }

    public Usuarioexterno getUsextmodifId() {
        return usextmodifId;
    }

    public void setUsextmodifId(Usuarioexterno usextmodifId) {
        this.usextmodifId = usextmodifId;
    }

    public Usuarioexterno getUsextbajaId() {
        return usextbajaId;
    }

    public void setUsextbajaId(Usuarioexterno usextbajaId) {
        this.usextbajaId = usextbajaId;
    }

    public Usuarioexterno getUsextaltaId() {
        return usextaltaId;
    }

    public void setUsextaltaId(Usuarioexterno usextaltaId) {
        this.usextaltaId = usextaltaId;
    }

    public Usuario getUsmodifId() {
        return usmodifId;
    }

    public void setUsmodifId(Usuario usmodifId) {
        this.usmodifId = usmodifId;
    }

    public Usuario getUsbajaId() {
        return usbajaId;
    }

    public void setUsbajaId(Usuario usbajaId) {
        this.usbajaId = usbajaId;
    }

    public Usuario getUsaltaId() {
        return usaltaId;
    }

    public void setUsaltaId(Usuario usaltaId) {
        this.usaltaId = usaltaId;
    }

    @XmlTransient
    public Collection<Operador> getOperadorCollection() {
        return operadorCollection;
    }

    public void setOperadorCollection(Collection<Operador> operadorCollection) {
        this.operadorCollection = operadorCollection;
    }

    @XmlTransient
    public Collection<Usuarioexterno> getUsuarioexternoCollection() {
        return usuarioexternoCollection;
    }

    public void setUsuarioexternoCollection(Collection<Usuarioexterno> usuarioexternoCollection) {
        this.usuarioexternoCollection = usuarioexternoCollection;
    }

    @XmlTransient
    public Collection<Rol> getRolCollection() {
        return rolCollection;
    }

    public void setRolCollection(Collection<Rol> rolCollection) {
        this.rolCollection = rolCollection;
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
        if (!(object instanceof Adminentidad)) {
            return false;
        }
        Adminentidad other = (Adminentidad) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gob.ambiente.aplicaciones.entities.Adminentidad[ id=" + id + " ]";
    }
    
}
