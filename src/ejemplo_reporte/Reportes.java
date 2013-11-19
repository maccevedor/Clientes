/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_reporte;

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
 * @author usuario
 */
public class Reportes {
    private Connection cn;
    public Reportes(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://10.163.30.202/intranet","root","chicamo");
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void mostrarReporte()throws Exception{        
        JasperReport report= JasperCompileManager.compileReport(System.getProperty("user.dir").concat("/src/ejemplo_reporte/cliente.jrxml"));
        JasperPrint print= JasperFillManager.fillReport(report, null,cn);
        JasperViewer view=new JasperViewer(print,false);
        view.setTitle("Mi primer repòrte");
        view.setExtendedState(Frame.MAXIMIZED_BOTH);
        view.setVisible(true);
    }
    
}
