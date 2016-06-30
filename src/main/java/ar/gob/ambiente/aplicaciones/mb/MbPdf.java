
package ar.gob.ambiente.aplicaciones.mb;

import ar.gob.ambiente.aplicaciones.entities.Actividad;
import ar.gob.ambiente.aplicaciones.srv.BackendSrv;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
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
import net.sf.jasperreports.engine.JasperRunManager;

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
        lstActividades = new ArrayList<>();
        Actividad ac1 = new Actividad();
        ac1.setId(1);
        ac1.setCodigo("A1");
        ac1.setDescripcion("pepe");
        lstActividades.add(ac1);
        Actividad ac2 = new Actividad();
        ac2.setId(1);
        ac2.setCodigo("A2");
        ac2.setDescripcion("lola");
        lstActividades.add(ac2);
        
        //lstActividades = backendServ.getActividadAll();
        return lstActividades;
    }
     
    public void init() throws JRException{

    }
    
    public void pdf() throws JRException, IOException{
        JRBeanCollectionDataSource beanCollectionDataSource = new JRBeanCollectionDataSource(lstActividades);
        String reportPath = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/pruebaActividades.jasper");
        jasperPrint =  JasperFillManager.fillReport(reportPath, new HashMap(), beanCollectionDataSource);
        HttpServletResponse httpServletResponse = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
        httpServletResponse.addHeader("Content-disposition", "attachment; filename=report.pdf");
        ServletOutputStream servletOutputStream = httpServletResponse.getOutputStream();
        
        JasperExportManager.exportReportToPdfStream(jasperPrint, servletOutputStream);
        FacesContext.getCurrentInstance().responseComplete();
        
        /*
        FacesContext facesContext = FacesContext.getCurrentInstance(); //Get the context ONCE
        HttpServletResponse response = (HttpServletResponse)facesContext.getExternalContext().getResponse();
        
            ServletOutputStream servletOutputStream = response.getOutputStream();
            response.setContentType("application/pdf");
            facesContext.responseComplete();
            
                JRBeanCollectionDataSource beanCollectionDataSource = new JRBeanCollectionDataSource(lstActividades);
                jasperPrint =  JasperFillManager.fillReport("C:\\Users\\Administrador\\Desktop\\videoGEL\\pruebaActividades.jasper", new HashMap(), beanCollectionDataSource);
                JasperExportManager.exportReportToPdfStream(jasperPrint, servletOutputStream);

            servletOutputStream.flush();
            servletOutputStream.close();
        */
        /*
        try {
            ServletOutputStream servletOutputStream = response.getOutputStream();
            response.setContentType("application/pdf");
            facesContext.responseComplete();
            
            
            try {  // Replace this with your desired JR utility method
                JRBeanCollectionDataSource beanCollectionDataSource = new JRBeanCollectionDataSource(lstActividades);
                jasperPrint =  JasperFillManager.fillReport("C:\\Users\\Administrador\\Desktop\\videoGEL\\pruebaActividades.jasper", new HashMap(), beanCollectionDataSource);
                JasperExportManager.exportReportToPdfStream(jasperPrint, servletOutputStream);
            } catch (JRException ex) {
                System.out.println(ex.getMessage());
            }
            servletOutputStream.flush();
            servletOutputStream.close();
        } catch (IOException ex) {
           System.out.println(ex.getMessage());
        } catch (Exception ex) {
           System.out.println(ex.getMessage());
        }        
        */
        
        
        /*
        init();
        HttpServletResponse hsr = (HttpServletResponse)FacesContext.getCurrentInstance().getExternalContext().getResponse();
        hsr.addHeader("Content-disposition", "atachment; filename=report.pdf");
        ServletOutputStream sos = hsr.getOutputStream();
        JasperExportManager.exportReportToPdfStream(jasperPrint, sos);
        FacesContext.getCurrentInstance().responseComplete();
        */
    }
}
