/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.gob.ambiente.aplicaciones.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "firmante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Firmante.findAll", query = "SELECT f FROM Firmante f")})
public class Firmante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "idrupfis")
    private BigInteger idrupfis;
    @Column(name = "cuit")
    private BigInteger cuit;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombreyapellido")
    private String nombreyapellido;
    @Column(name = "dni")
    private BigInteger dni;
    @Size(max = 1)
    @Column(name = "dniletra")
    private String dniletra;
    @JoinColumn(name = "admin_id", referencedColumnName = "id")
    @ManyToOne
    private Adminentidad adminId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "firmanteId")
    private Collection<Establecimiento> establecimientoCollection;
    @OneToMany(mappedBy = "firmanteId")
    private Collection<Declaracionjurada> declaracionjuradaCollection;
    @OneToMany(mappedBy = "firmanteantId")
    private Collection<Historialfirmantes> historialfirmantesCollection;
    @OneToMany(mappedBy = "firmanteactId")
    private Collection<Historialfirmantes> historialfirmantesCollection1;

    public Firmante() {
    }

    public Firmante(Integer id) {
        this.id = id;
    }

    public Firmante(Integer id, String nombreyapellido) {
        this.id = id;
        this.nombreyapellido = nombreyapellido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigInteger getIdrupfis() {
        return idrupfis;
    }

    public void setIdrupfis(BigInteger idrupfis) {
        this.idrupfis = idrupfis;
    }

    public BigInteger getCuit() {
        return cuit;
    }

    public void setCuit(BigInteger cuit) {
        this.cuit = cuit;
    }

    public String getNombreyapellido() {
        return nombreyapellido;
    }

    public void setNombreyapellido(String nombreyapellido) {
        this.nombreyapellido = nombreyapellido;
    }

    public BigInteger getDni() {
        return dni;
    }

    public void setDni(BigInteger dni) {
        this.dni = dni;
    }

    public String getDniletra() {
        return dniletra;
    }

    public void setDniletra(String dniletra) {
        this.dniletra = dniletra;
    }

    public Adminentidad getAdminId() {
        return adminId;
    }

    public void setAdminId(Adminentidad adminId) {
        this.adminId = adminId;
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

    @XmlTransient
    public Collection<Historialfirmantes> getHistorialfirmantesCollection() {
        return historialfirmantesCollection;
    }

    public void setHistorialfirmantesCollection(Collection<Historialfirmantes> historialfirmantesCollection) {
        this.historialfirmantesCollection = historialfirmantesCollection;
    }

    @XmlTransient
    public Collection<Historialfirmantes> getHistorialfirmantesCollection1() {
        return historialfirmantesCollection1;
    }

    public void setHistorialfirmantesCollection1(Collection<Historialfirmantes> historialfirmantesCollection1) {
        this.historialfirmantesCollection1 = historialfirmantesCollection1;
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
        if (!(object instanceof Firmante)) {
            return false;
        }
        Firmante other = (Firmante) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gob.ambiente.aplicaciones.entities.Firmante[ id=" + id + " ]";
    }
    
}
