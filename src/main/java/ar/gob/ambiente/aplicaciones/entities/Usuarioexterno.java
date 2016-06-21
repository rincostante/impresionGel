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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "usuarioexterno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuarioexterno.findAll", query = "SELECT u FROM Usuarioexterno u")})
public class Usuarioexterno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "clave")
    private String clave;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "cude")
    private String cude;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cuit")
    private long cuit;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "domcalle")
    private String domcalle;
    @Size(max = 10)
    @Column(name = "dpto")
    private String dpto;
    @Size(max = 50)
    @Column(name = "localidad")
    private String localidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "numero")
    private String numero;
    @Size(max = 10)
    @Column(name = "piso")
    private String piso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "primeravez")
    private boolean primeravez;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "razonsocial")
    private String razonsocial;
    @Size(max = 100)
    @Column(name = "tipoest")
    private String tipoest;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "email")
    private String email;
    @OneToMany(mappedBy = "usextmodifId")
    private Collection<Adminentidad> adminentidadCollection;
    @OneToMany(mappedBy = "usextbajaId")
    private Collection<Adminentidad> adminentidadCollection1;
    @OneToMany(mappedBy = "usextaltaId")
    private Collection<Adminentidad> adminentidadCollection2;
    @OneToMany(mappedBy = "usuarioId")
    private Collection<Historialdeclaraciones> historialdeclaracionesCollection;
    @JoinColumn(name = "admin_id", referencedColumnName = "id")
    @ManyToOne
    private Adminentidad adminId;
    @OneToMany(mappedBy = "usuarioexternoId")
    private Collection<Historialfirmantes> historialfirmantesCollection;

    public Usuarioexterno() {
    }

    public Usuarioexterno(Integer id) {
        this.id = id;
    }

    public Usuarioexterno(Integer id, String clave, String cude, long cuit, String domcalle, String numero, boolean primeravez, String razonsocial, String email) {
        this.id = id;
        this.clave = clave;
        this.cude = cude;
        this.cuit = cuit;
        this.domcalle = domcalle;
        this.numero = numero;
        this.primeravez = primeravez;
        this.razonsocial = razonsocial;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCude() {
        return cude;
    }

    public void setCude(String cude) {
        this.cude = cude;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public String getDomcalle() {
        return domcalle;
    }

    public void setDomcalle(String domcalle) {
        this.domcalle = domcalle;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public boolean getPrimeravez() {
        return primeravez;
    }

    public void setPrimeravez(boolean primeravez) {
        this.primeravez = primeravez;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public String getTipoest() {
        return tipoest;
    }

    public void setTipoest(String tipoest) {
        this.tipoest = tipoest;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlTransient
    public Collection<Adminentidad> getAdminentidadCollection() {
        return adminentidadCollection;
    }

    public void setAdminentidadCollection(Collection<Adminentidad> adminentidadCollection) {
        this.adminentidadCollection = adminentidadCollection;
    }

    @XmlTransient
    public Collection<Adminentidad> getAdminentidadCollection1() {
        return adminentidadCollection1;
    }

    public void setAdminentidadCollection1(Collection<Adminentidad> adminentidadCollection1) {
        this.adminentidadCollection1 = adminentidadCollection1;
    }

    @XmlTransient
    public Collection<Adminentidad> getAdminentidadCollection2() {
        return adminentidadCollection2;
    }

    public void setAdminentidadCollection2(Collection<Adminentidad> adminentidadCollection2) {
        this.adminentidadCollection2 = adminentidadCollection2;
    }

    @XmlTransient
    public Collection<Historialdeclaraciones> getHistorialdeclaracionesCollection() {
        return historialdeclaracionesCollection;
    }

    public void setHistorialdeclaracionesCollection(Collection<Historialdeclaraciones> historialdeclaracionesCollection) {
        this.historialdeclaracionesCollection = historialdeclaracionesCollection;
    }

    public Adminentidad getAdminId() {
        return adminId;
    }

    public void setAdminId(Adminentidad adminId) {
        this.adminId = adminId;
    }

    @XmlTransient
    public Collection<Historialfirmantes> getHistorialfirmantesCollection() {
        return historialfirmantesCollection;
    }

    public void setHistorialfirmantesCollection(Collection<Historialfirmantes> historialfirmantesCollection) {
        this.historialfirmantesCollection = historialfirmantesCollection;
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
        if (!(object instanceof Usuarioexterno)) {
            return false;
        }
        Usuarioexterno other = (Usuarioexterno) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gob.ambiente.aplicaciones.entities.Usuarioexterno[ id=" + id + " ]";
    }
    
}
