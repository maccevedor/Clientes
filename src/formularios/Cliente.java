
package formularios;

import Control.Validaciones;
import Control.conectar;
import java.sql.*;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import formularios.Encuesta;

/**
 *
 * @author macevedor
 */
public class Cliente extends javax.swing.JFrame {
    
private Validaciones val = new Validaciones();

   DefaultTableModel model;
   
    public Cliente() {
        initComponents();
        limpiar();
        bloquear();
        cargar("");
    }
    
    void cargar(String valor){
        
        //Titulos de la Tabla
        String [] titulos = {"Cedula","Nombre","Apellido","Sexo","Fecha Nacimiento","Municipio","Direccion","Correo","Celular"};
        //Nuremos de campos de Columunas
        String [] registros = new String[9];
        //Creamos la consulta sql que nos trae los datos de la tabla cliente
        String sql = "select Cedula,Nombre,Apellido,Sexo,fchNacimiento,Municipio,Direccion,Email,Celular from cliente where concat(Nombre,'',Apellido) like '%"+valor+"%'";
        model = new DefaultTableModel(null,titulos);
        
        //Llarma la conexion de base datos 
        conectar cc = new conectar();
        Connection cn = cc.conexion();
        

        //Definimos los valores de array , que fueron tomadas de el sql       
       try {
             Statement st = cn.createStatement();
             //asignamos a rs la consulta
             ResultSet rs = st.executeQuery(sql);
             //ingresamos datos de la consulta
             while(rs.next()){
             registros[0]=rs.getString("Cedula");
             registros[1]=rs.getString("Nombre");
             registros[2]=rs.getString("Apellido");
             registros[3]=rs.getString("Sexo");
             registros[4]=rs.getString("FchNacimiento");
             registros[5]=rs.getString("Municipio");
             registros[6]=rs.getString("Direccion");
             registros[7]=rs.getString("Email");
             registros[8]=rs.getString("Celular");
             
             model.addRow(registros);
             }
             tablaCliente.setModel(model);
       } catch (SQLException ex) {
           //Logger.getLogger(ing_cli.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null, ex);
       }
        
    }

    void limpiar(){
        txtCedula.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtHijos.setText("");
        txtDireccion.setText("");
        txtEmail.setText("");
        txtTelefono.setText("");
        txtCelular.setText("");
        
    }
    
    void bloquear(){
        
        txtCedula.setEnabled(false);
        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);
        fecha.setEnabled(false);
        txtHijos.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtEmail.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtCelular.setEnabled(false);
        btnGuardar.setEnabled(false);
        
        }
    
    void desbloquear(){
        txtCedula.setEnabled(true);
        txtNombre.setEnabled(true);
        txtApellido.setEnabled(true);
        fecha.setEnabled(true);
        txtHijos.setEnabled(true);
        txtDireccion.setEnabled(true);
        txtEmail.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtCelular.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnGuardar.setEnabled(true);
        
    
    }
    
         void BuscarClienteEditar(String cod) {
                //llamaos la conexion
               conectar cc = new conectar();
               Connection cn = cc.conexion();
        
        try{
           
            limpiar();
            String ced="",nom="",ape="",sex,fechaN,ecivil,nhijos="",municipios="",direccion="",email="",telefono="",celular="";
            String cons="select * from cliente WHERE Cedula='"+cod+"'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(cons);
            while(rs.next())
            {
                ced=rs.getString(2);
                nom=rs.getString(3);
                ape=rs.getString(4);
                sex=rs.getString(5);
                fechaN=rs.getString(6);
                ecivil=rs.getString(7);
                nhijos=rs.getString(8);
                municipios=rs.getString(9);
                direccion=rs.getString(10);
                email=rs.getString(11);
                telefono=rs.getString(12);
                celular=rs.getString(13);
           
            }
            txtCedula.setText(ced);
            txtNombre.setText(nom);
            txtApellido.setText(ape);
            //sexo
            //fecha
            //Estado Civil
            // municipio.
            txtEmail.setText(email);
            txtHijos.setText(nhijos);
            txtDireccion.setText(direccion);
            txtTelefono.setText(telefono);
            txtCelular.setText(celular);
            
            
            }catch(Exception e)
            {
            System.out.println(e.getMessage());
            }
     
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JToggleButton();
        btnNuevo = new javax.swing.JToggleButton();
        btnModificar = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCliente = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton4 = new javax.swing.JToggleButton();
        sexo = new javax.swing.JComboBox();
        municipio = new javax.swing.JComboBox();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        fecha = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtHijos = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        civil = new javax.swing.JComboBox();
        btnEliminar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCedula.setText("Cedula");
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        getContentPane().add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 73, 141, -1));

        txtNombre.setText("Nombre");
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 102, 141, -1));

        txtApellido.setText("Apellido");
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 128, 141, -1));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btnGuardar.setToolTipText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 60, -1));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        btnNuevo.setToolTipText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 50, 60));

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        btnModificar.setToolTipText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 60, -1));

        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        jToggleButton3.setToolTipText("Cancelar");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 60, -1));

        tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaCliente);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 351, 950, 270));

        txtBuscar.setToolTipText("Digite el nombre o apellido a buscar");
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 48, -1));

        jToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reporte.png"))); // NOI18N
        jToggleButton4.setToolTipText("Informe");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 60, -1));

        sexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));
        sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoActionPerformed(evt);
            }
        });
        getContentPane().add(sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 186, 141, -1));

        municipio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bucaramanga", "Florida", "Giron", "Piedecuesta", "Santafé de Bogotá", "Puerto Nariño", "Leticia", "Medellín", "Abejorral", "Abriaqui", "Alejandría", "Amagá", "Amalfi", "Andes", "Angelópolis", "Angostura", "Anorí", "Antioquia", "Anzá", "Apartadó", "Arboletes", "Argelia", "Armenia", "Barbosa", "Belmira", "Bello", "Betania", "Betulia", "Bolívar", "Briseño", "Buriticá", "Cáceres", "Caicedo", "Caldas", "Campamento", "Cañasgordas", "Caracolí", "Caramanta", "Carepa", "Carmen de Viboral", "Carolina", "Caucasia", "Chigorodó", "Cisneros", "Cocorná", "Concepción", "Concordia", "Copacabana", "Dabeiba", "Don Matías", "Ebéjico", "El Bagre", "Entrerríos", "Envigado", "Fredonia", "Frontino", "Giraldo", "Girardota", "Gómez Plata", "Granada", "Guadalupe", "Guarne", "Guatapé", "Heliconia", "Hispania", "Itagüí", "Ituango", "Jardín", "Jericó", "La Estrella", "La Pintada", "La Unión", "Liborina", "Maceo", "Marinilla", "Montebello", "Murindó", "Mutatá", "Nariño", "Necoclí", "Nechí", "Olaya", "Peñol", "Peque", "Pueblorrico", "Puerto Berrío", "Puerto Nare", "Puerto Triunfo", "Remedios", "Retiro", "Rionegro", "Sabanalarga", "Sabaneta", "Salgar", "San Andrés", "San Carlos", "San francisco", "San Jerónimo", "San José de Montaña", "San Juan de Urabá", "San Luis", "San Pedro", "San Pedro de Urabá", "San Rafael", "San Roque", "San Vicente", "Santa Bárbara", "Santa Rosa de Osos", "Santo Domingo", "Santuario", "Segovia", "Sonsón", "Sopetrán", "Támesis", "Tarazá", "Tarso", "Titiribí", "Toledo", "Turbo", "Uramita", "Urrao", "Valdivia", "Valparaíso", "Vegachí", "Venecia", "Vigía del Fuerte", "Yalí", "Yarumal", "Yolombó", "Yondó (Casabe)", "Zaragoza 895", "Arauca", "Arauquita", "Cravo Norte", "Fortul", "Puerto Rondón", "Fortul", "Puerto Rondón", "Saravena", "Tame", "Barranquilla", "Baranoa", "Campo de la Cruz", "Candelaria", "Galapa", "Juan de Acosta", "Luruaco", "Malambo", "Manatí", "Palmar de Varela", "Piojó", "Polonuevo", "Ponedera", "Puerto Colombia", "Repelón", "Sabanagrande", "Sabanalarga", "Santa Lucía", "Santo Tomás", "Soledad", "Suán", "Tubará", "Usiacurí", "Cartagena", "Achí", "Altos del Rosario", "Arenal", "Arjona", "Arroyohondo", "Barranco de Loba", "Calamar", "Cantagallo", "Cicuto", "Córdoba", "Clemencia", "El Carmen de Bolívar", "El Guamo", "El Peñón", "Hatillo de Loba", "Magangue", "Mahates", "Margarita", "María la Baja", "Montecristo", "Mompós", "Morales", "Pinillos", "Regidor", "Río Viejo", "San Cristóbal", "San Estanislao", "San Fernando", "San Jacinto", "San Jacinto del Cauca", "San Juan Nepomuceno", "San Martín de Loba", "San Pablo", "Santa Catalina", "Santa Rosa", "Santa Rosa del Sur", "Simití", "Soplaviento", "Talaigua Nuevo", "Tiquisio (Puerto Rico)", "Turbaco", "Turbaná", "Villanueva", "Zambrano", "Boyacá 15", "Tunja", "Almeida", "Aquitania", "Arcabuco", "Belén", "Berbeo", "Beteitiva", "Boavita", "Boyacá", "Briseño", "Buenavista", "Busbanzá", "Caldas", "Campohermoso", "Cerinza", "Chinavita", "Chiquinquirá", "Chiscas", "Chita", "Chitaranque", "Chivatá", "Ciénaga", "Cómbita", "Coper", "Corrales", "Covarachia", "Cubar", "Cucaita", "Cuitiva", "Chíquiza", "Chivor", "Duitama", "El Cocuy", "El Espino", "Firavitoba", "Floresta", "Gachantivá", "Gámeza", "Garagoa", "Guacamayas", "Guateque", "Guayatá", "Guicán", "Iza", "Jenesano", "Jericó", "Labranzagrande", "La Capilla", "La Victoria", "La Ubita", "Villa de Leyva", "Macanal", "Maripí", "Miraflores", "Mongua", "Monguí", "Moniquirá", "Motavita", "Muzo", "Nobsa", "Nuevo Colón", "Oicatá", "Otanche", "Pachavita", "Páez", "Paipa", "Pajarito", "Panqueba", "Pauna", "Paya", "Paz de Río", "Pesca", "Pisva", "Puerto Boyacá", "Quípama", "Ramiquirí", "Ráquira", "Rondón", "Saboyá", "Sáchica", "Samacá", "San Eduardo", "San José de Pare", "San Luis de Gaceno", "San Mateo", "San Miguel de Sema", "San Pablo de Borbur", "Santana", "Santa María", "Santa Rosa de Viterbo", "Santa Sofía", "Sativanorte", "Sativasur", "Siachoque", "Soatá", "Socotá", "Socha", "Sogamoso", "Somondoco", "Sora", "Sotaquirá", "Soracá", "Susacón", "Sutamarchán", "Sutatenza", "Tasco", "Tenza", "Tibaná", "Tibasosa", "Tinjacá", "Tipacoque", "Toca", "Toguí", "Tópaga", "Tota", "Tunungua", "Turmequé", "Tuta", "Tutazá", "Úmbita", "Ventaquemada", "Viracachá", "Zetaquirá", "Manizales", "Aguadas", "Anserma", "Aranzazu", "Belalcázar", "Chinchina", "Filadelfia", "La Dorada", "La Merced", "Manzanares", "Marmato", "Marquetalia", "Marulanda", "Neira", "Pácora", "Palestina", "Pensilvania", "Riosucio", "Risaralda", "Salamina", "Samaná", "San José", "Supía", "Victoria", "Villamaría", "Viterbo", "Caquetá 18 Florencia", "Albania", "Belén de los Andaquíes", "Cartagena del Chairá", "Curillo", "El Doncello", "El Paujil", "La Montañita", "Milán", "Morelia", "Puerto Rico", "San José del Fragua", "San Vicente del Caguán", "Solano", "Solita", "Valparaíso", "Yopal", "Aguazul", "Chameza", "Hato Corozal", "La Salina", "Maní", "Monterrey", "Nunchía", "Orocué", "Paz de Ariporo", "Pore", "Recetor", "Sabalarga", "Sácama", "San Luis de Palenque", "Támara", "Tauramena", "Trinidad", "Villanueva", "Popayán", "Almaguer", "Argelia", "Balboa", "Bolívar", "Buenos Aires", "Cajibío", "Caldono", "Caloto", "Corinto", "El Tambo", "Florencia", "Guapi", "Inzá", "Jambaló", "La Sierra", "La Vega", "López (Micay)", "Mercaderes", "Miranda", "Morales", "Padilla", "Páez (Belalcazar)", "Patía (El Bordo)", "Piamonte", "Piendamó", "Puerto Tejada", "Puracé (Coconuco)", "Rosas", "San Sebastián", "Santander de Quilichao", "Santa Rosa", "Silvia", "Sotará (Paispamba)", "Suárez", "Timbío", "Timbiquí", "Toribío", "Totoro", "Valledupar", "Aguachica", "Agustín Codazzi", "Astrea", "Becerril", "Bosconia", "Chimichagua", "Chiriguaná", "Curumaní", "El Copey", "El Paso", "Gamarra", "González", "La Gloria", "La Jagua de Ibirico", "Manaure Balcón Cesar", "Pailitas", "Pelaya", "Pueblo Bello", "Río de Oro", "La Paz (Robles)", "San Alberto", "San Diego", "San Martín", "Tamalameque", "Montería", "Ayapel", "Buenavista", "Canalete", "Cereté", "Chima", "Chinú", "Ciénaga de Oro", "Cotorra", "La Apartada (Frontera)", "Lorica", "Los Córdobas", "Momil", "Montelíbano", "Monitos", "Planeta Rica", "Pueblo Nuevo", "Puerto Escondido", "Puerto Libertador", "Purísima", "Sahagún", "San Andrés Sotavento", "San Antero", "San Bernardo del Viento", "San Carlos", "San Pelayo", "Tierralta", "Valencia", "Agua de Dios", "Albán", "Anapoima", "Anolaima", "Arbeláez", "Beltrán", "Bituima", "Bojacá", "Cabrera", "Cachipay", "Cajicá", "Caparrapí", "Cáqueza", "Carmen de Carupa", "Chaguaní", "Chía", "Chipaque", "Choachí", "Chocontá", "Cogua", "Cota", "Cucunubá", "El Colegio", "El Peñón", "El Rosal", "Facatativá", "Fómeque", "Fosca ", "Funza", "Fúquene", "Fusagasugá", "Gachalá", "Gachancipá", "Gachetá", "Gama", "Girardot", "Granada", "Guachetá", "Guaduas", "Guasca", "Guataquí", "Guatavita", "Guayabal de Síquima", "Guayabetal", "Gutiérrez", "Jerusalén", "Junín", "La Calera", "La Mesa", "La Palma", "La Peña", "La Vega", "Lenguazaque", "Machetá", "Madrid", "Manta", "Medina", "Mosquera", "Nariño", "Nemocón", "Nilo", "Nimaima", "Nocaima", "Venecia (Ospina Pérez)", "Pacho", "Paime", "Pandi", "Paratebueno", "Pasca", "Puerto Salgar", "Pulí", "Quebradanegra", "Quetame", "Quipile", "Rafael", "Ricaurte", "San Antonio de Tequendama", "San Bernardo", "San Cayetano", "San Francisco", "San Juan de Rioseco", "Sasaima", "Sesquilé", "Sibate", "Silvania", "Simijaca", "Soacha", "Sopó", "Subachoque", "Suesca", "Supatá", "Susa", "Sutatausa", "Tabio", "Tausa", "Tena", "Tenjo", "Tibacuy", "Tibiritá", "Tocaima", "Tocancipá", "Topaipí", "Ubalá", "Ubaque", "Ubaté", "Une", "Útica", "Vergara", "Vianí", "Villagómez", "Villapinzón", "Villeta", "Viotá", "Yacopí", "Zipacón", "Zipaquirá", "Quibdó", "Acandí", "Alto Baudó (Pie de Pato)", "Atrato (Yuto)", "Bagadó", "Bahía Solano (Mútis)", "Bajo Baudó (Pizarro)", "Bojayá (Bellavista)", "Cantón de San Pablo", "Condoto", "El Carmen", "El Litoral de San Juan", "Itsmina", "Juradó", "Lloró", "Nóvita", "Nuquí", "Riosucio", "San José del Palmar", "Sipí", "Tadó", "Unguía", "Inírida", "San José del Guaviare", "Calamar", "El Retorno", "Miraflores", "Neiva", "Acevedo", "Agrado", "Aipe", "Algeciras", "Altamira", "Baraya", "Campoalegre", "Colombia", "Elías", "Garzón", "Gigante", "Guadalupe", "Hobo", "Iquira", "Isnos", "La Argentina", "La Plata", "Nátaga", "Oporapa", "Paicol", "Palermo", "Palestina", "Pital", "Pitalito", "Rivera", "Saladoblanco", "San Agustín", "Santa María", "Suazá", "Tarqui", "Tesalia", "Tello", "Teruel", "Timaná", "Villavieja", "Yaguará", "Riohacha", "Barrancas", "Dibulla", "Distracción", "El Molino", "Fonseca", "Hatonuevo", "Maicao", "Manaure", "San Juan del Cesar", "Uribía", "Urumita", "Villanueva", "Santa Marta", "Aracataca", "Ariguaní (El Difícil)", "Cerro San Antonio", "Chivolo", "Ciénaga", "El Banco", "El Piñón", "El Retén", "Fundación", "Guamal", "Pedraza", "Pijiño del Carmen", "Pivijay", "Plato", "Publoviejo", "Remolino", "Salamina", "San Sebastián de Buuenavista", "San Zenón", "Santa Ana", "Sitionuevo", "Tenerife", "Meta 50 Villavicencio", "Acacias", "Barranca de Upía", "Cabuyaro", "Castilla la Nueva", "Cubarral", "Cumaral", "El Calvario", "El Castillo", "El Dorado", "Fuente de Oro", "Granada", "Guamal", "Mapiripán", "Mesetas", "La Macarena", "La Uribe", "Lejanías", "Puerto Concordia", "Puerto Gaitán", "Puerto López", "Puerto Lleras", "Puerto Rico", "Restrepo", "San Carlos de Guaroa", "San Juan de Arama", "San Juanito", "San Martín", "Vistahermosa", "Pasto", "Albán (San José)", "Aldana", "Ancuyá", "Arboleda (Berruecos)", "Barbacoas", "Belén", "Buesaco", "Colón (Génova)", "Consacá", "Contadero", "Córdoba", "Cuaspud (Carlosama)", "Cumbal", "Cumbitará", "Chachagüi", "El Charco", "El Rosario", "El Tablón", "El Tambo", "Funes", "Guachucal", "Guaitarilla", "Gualmatán", "Iles", "Imúes", "Ipiales", "La Cruz", "La Florida", "La Llanada", "La Tola", "La Unión", "Leiva", "Linares", "Los Andes (Sotomayor)", "Magüí (Payán)", "Mallama (Piedrancha)", "Mosquera", "Olaya", "Ospina", "Francisco Pizarro", "Policarpa", "Potosí", "Providencia", "Puerres", "Pupiales", "Ricaurte", "Roberto Payán (San José)", "Samaniego", "Sandoná", "San Bernardo", "San Lorenzo", "San Pablo", "San Pedro de Cartago", "Santa Bárbara (Iscuandé)", "Santa Cruz (Guachávez)", "Sapuyés", "Taminango", "Tangua", "Tumaco", "Túquerres", "Yacuanquer", "Cúcuta", "Abrego", "Arboledas", "Bochalema", "Bucarasica", "Cácota", "Cáchira", "Chinácota", "Chitagá", "Convención", "Cucutilla", "Durania", "El Carmen", "El Tarra", "El Zulia", "Gramalote", "Hacarí", "Herrán", "Labateca", "La Esperanza", "La Playa", "Los Patios", "Lourdes", "Mutiscua", "Ocaña", "Pamplona", "Pamplonita", "Puerto Santander", "Ragonvalia", "Salazar", "San Calixto", "San Cayetano", "Santiago", "Sardinata", "Silos", "Teorama", "Tibú", "Toledo", "Villacaro", "Villa del Rosario", "Mocoa", "Colón", "Orito", "Puerto Asís", "Puerto Caicedo", "Puerto Guzmán", "Puerto Leguízamo", "Sibundoy", "San Francisco", "San Miguel", "Santiago", "Villa Gamuez (La Hormiga)", "Villa Garzón", "Quindío 63 Armenia", "Buenavista", "Calarcá", "Circasia", "Córdoba", "Filandia", "Génova", "La Tebaida", "Montenegro", "Pijao", "Quimbaya", "Salento", "Pereira", "Apía", "Balboa", "Belén de Umbría", "Dos Quebradas", "Guática", "La Celia", "La Virginia", "Marsella", "Mistrató", "Pueblo Rico", "Quinchia", "Santa Rosa de Cabal", "Santuario", "San Andrés 88\tSan Andrés", "Providencia", "Bucaramanga", "Aguada", "Albania", "Aratoca", "Barbosa", "Barichara", "Barrancabermeja", "Betulia", "Bolívar", "Cabrera", "California", "Capitanejo", "Carcasí", "Cepitá", "Cerrito", "Charalá", "Charta", "Chima", "Chipatá", "Cimitarra", "Concepción", "Confines", "Contratación", "Coromoro", "Curití", "El Carmen", "El Guacamayo", "El Peñón", "El Playón", "Encino", "Enciso", "Florián", "Floridablanca", "Galán", "Gámbita", "Girón", "Guaca", "Guadalupe", "Guapotá", "Guavata", "Guepsa", "Hato", "Jesús María", "Jordán", "La Belleza", "Landázuri", "La Paz", "Lebrija", "Los Santos", "Macaravita", "Málaga", "Matanza", "Mogotes", "Molagavita", "Ocamonte", "Oiba", "Onzága", "Palmar", "Palmas del Socorro", "Páramo", "Pie de Cuesta", "Pinchote", "Puente Nacional", "Puerto Parra", "Puerto Wilches", "Rionegro", "Sabana de Torres", "San Andrés", "San Benito", "San Gil", "San Joaquín", "San José de Miranda", "San Miguel", "San Vicente de Chucurí", "Santa Bárbara", "Santa Helena del Opón", "Simacota", "Socorro", "Suaita", "Sucre", "Suratá", "Tona", "Valle de San José", "Vélez", "Vetas", "Villanueva", "Zapatoca", "Sincelejo", "Buenavista", "Caimito", "Coloso (Ricaurte)", "Corozal", "Chalán", "Galeras (Nueva Granada)", "Guarandá", "La Unión", "Los Palmitos", "Majagual", "Morroa", "Ovejas", "Palmito", "Sampués", "San Benito Abad", "San Juan de Betulia", "San Marcos", "San Onofre", "San Pedro", "Sincé", "Sucre", "Tolú", "Toluviejo", "Ibagué", "Alpujarra", "Alvarado", "Ambalema", "Anzóategui", "Armero (Guayabal)", "Ataco", "Cajamarca", "Carmen de Apicalá", "Casabianca", "Chaparral", "Coello", "Coyaima", "Cunday", "Dolores", "Espinal", "Falán", "Flandes", "Fresno", "Guamo", "Herveo", "Honda", "Icononzo", "Lérida", "Líbano", "Mariquita", "Melgar", "Murillo", "Natagaima", "Ortega", "Palocabildo", "Piedras", "Planadas", "Prado", "Purificación", "Rioblanco", "Roncesvalles", "Rovira", "Saldaña", "San Antonio", "San Luis", "Santa Isabel", "Suárez", "Valle de San Juan", "Venadillo", "Villahermosa", "Villarrica", "Cali", "Alcalá", "Andalucía", "Ansermanuevo", "Argelia", "Bolívar", "Buenaventura", "Buga", "Bugalagrande", "Caicedonia", "Calima (Darién)", "Candelaria", "Cartago", "Dagua", "El Águila", "El Cairo", "El Cerrito", "El Dovio", "Florida", "Ginebra", "Guacarí", "Jamundí", "La Cumbre", "La Unión", "La Victoria", "Obando", "Palmira", "Pradera", "Restrepo", "Riofrío", "Roldanillo", "San Pedro", "Sevilla", "Toro", "Trujillo", "Tuluá", "Ulloa", "Versalles", "Vijes", "Yotoco", "Yumbo", "Zarzal", "Mitú", "Carurú", "Tatamá", "Vichada 99 Puerto Carreño", "La Primavera", "Santa Rosalia", "Cumaribo" }));
        getContentPane().add(municipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, -1, -1));
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 170, -1));

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 170, -1));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 170, -1));

        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularKeyTyped(evt);
            }
        });
        getContentPane().add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 170, -1));
        getContentPane().add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 159, 141, -1));

        jLabel2.setText("Cedula");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 76, 54, -1));

        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 105, 58, -1));

        jLabel4.setText("Apellido");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 136, 58, -1));

        jLabel5.setText("Fecha de Nacimiento");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 161, -1, -1));

        jLabel6.setText("Sexo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jLabel7.setText("Numero de Hijos");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 76, -1, -1));

        jLabel8.setText("Municipio");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 104, -1, -1));

        jLabel9.setText("Correo");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 168, -1, -1));

        jLabel10.setText("Direccion");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 136, -1, -1));

        jLabel11.setText("Telefono");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 199, -1, -1));

        jLabel12.setText("Celular");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 233, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Ingrese  los Datos del Cliente");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 11, 275, 40));

        txtHijos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHijosKeyTyped(evt);
            }
        });
        getContentPane().add(txtHijos, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 170, -1));

        jLabel14.setText("Estado CIvil");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        civil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Soltero ", "Casado ", "Divorciado ", "Viudo" }));
        getContentPane().add(civil, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 224, 141, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminar.setToolTipText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 60, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        jButton2.setToolTipText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 70, -1));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png"))); // NOI18N
        btnActualizar.setToolTipText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 60, -1));

        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/promociones.png"))); // NOI18N
        jToggleButton2.setSelected(true);
        jToggleButton2.setToolTipText("Promociones");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 40, 130, 100));

        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Encuestas.png"))); // NOI18N
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 150, 130, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        desbloquear();
        txtCedula.requestFocus();
        
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        bloquear();
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
 try {
        int filaMod=tablaCliente.getSelectedRow();
        if(filaMod==-1)
        {
        JOptionPane.showMessageDialog(null, "Seleccione alguna fila");
        }
        else
        {
        
        btnModificar.setEnabled(true);
        String cod=(String)tablaCliente.getValueAt(filaMod, 0);
        desbloquear();
        BuscarClienteEditar(cod);
        }
    } catch (Exception e) {
    }        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        txtCedula.transferFocus();
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
         txtNombre.transferFocus();
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
         txtApellido.transferFocus();
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
     
        //Este campo envia el dato que realiza la busqueda en la base con nombre y apellido del cliente
        cargar(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
        
      //  Reporte r= new Reporte();
      //   r.mostrarReporte();
         Reporte r=new Reporte();
        try {
            r.mostrarReporte();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ocurrio un error.. "+e.getMessage());
        }
        
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        conectar cc = new conectar();
        Connection cn = cc.conexion();
        int filasel= tablaCliente.getSelectedRow();
       try {
           if(filasel==-1)
           {
            JOptionPane.showMessageDialog(null, "Seleccione algun dato");
           }
           else
           {
             String  ced=(String)tablaCliente.getValueAt(filasel, 0);
             String eliminarSQL="DELETE FROM cliente WHERE Cedula = '"+ced+"'";
             try {
             PreparedStatement pst  = cn.prepareStatement(eliminarSQL);
          pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Borrado");
            cargar("");
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // Abrio al conexion
        conectar cc = new conectar();
        Connection cn = cc.conexion();
        //Sql que me identifica cual es el usario que debo modificar
        String sql="UPDATE cliente SET Nombre = '"+txtNombre.getText()+"',Apellido ='"+txtApellido.getText()+"',Sexo = '"+String.valueOf(sexo.getSelectedItem())+"',Ecivil = '"+String.valueOf(civil.getSelectedItem())+"',Nhijos ='"+txtHijos.getText()+"',Municipio = '"+String.valueOf(municipio.getSelectedItem())+"',Direccion ='"+txtDireccion.getText()+"',Email ='"+txtEmail.getText()+"',Telefono ='"+txtTelefono.getText()+"',Celular ='"+txtCelular.getText()+"' WHERE Cedula = '"+txtCedula.getText()+"'" ; 
    try {
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.executeUpdate();
       JOptionPane.showMessageDialog(null, "Actualizado");
       cargar("");
       bloquear();
       limpiar();
    } catch (Exception e) {
         JOptionPane.showMessageDialog(null, e);
    }
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        // TODO add your handling code here:
        //Encuesta menu=new Encuesta();
        //menu.show();
        //menu.setExtendedState(new Encuesta().NORMAL);        
     
        
         int  fila = tablaCliente.getSelectedRow();
         
        if(fila==-1)
         {
             JOptionPane.showMessageDialog(null, "No  ha seleccionado ningun registro");
         }
         
         else
          {
          // Se envia la primera fila    
          String codins=tablaCliente.getValueAt(fila, 0).toString();
          //se asigna a la caja Cedu el valos de fila 0
          Encuesta.Cedu.setText(codins);
     
          }
             
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
         Promocion menu=new Promocion();
         menu.show();
         menu.setExtendedState(new Promocion().NORMAL);
         this.setVisible(false);
             
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        // Realizamos la conexion con la base datos
        conectar cc = new conectar();
        Connection cn = cc.conexion();
        String ced,nom,ape,sex,fechaN,ecivil,nhijos,municipios,direccion,email,telefono,celular;
        String sql="";
        //Obtenemos los valores de los campos
        ced = txtCedula.getText();
        nom = txtNombre.getText();
        ape = txtApellido.getText();
        // Realizamos el cambio de formato de la fecha , esto con el fin de que no aparezca la hora
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date fechaSeleccionada = fecha.getDate();
        fechaN = String.valueOf(formato.format(fechaSeleccionada));
        sex = String.valueOf(sexo.getSelectedItem());
        ecivil = String.valueOf(civil.getSelectedItem());
        nhijos = txtHijos.getText();
        municipios = String.valueOf(municipio.getSelectedItem());
        direccion = txtDireccion.getText();
        email = txtEmail.getText();
        telefono = txtTelefono.getText();
        celular = txtCelular.getText();

        sql = "insert into cliente (Cedula,Nombre,Apellido,Sexo,FchNacimiento,Ecivil,Nhijos,Municipio,Direccion,Email,Telefono,Celular) values (?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1,ced);
            pst.setString(2,nom);
            pst.setString(3,ape);
            pst.setString(4,sex);
            pst.setString(5,fechaN);
            pst.setString(6,ecivil);
            pst.setString(7,nhijos);
            pst.setString(8,municipios);
            pst.setString(9,direccion);
            pst.setString(10,email);
            pst.setString(11,telefono);
            pst.setString(12,celular);

            int n = pst.executeUpdate();
            if (n>0){
                JOptionPane.showMessageDialog(null,"Registro Guardado");
                bloquear();
                cargar("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtHijosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHijosKeyTyped
        // TODO add your handling code here:
          if(!val.TeclaEntero(txtHijos.getText(), evt)){
           evt.consume();
           JOptionPane.showMessageDialog(this, "Debe digitar solo números");
        }        
        
    }//GEN-LAST:event_txtHijosKeyTyped

    private void txtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyTyped
        // TODO add your handling code here:
          if(!val.TeclaEntero(txtCelular.getText(), evt)){
           evt.consume();
           JOptionPane.showMessageDialog(this, "Debe digitar solo números");
        }        
    }//GEN-LAST:event_txtCelularKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailKeyTyped
 
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
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JToggleButton btnGuardar;
    private javax.swing.JToggleButton btnModificar;
    private javax.swing.JToggleButton btnNuevo;
    private javax.swing.JComboBox civil;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JComboBox municipio;
    private javax.swing.JComboBox sexo;
    public javax.swing.JTable tablaCliente;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHijos;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
