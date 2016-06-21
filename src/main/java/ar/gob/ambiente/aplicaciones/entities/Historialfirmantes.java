/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.gob.ambiente.aplicaciones.entities;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "historialfirmantes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Historialfirmantes.findAll", query = "SELECT h FROM Historialfirmantes h")})
public class Historialfirmantes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "activa")
    private Boolean activa;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Size(max = 255)
    @Column(name = "motivo")
    private String motivo;
    @JoinColumn(name = "usuarioexterno_id", referencedColumnName = "id")
    @ManyToOne
    private Usuarioexterno usuarioexternoId;
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    @ManyToOne
    private Usuario usuarioId;
    @JoinColumn(name = "firmanteant_id", referencedColumnName = "id")
    @ManyToOne
    private Firmante firmanteantId;
    @JoinColumn(name = "firmanteact_id", referencedColumnName = "id")
    @ManyToOne
    private Firmante firmanteactId;
    @JoinColumn(name = "establecimiento_id", referencedColumnName = "id")
    @ManyToOne
    private Establecimiento establecimientoId;

    public Historialfirmantes() {
    }

    public Historialfirmantes(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getActiva() {
        return activa;
    }

    public void setActiva(Boolean activa) {
        this.activa = activa;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Usuarioexterno getUsuarioexternoId() {
        return usuarioexternoId;
    }

    public void setUsuarioexternoId(Usuarioexterno usuarioexternoId) {
        this.usuarioexternoId = usuarioexternoId;
    }

    public Usuario getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuario usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Firmante getFirmanteantId() {
        return firmanteantId;
    }

    public void setFirmanteantId(Firmante firmanteantId) {
        this.firmanteantId = firmanteantId;
    }

    public Firmante getFirmanteactId() {
        return firmanteactId;
    }

    public void setFirmanteactId(Firmante firmanteactId) {
        this.firmanteactId = firmanteactId;
    }

    public Establecimiento getEstablecimientoId() {
        return establecimientoId;
    }

    public void setEstablecimientoId(Establecimiento establecimientoId) {
        this.establecimientoId = establecimientoId;
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
        if (!(object instanceof Historialfirmantes)) {
            return false;
        }
        Historialfirmantes other = (Historialfirmantes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gob.ambiente.aplicaciones.entities.Historialfirmantes[ id=" + id + " ]";
    }
    
}
