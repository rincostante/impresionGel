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
@Table(name = "establecimiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Establecimiento.findAll", query = "SELECT e FROM Establecimiento e")})
public class Establecimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "crs")
    private int crs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cuit")
    private long cuit;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idrupest")
    private long idrupest;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idrupraz")
    private long idrupraz;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero")
    private long numero;
    @Size(max = 50)
    @Column(name = "procproduct")
    private String procproduct;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "razonsocial")
    private String razonsocial;
    @Column(name = "rzjuridica")
    private Boolean rzjuridica;
    @Column(name = "partidogel")
    private Integer partidogel;
    @Size(max = 10)
    @Column(name = "codrecibo")
    private String codrecibo;
    @OneToMany(mappedBy = "establecimientoId")
    private Collection<Historialactividades> historialactividadesCollection;
    @JoinColumn(name = "partido_id", referencedColumnName = "id")
    @ManyToOne
    private Partido partidoId;
    @JoinColumn(name = "inmueble_id", referencedColumnName = "id")
    @ManyToOne
    private Inmueble inmuebleId;
    @JoinColumn(name = "firmante_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Firmante firmanteId;
    @JoinColumn(name = "admin_id", referencedColumnName = "id")
    @ManyToOne
    private Adminentidad adminId;
    @OneToMany(mappedBy = "establecimientoId")
    private Collection<Historialdeclaraciones> historialdeclaracionesCollection;
    @OneToMany(mappedBy = "establecimientoId")
    private Collection<Historialfirmantes> historialfirmantesCollection;

    public Establecimiento() {
    }

    public Establecimiento(Integer id) {
        this.id = id;
    }

    public Establecimiento(Integer id, int crs, long cuit, long idrupest, long idrupraz, long numero, String razonsocial) {
        this.id = id;
        this.crs = crs;
        this.cuit = cuit;
        this.idrupest = idrupest;
        this.idrupraz = idrupraz;
        this.numero = numero;
        this.razonsocial = razonsocial;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCrs() {
        return crs;
    }

    public void setCrs(int crs) {
        this.crs = crs;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public long getIdrupest() {
        return idrupest;
    }

    public void setIdrupest(long idrupest) {
        this.idrupest = idrupest;
    }

    public long getIdrupraz() {
        return idrupraz;
    }

    public void setIdrupraz(long idrupraz) {
        this.idrupraz = idrupraz;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getProcproduct() {
        return procproduct;
    }

    public void setProcproduct(String procproduct) {
        this.procproduct = procproduct;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public Boolean getRzjuridica() {
        return rzjuridica;
    }

    public void setRzjuridica(Boolean rzjuridica) {
        this.rzjuridica = rzjuridica;
    }

    public Integer getPartidogel() {
        return partidogel;
    }

    public void setPartidogel(Integer partidogel) {
        this.partidogel = partidogel;
    }

    public String getCodrecibo() {
        return codrecibo;
    }

    public void setCodrecibo(String codrecibo) {
        this.codrecibo = codrecibo;
    }

    @XmlTransient
    public Collection<Historialactividades> getHistorialactividadesCollection() {
        return historialactividadesCollection;
    }

    public void setHistorialactividadesCollection(Collection<Historialactividades> historialactividadesCollection) {
        this.historialactividadesCollection = historialactividadesCollection;
    }

    public Partido getPartidoId() {
        return partidoId;
    }

    public void setPartidoId(Partido partidoId) {
        this.partidoId = partidoId;
    }

    public Inmueble getInmuebleId() {
        return inmuebleId;
    }

    public void setInmuebleId(Inmueble inmuebleId) {
        this.inmuebleId = inmuebleId;
    }

    public Firmante getFirmanteId() {
        return firmanteId;
    }

    public void setFirmanteId(Firmante firmanteId) {
        this.firmanteId = firmanteId;
    }

    public Adminentidad getAdminId() {
        return adminId;
    }

    public void setAdminId(Adminentidad adminId) {
        this.adminId = adminId;
    }

    @XmlTransient
    public Collection<Historialdeclaraciones> getHistorialdeclaracionesCollection() {
        return historialdeclaracionesCollection;
    }

    public void setHistorialdeclaracionesCollection(Collection<Historialdeclaraciones> historialdeclaracionesCollection) {
        this.historialdeclaracionesCollection = historialdeclaracionesCollection;
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
        if (!(object instanceof Establecimiento)) {
            return false;
        }
        Establecimiento other = (Establecimiento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gob.ambiente.aplicaciones.entities.Establecimiento[ id=" + id + " ]";
    }
    
}
