/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package formularios;

import Control.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author macevedor
 */
public class Encuesta extends javax.swing.JFrame {
 private DefaultTableModel model;
    /**
     * Creates new form Encuesta
     */
    public Encuesta() {
        initComponents();
        bloquear();
        cargar();
    }
    
    
     void cargar(){
        
        //Titulos de la Tabla
        String [] titulos = {"Id","Servicio","Frecuencia","Costo","Tiempo","Opinion","Mejora","Promociones"};
        String [] registros = new String[8];
        String sql = "select Id,Servicio,Frecuencia,Costo,Tiempo,Opinion,Mejora,Promociones  from encuesta ";
        model = new DefaultTableModel(null,titulos);
        conectar cc = new conectar();
        Connection cn = cc.conexion();
        
      
       try {
             Statement st = cn.createStatement();
             ResultSet rs = st.executeQuery(sql);
             
             while(rs.next()){
             registros[0]=rs.getString("Id");    
             registros[1]=rs.getString("Servicio");
             registros[2]=rs.getString("Frecuencia");
             registros[3]=rs.getString("Costo");
             registros[4]=rs.getString("Tiempo");
             registros[5]=rs.getString("Opinion");
             registros[6]=rs.getString("Mejora");
             registros[7]=rs.getString("Promociones");
             
             
             model.addRow(registros);
             }
             tablaEncuestas.setModel(model);
       } catch (SQLException ex) {
           //Logger.getLogger(ing_cli.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null, ex);
       }
        
    }
    
    void limpiar(){
        
        txtServicio.setText("");
        txtFrecuencia.setText("");
        txtCosto.setText("");
        txtTiempo.setText("");
        txtOpinion.setText("");
        txtMejora.setText("");
        txtPromociones.setText("");
                
    }
    
    void bloquear(){
        
        txtServicio.setEnabled(false);
        txtFrecuencia.setEnabled(false);
        txtCosto.setEnabled(false);
        txtTiempo.setEnabled(false);
        txtOpinion.setEnabled(false);
        txtMejora.setEnabled(false);
        txtPromociones.setEnabled(false);
        
    }
    
    void desbloquear(){
         txtServicio.setEnabled(true);
        txtFrecuencia.setEnabled(true);
        txtCosto.setEnabled(true);
        txtTiempo.setEnabled(true);
        txtOpinion.setEnabled(true);
        txtMejora.setEnabled(true);
        txtPromociones.setEnabled(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtServicio = new javax.swing.JTextField();
        txtFrecuencia = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        txtTiempo = new javax.swing.JTextField();
        txtOpinion = new javax.swing.JTextField();
        txtMejora = new javax.swing.JTextField();
        txtPromociones = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEncuestas = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 100, 30));
        getContentPane().add(txtFrecuencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 100, -1));
        getContentPane().add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 100, -1));
        getContentPane().add(txtTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 100, -1));
        getContentPane().add(txtOpinion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 100, -1));
        getContentPane().add(txtMejora, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 100, -1));
        getContentPane().add(txtPromociones, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 100, -1));

        jLabel1.setText("Que servicio Adquirio");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jLabel2.setText("Frecuencia que adquiere el servicio");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        jLabel3.setText("Dinero que gasta en el servicio");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel4.setText("Tiempo que gasto");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel5.setText("Opinion del servicio");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jLabel6.setText("Mejora del servicio");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        jLabel7.setText("Quepromocion le gustaria");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        btnNuevo.setToolTipText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, -1, -1));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btnGuardar.setToolTipText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        jButton3.setToolTipText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reporte.png"))); // NOI18N
        jButton4.setToolTipText("Informe");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, -1, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        jButton5.setToolTipText("Salir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, -1, -1));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Encuesta");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 120, 40));

        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/promociones.png"))); // NOI18N
        jToggleButton5.setToolTipText("Promociones");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 130, 80));

        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cliente.png"))); // NOI18N
        jToggleButton2.setToolTipText("Cliente");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 130, 80));

        tablaEncuestas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaEncuestas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 640, 100));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminar.setToolTipText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        desbloquear();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        // TODO add your handling code here:
        Promocion menu=new Promocion();
         menu.show();
         menu.setExtendedState(new Promocion().NORMAL);
         this.setVisible(false);
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
         Cliente menu=new Cliente();
         menu.show();
         menu.setExtendedState(new Cliente().NORMAL);
         this.setVisible(false);
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        conectar cc = new conectar();
        Connection cn = cc.conexion();
        //inicializamos
        String servicio,frecuencia,costo,tiempo,opinion,mejora,promocion;
        String sql="";
        servicio = txtServicio.getText();
        frecuencia = txtFrecuencia.getText();
        costo = txtCosto.getText();
        tiempo = txtTiempo.getText();
        opinion = txtOpinion.getText();
        mejora = txtPromociones.getText();
        promocion = txtPromociones.getText();
        

         sql = "insert into encuesta (Servicio,Frecuencia,Costo,Tiempo,Opinion,Mejora,Promociones) values (?,?,?,?,?,?,?)";
          try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1,servicio);
            pst.setString(2,frecuencia);
            pst.setString(3,costo);
            pst.setString(4,tiempo);
            pst.setString(5,opinion);
            pst.setString(6,mejora);
            pst.setString(7,promocion);
            
            int n = pst.executeUpdate();
            if (n>0){
                JOptionPane.showMessageDialog(null,"Registro Guardado");
                bloquear();
                cargar();
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        
       conectar cc = new conectar();
        Connection cn = cc.conexion();
        int filasel= tablaEncuestas.getSelectedRow();
       try {
           if(filasel==-1)
           {
            JOptionPane.showMessageDialog(null, "Seleccione algun dato");
           }
           else
           {
             String  Id=(String)tablaEncuestas.getValueAt(filasel, 0);
             String eliminarSQL="DELETE FROM encuesta WHERE Id = '"+Id+"'";
             try {
             PreparedStatement pst  = cn.prepareStatement(eliminarSQL);
          pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Borrado");
            cargar();
            } 
            catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            }
           }
           } 
       catch (Exception e)
       {
       }        
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        limpiar();
        bloquear();
        cargar();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
            ReporteEncuestas r = new ReporteEncuestas();
        try {
            r.mostrarReporte();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ocurrio un error.. "+e.getMessage());
        }
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Encuesta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JTable tablaEncuestas;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtFrecuencia;
    private javax.swing.JTextField txtMejora;
    private javax.swing.JTextField txtOpinion;
    private javax.swing.JTextField txtPromociones;
    private javax.swing.JTextField txtServicio;
    private javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
}
