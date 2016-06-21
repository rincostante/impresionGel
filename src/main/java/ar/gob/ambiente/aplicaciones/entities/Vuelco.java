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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "vuelco")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vuelco.findAll", query = "SELECT v FROM Vuelco v")})
public class Vuelco implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "acido")
    private Boolean acido;
    @Column(name = "alcalino")
    private Boolean alcalino;
    @Column(name = "arsenico")
    private Boolean arsenico;
    @Column(name = "caafechavenc")
    @Temporal(TemporalType.DATE)
    private Date caafechavenc;
    @Column(name = "caanum")
    private Integer caanum;
    @Column(name = "caavigente")
    private Boolean caavigente;
    @Column(name = "cadmio")
    private Boolean cadmio;
    @Column(name = "caldera")
    private Boolean caldera;
    @Column(name = "captaaguasubte")
    private Boolean captaaguasubte;
    @Column(name = "cianuro")
    private Boolean cianuro;
    @Column(name = "circabierntrefrig")
    private Boolean circabierntrefrig;
    @Column(name = "circcerrrefrig")
    private Boolean circcerrrefrig;
    @Column(name = "cromo")
    private Boolean cromo;
    @Size(max = 255)
    @Column(name = "descdrp")
    private String descdrp;
    @Column(name = "detergentes")
    private Boolean detergentes;
    @Column(name = "expanio")
    private Integer expanio;
    @Column(name = "expnum")
    private Integer expnum;
    @Column(name = "fenoles")
    private Boolean fenoles;
    @Column(name = "hidrocarburos")
    private Boolean hidrocarburos;
    @Column(name = "inscripto")
    private Boolean inscripto;
    @Column(name = "lavapisosind")
    private Boolean lavapisosind;
    @Column(name = "mercurio")
    private Boolean mercurio;
    @Column(name = "neutro")
    private Boolean neutro;
    @Size(max = 255)
    @Column(name = "nombredrp")
    private String nombredrp;
    @Column(name = "plomo")
    private Boolean plomo;
    @Column(name = "recircagua")
    private Boolean recircagua;
    @Column(name = "solidossediment")
    private Boolean solidossediment;
    @Column(name = "solventesorg")
    private Boolean solventesorg;
    @Column(name = "sustsolubles")
    private Boolean sustsolubles;
    @Size(max = 255)
    @Column(name = "tipodrp")
    private String tipodrp;
    @Size(max = 255)
    @Column(name = "usdrp")
    private String usdrp;
    @Column(name = "tienepermisofact")
    private Boolean tienepermisofact;
    @Column(name = "tienecortedesague")
    private Boolean tienecortedesague;
    @Size(max = 100)
    @Column(name = "callefactibilidad")
    private String callefactibilidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "caudalautorizado")
    private Double caudalautorizado;
    @Size(max = 100)
    @Column(name = "orgautorizante")
    private String orgautorizante;
    @Column(name = "radioservido")
    private Boolean radioservido;
    @Size(max = 500)
    @Column(name = "procproduct")
    private String procproduct;
    @Column(name = "horariodiscontinuo")
    private Boolean horariodiscontinuo;
    @OneToMany(mappedBy = "vuelcoId")
    private Collection<Descarga> descargaCollection;
    @OneToMany(mappedBy = "vuelcoId")
    private Collection<Declaracionjurada> declaracionjuradaCollection;
    @JoinColumn(name = "operador_id", referencedColumnName = "id")
    @ManyToOne
    private Operador operadorId;
    @OneToMany(mappedBy = "vuelcoId")
    private Collection<Diavuelco> diavuelcoCollection;

    public Vuelco() {
    }

    public Vuelco(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getAcido() {
        return acido;
    }

    public void setAcido(Boolean acido) {
        this.acido = acido;
    }

    public Boolean getAlcalino() {
        return alcalino;
    }

    public void setAlcalino(Boolean alcalino) {
        this.alcalino = alcalino;
    }

    public Boolean getArsenico() {
        return arsenico;
    }

    public void setArsenico(Boolean arsenico) {
        this.arsenico = arsenico;
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

    public Boolean getCadmio() {
        return cadmio;
    }

    public void setCadmio(Boolean cadmio) {
        this.cadmio = cadmio;
    }

    public Boolean getCaldera() {
        return caldera;
    }

    public void setCaldera(Boolean caldera) {
        this.caldera = caldera;
    }

    public Boolean getCaptaaguasubte() {
        return captaaguasubte;
    }

    public void setCaptaaguasubte(Boolean captaaguasubte) {
        this.captaaguasubte = captaaguasubte;
    }

    public Boolean getCianuro() {
        return cianuro;
    }

    public void setCianuro(Boolean cianuro) {
        this.cianuro = cianuro;
    }

    public Boolean getCircabierntrefrig() {
        return circabierntrefrig;
    }

    public void setCircabierntrefrig(Boolean circabierntrefrig) {
        this.circabierntrefrig = circabierntrefrig;
    }

    public Boolean getCirccerrrefrig() {
        return circcerrrefrig;
    }

    public void setCirccerrrefrig(Boolean circcerrrefrig) {
        this.circcerrrefrig = circcerrrefrig;
    }

    public Boolean getCromo() {
        return cromo;
    }

    public void setCromo(Boolean cromo) {
        this.cromo = cromo;
    }

    public String getDescdrp() {
        return descdrp;
    }

    public void setDescdrp(String descdrp) {
        this.descdrp = descdrp;
    }

    public Boolean getDetergentes() {
        return detergentes;
    }

    public void setDetergentes(Boolean detergentes) {
        this.detergentes = detergentes;
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

    public Boolean getFenoles() {
        return fenoles;
    }

    public void setFenoles(Boolean fenoles) {
        this.fenoles = fenoles;
    }

    public Boolean getHidrocarburos() {
        return hidrocarburos;
    }

    public void setHidrocarburos(Boolean hidrocarburos) {
        this.hidrocarburos = hidrocarburos;
    }

    public Boolean getInscripto() {
        return inscripto;
    }

    public void setInscripto(Boolean inscripto) {
        this.inscripto = inscripto;
    }

    public Boolean getLavapisosind() {
        return lavapisosind;
    }

    public void setLavapisosind(Boolean lavapisosind) {
        this.lavapisosind = lavapisosind;
    }

    public Boolean getMercurio() {
        return mercurio;
    }

    public void setMercurio(Boolean mercurio) {
        this.mercurio = mercurio;
    }

    public Boolean getNeutro() {
        return neutro;
    }

    public void setNeutro(Boolean neutro) {
        this.neutro = neutro;
    }

    public String getNombredrp() {
        return nombredrp;
    }

    public void setNombredrp(String nombredrp) {
        this.nombredrp = nombredrp;
    }

    public Boolean getPlomo() {
        return plomo;
    }

    public void setPlomo(Boolean plomo) {
        this.plomo = plomo;
    }

    public Boolean getRecircagua() {
        return recircagua;
    }

    public void setRecircagua(Boolean recircagua) {
        this.recircagua = recircagua;
    }

    public Boolean getSolidossediment() {
        return solidossediment;
    }

    public void setSolidossediment(Boolean solidossediment) {
        this.solidossediment = solidossediment;
    }

    public Boolean getSolventesorg() {
        return solventesorg;
    }

    public void setSolventesorg(Boolean solventesorg) {
        this.solventesorg = solventesorg;
    }

    public Boolean getSustsolubles() {
        return sustsolubles;
    }

    public void setSustsolubles(Boolean sustsolubles) {
        this.sustsolubles = sustsolubles;
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

    public Boolean getTienepermisofact() {
        return tienepermisofact;
    }

    public void setTienepermisofact(Boolean tienepermisofact) {
        this.tienepermisofact = tienepermisofact;
    }

    public Boolean getTienecortedesague() {
        return tienecortedesague;
    }

    public void setTienecortedesague(Boolean tienecortedesague) {
        this.tienecortedesague = tienecortedesague;
    }

    public String getCallefactibilidad() {
        return callefactibilidad;
    }

    public void setCallefactibilidad(String callefactibilidad) {
        this.callefactibilidad = callefactibilidad;
    }

    public Double getCaudalautorizado() {
        return caudalautorizado;
    }

    public void setCaudalautorizado(Double caudalautorizado) {
        this.caudalautorizado = caudalautorizado;
    }

    public String getOrgautorizante() {
        return orgautorizante;
    }

    public void setOrgautorizante(String orgautorizante) {
        this.orgautorizante = orgautorizante;
    }

    public Boolean getRadioservido() {
        return radioservido;
    }

    public void setRadioservido(Boolean radioservido) {
        this.radioservido = radioservido;
    }

    public String getProcproduct() {
        return procproduct;
    }

    public void setProcproduct(String procproduct) {
        this.procproduct = procproduct;
    }

    public Boolean getHorariodiscontinuo() {
        return horariodiscontinuo;
    }

    public void setHorariodiscontinuo(Boolean horariodiscontinuo) {
        this.horariodiscontinuo = horariodiscontinuo;
    }

    @XmlTransient
    public Collection<Descarga> getDescargaCollection() {
        return descargaCollection;
    }

    public void setDescargaCollection(Collection<Descarga> descargaCollection) {
        this.descargaCollection = descargaCollection;
    }

    @XmlTransient
    public Collection<Declaracionjurada> getDeclaracionjuradaCollection() {
        return declaracionjuradaCollection;
    }

    public void setDeclaracionjuradaCollection(Collection<Declaracionjurada> declaracionjuradaCollection) {
        this.declaracionjuradaCollection = declaracionjuradaCollection;
    }

    public Operador getOperadorId() {
        return operadorId;
    }

    public void setOperadorId(Operador operadorId) {
        this.operadorId = operadorId;
    }

    @XmlTransient
    public Collection<Diavuelco> getDiavuelcoCollection() {
        return diavuelcoCollection;
    }

    public void setDiavuelcoCollection(Collection<Diavuelco> diavuelcoCollection) {
        this.diavuelcoCollection = diavuelcoCollection;
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
        if (!(object instanceof Vuelco)) {
            return false;
        }
        Vuelco other = (Vuelco) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gob.ambiente.aplicaciones.entities.Vuelco[ id=" + id + " ]";
    }
    
}
