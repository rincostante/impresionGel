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
@Table(name = "descarga")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Descarga.findAll", query = "SELECT d FROM Descarga d")})
public class Descarga implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "anulado")
    private Boolean anulado;
    @Column(name = "camtomamuestra")
    private Boolean camtomamuestra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "caudal")
    private double caudal;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "caudalautorizado")
    private Double caudalautorizado;
    @Column(name = "mayor5km")
    private Boolean mayor5km;
    @Size(max = 500)
    @Column(name = "motivoanulado")
    private String motivoanulado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numorden")
    private int numorden;
    @Size(max = 255)
    @Column(name = "orgautorizante")
    private String orgautorizante;
    @Basic(optional = false)
    @NotNull
    @Column(name = "clavetipo")
    private int clavetipo;
    @JoinColumn(name = "vuelco_id", referencedColumnName = "id")
    @ManyToOne
    private Vuelco vuelcoId;
    @JoinColumn(name = "curso_id", referencedColumnName = "id")
    @ManyToOne
    private Curso cursoId;
    @JoinColumn(name = "aforo_id", referencedColumnName = "id")
    @ManyToOne
    private Aforo aforoId;
    @OneToMany(mappedBy = "descargaId")
    private Collection<Tratamiento> tratamientoCollection;

    public Descarga() {
    }

    public Descarga(Integer id) {
        this.id = id;
    }

    public Descarga(Integer id, double caudal, int numorden, int clavetipo) {
        this.id = id;
        this.caudal = caudal;
        this.numorden = numorden;
        this.clavetipo = clavetipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getAnulado() {
        return anulado;
    }

    public void setAnulado(Boolean anulado) {
        this.anulado = anulado;
    }

    public Boolean getCamtomamuestra() {
        return camtomamuestra;
    }

    public void setCamtomamuestra(Boolean camtomamuestra) {
        this.camtomamuestra = camtomamuestra;
    }

    public double getCaudal() {
        return caudal;
    }

    public void setCaudal(double caudal) {
        this.caudal = caudal;
    }

    public Double getCaudalautorizado() {
        return caudalautorizado;
    }

    public void setCaudalautorizado(Double caudalautorizado) {
        this.caudalautorizado = caudalautorizado;
    }

    public Boolean getMayor5km() {
        return mayor5km;
    }

    public void setMayor5km(Boolean mayor5km) {
        this.mayor5km = mayor5km;
    }

    public String getMotivoanulado() {
        return motivoanulado;
    }

    public void setMotivoanulado(String motivoanulado) {
        this.motivoanulado = motivoanulado;
    }

    public int getNumorden() {
        return numorden;
    }

    public void setNumorden(int numorden) {
        this.numorden = numorden;
    }

    public String getOrgautorizante() {
        return orgautorizante;
    }

    public void setOrgautorizante(String orgautorizante) {
        this.orgautorizante = orgautorizante;
    }

    public int getClavetipo() {
        return clavetipo;
    }

    public void setClavetipo(int clavetipo) {
        this.clavetipo = clavetipo;
    }

    public Vuelco getVuelcoId() {
        return vuelcoId;
    }

    public void setVuelcoId(Vuelco vuelcoId) {
        this.vuelcoId = vuelcoId;
    }

    public Curso getCursoId() {
        return cursoId;
    }

    public void setCursoId(Curso cursoId) {
        this.cursoId = cursoId;
    }

    public Aforo getAforoId() {
        return aforoId;
    }

    public void setAforoId(Aforo aforoId) {
        this.aforoId = aforoId;
    }

    @XmlTransient
    public Collection<Tratamiento> getTratamientoCollection() {
        return tratamientoCollection;
    }

    public void setTratamientoCollection(Collection<Tratamiento> tratamientoCollection) {
        this.tratamientoCollection = tratamientoCollection;
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
        if (!(object instanceof Descarga)) {
            return false;
        }
        Descarga other = (Descarga) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gob.ambiente.aplicaciones.entities.Descarga[ id=" + id + " ]";
    }
    
}
