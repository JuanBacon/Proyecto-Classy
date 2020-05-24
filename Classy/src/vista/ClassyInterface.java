
package vista;
//Controles
import control.ControlEstudiante;
import control.ControlProfesor;
import control.ControlPais;
//Modelos
import modelo.Estudiante;
import modelo.Profesor;
import modelo.Pais;
//Utilidades
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//Fechas
 
public class ClassyInterface extends javax.swing.JFrame {

    //Creacion de listas
    LinkedList<Pais> lPais;
    
    
    public ClassyInterface() {
        initComponents();
        
        //Instancia de listas
        lPais=new LinkedList<>();
        
        
        
        //Determinar visibilidad inicial de los paneles
        panelInicio.setVisible(true);
        //Estudiante
        panelRegistroEstudiante.setVisible(false);
        panelInicioEstudiante.setVisible(false);
        //Profesor
        panelInicioProfesor.setVisible(false);
        panelRegistroProfesor.setVisible(false);
        //Rol
        panelRolRegistro.setVisible(false);
        panelRolIngreso.setVisible(false);
        //Publicaciones
        panelPublicacionesEstudiante.setVisible(false);
        panelPublicacionesProfesor.setVisible(false);
        //cursos
        panelCursosEstudiante.setVisible(false);
        panelCursosProfesor.setVisible(false);
        
        //Botones
        //PANEL DE INICIO
        ButtonIngresarInicio.setOpaque(false);
        ButtonIngresarInicio.setContentAreaFilled(false); //Hacer el contenido Trasnparente
        ButtonIngresarInicio.setBorderPainted(false);
        
        ButtonRegistrarInicio.setOpaque(false);
        ButtonRegistrarInicio.setContentAreaFilled(false); 
        ButtonRegistrarInicio.setBorderPainted(false);
        
        //PANEL ROL REGISTRO
        ButtonRegistroEstudiante.setOpaque(false);
        ButtonRegistroEstudiante.setContentAreaFilled(false); 
        ButtonRegistroEstudiante.setBorderPainted(false);
                
        ButtonRegistroProfesor.setOpaque(false);
        ButtonRegistroProfesor.setContentAreaFilled(false); 
        ButtonRegistroProfesor.setBorderPainted(false);
        
        ButtonVolverRol.setOpaque(false);
        ButtonVolverRol.setContentAreaFilled(false); 
        ButtonVolverRol.setBorderPainted(false);
        
        //PANEL REGISTRAR ESTUDIANTE
        ButtonVolverRegistroEstudiante.setOpaque(false);
        ButtonVolverRegistroEstudiante.setContentAreaFilled(false); 
        ButtonVolverRegistroEstudiante.setBorderPainted(false);
        
        ButtonRegistrarEstudiante.setOpaque(false);
        ButtonRegistrarEstudiante.setContentAreaFilled(false); 
        ButtonRegistrarEstudiante.setBorderPainted(false);
        
        //PANEL REGISTRAR PROFESOR
        ButtonRegistrarProfesor.setOpaque(false);
        ButtonRegistrarProfesor.setContentAreaFilled(false); 
        ButtonRegistrarProfesor.setBorderPainted(false);
        
        
        ButtonVolverRegistroProfesor.setOpaque(false);
        ButtonVolverRegistroProfesor.setContentAreaFilled(false); 
        ButtonVolverRegistroProfesor.setBorderPainted(false);
        
        
    }

   
    
    //NO TOCAR
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInicio = new javax.swing.JPanel();
        ButtonIngresarInicio = new javax.swing.JButton();
        ButtonRegistrarInicio = new javax.swing.JButton();
        imgInicio = new javax.swing.JLabel();
        panelRegistroEstudiante = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ButtonRegistrarEstudiante = new javax.swing.JButton();
        ButtonVolverRegistroEstudiante = new javax.swing.JButton();
        jTnombre1Estudiante = new javax.swing.JTextField();
        jTapellido1Estudiante = new javax.swing.JTextField();
        jTcorreoEstudiante = new javax.swing.JTextField();
        jTnombre2Estudiante = new javax.swing.JTextField();
        jTapellido2Estudiante = new javax.swing.JTextField();
        jTcontraseñaEstudiante = new javax.swing.JPasswordField();
        jDateNacimientoEstudiante = new com.toedter.calendar.JDateChooser();
        imgRegistroEstudiante = new javax.swing.JLabel();
        panelRegistroProfesor = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTnombre1Profesor = new javax.swing.JTextField();
        jTapellido1Profesor = new javax.swing.JTextField();
        jTcorreoProfesor = new javax.swing.JTextField();
        jTnombre2Profesor = new javax.swing.JTextField();
        jTapellido2Profesor = new javax.swing.JTextField();
        jTdireccionProfesor = new javax.swing.JTextField();
        jTcontraseñaProfesor = new javax.swing.JPasswordField();
        jCpaisProfesor = new javax.swing.JComboBox<>();
        ButtonRegistrarProfesor = new javax.swing.JButton();
        ButtonVolverRegistroProfesor = new javax.swing.JButton();
        imgRegistroProfesor = new javax.swing.JLabel();
        panelInicioEstudiante = new javax.swing.JPanel();
        imgInicioEstudiante = new javax.swing.JLabel();
        panelInicioProfesor = new javax.swing.JPanel();
        imgInicioProfesor = new javax.swing.JLabel();
        panelRolIngreso = new javax.swing.JPanel();
        imgRolIngreso = new javax.swing.JLabel();
        panelRolRegistro = new javax.swing.JPanel();
        ButtonRegistroEstudiante = new javax.swing.JButton();
        ButtonRegistroProfesor = new javax.swing.JButton();
        ButtonVolverRol = new javax.swing.JButton();
        imgRolRegistro = new javax.swing.JLabel();
        panelCursosEstudiante = new javax.swing.JPanel();
        imgCursosEstudiante = new javax.swing.JLabel();
        panelCursosProfesor = new javax.swing.JPanel();
        imgCursosProfesor = new javax.swing.JLabel();
        panelPublicacionesEstudiante = new javax.swing.JPanel();
        imgPublicacionesEstudiante = new javax.swing.JLabel();
        panelPublicacionesProfesor = new javax.swing.JPanel();
        imgPublicacionesProfesor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Classy!");
        setMaximumSize(new java.awt.Dimension(1940, 1100));
        setMinimumSize(new java.awt.Dimension(1940, 1100));
        setPreferredSize(new java.awt.Dimension(1940, 1100));
        setResizable(false);
        getContentPane().setLayout(null);

        panelInicio.setBackground(new java.awt.Color(204, 204, 204));
        panelInicio.setMaximumSize(new java.awt.Dimension(1920, 1080));
        panelInicio.setMinimumSize(new java.awt.Dimension(1920, 1080));
        panelInicio.setPreferredSize(new java.awt.Dimension(1920, 1080));
        panelInicio.setLayout(null);

        ButtonIngresarInicio.setBackground(new java.awt.Color(255, 255, 255));
        ButtonIngresarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonIngresarInicioActionPerformed(evt);
            }
        });
        panelInicio.add(ButtonIngresarInicio);
        ButtonIngresarInicio.setBounds(730, 780, 460, 100);

        ButtonRegistrarInicio.setBackground(new java.awt.Color(255, 255, 255));
        ButtonRegistrarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegistrarInicioActionPerformed(evt);
            }
        });
        panelInicio.add(ButtonRegistrarInicio);
        ButtonRegistrarInicio.setBounds(730, 910, 460, 100);

        imgInicio.setBackground(new java.awt.Color(96, 3, 3));
        imgInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Entrada 1.2.png"))); // NOI18N
        panelInicio.add(imgInicio);
        imgInicio.setBounds(0, 0, 1920, 1080);

        getContentPane().add(panelInicio);
        panelInicio.setBounds(10, 11, 1920, 1080);

        panelRegistroEstudiante.setBackground(new java.awt.Color(204, 204, 204));
        panelRegistroEstudiante.setMaximumSize(new java.awt.Dimension(1920, 1080));
        panelRegistroEstudiante.setMinimumSize(new java.awt.Dimension(1920, 1080));
        panelRegistroEstudiante.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Montserrat", 3, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(110, 54, 32));
        jLabel1.setText("Segundo Nombre");
        panelRegistroEstudiante.add(jLabel1);
        jLabel1.setBounds(1080, 390, 330, 50);

        jLabel2.setFont(new java.awt.Font("Montserrat", 3, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(110, 54, 32));
        jLabel2.setText("Primer Nombre*");
        panelRegistroEstudiante.add(jLabel2);
        jLabel2.setBounds(340, 390, 290, 50);

        jLabel3.setFont(new java.awt.Font("Montserrat", 3, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(110, 54, 32));
        jLabel3.setText("Segundo Apellido");
        panelRegistroEstudiante.add(jLabel3);
        jLabel3.setBounds(1080, 500, 330, 50);

        jLabel4.setFont(new java.awt.Font("Montserrat", 3, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(110, 54, 32));
        jLabel4.setText("Primer Apellido*");
        panelRegistroEstudiante.add(jLabel4);
        jLabel4.setBounds(340, 500, 290, 50);

        jLabel5.setFont(new java.awt.Font("Montserrat", 3, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(110, 54, 32));
        jLabel5.setText("Fecha Nacimiento*");
        panelRegistroEstudiante.add(jLabel5);
        jLabel5.setBounds(1080, 600, 330, 50);

        jLabel6.setFont(new java.awt.Font("Montserrat", 3, 26)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(110, 54, 32));
        jLabel6.setText("Correo electrónico*");
        panelRegistroEstudiante.add(jLabel6);
        jLabel6.setBounds(340, 600, 290, 50);

        jLabel7.setFont(new java.awt.Font("Montserrat", 3, 26)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(110, 54, 32));
        jLabel7.setText("Contraseña*");
        panelRegistroEstudiante.add(jLabel7);
        jLabel7.setBounds(340, 710, 290, 50);

        ButtonRegistrarEstudiante.setBackground(new java.awt.Color(153, 0, 0));
        ButtonRegistrarEstudiante.setAlignmentY(0.0F);
        ButtonRegistrarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegistrarEstudianteActionPerformed(evt);
            }
        });
        panelRegistroEstudiante.add(ButtonRegistrarEstudiante);
        ButtonRegistrarEstudiante.setBounds(830, 910, 260, 100);

        ButtonVolverRegistroEstudiante.setBackground(new java.awt.Color(153, 0, 0));
        ButtonVolverRegistroEstudiante.setAlignmentY(0.0F);
        ButtonVolverRegistroEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVolverRegistroEstudianteActionPerformed(evt);
            }
        });
        panelRegistroEstudiante.add(ButtonVolverRegistroEstudiante);
        ButtonVolverRegistroEstudiante.setBounds(1580, 910, 260, 100);

        jTnombre1Estudiante.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jTnombre1Estudiante.setToolTipText("Tu primer nombre");
        panelRegistroEstudiante.add(jTnombre1Estudiante);
        jTnombre1Estudiante.setBounds(340, 440, 520, 50);

        jTapellido1Estudiante.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jTapellido1Estudiante.setToolTipText("Tu primer apellido");
        panelRegistroEstudiante.add(jTapellido1Estudiante);
        jTapellido1Estudiante.setBounds(340, 547, 520, 50);

        jTcorreoEstudiante.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jTcorreoEstudiante.setToolTipText("Tu correo electrónico");
        jTcorreoEstudiante.setAlignmentY(0.0F);
        panelRegistroEstudiante.add(jTcorreoEstudiante);
        jTcorreoEstudiante.setBounds(340, 655, 520, 50);

        jTnombre2Estudiante.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jTnombre2Estudiante.setToolTipText("Tu segundo nombre");
        panelRegistroEstudiante.add(jTnombre2Estudiante);
        jTnombre2Estudiante.setBounds(1080, 440, 520, 50);

        jTapellido2Estudiante.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jTapellido2Estudiante.setToolTipText("Tu segundo apellido");
        panelRegistroEstudiante.add(jTapellido2Estudiante);
        jTapellido2Estudiante.setBounds(1080, 547, 520, 50);

        jTcontraseñaEstudiante.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        panelRegistroEstudiante.add(jTcontraseñaEstudiante);
        jTcontraseñaEstudiante.setBounds(341, 760, 520, 50);

        jDateNacimientoEstudiante.setToolTipText("Tu hecha de nacimiento");
        panelRegistroEstudiante.add(jDateNacimientoEstudiante);
        jDateNacimientoEstudiante.setBounds(1080, 655, 520, 50);

        imgRegistroEstudiante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgRegistroEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Registro Estudiante1.0.png"))); // NOI18N
        panelRegistroEstudiante.add(imgRegistroEstudiante);
        imgRegistroEstudiante.setBounds(10, 0, 1920, 1080);

        getContentPane().add(panelRegistroEstudiante);
        panelRegistroEstudiante.setBounds(10, 11, 1920, 1080);

        panelRegistroProfesor.setBackground(new java.awt.Color(204, 204, 204));
        panelRegistroProfesor.setMaximumSize(new java.awt.Dimension(1920, 1080));
        panelRegistroProfesor.setMinimumSize(new java.awt.Dimension(1920, 1080));
        panelRegistroProfesor.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Montserrat", 3, 26)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(110, 54, 32));
        jLabel8.setText("Segundo Nombre");
        panelRegistroProfesor.add(jLabel8);
        jLabel8.setBounds(1080, 390, 330, 50);

        jLabel9.setFont(new java.awt.Font("Montserrat", 3, 26)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(110, 54, 32));
        jLabel9.setText("Primer Nombre*");
        panelRegistroProfesor.add(jLabel9);
        jLabel9.setBounds(340, 390, 290, 50);

        jLabel10.setFont(new java.awt.Font("Montserrat", 3, 26)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(110, 54, 32));
        jLabel10.setText("Segundo Apellido");
        panelRegistroProfesor.add(jLabel10);
        jLabel10.setBounds(1080, 500, 330, 50);

        jLabel11.setFont(new java.awt.Font("Montserrat", 3, 26)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(110, 54, 32));
        jLabel11.setText("Primer Apellido*");
        panelRegistroProfesor.add(jLabel11);
        jLabel11.setBounds(340, 500, 290, 50);

        jLabel12.setFont(new java.awt.Font("Montserrat", 3, 26)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(110, 54, 32));
        jLabel12.setText("Dirección*");
        panelRegistroProfesor.add(jLabel12);
        jLabel12.setBounds(1080, 600, 330, 50);

        jLabel13.setFont(new java.awt.Font("Montserrat", 3, 26)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(110, 54, 32));
        jLabel13.setText("Correo electrónico*");
        panelRegistroProfesor.add(jLabel13);
        jLabel13.setBounds(340, 600, 290, 50);

        jLabel14.setFont(new java.awt.Font("Montserrat", 3, 26)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(110, 54, 32));
        jLabel14.setText("Contraseña*");
        panelRegistroProfesor.add(jLabel14);
        jLabel14.setBounds(340, 710, 290, 50);

        jLabel15.setFont(new java.awt.Font("Montserrat", 3, 26)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(110, 54, 32));
        jLabel15.setText("País*");
        panelRegistroProfesor.add(jLabel15);
        jLabel15.setBounds(1080, 710, 290, 50);

        jTnombre1Profesor.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jTnombre1Profesor.setToolTipText("Tu primer nombre");
        panelRegistroProfesor.add(jTnombre1Profesor);
        jTnombre1Profesor.setBounds(340, 440, 520, 50);
        jTnombre1Profesor.getAccessibleContext().setAccessibleName("");

        jTapellido1Profesor.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jTapellido1Profesor.setToolTipText("Tu primer apellido");
        panelRegistroProfesor.add(jTapellido1Profesor);
        jTapellido1Profesor.setBounds(340, 547, 520, 50);

        jTcorreoProfesor.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jTcorreoProfesor.setToolTipText("Tu correo electrónico");
        jTcorreoProfesor.setAlignmentY(0.0F);
        panelRegistroProfesor.add(jTcorreoProfesor);
        jTcorreoProfesor.setBounds(340, 655, 520, 50);

        jTnombre2Profesor.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jTnombre2Profesor.setToolTipText("Tu segundo nombre");
        panelRegistroProfesor.add(jTnombre2Profesor);
        jTnombre2Profesor.setBounds(1080, 440, 520, 50);

        jTapellido2Profesor.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jTapellido2Profesor.setToolTipText("Tu segundo apellido");
        panelRegistroProfesor.add(jTapellido2Profesor);
        jTapellido2Profesor.setBounds(1080, 547, 520, 50);

        jTdireccionProfesor.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jTdireccionProfesor.setToolTipText("Tu segundo apellido");
        panelRegistroProfesor.add(jTdireccionProfesor);
        jTdireccionProfesor.setBounds(1080, 655, 520, 50);

        jTcontraseñaProfesor.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        panelRegistroProfesor.add(jTcontraseñaProfesor);
        jTcontraseñaProfesor.setBounds(341, 760, 520, 50);

        jCpaisProfesor.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        panelRegistroProfesor.add(jCpaisProfesor);
        jCpaisProfesor.setBounds(1080, 760, 520, 50);

        ButtonRegistrarProfesor.setBackground(new java.awt.Color(153, 0, 0));
        ButtonRegistrarProfesor.setAlignmentY(0.0F);
        ButtonRegistrarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegistrarProfesorActionPerformed(evt);
            }
        });
        panelRegistroProfesor.add(ButtonRegistrarProfesor);
        ButtonRegistrarProfesor.setBounds(830, 910, 260, 100);

        ButtonVolverRegistroProfesor.setBackground(new java.awt.Color(153, 0, 0));
        ButtonVolverRegistroProfesor.setAlignmentY(0.0F);
        ButtonVolverRegistroProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVolverRegistroProfesorActionPerformed(evt);
            }
        });
        panelRegistroProfesor.add(ButtonVolverRegistroProfesor);
        ButtonVolverRegistroProfesor.setBounds(1580, 910, 260, 100);

        imgRegistroProfesor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgRegistroProfesor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Registro 1.0.png"))); // NOI18N
        panelRegistroProfesor.add(imgRegistroProfesor);
        imgRegistroProfesor.setBounds(10, 0, 1920, 1080);

        getContentPane().add(panelRegistroProfesor);
        panelRegistroProfesor.setBounds(10, 11, 1920, 1080);

        panelInicioEstudiante.setBackground(new java.awt.Color(204, 204, 204));
        panelInicioEstudiante.setMaximumSize(new java.awt.Dimension(1920, 1080));
        panelInicioEstudiante.setMinimumSize(new java.awt.Dimension(1920, 1080));
        panelInicioEstudiante.setLayout(null);

        imgInicioEstudiante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgInicioEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Ingreso 1.0.png"))); // NOI18N
        panelInicioEstudiante.add(imgInicioEstudiante);
        imgInicioEstudiante.setBounds(0, 0, 1920, 1080);

        getContentPane().add(panelInicioEstudiante);
        panelInicioEstudiante.setBounds(10, 11, 1920, 1080);

        panelInicioProfesor.setBackground(new java.awt.Color(204, 204, 204));
        panelInicioProfesor.setMaximumSize(new java.awt.Dimension(1920, 1080));
        panelInicioProfesor.setMinimumSize(new java.awt.Dimension(1920, 1080));
        panelInicioProfesor.setLayout(null);

        imgInicioProfesor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgInicioProfesor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Ingreso 1.0.png"))); // NOI18N
        panelInicioProfesor.add(imgInicioProfesor);
        imgInicioProfesor.setBounds(0, 0, 1920, 1080);

        getContentPane().add(panelInicioProfesor);
        panelInicioProfesor.setBounds(10, 11, 1920, 1080);

        panelRolIngreso.setBackground(new java.awt.Color(204, 204, 204));
        panelRolIngreso.setMaximumSize(new java.awt.Dimension(1920, 1080));
        panelRolIngreso.setMinimumSize(new java.awt.Dimension(1920, 1080));
        panelRolIngreso.setLayout(null);

        imgRolIngreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgRolIngreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Rol 1.1.png"))); // NOI18N
        panelRolIngreso.add(imgRolIngreso);
        imgRolIngreso.setBounds(0, 0, 1920, 1080);

        getContentPane().add(panelRolIngreso);
        panelRolIngreso.setBounds(10, 11, 1920, 1080);

        panelRolRegistro.setBackground(new java.awt.Color(204, 204, 204));
        panelRolRegistro.setMaximumSize(new java.awt.Dimension(1920, 1080));
        panelRolRegistro.setMinimumSize(new java.awt.Dimension(1920, 1080));
        panelRolRegistro.setLayout(null);

        ButtonRegistroEstudiante.setBackground(new java.awt.Color(153, 0, 0));
        ButtonRegistroEstudiante.setAlignmentY(0.0F);
        ButtonRegistroEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegistroEstudianteActionPerformed(evt);
            }
        });
        panelRolRegistro.add(ButtonRegistroEstudiante);
        ButtonRegistroEstudiante.setBounds(1070, 570, 400, 60);

        ButtonRegistroProfesor.setBackground(new java.awt.Color(153, 0, 0));
        ButtonRegistroProfesor.setAlignmentY(0.0F);
        ButtonRegistroProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegistroProfesorActionPerformed(evt);
            }
        });
        panelRolRegistro.add(ButtonRegistroProfesor);
        ButtonRegistroProfesor.setBounds(530, 570, 400, 60);

        ButtonVolverRol.setBackground(new java.awt.Color(153, 0, 0));
        ButtonVolverRol.setAlignmentY(0.0F);
        ButtonVolverRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVolverRolActionPerformed(evt);
            }
        });
        panelRolRegistro.add(ButtonVolverRol);
        ButtonVolverRol.setBounds(1580, 910, 250, 100);

        imgRolRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgRolRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Rol 1.1.png"))); // NOI18N
        panelRolRegistro.add(imgRolRegistro);
        imgRolRegistro.setBounds(0, 0, 1920, 1080);

        getContentPane().add(panelRolRegistro);
        panelRolRegistro.setBounds(10, 11, 1920, 1080);

        panelCursosEstudiante.setBackground(new java.awt.Color(204, 204, 204));
        panelCursosEstudiante.setMaximumSize(new java.awt.Dimension(1920, 1080));
        panelCursosEstudiante.setMinimumSize(new java.awt.Dimension(1920, 1080));
        panelCursosEstudiante.setLayout(null);

        imgCursosEstudiante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgCursosEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cursos estudiante 1.0.png"))); // NOI18N
        panelCursosEstudiante.add(imgCursosEstudiante);
        imgCursosEstudiante.setBounds(0, 0, 1920, 1080);

        getContentPane().add(panelCursosEstudiante);
        panelCursosEstudiante.setBounds(10, 11, 1920, 1080);

        panelCursosProfesor.setBackground(new java.awt.Color(204, 204, 204));
        panelCursosProfesor.setMaximumSize(new java.awt.Dimension(1920, 1080));
        panelCursosProfesor.setMinimumSize(new java.awt.Dimension(1920, 1080));
        panelCursosProfesor.setLayout(null);

        imgCursosProfesor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgCursosProfesor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cursos  profesor 1.0.png"))); // NOI18N
        panelCursosProfesor.add(imgCursosProfesor);
        imgCursosProfesor.setBounds(0, 0, 1920, 1080);

        getContentPane().add(panelCursosProfesor);
        panelCursosProfesor.setBounds(10, 11, 1920, 1080);

        panelPublicacionesEstudiante.setBackground(new java.awt.Color(204, 204, 204));
        panelPublicacionesEstudiante.setMaximumSize(new java.awt.Dimension(1920, 1080));
        panelPublicacionesEstudiante.setMinimumSize(new java.awt.Dimension(1920, 1080));
        panelPublicacionesEstudiante.setLayout(null);

        imgPublicacionesEstudiante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgPublicacionesEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Publicaciones estudiante 1.0 .png"))); // NOI18N
        panelPublicacionesEstudiante.add(imgPublicacionesEstudiante);
        imgPublicacionesEstudiante.setBounds(0, 0, 1920, 1080);

        getContentPane().add(panelPublicacionesEstudiante);
        panelPublicacionesEstudiante.setBounds(10, 11, 1920, 1080);

        panelPublicacionesProfesor.setBackground(new java.awt.Color(204, 204, 204));
        panelPublicacionesProfesor.setMaximumSize(new java.awt.Dimension(1920, 1080));
        panelPublicacionesProfesor.setMinimumSize(new java.awt.Dimension(1920, 1080));
        panelPublicacionesProfesor.setLayout(null);

        imgPublicacionesProfesor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgPublicacionesProfesor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Publicacion profesor 1.0.png"))); // NOI18N
        panelPublicacionesProfesor.add(imgPublicacionesProfesor);
        imgPublicacionesProfesor.setBounds(0, 0, 1920, 1080);

        getContentPane().add(panelPublicacionesProfesor);
        panelPublicacionesProfesor.setBounds(10, 11, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonIngresarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonIngresarInicioActionPerformed
       
        //Determinar visibilidad de los paneles
        panelInicio.setVisible(false);
        //Estudiante
        panelRegistroEstudiante.setVisible(false);
        panelInicioEstudiante.setVisible(false);
        //Profesor
        panelInicioProfesor.setVisible(false);
        panelRegistroProfesor.setVisible(false);
        //Rol
        panelRolRegistro.setVisible(false);
        panelRolIngreso.setVisible(true);
        //Publicaciones
        panelPublicacionesEstudiante.setVisible(false);
        panelPublicacionesProfesor.setVisible(false);
        //cursos
        panelCursosEstudiante.setVisible(false);
        panelCursosProfesor.setVisible(false);
        
    }//GEN-LAST:event_ButtonIngresarInicioActionPerformed

    private void ButtonRegistrarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegistrarInicioActionPerformed
        //Determinar visibilidad de los paneles
        panelInicio.setVisible(false);
        //Estudiante
        panelRegistroEstudiante.setVisible(false);
        panelInicioEstudiante.setVisible(false);
        //Profesor
        panelInicioProfesor.setVisible(false);
        panelRegistroProfesor.setVisible(false);
        //Rol
        panelRolRegistro.setVisible(true);
        panelRolIngreso.setVisible(false);
        //Publicaciones
        panelPublicacionesEstudiante.setVisible(false);
        panelPublicacionesProfesor.setVisible(false);
        //cursos
        panelCursosEstudiante.setVisible(false);
        panelCursosProfesor.setVisible(false);
    }//GEN-LAST:event_ButtonRegistrarInicioActionPerformed

    private void ButtonVolverRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVolverRolActionPerformed
      
        volverMenuInicial();
        
    }//GEN-LAST:event_ButtonVolverRolActionPerformed

    private void ButtonRegistroEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegistroEstudianteActionPerformed
        panelInicio.setVisible(false);
        //Estudiante
        panelRegistroEstudiante.setVisible(true);
        panelInicioEstudiante.setVisible(false);
        //Profesor
        panelInicioProfesor.setVisible(false);
        panelRegistroProfesor.setVisible(false);
        //Rol
        panelRolRegistro.setVisible(false);
        panelRolIngreso.setVisible(false);
        //Publicaciones
        panelPublicacionesEstudiante.setVisible(false);
        panelPublicacionesProfesor.setVisible(false);
        //cursos
        panelCursosEstudiante.setVisible(false);
        panelCursosProfesor.setVisible(false);
        
        
    }//GEN-LAST:event_ButtonRegistroEstudianteActionPerformed

    private void ButtonVolverRegistroEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVolverRegistroEstudianteActionPerformed
        volverMenuInicial();
        limpiarCamposRegistroEstudiante();
    }//GEN-LAST:event_ButtonVolverRegistroEstudianteActionPerformed

    private void ButtonRegistrarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegistrarEstudianteActionPerformed
        
        
        //Validacion de campos
        if(jTnombre1Estudiante.getText().isEmpty() || jTapellido1Estudiante.getText().isEmpty() || jDateNacimientoEstudiante.getDate() == null || jTcorreoEstudiante.getText().isEmpty() || jTcontraseñaEstudiante.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Por favor llena todos los campos obligatorios");
        }else{
            
        ControlEstudiante objce = new ControlEstudiante();
        
        java.util.Date date;
        java.sql.Date fechaNacimiento;
        date = jDateNacimientoEstudiante.getDate();
        fechaNacimiento = new java.sql.Date(date.getTime());
        //System.out.print(fechaNacimiento); //Imprime la fecha de nacimiento seleccionada
        String nombre1 = jTnombre1Estudiante.getText();
        String nombre2 = jTnombre2Estudiante.getText();
        String apellido1 = jTapellido1Estudiante.getText();
        String apellido2 = jTapellido2Estudiante.getText();
        String correo = jTcorreoEstudiante.getText();
        String contraseña = jTcontraseñaEstudiante.getText();
        
        Estudiante ee = new Estudiante(nombre1,nombre2,apellido1,apellido2,correo,fechaNacimiento,contraseña);

        
        boolean t = objce.insertarEstudiante(ee);
            if (t) {
                JOptionPane.showMessageDialog(rootPane, "Insertado un estudiante a la base de datos");
            }else{
                JOptionPane.showMessageDialog(rootPane, "No se incerto a la base de datos");
            }
        //System.out.print("Insertado un estudiante a la base de datos"); //Mensaje de verificacion en consola
         limpiarCamposRegistroEstudiante();
         volverMenuInicial();
        }
        
        
    }//GEN-LAST:event_ButtonRegistrarEstudianteActionPerformed

    private void ButtonRegistroProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegistroProfesorActionPerformed
        panelInicio.setVisible(false);
        //Estudiante
        panelRegistroEstudiante.setVisible(false);
        panelInicioEstudiante.setVisible(false);
        //Profesor
        panelInicioProfesor.setVisible(false);
        panelRegistroProfesor.setVisible(true);
        //Rol
        panelRolRegistro.setVisible(false);
        panelRolIngreso.setVisible(false);
        //Publicaciones
        panelPublicacionesEstudiante.setVisible(false);
        panelPublicacionesProfesor.setVisible(false);
        //cursos
        panelCursosEstudiante.setVisible(false);
        panelCursosProfesor.setVisible(false);
        
        
        ControlPais objcpais = new ControlPais();
        lPais = objcpais.consultarPaises();
        
        for (int j = 0; j < lPais.size(); j++) {
            Pais objpais = lPais.get(j);
            jCpaisProfesor.addItem(objpais.getNombre_pais());
        }
    }//GEN-LAST:event_ButtonRegistroProfesorActionPerformed

    private void ButtonRegistrarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegistrarProfesorActionPerformed
        
       if(jTnombre1Profesor.getText().isEmpty() || jTapellido1Profesor.getText().isEmpty() || jTcorreoProfesor.getText().isEmpty() || jTcontraseñaProfesor.getText().isEmpty() || jTdireccionProfesor.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Por favor llena todos los campos obligatorios");
       }else{
        
        ControlProfesor objcpro = new ControlProfesor();
        
        java.util.Date fechaActual = new java.util.Date();
        java.sql.Date fechaCreacion;
        fechaCreacion = new java.sql.Date(fechaActual.getTime());
        //System.out.println(fechaCreacion); //Imprime la fecha actual (creacion de un profesor)
        String nombre1 = jTnombre1Profesor.getText();
        String nombre2 = jTnombre2Profesor.getText();
        String apellido1 = jTapellido1Profesor.getText();
        String apellido2 = jTapellido2Profesor.getText();
        String direccion = jTdireccionProfesor.getText();
        String correo = jTcorreoProfesor.getText();
        String contraseña = jTcontraseñaProfesor.getText();
        
        int idp=0;
            for (int i = 0; i < lPais.size(); i++) {
                Pais get = lPais.get(i);
                String pais=String.valueOf(jCpaisProfesor.getSelectedItem());
                if(pais.equals(get.getNombre_pais())){
                    idp=get.getId_pais();
                }
            }
        
        Profesor pr = new Profesor(nombre1,nombre2,apellido1,apellido2,correo,direccion,contraseña,fechaCreacion,idp);
        
        boolean t = objcpro.insertarProfesor(pr);
        
            if(t) {
                    JOptionPane.showMessageDialog(rootPane, "Insertado un Profesor a la base de datos");
                }else{
                    JOptionPane.showMessageDialog(rootPane, "No se incerto a la base de datos");
                }
        //System.out.print("Insertado un estudiante a la base de datos"); //Mensaje de verificacion en consola
        limpiarCamposRegistroProfesor();
        volverMenuInicial();
       }
            
        
        
       
            
        
    }//GEN-LAST:event_ButtonRegistrarProfesorActionPerformed

    private void ButtonVolverRegistroProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVolverRegistroProfesorActionPerformed
        volverMenuInicial();
        limpiarCamposRegistroProfesor();
    }//GEN-LAST:event_ButtonVolverRegistroProfesorActionPerformed

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
            java.util.logging.Logger.getLogger(ClassyInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClassyInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClassyInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClassyInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
          
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClassyInterface().setVisible(true);
            }
        });
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonIngresarInicio;
    private javax.swing.JButton ButtonRegistrarEstudiante;
    private javax.swing.JButton ButtonRegistrarInicio;
    private javax.swing.JButton ButtonRegistrarProfesor;
    private javax.swing.JButton ButtonRegistroEstudiante;
    private javax.swing.JButton ButtonRegistroProfesor;
    private javax.swing.JButton ButtonVolverRegistroEstudiante;
    private javax.swing.JButton ButtonVolverRegistroProfesor;
    private javax.swing.JButton ButtonVolverRol;
    private javax.swing.JLabel imgCursosEstudiante;
    private javax.swing.JLabel imgCursosProfesor;
    private javax.swing.JLabel imgInicio;
    private javax.swing.JLabel imgInicioEstudiante;
    private javax.swing.JLabel imgInicioProfesor;
    private javax.swing.JLabel imgPublicacionesEstudiante;
    private javax.swing.JLabel imgPublicacionesProfesor;
    private javax.swing.JLabel imgRegistroEstudiante;
    private javax.swing.JLabel imgRegistroProfesor;
    private javax.swing.JLabel imgRolIngreso;
    private javax.swing.JLabel imgRolRegistro;
    private javax.swing.JComboBox<String> jCpaisProfesor;
    private com.toedter.calendar.JDateChooser jDateNacimientoEstudiante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTapellido1Estudiante;
    private javax.swing.JTextField jTapellido1Profesor;
    private javax.swing.JTextField jTapellido2Estudiante;
    private javax.swing.JTextField jTapellido2Profesor;
    private javax.swing.JPasswordField jTcontraseñaEstudiante;
    private javax.swing.JPasswordField jTcontraseñaProfesor;
    private javax.swing.JTextField jTcorreoEstudiante;
    private javax.swing.JTextField jTcorreoProfesor;
    private javax.swing.JTextField jTdireccionProfesor;
    private javax.swing.JTextField jTnombre1Estudiante;
    private javax.swing.JTextField jTnombre1Profesor;
    private javax.swing.JTextField jTnombre2Estudiante;
    private javax.swing.JTextField jTnombre2Profesor;
    private javax.swing.JPanel panelCursosEstudiante;
    private javax.swing.JPanel panelCursosProfesor;
    private javax.swing.JPanel panelInicio;
    private javax.swing.JPanel panelInicioEstudiante;
    private javax.swing.JPanel panelInicioProfesor;
    private javax.swing.JPanel panelPublicacionesEstudiante;
    private javax.swing.JPanel panelPublicacionesProfesor;
    private javax.swing.JPanel panelRegistroEstudiante;
    private javax.swing.JPanel panelRegistroProfesor;
    private javax.swing.JPanel panelRolIngreso;
    private javax.swing.JPanel panelRolRegistro;
    // End of variables declaration//GEN-END:variables

    private void volverMenuInicial() {
        
        panelInicio.setVisible(true);
        //Estudiante
        panelRegistroEstudiante.setVisible(false);
        panelInicioEstudiante.setVisible(false);
        //Profesor
        panelInicioProfesor.setVisible(false);
        panelRegistroProfesor.setVisible(false);
        //Rol
        panelRolRegistro.setVisible(false);
        panelRolIngreso.setVisible(false);
        //Publicaciones
        panelPublicacionesEstudiante.setVisible(false);
        panelPublicacionesProfesor.setVisible(false);
        //cursos
        panelCursosEstudiante.setVisible(false);
        panelCursosProfesor.setVisible(false);
    }

    private void limpiarCamposRegistroEstudiante() {
        jTapellido1Estudiante.setText("");
        jTapellido2Estudiante.setText("");
        jTcontraseñaEstudiante.setText("");
        jTcorreoEstudiante.setText("");
        jDateNacimientoEstudiante.setCalendar(null);
        jTnombre1Estudiante.setText("");
        jTnombre2Estudiante.setText("");
        jTcontraseñaEstudiante.setText("");
    }

    private void limpiarCamposRegistroProfesor() {
        jTapellido1Profesor.setText("");
        jTapellido2Profesor.setText("");
        jTcontraseñaProfesor.setText("");
        jTcorreoProfesor.setText("");
        jTnombre1Profesor.setText("");
        jTnombre2Profesor.setText("");
        jTcontraseñaProfesor.setText("");
        jTdireccionProfesor.setText("");
        jCpaisProfesor.setSelectedIndex(0);
        jCpaisProfesor.removeAllItems();
    }
}
