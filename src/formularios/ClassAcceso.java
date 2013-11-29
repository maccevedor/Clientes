
package formularios;

/**
 *
 * @author AVALOS
 */
import java.sql.*;
import javax.swing.JOptionPane;
import formularios.Cliente;
import Control.conectar;

public class ClassAcceso {
  public  void acceso(String usuario ,String clave){
Connection conexio=null;
Statement consulta=null;
ResultSet tabla=null;
try{
    Class.forName("com.mysql.jdbc.Driver");
    conexio=DriverManager.getConnection("jdbc:mysql://localhost/cliente","root","");
    consulta=conexio.createStatement();
    
    
    tabla=consulta.executeQuery("select nom_usuario , cla_usuario from usuarios where nom_usuario='"+usuario+"'and cla_usuario='"+clave+"'");
    if(tabla.next()){
         JOptionPane.showMessageDialog(null, "logueo correcto");
        // sql = "update cliente set Sesion=now() where Nom_usuario="+usuario+"";
        // PreparedStatement pst = conexio.prepareStatement(sql);
         // pst.executeUpdate();
         Cliente menu=new Cliente();
         menu.show();
         menu.setExtendedState(new Cliente().MAXIMIZED_BOTH);
         }
    else{
        JOptionPane.showMessageDialog(null,"usuario y clave incorrecto");
 
    }
}catch(ClassNotFoundException |SQLException e){}

  }  
}
    
    

