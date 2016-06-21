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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "inmueble")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inmueble.findAll", query = "SELECT i FROM Inmueble i")})
public class Inmueble implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "latitud")
    private Double latitud;
    @Column(name = "longitud")
    private Double longitud;
    @Size(max = 100)
    @Column(name = "nomcatastral")
    private String nomcatastral;
    @Size(max = 20)
    @Column(name = "partinmob")
    private String partinmob;
    @Column(name = "personalfabrica")
    private Integer personalfabrica;
    @Column(name = "personaloficina")
    private Integer personaloficina;
    @Column(name = "radioservido")
    private Boolean radioservido;
    @Column(name = "supcubierta")
    private Double supcubierta;
    @Column(name = "suplibre")
    private Double suplibre;
    @Size(max = 100)
    @Column(name = "callefactibilidad")
    private String callefactibilidad;
    @Column(name = "idrupdom")
    private BigInteger idrupdom;
    @Size(max = 255)
    @Column(name = "calle")
    private String calle;
    @Size(max = 20)
    @Column(name = "dpto")
    private String dpto;
    @Size(max = 255)
    @Column(name = "localidad")
    private String localidad;
    @Size(max = 10)
    @Column(name = "numero")
    private String numero;
    @Size(max = 10)
    @Column(name = "piso")
    private String piso;
    @Size(max = 50)
    @Column(name = "provincia")
    private String provincia;
    @Size(max = 50)
    @Column(name = "departamento")
    private String departamento;
    @OneToMany(mappedBy = "inmuebleId")
    private Collection<Establecimiento> establecimientoCollection;

    public Inmueble() {
    }

    public Inmueble(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public String getNomcatastral() {
        return nomcatastral;
    }

    public void setNomcatastral(String nomcatastral) {
        this.nomcatastral = nomcatastral;
    }

    public String getPartinmob() {
        return partinmob;
    }

    public void setPartinmob(String partinmob) {
        this.partinmob = partinmob;
    }

    public Integer getPersonalfabrica() {
        return personalfabrica;
    }

    public void setPersonalfabrica(Integer personalfabrica) {
        this.personalfabrica = personalfabrica;
    }

    public Integer getPersonaloficina() {
        return personaloficina;
    }

    public void setPersonaloficina(Integer personaloficina) {
        this.personaloficina = personaloficina;
    }

    public Boolean getRadioservido() {
        return radioservido;
    }

    public void setRadioservido(Boolean radioservido) {
        this.radioservido = radioservido;
    }

    public Double getSupcubierta() {
        return supcubierta;
    }

    public void setSupcubierta(Double supcubierta) {
        this.supcubierta = supcubierta;
    }

    public Double getSuplibre() {
        return suplibre;
    }

    public void setSuplibre(Double suplibre) {
        this.suplibre = suplibre;
    }

    public String getCallefactibilidad() {
        return callefactibilidad;
    }

    public void setCallefactibilidad(String callefactibilidad) {
        this.callefactibilidad = callefactibilidad;
    }

    public BigInteger getIdrupdom() {
        return idrupdom;
    }

    public void setIdrupdom(BigInteger idrupdom) {
        this.idrupdom = idrupdom;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
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

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @XmlTransient
    public Collection<Establecimiento> getEstablecimientoCollection() {
        return establecimientoCollection;
    }

    public void setEstablecimientoCollection(Collection<Establecimiento> establecimientoCollection) {
        this.establecimientoCollection = establecimientoCollection;
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
        if (!(object instanceof Inmueble)) {
            return false;
        }
        Inmueble other = (Inmueble) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gob.ambiente.aplicaciones.entities.Inmueble[ id=" + id + " ]";
    }
    
}
