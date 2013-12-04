/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package formularios;

import java.awt.Frame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author admin
 */
public class ReporteEncuestas {
    
     
    private Connection cn;
    public ReporteEncuestas(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost/cliente","root","");
          
        
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void mostrarReporte()throws Exception{       
      
        
        JasperReport report= JasperCompileManager.compileReport(System.getProperty("user.dir").concat("/src/formularios/encuestas.jrxml"));
        JasperPrint print= JasperFillManager.fillReport(report, null,cn);
        JasperViewer view=new JasperViewer(print,false);
        view.setTitle("Mi primer repòrte");
        view.setExtendedState(Frame.MAXIMIZED_BOTH);
        view.setVisible(true);
    }
    
}
