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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "barro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Barro.findAll", query = "SELECT b FROM Barro b")})
public class Barro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "adjuntaprotocolo")
    private Boolean adjuntaprotocolo;
    @Column(name = "contieneelemanexod")
    private Boolean contieneelemanexod;
    @Size(max = 255)
    @Column(name = "descotrotratamiento")
    private String descotrotratamiento;
    @Column(name = "deshidratacion")
    private Boolean deshidratacion;
    @Column(name = "desinfeccion")
    private Boolean desinfeccion;
    @Column(name = "destinsumo")
    private Boolean destinsumo;
    @Column(name = "destlandfarming")
    private Boolean destlandfarming;
    @Column(name = "destotros")
    private Boolean destotros;
    @Column(name = "destrellsanitario")
    private Boolean destrellsanitario;
    @Size(max = 255)
    @Column(name = "especifotrodestino")
    private String especifotrodestino;
    @Column(name = "estabilizacion")
    private Boolean estabilizacion;
    @Column(name = "otrostratamiento")
    private Boolean otrostratamiento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "porcentaje")
    private Double porcentaje;
    @Column(name = "retiramediospropios")
    private Boolean retiramediospropios;
    @Size(max = 255)
    @Column(name = "descotrosmedios")
    private String descotrosmedios;
    @Column(name = "tratpropio")
    private Boolean tratpropio;
    @Size(max = 255)
    @Column(name = "usocomoinsumo")
    private String usocomoinsumo;
    @Column(name = "volumen")
    private Double volumen;
    @Column(name = "retiratransdrp")
    private Boolean retiratransdrp;
    @Column(name = "trataopdrp")
    private Boolean trataopdrp;
    @Column(name = "retiraotrosmedios")
    private Boolean retiraotrosmedios;
    @OneToMany(mappedBy = "barroId")
    private Collection<Declaracionjurada> declaracionjuradaCollection;
    @JoinColumn(name = "transpdrp_id", referencedColumnName = "id")
    @ManyToOne
    private Estabdrp transpdrpId;
    @JoinColumn(name = "operadordrp_id", referencedColumnName = "id")
    @ManyToOne
    private Estabdrp operadordrpId;

    public Barro() {
    }

    public Barro(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getAdjuntaprotocolo() {
        return adjuntaprotocolo;
    }

    public void setAdjuntaprotocolo(Boolean adjuntaprotocolo) {
        this.adjuntaprotocolo = adjuntaprotocolo;
    }

    public Boolean getContieneelemanexod() {
        return contieneelemanexod;
    }

    public void setContieneelemanexod(Boolean contieneelemanexod) {
        this.contieneelemanexod = contieneelemanexod;
    }

    public String getDescotrotratamiento() {
        return descotrotratamiento;
    }

    public void setDescotrotratamiento(String descotrotratamiento) {
        this.descotrotratamiento = descotrotratamiento;
    }

    public Boolean getDeshidratacion() {
        return deshidratacion;
    }

    public void setDeshidratacion(Boolean deshidratacion) {
        this.deshidratacion = deshidratacion;
    }

    public Boolean getDesinfeccion() {
        return desinfeccion;
    }

    public void setDesinfeccion(Boolean desinfeccion) {
        this.desinfeccion = desinfeccion;
    }

    public Boolean getDestinsumo() {
        return destinsumo;
    }

    public void setDestinsumo(Boolean destinsumo) {
        this.destinsumo = destinsumo;
    }

    public Boolean getDestlandfarming() {
        return destlandfarming;
    }

    public void setDestlandfarming(Boolean destlandfarming) {
        this.destlandfarming = destlandfarming;
    }

    public Boolean getDestotros() {
        return destotros;
    }

    public void setDestotros(Boolean destotros) {
        this.destotros = destotros;
    }

    public Boolean getDestrellsanitario() {
        return destrellsanitario;
    }

    public void setDestrellsanitario(Boolean destrellsanitario) {
        this.destrellsanitario = destrellsanitario;
    }

    public String getEspecifotrodestino() {
        return especifotrodestino;
    }

    public void setEspecifotrodestino(String especifotrodestino) {
        this.especifotrodestino = especifotrodestino;
    }

    public Boolean getEstabilizacion() {
        return estabilizacion;
    }

    public void setEstabilizacion(Boolean estabilizacion) {
        this.estabilizacion = estabilizacion;
    }

    public Boolean getOtrostratamiento() {
        return otrostratamiento;
    }

    public void setOtrostratamiento(Boolean otrostratamiento) {
        this.otrostratamiento = otrostratamiento;
    }

    public Double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Boolean getRetiramediospropios() {
        return retiramediospropios;
    }

    public void setRetiramediospropios(Boolean retiramediospropios) {
        this.retiramediospropios = retiramediospropios;
    }

    public String getDescotrosmedios() {
        return descotrosmedios;
    }

    public void setDescotrosmedios(String descotrosmedios) {
        this.descotrosmedios = descotrosmedios;
    }

    public Boolean getTratpropio() {
        return tratpropio;
    }

    public void setTratpropio(Boolean tratpropio) {
        this.tratpropio = tratpropio;
    }

    public String getUsocomoinsumo() {
        return usocomoinsumo;
    }

    public void setUsocomoinsumo(String usocomoinsumo) {
        this.usocomoinsumo = usocomoinsumo;
    }

    public Double getVolumen() {
        return volumen;
    }

    public void setVolumen(Double volumen) {
        this.volumen = volumen;
    }

    public Boolean getRetiratransdrp() {
        return retiratransdrp;
    }

    public void setRetiratransdrp(Boolean retiratransdrp) {
        this.retiratransdrp = retiratransdrp;
    }

    public Boolean getTrataopdrp() {
        return trataopdrp;
    }

    public void setTrataopdrp(Boolean trataopdrp) {
        this.trataopdrp = trataopdrp;
    }

    public Boolean getRetiraotrosmedios() {
        return retiraotrosmedios;
    }

    public void setRetiraotrosmedios(Boolean retiraotrosmedios) {
        this.retiraotrosmedios = retiraotrosmedios;
    }

    @XmlTransient
    public Collection<Declaracionjurada> getDeclaracionjuradaCollection() {
        return declaracionjuradaCollection;
    }

    public void setDeclaracionjuradaCollection(Collection<Declaracionjurada> declaracionjuradaCollection) {
        this.declaracionjuradaCollection = declaracionjuradaCollection;
    }

    public Estabdrp getTranspdrpId() {
        return transpdrpId;
    }

    public void setTranspdrpId(Estabdrp transpdrpId) {
        this.transpdrpId = transpdrpId;
    }

    public Estabdrp getOperadordrpId() {
        return operadordrpId;
    }

    public void setOperadordrpId(Estabdrp operadordrpId) {
        this.operadordrpId = operadordrpId;
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
        if (!(object instanceof Barro)) {
            return false;
        }
        Barro other = (Barro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gob.ambiente.aplicaciones.entities.Barro[ id=" + id + " ]";
    }
    
}
