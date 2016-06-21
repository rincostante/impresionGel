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
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombrecompleto")
    private String nombrecompleto;
    @OneToMany(mappedBy = "usuarioId")
    private Collection<Historialactividades> historialactividadesCollection;
    @JoinColumn(name = "rol_id", referencedColumnName = "id")
    @ManyToOne
    private Rol rolId;
    @JoinColumn(name = "admin_id", referencedColumnName = "id")
    @ManyToOne
    private Adminentidad adminId;
    @OneToMany(mappedBy = "usmodifId")
    private Collection<Adminentidad> adminentidadCollection;
    @OneToMany(mappedBy = "usbajaId")
    private Collection<Adminentidad> adminentidadCollection1;
    @OneToMany(mappedBy = "usaltaId")
    private Collection<Adminentidad> adminentidadCollection2;
    @OneToMany(mappedBy = "usuarioId")
    private Collection<Historialfirmantes> historialfirmantesCollection;

    public Usuario() {
    }

    public Usuario(Integer id) {
        this.id = id;
    }

    public Usuario(Integer id, String nombre, String nombrecompleto) {
        this.id = id;
        this.nombre = nombre;
        this.nombrecompleto = nombrecompleto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    @XmlTransient
    public Collection<Historialactividades> getHistorialactividadesCollection() {
        return historialactividadesCollection;
    }

    public void setHistorialactividadesCollection(Collection<Historialactividades> historialactividadesCollection) {
        this.historialactividadesCollection = historialactividadesCollection;
    }

    public Rol getRolId() {
        return rolId;
    }

    public void setRolId(Rol rolId) {
        this.rolId = rolId;
    }

    public Adminentidad getAdminId() {
        return adminId;
    }

    public void setAdminId(Adminentidad adminId) {
        this.adminId = adminId;
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
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ar.gob.ambiente.aplicaciones.entities.Usuario[ id=" + id + " ]";
    }
    
}
