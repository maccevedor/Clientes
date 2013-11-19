/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_reporte;

/**
 *
 * @author usuario
 */
public class Ejemplo_reporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
               new frmPrincipal().setVisible(true);
            }
        });
    }
}
