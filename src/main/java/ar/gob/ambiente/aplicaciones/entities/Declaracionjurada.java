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
@Table(name = "declaracionjurada")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Declaracionjurada.findAll", query = "SELECT d FROM Declaracionjurada d")})
public class Declaracionjurada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "cude")
    private String cude;
    @Column(name = "horario_id")
    private BigInteger horarioId;
    @Column(name = "adjuntabalancemasas")
    private Boolean adjuntabalancemasas;
    @Size(max = 250)
    @Column(name = "rutabalancemasas")
    private String rutabalancemasas;
    @Column(name = "adjuntamanifycert")
    private Boolean adjuntamanifycert;
    @Size(max = 250)
    @Column(name = "rutamanifycert")
    private String rutamanifycert;
    @Column(name = "adjuntapermisofact")
    private Boolean adjuntapermisofact;
    @Size(max = 250)
    @Column(name = "rutapermisofact")
    private String rutapermisofact;
    @Column(name = "adjuntainicofact")
    private Boolean adjuntainicofact;
    @Size(max = 250)
    @Column(name = "rutainiciofact")
    private String rutainiciofact;
    @Column(name = "adjuntacroquis")
    private Boolean adjuntacroquis;
    @Size(max = 250)
    @Column(name = "rutacroquis")
    private String rutacroquis;
    @Column(name = "adjuntacertretiroydispfinal")
    private Boolean adjuntacertretiroydispfinal;
    @Size(max = 250)
    @Column(name = "rutacertretiroydispfinal")
    private String rutacertretiroydispfinal;
    @Column(name = "adjuntaprotocolo")
    private Boolean adjuntaprotocolo;
    @Size(max = 250)
    @Column(name = "rutaprotocolo")
    private String rutaprotocolo;
    @Size(max = 500)
    @Column(name = "observaciones")
    private String observaciones;
    @Basic(optional = false)
    @NotNull
    @Column(name = "claveestado")
    private int claveestado;
    @OneToMany(mappedBy = "declaracionId")
    private Collection<Cantpersonaldec> cantpersonaldecCollection;
    @JoinColumn(name = "vuelco_id", referencedColumnName = "id")
    @ManyToOne
    private Vuelco vuelcoId;
    @JoinColumn(name = "recibo_id", referencedColumnName = "id")
    @ManyToOne
    private Recibo reciboId;
    @JoinColumn(name = "firmante_id", referencedColumnName = "id")
    @ManyToOne
    private Firmante firmanteId;
    @JoinColumn(name = "documentacion_id", referencedColumnName = "id")
    @ManyToOne
    private Docdec documentacionId;
    @JoinColumn(name = "barro_id", referencedColumnName = "id")
    @ManyToOne
    private Barro barroId;
    @JoinColumn(name = "admin_id", referencedColumnName = "id")
    @ManyToOne
    private Adminentidad adminId;
    @JoinColumn(name = "abastecimiento_id", referencedColumnName = "id")
    @ManyToOne
    private Abastecimiento abastecimientoId;
    @OneToMany(mappedBy = "declaracionId")
    private Collection<Superficiedec> superficiedecCollection;
    @OneToMany(mappedBy = "declaracionId")
    private Collection<Producto> productoCollection;
    @OneToMany(mappedBy = "declaracionjuradaantId")
    private Collection<Historialdeclaraciones> historialdeclaracionesCollection;
    @OneToMany(mappedBy = "declaracionjuradaId")
    private Collection<Historialdeclaraciones> historialdeclaracionesCollection1;
    @OneToMany(mappedBy = "declaracionId")
    private Collection<Actividaddec> actividaddecCollection;
    @OneToMany(mappedBy = "declaracionId")
    private Collection<Fechadec> fechadecCollection;

    public Declaracionjurada() {
    }

    public Declaracionjurada(Integer id) {
        this.id = id;
    }

    public Declaracionjurada(Integer id, String cude, int claveestado) {
        this.id = id;
        this.cude = cude;
        this.claveestado = claveestado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCude() {
        return cude;
    }

    public void setCude(String cude) {
        this.cude = cude;
    }

    public BigInteger getHorarioId() {
        return horarioId;
    }

    public void setHorarioId(BigInteger horarioId) {
        this.horarioId = horarioId;
    }

    public Boolean getAdjuntabalancemasas() {
        return adjuntabalancemasas;
    }

    public void setAdjuntabalancemasas(Boolean adjuntabalancemasas) {
        this.adjuntabalancemasas = adjuntabalancemasas;
    }

    public String getRutabalancemasas() {
        return rutabalancemasas;
    }

    public void setRutabalancemasas(String rutabalancemasas) {
        this.rutabalancemasas = rutabalancemasas;
    }

    public Boolean getAdjuntamanifycert() {
        return adjuntamanifycert;
    }

    public void setAdjuntamanifycert(Boolean adjuntamanifycert) {
        this.adjuntamanifycert = adjuntamanifycert;
    }

    public String getRutamanifycert() {
        return rutamanifycert;
    }

    public void setRutamanifycert(String rutamanifycert) {
        this.rutamanifycert = rutamanifycert;
    }

    public Boolean getAdjuntapermisofact() {
        return adjuntapermisofact;
    }

    public void setAdjuntapermisofact(Boolean adjuntapermisofact) {
        this.adjuntapermisofact = adjuntapermisofact;
    }

    public String getRutapermisofact() {
        return rutapermisofact;
    }

    public void setRutapermisofact(String rutapermisofact) {
        this.rutapermisofact = rutapermisofact;
    }

    public Boolean getAdjuntainicofact() {
        return adjuntainicofact;
    }

    public void setAdjuntainicofact(Boolean adjuntainicofact) {
        this.adjuntainicofact = adjuntainicofact;
    }

    public String getRutainiciofact() {
        return rutainiciofact;
    }

    public void setRutainiciofact(String rutainiciofact) {
        this.rutainiciofact = rutainiciofact;
    }

    public Boolean getAdjuntacroquis() {
        return adjuntacroquis;
    }

    public void setAdjuntacroquis(Boolean adjuntacroquis) {
        this.adjuntacroquis = adjuntacroquis;
    }

    public String getRutacroquis() {
        return rutacroquis;
    }

    public void setRutacroquis(String rutacroquis) {
        this.rutacroquis = rutacroquis;
    }

    public Boolean getAdjuntacertretiroydispfinal() {
        return adjuntacertretiroydispfinal;
    }

    public void setAdjuntacertretiroydispfinal(Boolean adjuntacertretiroydispfinal) {
        this.adjuntacertretiroydispfinal = adjuntacertretiroydispfinal;
    }

    public String getRutacertretiroydispfinal() {
        return rutacertretiroydispfinal;
    }

    public void setRutacertretiroydispfinal(String rutacertretiroydispfinal) {
        this.rutacertretiroydispfinal = rutacertretiroydispfinal;
    }

    public Boolean getAdjuntaprotocolo() {
        return adjuntaprotocolo;
    }

    public void setAdjuntaprotocolo(Boolean adjuntaprotocolo) {
        this.adjuntaprotocolo = adjuntaprotocolo;
    }

    public String getRutaprotocolo() {
        return rutaprotocolo;
    }

    public void setRutaprotocolo(String rutaprotocolo) {
        this.rutaprotocolo = rutaprotocolo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getClaveestado() {
        return claveestado;
    }

    public void setClaveestado(int claveestado) {
        this.claveestado = claveestado;
    }

    @XmlTransient
    public Collection<Cantpersonaldec> getCantpersonaldecCollection() {
        return cantpersonaldecCollection;
    }

    public void setCantpersonaldecCollection(Collection<Cantpersonaldec> cantpersonaldecCollection) {
        this.cantpersonaldecCollection = cantpersonaldecCollection;
    }

    public Vuelco getVuelcoId() {
        return vuelcoId;
    }

    public void setVuelcoId(Vuelco vuelcoId) {
        this.vuelcoId = vuelcoId;
    }

    public Recibo getReciboId() {
        return reciboId;
    }

    public void setReciboId(Recibo reciboId) {
        this.reciboId = reciboId;
    }

    public Firmante getFirmanteId() {
        return firmanteId;
    }

    public void setFirmanteId(Firmante firmanteId) {
        this.firmanteId = firmanteId;
    }

    public Docdec getDocumentacionId() {
        return documentacionId;
    }

    public void setDocumentacionId(Docdec documentacionId) {
        this.documentacionId = documentacionId;
    }

    public Barro getBarroId() {
        return barroId;
    }

    public void setBarroId(Barro barroId) {
        this.barroId = barroId;
    }

    public Adminentidad getAdminId() {
        return adminId;
    }

    public void setAdminId(Adminentidad adminId) {
        this.adminId = adminId;
    }

    public Abastecimiento getAbastecimientoId() {
        return abastecimientoId;
    }

    public void setAbastecimientoId(Abastecimiento abastecimientoId) {
        this.abastecimientoId = abastecimientoId;
    }

    @XmlTransient
    public Collection<Superficiedec> getSuperficiedecCollection() {
        return superficiedecCollection;
    }

    public void setSuperficiedecCollection(Collection<Superficiedec> superficiedecCollection) {
        this.superficiedecCollection = superficiedecCollection;
    }

    @XmlTransient
    public Collection<Producto> getProductoCollection() {
        return productoCollection;
    }

    public void setProductoCollection(Collection<Producto> productoCollection) {
        this.productoCollection = productoCollection;
    }

    @XmlTransient
    public Collection<Historialdeclaraciones> getHistorialdeclaracionesCollection() {
        return historialdeclaracionesCollection;
    }

    public void setHistorialdeclaracionesCollection(Collection<Historialdeclaraciones> historialdeclaracionesCollection) {
        this.historialdeclaracionesCollection = historialdeclaracionesCollection;
    }

    @XmlTransient
    public Collection<Historialdeclaraciones> getHistorialdeclaracionesCollection1() {
        return historialdeclaracionesCollection1;
    }

    public void setHistorialdeclaracionesCollection1(Collection<Historialdeclaraciones> historialdeclaracionesCollection1) {
        this.historialdeclaracionesCollection1 = historialdeclaracionesCollection1;
    }

    @XmlTransient
    public Collection<Actividaddec> getActividaddecCollection() {
        return actividaddecCollection;
    }

    public void setActividaddecCollection(Collection<Actividaddec> actividaddecCollection) {
        this.actividaddecCollection = actividaddecCollection;
    }

    @XmlTransient
    public Collection<Fechadec> getFechadecCollection() {
        return fechadecCollection;
    }

    public void setFechadecCollection(Collection<Fechadec> fechadecCollection) {
        this.fechadecCollection = fechadecCollection;
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
        if (!(object instanceof Declaracionjurada)) {
            return false;
        }
        Declaracionjurada other = (Declaracionjurada) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gob.ambiente.aplicaciones.entities.Declaracionjurada[ id=" + id + " ]";
    }
    
}
