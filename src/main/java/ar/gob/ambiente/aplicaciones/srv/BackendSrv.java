/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.gob.ambiente.aplicaciones.srv;

import ar.gob.ambiente.aplicaciones.entities.Actividad;
import ar.gob.ambiente.aplicaciones.facades.ActividadFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Administrador
 */
@LocalBean
@Stateless
public class BackendSrv {

    @EJB
    ActividadFacade actividadFacade;
    
    /*********************************
     * Métodos para las Actividades **
     *********************************/
    
    /**
     * Método para insertar una Actividad
     * @param actividad
     */
    public void createActividad(Actividad actividad){
        actividadFacade.create(actividad);
    }
    
    /**
     * Método para editar una Actividad
     * @param actividad 
     */
    public void editActividad(Actividad actividad){
        actividadFacade.edit(actividad);
    }
    
    /**
     * Método para obtener una Actividad según su id
     * @param id
     * @return 
     */
    public Actividad getActividadByID(Long id){
        return actividadFacade.find(id);
    }    
    
    /**
     * Método para obtener todas las Actividades
     * Se implementa para poder exponerlo como servicio.
     * @return 
     */
    public List<Actividad> getActividadAll(){
        return actividadFacade.findAll();
    }    
}
