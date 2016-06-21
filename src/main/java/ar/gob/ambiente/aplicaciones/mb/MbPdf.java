
package ar.gob.ambiente.aplicaciones.mb;

import ar.gob.ambiente.aplicaciones.entities.Actividad;
import ar.gob.ambiente.aplicaciones.srv.BackendSrv;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperExportManager;

/**
 *
 * @author Administrador
 */
public class MbPdf implements Serializable{
    
    @EJB BackendSrv backendServ;
    
    private List<Actividad> lstActividades;
    JasperPrint jasperPrint;

    public MbPdf() {
    }

    public List<Actividad> getLstActividades() {
        lstActividades = backendServ.getActividadAll();
        return lstActividades;
    }
    
    public void init() throws JRException{
        JRBeanCollectionDataSource beanCollectionDataSource = new JRBeanCollectionDataSource(lstActividades);
        jasperPrint =  JasperFillManager.fillReport("C:\\Users\\Administrador\\Desktop\\videoGEL\\pruebaActividades.jasper", new HashMap(), beanCollectionDataSource);
    }
    
    public void pdf(ActionEvent actionEvent) throws JRException, IOException{
        init();
        HttpServletResponse hsr = (HttpServletResponse)FacesContext.getCurrentInstance().getExternalContext().getResponse();
        ServletOutputStream sos = hsr.getOutputStream();
        JasperExportManager.exportReportToPdfStream(jasperPrint, sos);
    }
}
