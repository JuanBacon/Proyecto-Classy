package vista;
//Controles

import control.ControlEstudiante;
import control.ControlProfesor;
import control.ControlPais;
import control.ControlCurso;
import control.ControlCategoria;
import control.ControlCurso;
import control.ControlInscripcion;
import control.ControlPublicacion;
import control.ControlMaterial;
import java.awt.Image;

//Modelos
import modelo.Estudiante;
import modelo.Profesor;
import modelo.Pais;
import modelo.Curso;
import modelo.Categoria;
import modelo.Material;
import modelo.Curso;
import modelo.Inscripcion;
import modelo.Material;
import modelo.Publicacion;
//Utilidades
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import javafx.stage.FileChooser;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
//Fechas

public class ClassyInterface extends javax.swing.JFrame {

    //File chooser
    FileChooser fileChooser;
    //Creacion de listas
    LinkedList<Pais> lPais;
    LinkedList<Categoria> lCategoria;
    LinkedList<Curso> lc;
    LinkedList<Curso> lCurso;
    LinkedList<Publicacion> lPublicacion;
    LinkedList<Material> lMaterial;
    LinkedList<Publicacion> lPublicacionC;
    //Variables de "sesion"
    String tipo;
    int id_usuario;
    int id_cursoe;
    String pathImagen = "";

    DefaultTableModel modelo;
    String data[][] = {};
    String cabeza[] = {"Curso", "Profesor", "Ingresar"};

    public ClassyInterface() {
        initComponents();

        modelo = new DefaultTableModel(data, cabeza);
        jtCursos.setModel(modelo);

        //Instancia de listas
        lPais = new LinkedList<>();
        lCategoria = new LinkedList<>();
        lc = new LinkedList<>();
        lCurso = new LinkedList<>();
        lPublicacion = new LinkedList<>();
        lMaterial = new LinkedList<>();
        lPublicacionC = new LinkedList<>();

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
        panelCrearCurso.setVisible(false);
        //Material
        panelMaterialProfesor.setVisible(false);
        //Bienvenido
        panelBienvenido.setVisible(false);

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

        //PANEL ROL INICIO
        ButtonInicioEstudiante.setOpaque(false);
        ButtonInicioEstudiante.setContentAreaFilled(false);
        ButtonInicioEstudiante.setBorderPainted(false);

        ButtonInicioProfesor.setOpaque(false);
        ButtonInicioProfesor.setContentAreaFilled(false);
        ButtonInicioProfesor.setBorderPainted(false);

        ButtonVolverRol1.setOpaque(false);
        ButtonVolverRol1.setContentAreaFilled(false);
        ButtonVolverRol1.setBorderPainted(false);

        //PANEL INICIAR ESTUDIANTE
        ButtonVolverInicioEstudiante.setOpaque(false);
        ButtonVolverInicioEstudiante.setContentAreaFilled(false);
        ButtonVolverInicioEstudiante.setBorderPainted(false);

        ButtonEntrarInicioEstudiante.setOpaque(false);
        ButtonEntrarInicioEstudiante.setContentAreaFilled(false);
        ButtonEntrarInicioEstudiante.setBorderPainted(false);

        //PANEL INICIAR PROFESOR
        ButtonVolverInicioProfesor.setOpaque(false);
        ButtonVolverInicioProfesor.setContentAreaFilled(false);
        ButtonVolverInicioProfesor.setBorderPainted(false);

        ButtonEntrarInicioProfesor.setOpaque(false);
        ButtonEntrarInicioProfesor.setContentAreaFilled(false);
        ButtonEntrarInicioProfesor.setBorderPainted(false);

        //PANEL CURSOS PROFESOR
        ButtonCerrarSesionProfesor.setOpaque(false);
        ButtonCerrarSesionProfesor.setContentAreaFilled(false);
        ButtonCerrarSesionProfesor.setBorderPainted(false);

        ButtonAgregarCurso.setOpaque(false);
        ButtonAgregarCurso.setContentAreaFilled(false);
        ButtonAgregarCurso.setBorderPainted(false);

        ButtonAgregarMaterial.setOpaque(false);
        ButtonAgregarMaterial.setContentAreaFilled(false);
        ButtonAgregarMaterial.setBorderPainted(false);

        ButtonAgregarPublicacion.setOpaque(false);
        ButtonAgregarPublicacion.setContentAreaFilled(false);
        ButtonAgregarPublicacion.setBorderPainted(false);

        //PANEL CREAR CURSO PROFESOR       
        ButtonCrearCurso.setOpaque(false);
        ButtonCrearCurso.setContentAreaFilled(false);
        ButtonCrearCurso.setBorderPainted(false);

        ButtonRegresarCrearCurso.setOpaque(false);
        ButtonRegresarCrearCurso.setContentAreaFilled(false);
        ButtonRegresarCrearCurso.setBorderPainted(false);

        ButtonAgregarContenidoCC.setOpaque(false);
        ButtonAgregarContenidoCC.setContentAreaFilled(false);
        ButtonAgregarContenidoCC.setBorderPainted(false);

        ButtonAgregarPublicacionCC.setOpaque(false);
        ButtonAgregarPublicacionCC.setContentAreaFilled(false);
        ButtonAgregarPublicacionCC.setBorderPainted(false);

        //PANEL CREAR PUBLICACION PROFESOR
        ButtonRegresarCrearPublicacion.setOpaque(false);
        ButtonRegresarCrearPublicacion.setContentAreaFilled(false);
        ButtonRegresarCrearPublicacion.setBorderPainted(false);

        ButtonAgregarContenidoCP.setOpaque(false);
        ButtonAgregarContenidoCP.setContentAreaFilled(false);
        ButtonAgregarContenidoCP.setBorderPainted(false);

        ButtonAgregarCursoCP.setOpaque(false);
        ButtonAgregarCursoCP.setContentAreaFilled(false);
        ButtonAgregarCursoCP.setBorderPainted(false);
        
        btnCrearPublicacion.setOpaque(false);
        btnCrearPublicacion.setContentAreaFilled(false);
        btnCrearPublicacion.setBorderPainted(false);

        //PANEL CREAR MATERIAL PROFESOR
        ButtonRegresarCrearMaterial.setOpaque(false);
        ButtonRegresarCrearMaterial.setContentAreaFilled(false);
        ButtonRegresarCrearMaterial.setBorderPainted(false);

        ButtonAgregarCursoCM.setOpaque(false);
        ButtonAgregarCursoCM.setContentAreaFilled(false);
        ButtonAgregarCursoCM.setBorderPainted(false);

        ButtonAgregarPublicacionCM.setOpaque(false);
        ButtonAgregarPublicacionCM.setContentAreaFilled(false);
        ButtonAgregarPublicacionCM.setBorderPainted(false);

        ButtonCargarMaterial.setOpaque(false);
        ButtonCargarMaterial.setContentAreaFilled(false);
        ButtonCargarMaterial.setBorderPainted(false);
        
        ButtonAbrirMaterial.setOpaque(false);
        ButtonAbrirMaterial.setContentAreaFilled(false);
        ButtonAbrirMaterial.setBorderPainted(false);

        //PANEL BIENVENIDO ESTUDIANTE
        ButtonCerrarSesionEstudiante.setOpaque(false);
        ButtonCerrarSesionEstudiante.setContentAreaFilled(false);
        ButtonCerrarSesionEstudiante.setBorderPainted(false);

        ButtonMisCursosEstudiante.setOpaque(false);
        ButtonMisCursosEstudiante.setContentAreaFilled(false);
        ButtonMisCursosEstudiante.setBorderPainted(false);

        //PANEL MIS CURSOS ESTUDIANTE
        ButtonRegresarMisCursosEstudiante.setOpaque(false);
        ButtonRegresarMisCursosEstudiante.setContentAreaFilled(false);
        ButtonRegresarMisCursosEstudiante.setBorderPainted(false);

        ButtonCerrarSesionEstudiante1.setOpaque(false);
        ButtonCerrarSesionEstudiante1.setContentAreaFilled(false);
        ButtonCerrarSesionEstudiante1.setBorderPainted(false);
        
        //PANEL PUBLICACIONES ESTUDIANTE
        
        ButtonRegresarAMisCursos.setOpaque(false);
        ButtonRegresarAMisCursos.setContentAreaFilled(false);
        ButtonRegresarAMisCursos.setBorderPainted(false);
        
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
        jLabel24 = new javax.swing.JLabel();
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
        jLabel25 = new javax.swing.JLabel();
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
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        ButtonEntrarInicioEstudiante = new javax.swing.JButton();
        ButtonVolverInicioEstudiante = new javax.swing.JButton();
        jTingresarContraseñaEstudiante = new javax.swing.JPasswordField();
        jTingresarCorreoEstudiante = new javax.swing.JTextField();
        imgInicioEstudiante = new javax.swing.JLabel();
        panelInicioProfesor = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        ButtonEntrarInicioProfesor = new javax.swing.JButton();
        ButtonVolverInicioProfesor = new javax.swing.JButton();
        jTingresarContraseñaProfesor = new javax.swing.JPasswordField();
        jTingresarCorreoProfesor = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        imgInicioProfesor = new javax.swing.JLabel();
        panelRolIngreso = new javax.swing.JPanel();
        ButtonInicioEstudiante = new javax.swing.JButton();
        ButtonInicioProfesor = new javax.swing.JButton();
        ButtonVolverRol1 = new javax.swing.JButton();
        imgRolIngreso = new javax.swing.JLabel();
        panelRolRegistro = new javax.swing.JPanel();
        ButtonRegistroEstudiante = new javax.swing.JButton();
        ButtonRegistroProfesor = new javax.swing.JButton();
        ButtonVolverRol = new javax.swing.JButton();
        imgRolRegistro = new javax.swing.JLabel();
        panelBienvenido = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtCursos = new javax.swing.JTable();
        ButtonMisCursosEstudiante = new javax.swing.JButton();
        ButtonCerrarSesionEstudiante = new javax.swing.JButton();
        imgBienvenido = new javax.swing.JLabel();
        panelCursosEstudiante = new javax.swing.JPanel();
        ButtonRegresarMisCursosEstudiante = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        ButtonCerrarSesionEstudiante1 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtCursosEstudiante = new javax.swing.JTable();
        imgCursosEstudiante = new javax.swing.JLabel();
        panelPublicacionesEstudiante = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtPublicacionesE = new javax.swing.JTable();
        ButtonRegresarAMisCursos = new javax.swing.JButton();
        imgPublicacionesEstudiante = new javax.swing.JLabel();
        panelCursosProfesor = new javax.swing.JPanel();
        ButtonAgregarMaterial = new javax.swing.JButton();
        ButtonAgregarPublicacion = new javax.swing.JButton();
        ButtonAgregarCurso = new javax.swing.JButton();
        ButtonCerrarSesionProfesor = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtCursosProfesor = new javax.swing.JTable();
        jLabel33 = new javax.swing.JLabel();
        imgCursosProfesor = new javax.swing.JLabel();
        panelPublicacionesProfesor = new javax.swing.JPanel();
        jComboCursos = new javax.swing.JComboBox<>();
        btnCrearPublicacion = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDescripcion = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        txtTituloPublicacion = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        ButtonAgregarCursoCP = new javax.swing.JButton();
        ButtonAgregarContenidoCP = new javax.swing.JButton();
        ButtonRegresarCrearPublicacion = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jtPublicacionesProfesor = new javax.swing.JTable();
        imgPublicacionesProfesor = new javax.swing.JLabel();
        panelCrearCurso = new javax.swing.JPanel();
        ButtonAgregarContenidoCC = new javax.swing.JButton();
        ButtonAgregarPublicacionCC = new javax.swing.JButton();
        ButtonCrearCurso = new javax.swing.JButton();
        ButtonRegresarCrearCurso = new javax.swing.JButton();
        jTNombreCurso = new javax.swing.JTextField();
        jCCategoriaCurso = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTDescripcionCurso = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        imgCrearCurso = new javax.swing.JLabel();
        panelMaterialProfesor = new javax.swing.JPanel();
        ButtonAgregarPublicacionCM = new javax.swing.JButton();
        ButtonAgregarCursoCM = new javax.swing.JButton();
        ButtonRegresarCrearMaterial = new javax.swing.JButton();
        txtNombreMaterial1 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jComboPublicaciones1 = new javax.swing.JComboBox<>();
        ButtonAbrirMaterial = new javax.swing.JButton();
        ButtonCargarMaterial = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        subirImagen = new javax.swing.JLabel();
        imgMaterialProfesor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Classy!");
        setMinimumSize(new java.awt.Dimension(1940, 1100));
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
        jLabel1.setText("Estudiante");
        panelRegistroEstudiante.add(jLabel1);
        jLabel1.setBounds(1050, 280, 330, 50);

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

        jLabel24.setFont(new java.awt.Font("Montserrat", 3, 26)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(110, 54, 32));
        jLabel24.setText("Segundo Nombre");
        panelRegistroEstudiante.add(jLabel24);
        jLabel24.setBounds(1080, 390, 330, 50);

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

        jLabel25.setFont(new java.awt.Font("Montserrat", 3, 26)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(110, 54, 32));
        jLabel25.setText("Profesor");
        panelRegistroProfesor.add(jLabel25);
        jLabel25.setBounds(1090, 280, 330, 50);

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
        imgRegistroProfesor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Registro Profesor 1.0.png"))); // NOI18N
        panelRegistroProfesor.add(imgRegistroProfesor);
        imgRegistroProfesor.setBounds(10, 0, 1920, 1080);

        getContentPane().add(panelRegistroProfesor);
        panelRegistroProfesor.setBounds(10, 11, 1920, 1080);

        panelInicioEstudiante.setBackground(new java.awt.Color(204, 204, 204));
        panelInicioEstudiante.setMaximumSize(new java.awt.Dimension(1920, 1080));
        panelInicioEstudiante.setMinimumSize(new java.awt.Dimension(1920, 1080));
        panelInicioEstudiante.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Montserrat", 3, 26)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(110, 54, 32));
        jLabel16.setText("Contraseña");
        panelInicioEstudiante.add(jLabel16);
        jLabel16.setBounds(700, 560, 330, 50);

        jLabel17.setFont(new java.awt.Font("Montserrat", 3, 26)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(110, 54, 32));
        jLabel17.setText("Correo Electrónico");
        panelInicioEstudiante.add(jLabel17);
        jLabel17.setBounds(700, 440, 290, 50);

        jLabel26.setFont(new java.awt.Font("Montserrat", 3, 26)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(110, 54, 32));
        jLabel26.setText("Estudiante");
        panelInicioEstudiante.add(jLabel26);
        jLabel26.setBounds(1010, 390, 330, 50);

        ButtonEntrarInicioEstudiante.setBackground(new java.awt.Color(153, 0, 0));
        ButtonEntrarInicioEstudiante.setAlignmentY(0.0F);
        ButtonEntrarInicioEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEntrarInicioEstudianteActionPerformed(evt);
            }
        });
        panelInicioEstudiante.add(ButtonEntrarInicioEstudiante);
        ButtonEntrarInicioEstudiante.setBounds(830, 730, 250, 100);

        ButtonVolverInicioEstudiante.setBackground(new java.awt.Color(153, 0, 0));
        ButtonVolverInicioEstudiante.setAlignmentY(0.0F);
        ButtonVolverInicioEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVolverInicioEstudianteActionPerformed(evt);
            }
        });
        panelInicioEstudiante.add(ButtonVolverInicioEstudiante);
        ButtonVolverInicioEstudiante.setBounds(1580, 910, 250, 100);

        jTingresarContraseñaEstudiante.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        panelInicioEstudiante.add(jTingresarContraseñaEstudiante);
        jTingresarContraseñaEstudiante.setBounds(700, 607, 520, 50);

        jTingresarCorreoEstudiante.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jTingresarCorreoEstudiante.setToolTipText("Tu primer nombre");
        panelInicioEstudiante.add(jTingresarCorreoEstudiante);
        jTingresarCorreoEstudiante.setBounds(700, 500, 520, 50);

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

        jLabel18.setFont(new java.awt.Font("Montserrat", 3, 26)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(110, 54, 32));
        jLabel18.setText("Contraseña");
        panelInicioProfesor.add(jLabel18);
        jLabel18.setBounds(700, 560, 330, 50);

        jLabel19.setFont(new java.awt.Font("Montserrat", 3, 26)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(110, 54, 32));
        jLabel19.setText("Correo Electrónico");
        panelInicioProfesor.add(jLabel19);
        jLabel19.setBounds(700, 440, 290, 50);

        ButtonEntrarInicioProfesor.setBackground(new java.awt.Color(153, 0, 0));
        ButtonEntrarInicioProfesor.setAlignmentY(0.0F);
        ButtonEntrarInicioProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEntrarInicioProfesorActionPerformed(evt);
            }
        });
        panelInicioProfesor.add(ButtonEntrarInicioProfesor);
        ButtonEntrarInicioProfesor.setBounds(830, 730, 250, 100);

        ButtonVolverInicioProfesor.setBackground(new java.awt.Color(153, 0, 0));
        ButtonVolverInicioProfesor.setAlignmentY(0.0F);
        ButtonVolverInicioProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVolverInicioProfesorActionPerformed(evt);
            }
        });
        panelInicioProfesor.add(ButtonVolverInicioProfesor);
        ButtonVolverInicioProfesor.setBounds(1580, 910, 250, 100);

        jTingresarContraseñaProfesor.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jTingresarContraseñaProfesor.setToolTipText("Tu contraseña");
        panelInicioProfesor.add(jTingresarContraseñaProfesor);
        jTingresarContraseñaProfesor.setBounds(700, 607, 520, 50);

        jTingresarCorreoProfesor.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jTingresarCorreoProfesor.setToolTipText("Tu Correo");
        panelInicioProfesor.add(jTingresarCorreoProfesor);
        jTingresarCorreoProfesor.setBounds(700, 500, 520, 50);

        jLabel32.setFont(new java.awt.Font("Montserrat", 3, 26)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(110, 54, 32));
        jLabel32.setText("Profesor");
        panelInicioProfesor.add(jLabel32);
        jLabel32.setBounds(1010, 390, 330, 50);

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

        ButtonInicioEstudiante.setBackground(new java.awt.Color(153, 0, 0));
        ButtonInicioEstudiante.setAlignmentY(0.0F);
        ButtonInicioEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonInicioEstudianteActionPerformed(evt);
            }
        });
        panelRolIngreso.add(ButtonInicioEstudiante);
        ButtonInicioEstudiante.setBounds(1070, 570, 400, 60);

        ButtonInicioProfesor.setBackground(new java.awt.Color(153, 0, 0));
        ButtonInicioProfesor.setAlignmentY(0.0F);
        ButtonInicioProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonInicioProfesorActionPerformed(evt);
            }
        });
        panelRolIngreso.add(ButtonInicioProfesor);
        ButtonInicioProfesor.setBounds(530, 570, 400, 60);

        ButtonVolverRol1.setBackground(new java.awt.Color(153, 0, 0));
        ButtonVolverRol1.setAlignmentY(0.0F);
        ButtonVolverRol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVolverRol1ActionPerformed(evt);
            }
        });
        panelRolIngreso.add(ButtonVolverRol1);
        ButtonVolverRol1.setBounds(1580, 910, 250, 100);

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

        panelBienvenido.setBackground(new java.awt.Color(204, 204, 204));
        panelBienvenido.setMaximumSize(new java.awt.Dimension(1920, 1080));
        panelBienvenido.setMinimumSize(new java.awt.Dimension(1920, 1080));
        panelBienvenido.setLayout(null);

        jtCursos.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jtCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "Nombre del curso", "Nombre del profesor", "Descripcion", "Categoria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtCursos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jtCursos.setAutoscrolls(false);
        jtCursos.setPreferredSize(new java.awt.Dimension(375, 402));
        jtCursos.getTableHeader().setReorderingAllowed(false);
        jtCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtCursosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtCursos);
        if (jtCursos.getColumnModel().getColumnCount() > 0) {
            jtCursos.getColumnModel().getColumn(0).setResizable(false);
            jtCursos.getColumnModel().getColumn(0).setPreferredWidth(1);
            jtCursos.getColumnModel().getColumn(1).setResizable(false);
            jtCursos.getColumnModel().getColumn(3).setResizable(false);
        }

        panelBienvenido.add(jScrollPane2);
        jScrollPane2.setBounds(200, 450, 1380, 402);

        ButtonMisCursosEstudiante.setBackground(new java.awt.Color(153, 0, 0));
        ButtonMisCursosEstudiante.setAlignmentY(0.0F);
        ButtonMisCursosEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMisCursosEstudianteActionPerformed(evt);
            }
        });
        panelBienvenido.add(ButtonMisCursosEstudiante);
        ButtonMisCursosEstudiante.setBounds(1180, 910, 330, 100);

        ButtonCerrarSesionEstudiante.setBackground(new java.awt.Color(153, 0, 0));
        ButtonCerrarSesionEstudiante.setAlignmentY(0.0F);
        ButtonCerrarSesionEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCerrarSesionEstudianteActionPerformed(evt);
            }
        });
        panelBienvenido.add(ButtonCerrarSesionEstudiante);
        ButtonCerrarSesionEstudiante.setBounds(1540, 910, 330, 100);

        imgBienvenido.setBackground(new java.awt.Color(96, 3, 3));
        imgBienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgBienvenido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bienvenido 1.0.png"))); // NOI18N
        panelBienvenido.add(imgBienvenido);
        imgBienvenido.setBounds(0, 0, 1920, 1080);

        getContentPane().add(panelBienvenido);
        panelBienvenido.setBounds(10, 11, 1920, 1080);

        panelCursosEstudiante.setBackground(new java.awt.Color(204, 204, 204));
        panelCursosEstudiante.setMaximumSize(new java.awt.Dimension(1920, 1080));
        panelCursosEstudiante.setMinimumSize(new java.awt.Dimension(1920, 1080));
        panelCursosEstudiante.setLayout(null);

        ButtonRegresarMisCursosEstudiante.setBackground(new java.awt.Color(153, 0, 0));
        ButtonRegresarMisCursosEstudiante.setAlignmentY(0.0F);
        ButtonRegresarMisCursosEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegresarMisCursosEstudianteActionPerformed(evt);
            }
        });
        panelCursosEstudiante.add(ButtonRegresarMisCursosEstudiante);
        ButtonRegresarMisCursosEstudiante.setBounds(1170, 910, 330, 100);

        jLabel29.setFont(new java.awt.Font("Montserrat", 3, 26)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(110, 54, 32));
        jLabel29.setText("Mis");
        panelCursosEstudiante.add(jLabel29);
        jLabel29.setBounds(780, 280, 330, 50);

        ButtonCerrarSesionEstudiante1.setBackground(new java.awt.Color(153, 0, 0));
        ButtonCerrarSesionEstudiante1.setAlignmentY(0.0F);
        ButtonCerrarSesionEstudiante1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCerrarSesionEstudiante1ActionPerformed(evt);
            }
        });
        panelCursosEstudiante.add(ButtonCerrarSesionEstudiante1);
        ButtonCerrarSesionEstudiante1.setBounds(1540, 910, 330, 100);

        jtCursosEstudiante.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jtCursosEstudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtCursosEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtCursosEstudianteMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jtCursosEstudiante);

        panelCursosEstudiante.add(jScrollPane6);
        jScrollPane6.setBounds(460, 430, 990, 402);

        imgCursosEstudiante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgCursosEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cursos Estudiante 1.1.png"))); // NOI18N
        panelCursosEstudiante.add(imgCursosEstudiante);
        imgCursosEstudiante.setBounds(0, 0, 1920, 1080);

        getContentPane().add(panelCursosEstudiante);
        panelCursosEstudiante.setBounds(10, 11, 1920, 1080);

        panelPublicacionesEstudiante.setBackground(new java.awt.Color(204, 204, 204));
        panelPublicacionesEstudiante.setMaximumSize(new java.awt.Dimension(1920, 1080));
        panelPublicacionesEstudiante.setMinimumSize(new java.awt.Dimension(1920, 1080));
        panelPublicacionesEstudiante.setLayout(null);

        jtPublicacionesE.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jtPublicacionesE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jtPublicacionesE);

        panelPublicacionesEstudiante.add(jScrollPane5);
        jScrollPane5.setBounds(120, 360, 1190, 402);

        ButtonRegresarAMisCursos.setBackground(new java.awt.Color(153, 0, 0));
        ButtonRegresarAMisCursos.setAlignmentY(0.0F);
        ButtonRegresarAMisCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegresarAMisCursosActionPerformed(evt);
            }
        });
        panelPublicacionesEstudiante.add(ButtonRegresarAMisCursos);
        ButtonRegresarAMisCursos.setBounds(1580, 910, 260, 100);

        imgPublicacionesEstudiante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgPublicacionesEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Publicaciones estudiante 1.0 .png"))); // NOI18N
        panelPublicacionesEstudiante.add(imgPublicacionesEstudiante);
        imgPublicacionesEstudiante.setBounds(0, 0, 1920, 1080);

        getContentPane().add(panelPublicacionesEstudiante);
        panelPublicacionesEstudiante.setBounds(10, 11, 1920, 1080);

        panelCursosProfesor.setBackground(new java.awt.Color(204, 204, 204));
        panelCursosProfesor.setMaximumSize(new java.awt.Dimension(1920, 1080));
        panelCursosProfesor.setMinimumSize(new java.awt.Dimension(1920, 1080));
        panelCursosProfesor.setLayout(null);

        ButtonAgregarMaterial.setBackground(new java.awt.Color(153, 0, 0));
        ButtonAgregarMaterial.setAlignmentY(0.0F);
        ButtonAgregarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgregarMaterialActionPerformed(evt);
            }
        });
        panelCursosProfesor.add(ButtonAgregarMaterial);
        ButtonAgregarMaterial.setBounds(1080, 910, 410, 100);

        ButtonAgregarPublicacion.setBackground(new java.awt.Color(153, 0, 0));
        ButtonAgregarPublicacion.setAlignmentY(0.0F);
        ButtonAgregarPublicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgregarPublicacionActionPerformed(evt);
            }
        });
        panelCursosProfesor.add(ButtonAgregarPublicacion);
        ButtonAgregarPublicacion.setBounds(620, 910, 410, 100);

        ButtonAgregarCurso.setBackground(new java.awt.Color(153, 0, 0));
        ButtonAgregarCurso.setAlignmentY(0.0F);
        ButtonAgregarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgregarCursoActionPerformed(evt);
            }
        });
        panelCursosProfesor.add(ButtonAgregarCurso);
        ButtonAgregarCurso.setBounds(160, 910, 410, 100);

        ButtonCerrarSesionProfesor.setBackground(new java.awt.Color(153, 0, 0));
        ButtonCerrarSesionProfesor.setAlignmentY(0.0F);
        ButtonCerrarSesionProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCerrarSesionProfesorActionPerformed(evt);
            }
        });
        panelCursosProfesor.add(ButtonCerrarSesionProfesor);
        ButtonCerrarSesionProfesor.setBounds(1540, 910, 330, 100);

        jScrollPane4.setPreferredSize(new java.awt.Dimension(452, 420));

        jtCursosProfesor.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jtCursosProfesor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jtCursosProfesor);

        panelCursosProfesor.add(jScrollPane4);
        jScrollPane4.setBounds(480, 440, 1000, 420);

        jLabel33.setFont(new java.awt.Font("Montserrat", 3, 26)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(110, 54, 32));
        jLabel33.setText("Tus");
        panelCursosProfesor.add(jLabel33);
        jLabel33.setBounds(790, 280, 70, 50);

        imgCursosProfesor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgCursosProfesor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cursos profesor 1.2.png"))); // NOI18N
        panelCursosProfesor.add(imgCursosProfesor);
        imgCursosProfesor.setBounds(0, 0, 1920, 1080);

        getContentPane().add(panelCursosProfesor);
        panelCursosProfesor.setBounds(10, 11, 1920, 1080);

        panelPublicacionesProfesor.setBackground(new java.awt.Color(204, 204, 204));
        panelPublicacionesProfesor.setMaximumSize(new java.awt.Dimension(1920, 1080));
        panelPublicacionesProfesor.setMinimumSize(new java.awt.Dimension(1920, 1080));
        panelPublicacionesProfesor.setLayout(null);

        jComboCursos.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jComboCursos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboCursosItemStateChanged(evt);
            }
        });
        panelPublicacionesProfesor.add(jComboCursos);
        jComboCursos.setBounds(770, 260, 380, 40);

        btnCrearPublicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPublicacionActionPerformed(evt);
            }
        });
        panelPublicacionesProfesor.add(btnCrearPublicacion);
        btnCrearPublicacion.setBounds(240, 710, 410, 70);

        jLabel23.setFont(new java.awt.Font("Montserrat", 3, 26)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(110, 54, 32));
        jLabel23.setText("¿Curso al que corresponde la publicacion?");
        panelPublicacionesProfesor.add(jLabel23);
        jLabel23.setBounds(710, 210, 600, 20);

        txtAreaDescripcion.setColumns(20);
        txtAreaDescripcion.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtAreaDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtAreaDescripcion);

        panelPublicacionesProfesor.add(jScrollPane1);
        jScrollPane1.setBounds(240, 540, 410, 120);

        jLabel22.setFont(new java.awt.Font("Montserrat", 3, 26)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(110, 54, 32));
        jLabel22.setText("Descripcion");
        panelPublicacionesProfesor.add(jLabel22);
        jLabel22.setBounds(240, 510, 270, 20);

        txtTituloPublicacion.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        panelPublicacionesProfesor.add(txtTituloPublicacion);
        txtTituloPublicacion.setBounds(240, 425, 410, 50);

        jLabel20.setFont(new java.awt.Font("Montserrat", 3, 26)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(110, 54, 32));
        jLabel20.setText("Titulo Publicacion");
        panelPublicacionesProfesor.add(jLabel20);
        jLabel20.setBounds(240, 390, 300, 30);

        ButtonAgregarCursoCP.setBackground(new java.awt.Color(153, 0, 0));
        ButtonAgregarCursoCP.setAlignmentY(0.0F);
        ButtonAgregarCursoCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgregarCursoCPActionPerformed(evt);
            }
        });
        panelPublicacionesProfesor.add(ButtonAgregarCursoCP);
        ButtonAgregarCursoCP.setBounds(240, 910, 410, 100);

        ButtonAgregarContenidoCP.setBackground(new java.awt.Color(153, 0, 0));
        ButtonAgregarContenidoCP.setAlignmentY(0.0F);
        ButtonAgregarContenidoCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgregarContenidoCPActionPerformed(evt);
            }
        });
        panelPublicacionesProfesor.add(ButtonAgregarContenidoCP);
        ButtonAgregarContenidoCP.setBounds(1140, 910, 400, 100);

        ButtonRegresarCrearPublicacion.setBackground(new java.awt.Color(153, 0, 0));
        ButtonRegresarCrearPublicacion.setAlignmentY(0.0F);
        ButtonRegresarCrearPublicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegresarCrearPublicacionActionPerformed(evt);
            }
        });
        panelPublicacionesProfesor.add(ButtonRegresarCrearPublicacion);
        ButtonRegresarCrearPublicacion.setBounds(1570, 910, 260, 100);

        jtPublicacionesProfesor.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jtPublicacionesProfesor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(jtPublicacionesProfesor);

        panelPublicacionesProfesor.add(jScrollPane7);
        jScrollPane7.setBounds(930, 410, 790, 370);

        imgPublicacionesProfesor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgPublicacionesProfesor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Publicacion profesor 1.0.png"))); // NOI18N
        panelPublicacionesProfesor.add(imgPublicacionesProfesor);
        imgPublicacionesProfesor.setBounds(0, 10, 1920, 1080);

        getContentPane().add(panelPublicacionesProfesor);
        panelPublicacionesProfesor.setBounds(10, 11, 1920, 1080);

        panelCrearCurso.setBackground(new java.awt.Color(204, 204, 204));
        panelCrearCurso.setMaximumSize(new java.awt.Dimension(1920, 1080));
        panelCrearCurso.setMinimumSize(new java.awt.Dimension(1920, 1080));
        panelCrearCurso.setLayout(null);

        ButtonAgregarContenidoCC.setBackground(new java.awt.Color(153, 0, 0));
        ButtonAgregarContenidoCC.setAlignmentY(0.0F);
        ButtonAgregarContenidoCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgregarContenidoCCActionPerformed(evt);
            }
        });
        panelCrearCurso.add(ButtonAgregarContenidoCC);
        ButtonAgregarContenidoCC.setBounds(1080, 910, 420, 100);

        ButtonAgregarPublicacionCC.setBackground(new java.awt.Color(153, 0, 0));
        ButtonAgregarPublicacionCC.setAlignmentY(0.0F);
        ButtonAgregarPublicacionCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgregarPublicacionCCActionPerformed(evt);
            }
        });
        panelCrearCurso.add(ButtonAgregarPublicacionCC);
        ButtonAgregarPublicacionCC.setBounds(630, 910, 420, 100);

        ButtonCrearCurso.setBackground(new java.awt.Color(153, 0, 0));
        ButtonCrearCurso.setAlignmentY(0.0F);
        ButtonCrearCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCrearCursoActionPerformed(evt);
            }
        });
        panelCrearCurso.add(ButtonCrearCurso);
        ButtonCrearCurso.setBounds(800, 770, 330, 100);

        ButtonRegresarCrearCurso.setBackground(new java.awt.Color(153, 0, 0));
        ButtonRegresarCrearCurso.setAlignmentY(0.0F);
        ButtonRegresarCrearCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegresarCrearCursoActionPerformed(evt);
            }
        });
        panelCrearCurso.add(ButtonRegresarCrearCurso);
        ButtonRegresarCrearCurso.setBounds(1540, 910, 330, 100);

        jTNombreCurso.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        panelCrearCurso.add(jTNombreCurso);
        jTNombreCurso.setBounds(800, 396, 320, 50);

        jCCategoriaCurso.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        panelCrearCurso.add(jCCategoriaCurso);
        jCCategoriaCurso.setBounds(800, 495, 320, 50);

        jScrollPane3.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N

        jTDescripcionCurso.setColumns(20);
        jTDescripcionCurso.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jTDescripcionCurso.setLineWrap(true);
        jTDescripcionCurso.setRows(5);
        jTDescripcionCurso.setWrapStyleWord(true);
        jScrollPane3.setViewportView(jTDescripcionCurso);

        panelCrearCurso.add(jScrollPane3);
        jScrollPane3.setBounds(800, 596, 320, 130);

        jLabel21.setFont(new java.awt.Font("Montserrat", 3, 26)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(110, 54, 32));
        jLabel21.setText("Descripcion");
        panelCrearCurso.add(jLabel21);
        jLabel21.setBounds(800, 550, 330, 50);

        jLabel27.setFont(new java.awt.Font("Montserrat", 3, 26)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(110, 54, 32));
        jLabel27.setText("Nombre Curso*");
        panelCrearCurso.add(jLabel27);
        jLabel27.setBounds(800, 340, 290, 50);

        jLabel28.setFont(new java.awt.Font("Montserrat", 3, 26)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(110, 54, 32));
        jLabel28.setText("Categoria");
        panelCrearCurso.add(jLabel28);
        jLabel28.setBounds(800, 450, 330, 50);

        imgCrearCurso.setBackground(new java.awt.Color(96, 3, 3));
        imgCrearCurso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgCrearCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Agregar curso 1.1.png"))); // NOI18N
        panelCrearCurso.add(imgCrearCurso);
        imgCrearCurso.setBounds(0, 0, 1920, 1080);

        getContentPane().add(panelCrearCurso);
        panelCrearCurso.setBounds(10, 11, 1920, 1080);

        panelMaterialProfesor.setBackground(new java.awt.Color(204, 204, 204));
        panelMaterialProfesor.setMaximumSize(new java.awt.Dimension(1920, 1080));
        panelMaterialProfesor.setMinimumSize(new java.awt.Dimension(1920, 1080));
        panelMaterialProfesor.setLayout(null);

        ButtonAgregarPublicacionCM.setBackground(new java.awt.Color(153, 0, 0));
        ButtonAgregarPublicacionCM.setAlignmentY(0.0F);
        ButtonAgregarPublicacionCM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgregarPublicacionCMActionPerformed(evt);
            }
        });
        panelMaterialProfesor.add(ButtonAgregarPublicacionCM);
        ButtonAgregarPublicacionCM.setBounds(690, 910, 410, 100);

        ButtonAgregarCursoCM.setBackground(new java.awt.Color(153, 0, 0));
        ButtonAgregarCursoCM.setAlignmentY(0.0F);
        ButtonAgregarCursoCM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgregarCursoCMActionPerformed(evt);
            }
        });
        panelMaterialProfesor.add(ButtonAgregarCursoCM);
        ButtonAgregarCursoCM.setBounds(240, 910, 410, 100);

        ButtonRegresarCrearMaterial.setBackground(new java.awt.Color(153, 0, 0));
        ButtonRegresarCrearMaterial.setAlignmentY(0.0F);
        ButtonRegresarCrearMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegresarCrearMaterialActionPerformed(evt);
            }
        });
        panelMaterialProfesor.add(ButtonRegresarCrearMaterial);
        ButtonRegresarCrearMaterial.setBounds(1580, 910, 250, 90);

        txtNombreMaterial1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreMaterial1ActionPerformed(evt);
            }
        });
        panelMaterialProfesor.add(txtNombreMaterial1);
        txtNombreMaterial1.setBounds(770, 380, 380, 60);

        jLabel34.setFont(new java.awt.Font("Montserrat", 3, 26)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(110, 54, 32));
        jLabel34.setText("Publicacion");
        panelMaterialProfesor.add(jLabel34);
        jLabel34.setBounds(770, 570, 330, 50);
        panelMaterialProfesor.add(jComboPublicaciones1);
        jComboPublicaciones1.setBounds(770, 620, 380, 60);

        ButtonAbrirMaterial.setBackground(new java.awt.Color(153, 0, 0));
        ButtonAbrirMaterial.setAlignmentY(0.0F);
        ButtonAbrirMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAbrirMaterialActionPerformed(evt);
            }
        });
        panelMaterialProfesor.add(ButtonAbrirMaterial);
        ButtonAbrirMaterial.setBounds(750, 490, 410, 70);

        ButtonCargarMaterial.setBackground(new java.awt.Color(153, 0, 0));
        ButtonCargarMaterial.setAlignmentY(0.0F);
        ButtonCargarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCargarMaterialActionPerformed(evt);
            }
        });
        panelMaterialProfesor.add(ButtonCargarMaterial);
        ButtonCargarMaterial.setBounds(760, 760, 410, 100);

        jLabel35.setFont(new java.awt.Font("Montserrat", 3, 26)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(110, 54, 32));
        jLabel35.setText("Previsualizacion");
        panelMaterialProfesor.add(jLabel35);
        jLabel35.setBounds(1230, 460, 330, 50);

        jLabel36.setFont(new java.awt.Font("Montserrat", 3, 26)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(110, 54, 32));
        jLabel36.setText("Archivo Material");
        panelMaterialProfesor.add(jLabel36);
        jLabel36.setBounds(780, 500, 330, 50);

        jLabel37.setFont(new java.awt.Font("Montserrat", 3, 26)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(110, 54, 32));
        jLabel37.setText("Nombre Material");
        panelMaterialProfesor.add(jLabel37);
        jLabel37.setBounds(760, 320, 330, 50);
        panelMaterialProfesor.add(subirImagen);
        subirImagen.setBounds(1230, 510, 300, 300);

        imgMaterialProfesor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgMaterialProfesor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Material profesor 1.png"))); // NOI18N
        panelMaterialProfesor.add(imgMaterialProfesor);
        imgMaterialProfesor.setBounds(0, 0, 1920, 1080);

        getContentPane().add(panelMaterialProfesor);
        panelMaterialProfesor.setBounds(10, 11, 1920, 1080);

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
        panelCrearCurso.setVisible(false);
        //Material
        panelMaterialProfesor.setVisible(false);
        //Bienvenido
        panelBienvenido.setVisible(false);

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
        panelCrearCurso.setVisible(false);
        //Material
        panelMaterialProfesor.setVisible(false);
        //Bienvenido
        panelBienvenido.setVisible(false);
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
        panelCrearCurso.setVisible(false);
        //Material
        panelMaterialProfesor.setVisible(false);
        //Bienvenido
        panelBienvenido.setVisible(false);


    }//GEN-LAST:event_ButtonRegistroEstudianteActionPerformed

    private void ButtonVolverRegistroEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVolverRegistroEstudianteActionPerformed
        volverMenuInicial();
        limpiarCamposRegistroEstudiante();
    }//GEN-LAST:event_ButtonVolverRegistroEstudianteActionPerformed

    private void ButtonRegistrarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegistrarEstudianteActionPerformed

        //Validacion de campos
        if (jTnombre1Estudiante.getText().isEmpty() || jTapellido1Estudiante.getText().isEmpty() || jDateNacimientoEstudiante.getDate() == null || jTcorreoEstudiante.getText().isEmpty() || jTcontraseñaEstudiante.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por favor llena todos los campos obligatorios");
        } else {

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

            Estudiante ee = new Estudiante(nombre1, nombre2, apellido1, apellido2, correo, fechaNacimiento, contraseña);

            boolean t = objce.insertarEstudiante(ee);
            if (t) {
                JOptionPane.showMessageDialog(rootPane, "Insertado un estudiante a la base de datos");
            } else {
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
        panelCrearCurso.setVisible(false);
        //Material
        panelMaterialProfesor.setVisible(false);
        //Bienvenido
        panelBienvenido.setVisible(false);

        ControlPais objcpais = new ControlPais();
        lPais = objcpais.consultarPaises();

        for (int j = 0; j < lPais.size(); j++) {
            Pais objpais = lPais.get(j);
            jCpaisProfesor.addItem(objpais.getNombre_pais());
        }
    }//GEN-LAST:event_ButtonRegistroProfesorActionPerformed

    private void ButtonRegistrarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegistrarProfesorActionPerformed

        if (jTnombre1Profesor.getText().isEmpty() || jTapellido1Profesor.getText().isEmpty() || jTcorreoProfesor.getText().isEmpty() || jTcontraseñaProfesor.getText().isEmpty() || jTdireccionProfesor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por favor llena todos los campos obligatorios");
        } else {

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

            int idp = 0;
            for (int i = 0; i < lPais.size(); i++) {
                Pais get = lPais.get(i);
                String pais = String.valueOf(jCpaisProfesor.getSelectedItem());
                if (pais.equals(get.getNombre_pais())) {
                    idp = get.getId_pais();
                }
            }

            Profesor pr = new Profesor(nombre1, nombre2, apellido1, apellido2, correo, direccion, contraseña, fechaCreacion, idp);

            boolean t = objcpro.insertarProfesor(pr);

            if (t) {
                JOptionPane.showMessageDialog(rootPane, "Insertado un Profesor a la base de datos");
            } else {
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

    private void ButtonInicioEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonInicioEstudianteActionPerformed
        panelInicio.setVisible(false);
        //Estudiante
        panelRegistroEstudiante.setVisible(false);
        panelInicioEstudiante.setVisible(true);
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
        panelCrearCurso.setVisible(false);
        //Material
        panelMaterialProfesor.setVisible(false);
        //Bienvenido
        panelBienvenido.setVisible(false);
    }//GEN-LAST:event_ButtonInicioEstudianteActionPerformed

    private void ButtonInicioProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonInicioProfesorActionPerformed
        panelInicio.setVisible(false);
        //Estudiante
        panelRegistroEstudiante.setVisible(false);
        panelInicioEstudiante.setVisible(false);
        //Profesor
        panelInicioProfesor.setVisible(true);
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
        panelCrearCurso.setVisible(false);
        //Bienvenido
        panelBienvenido.setVisible(false);
    }//GEN-LAST:event_ButtonInicioProfesorActionPerformed

    private void ButtonVolverRol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVolverRol1ActionPerformed
        volverMenuInicial();
    }//GEN-LAST:event_ButtonVolverRol1ActionPerformed

    private void ButtonVolverInicioEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVolverInicioEstudianteActionPerformed
        volverMenuInicial();
        limpiarCamposInicioEstudiante();
    }//GEN-LAST:event_ButtonVolverInicioEstudianteActionPerformed

    private void ButtonEntrarInicioEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEntrarInicioEstudianteActionPerformed
        if (jTingresarCorreoEstudiante.getText().isEmpty() || jTingresarContraseñaEstudiante.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por favor llena todos los campos obligatorios");
        } else {
            ControlEstudiante objce = new ControlEstudiante();

            String correo = jTingresarCorreoEstudiante.getText();
            String contraseña = jTingresarContraseñaEstudiante.getText();
            //System.out.print(correo + "/ " + contraseña);//Output para validar los datos ingresados
            Estudiante ee = new Estudiante(correo, contraseña);

            int t = objce.IngresarEstudiante(ee);
            if (t > 0) {
                tipo = "estudiante";
                id_usuario = t;

                MostrarInicioEstudiante();
                limpiarCamposInicioEstudiante();

            } else {
                JOptionPane.showMessageDialog(rootPane, "Usuario y/o Contrasñea incorrectos");
            }
        }
    }//GEN-LAST:event_ButtonEntrarInicioEstudianteActionPerformed

    private void ButtonEntrarInicioProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEntrarInicioProfesorActionPerformed
        if (jTingresarCorreoProfesor.getText().isEmpty() || jTingresarContraseñaProfesor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por favor llena todos los campos obligatorios");
        } else {
            ControlProfesor objcpr = new ControlProfesor();

            String correo = jTingresarCorreoProfesor.getText();
            String contraseña = jTingresarContraseñaProfesor.getText();
            //System.out.print(correo + "/ " + contraseña); //Output para validar los datos ingresados
            Profesor pr = new Profesor(correo, contraseña);

            int t = objcpr.IngresarProfesor(pr);
            if (t > 0) {
                tipo = "profesor";
                id_usuario = t;

                mostrarInicioProfesor();
                limpiarCamposInicioProfesor();

            } else {
                JOptionPane.showMessageDialog(rootPane, "Usuario y/o Contrasñea incorrectos");
            }
        }
    }//GEN-LAST:event_ButtonEntrarInicioProfesorActionPerformed

    private void ButtonVolverInicioProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVolverInicioProfesorActionPerformed
        volverMenuInicial();
        limpiarCamposInicioProfesor();
    }//GEN-LAST:event_ButtonVolverInicioProfesorActionPerformed

    private void ButtonCerrarSesionProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCerrarSesionProfesorActionPerformed
        volverMenuInicial();
        cerrarSesion();
    }//GEN-LAST:event_ButtonCerrarSesionProfesorActionPerformed

    private void ButtonCerrarSesionEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCerrarSesionEstudianteActionPerformed
        volverMenuInicial();
        cerrarSesion();
    }//GEN-LAST:event_ButtonCerrarSesionEstudianteActionPerformed

    private void ButtonMisCursosEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMisCursosEstudianteActionPerformed
        
        MostrarMisCursos();
    }//GEN-LAST:event_ButtonMisCursosEstudianteActionPerformed

    private void ButtonAgregarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgregarCursoActionPerformed

        MostrarAgregarCurso();

    }//GEN-LAST:event_ButtonAgregarCursoActionPerformed

    private void ButtonCrearCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCrearCursoActionPerformed
        if (jTNombreCurso.getText().isEmpty() || jTDescripcionCurso.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Por favor llena todos los campos obligatorios");
        } else {
            ControlCurso obccu = new ControlCurso();

            java.util.Date fechaActual = new java.util.Date();
            java.sql.Timestamp fechaCreacion;
            fechaCreacion = new java.sql.Timestamp(fechaActual.getTime());
            //System.out.print(fechaCreacion); //Verificacion fecha 

            String nombreCurso = jTNombreCurso.getText();
            String DescripcionCurso = jTDescripcionCurso.getText();

            int idc = 0;
            for (int i = 0; i < lCategoria.size(); i++) {
                Categoria get = lCategoria.get(i);
                String Categoria = String.valueOf(jCCategoriaCurso.getSelectedItem());
                if (Categoria.equals(get.getNombre_categoria())) {
                    idc = get.getId_categoria();
                }
            }

            Curso cu = new Curso(nombreCurso, fechaCreacion, DescripcionCurso, id_usuario, idc);

            obccu.insertarCurso(cu);

            JOptionPane.showMessageDialog(rootPane, "Haz insertado un curso!");
            mostrarInicioProfesor();
            limpiarCrearCurso();
        }
    }//GEN-LAST:event_ButtonCrearCursoActionPerformed

    private void ButtonRegresarCrearCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegresarCrearCursoActionPerformed
        mostrarInicioProfesor();
        limpiarCrearCurso();
    }//GEN-LAST:event_ButtonRegresarCrearCursoActionPerformed

    private void ButtonRegresarMisCursosEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegresarMisCursosEstudianteActionPerformed
        panelInicio.setVisible(false);
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
        panelCrearCurso.setVisible(false);
        //Material
        panelMaterialProfesor.setVisible(false);
        //Bienvenido
        panelBienvenido.setVisible(true);
    }//GEN-LAST:event_ButtonRegresarMisCursosEstudianteActionPerformed

    private void ButtonCerrarSesionEstudiante1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCerrarSesionEstudiante1ActionPerformed
        volverMenuInicial();
        cerrarSesion();
    }//GEN-LAST:event_ButtonCerrarSesionEstudiante1ActionPerformed

    private void ButtonAgregarPublicacionCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgregarPublicacionCCActionPerformed
        LimpiarCamposProfesor();
        MostrarAgregarPublicacion();
        limpiarCrearCurso();
    }//GEN-LAST:event_ButtonAgregarPublicacionCCActionPerformed

    private void ButtonAgregarContenidoCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgregarContenidoCCActionPerformed
        LimpiarCamposProfesor();
        MostrarAgregarMaterial();
        limpiarCrearCurso();
    }//GEN-LAST:event_ButtonAgregarContenidoCCActionPerformed

    private void ButtonAgregarPublicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgregarPublicacionActionPerformed
        LimpiarCamposProfesor();
        MostrarAgregarPublicacion();
    }//GEN-LAST:event_ButtonAgregarPublicacionActionPerformed

    private void ButtonAgregarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgregarMaterialActionPerformed
        LimpiarCamposProfesor();
        MostrarAgregarMaterial();
    }//GEN-LAST:event_ButtonAgregarMaterialActionPerformed

    private void ButtonAgregarPublicacionCMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgregarPublicacionCMActionPerformed
        LimpiarCamposProfesor();
        MostrarAgregarPublicacion();
    }//GEN-LAST:event_ButtonAgregarPublicacionCMActionPerformed

    private void ButtonAgregarCursoCMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgregarCursoCMActionPerformed
        LimpiarCamposProfesor();
        MostrarAgregarCurso();
    }//GEN-LAST:event_ButtonAgregarCursoCMActionPerformed

    private void ButtonRegresarCrearMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegresarCrearMaterialActionPerformed
        LimpiarCamposProfesor();
        mostrarInicioProfesor();
        
    }//GEN-LAST:event_ButtonRegresarCrearMaterialActionPerformed

    private void ButtonAgregarCursoCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgregarCursoCPActionPerformed
        LimpiarCamposProfesor();
        MostrarAgregarCurso();
        LimpiarAgregarPublicacion();
        
    }//GEN-LAST:event_ButtonAgregarCursoCPActionPerformed

    private void ButtonAgregarContenidoCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgregarContenidoCPActionPerformed
        LimpiarCamposProfesor();
        MostrarAgregarMaterial();
        LimpiarAgregarPublicacion();
        
    }//GEN-LAST:event_ButtonAgregarContenidoCPActionPerformed

    private void ButtonRegresarCrearPublicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegresarCrearPublicacionActionPerformed
        LimpiarCamposProfesor();
        mostrarInicioProfesor();
        
    }//GEN-LAST:event_ButtonRegresarCrearPublicacionActionPerformed

    private void txtNombreMaterial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreMaterial1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMaterial1ActionPerformed

    private void ButtonCargarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCargarMaterialActionPerformed
        if(txtNombreMaterial1.getText().isEmpty() || pathImagen == ""){
            JOptionPane.showMessageDialog(rootPane, "Por favor, asigna un nomnbre al material");
        }else{
            ControlMaterial objcm = new ControlMaterial();
        //lPublicacion = new LinkedList<>();
        String nombre_materialP = txtNombreMaterial1.getText();
        int idp = 0;
        for (int i = 0; i < lPublicacion.size(); i++) {
            Publicacion get = lPublicacion.get(i);
            String PublicacionS = String.valueOf(jComboPublicaciones1.getSelectedItem());

            if (PublicacionS.equals(get.getTitulo_publicacion())) {
                idp = get.getId_publicacion();
            }
        }

        
        Material objm = new Material(nombre_materialP, pathImagen, idp);
        boolean t = objcm.insertarMaterial(objm);
        
        if (t) {
                JOptionPane.showMessageDialog(rootPane, "Insertado un material");
                mostrarInicioProfesor();
                LimpiarAgregarMaterial(); 
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se incertó a la base de datos");
            }
        }
        
        
    }//GEN-LAST:event_ButtonCargarMaterialActionPerformed

    private void btnCrearPublicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPublicacionActionPerformed
        //aqui se cargan las publicaciones
        
        if(txtTituloPublicacion.getText().isEmpty() || txtAreaDescripcion.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Por favor llena todos los campos");
        }else{
            ControlPublicacion objcp = new ControlPublicacion();
        String titulo_publicacionp = txtTituloPublicacion.getText();
        String descripcion_publicacionp = txtAreaDescripcion.getText();
        
        java.util.Date fechaActual = new java.util.Date();
        java.sql.Timestamp fechaPublicacion;
        fechaPublicacion = new java.sql.Timestamp(fechaActual.getTime());
        
        
        int idc = 0;
        for (int i = 0; i < lCurso.size(); i++) {
            Curso get = lCurso.get(i);
            String cursoS = String.valueOf(jComboCursos.getSelectedItem());

            if (cursoS.equals(get.getNombre_curso())) {
                idc = get.getId_curso();
            }
        }
        
        Publicacion objp = new Publicacion(fechaPublicacion, titulo_publicacionp, descripcion_publicacionp, idc);
        System.out.print(objp.toString());
        boolean t = objcp.insertPublicacion(objp);
        
        if (t) {
                JOptionPane.showMessageDialog(rootPane, "Insertado una publicacion");
                MostrarAgregarMaterial();
                LimpiarAgregarPublicacion(); 
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se incertó a la base de datos");
            }
        }
        
    }//GEN-LAST:event_btnCrearPublicacionActionPerformed

    private void jtCursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCursosMouseClicked
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(null, "Quieres inscribir este curso?", "Inscribir curso", dialogButton);
        if (dialogResult == JOptionPane.YES_OPTION) {
            int fila = jtCursos.getSelectedRow();
            if (fila >= 0) {
                ControlInscripcion objci = new ControlInscripcion();
                int id_curso = Integer.parseInt(jtCursos.getValueAt(fila, 0).toString());
                Inscripcion objins;
                objins = new Inscripcion(id_usuario, id_curso);
                boolean t = objci.insertarInscripcion(objins);
                //System.out.print(id_cursoe);//Comprobar que toma el id correcto
                if (t) {
                    JOptionPane.showMessageDialog(this, "Inscripcion exitosa");
                    ((DefaultTableModel)jtCursos.getModel()).removeRow(jtCursos.getSelectedRow());
                    MostrarMisCursos();
                } else {
                    JOptionPane.showMessageDialog(this, "Inscripcion no exitosa");
                }

            } else {
                JOptionPane.showMessageDialog(this, "Fila no seleccionada");
            }
        }
    }//GEN-LAST:event_jtCursosMouseClicked

    private void jtCursosEstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCursosEstudianteMouseClicked
     int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(null, "Quieres Entrar a este curso?", "Entrar al curso", dialogButton);
        if (dialogResult == JOptionPane.YES_OPTION) {
            int fila = jtCursosEstudiante.getSelectedRow();
            if (fila >=0) {
                    
                    id_cursoe = Integer.parseInt(jtCursosEstudiante.getValueAt(fila, 0).toString());
                    System.out.print(id_cursoe);
                    MostrarPublicaciones();
            } else {
                JOptionPane.showMessageDialog(this, "Fila no seleccionada");
            }
        }
        
        
        
    }//GEN-LAST:event_jtCursosEstudianteMouseClicked

    private void ButtonRegresarAMisCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegresarAMisCursosActionPerformed
     MostrarMisCursos();
    }//GEN-LAST:event_ButtonRegresarAMisCursosActionPerformed

    private void jComboCursosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboCursosItemStateChanged
        
        
        int idc = 0;
        for (int i = 0; i < lCurso.size(); i++) {
            Curso get = lCurso.get(i);
            String cursoS = String.valueOf(jComboCursos.getSelectedItem());

            if (cursoS.equals(get.getNombre_curso())) {
                idc = get.getId_curso();
            }
        }
                
        
        ControlPublicacion cp = new ControlPublicacion();
        lPublicacionC = cp.consultarPublicacionesCurso(idc);
        String matriz[][] = new String[lPublicacionC.size()][4];
        for (int i = 0; i < lPublicacionC.size(); i++) {
            matriz[i][0] = lPublicacionC.get(i).getId_publicacion() + "";
            matriz[i][1] = lPublicacionC.get(i).getFecha_publicacion().toString();
            matriz[i][2] = lPublicacionC.get(i).getTitulo_publicacion();
            matriz[i][3] = lPublicacionC.get(i).getDescripcion_publicacion();
        }

        jtPublicacionesProfesor.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "ID", "Fecha de Publicacion", "Titulo", "Informacion"
                }
        ));
        
        
        jtPublicacionesProfesor.getColumnModel().getColumn(0).setMinWidth(0);
        jtPublicacionesProfesor.getColumnModel().getColumn(0).setMaxWidth(0);
        jtPublicacionesProfesor.getColumnModel().getColumn(0).setWidth(0);
        
        
    }//GEN-LAST:event_jComboCursosItemStateChanged

    private void ButtonAbrirMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAbrirMaterialActionPerformed
        JFileChooser fileChooser = new JFileChooser();
         fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
         FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg","gif","png");
         fileChooser.addChoosableFileFilter(filter);
         int result = fileChooser.showSaveDialog(null);
         if(result == JFileChooser.APPROVE_OPTION){
             File selectedFile = fileChooser.getSelectedFile();
             String path = selectedFile.getAbsolutePath();
             
             pathImagen = path;
             subirImagen.setIcon(ResizeImage(path));
              }
         else if(result == JFileChooser.CANCEL_OPTION){
             System.out.println("No Data");
         }

    }//GEN-LAST:event_ButtonAbrirMaterialActionPerformed

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
    private javax.swing.JButton ButtonAbrirMaterial;
    private javax.swing.JButton ButtonAgregarContenidoCC;
    private javax.swing.JButton ButtonAgregarContenidoCP;
    private javax.swing.JButton ButtonAgregarCurso;
    private javax.swing.JButton ButtonAgregarCursoCM;
    private javax.swing.JButton ButtonAgregarCursoCP;
    private javax.swing.JButton ButtonAgregarMaterial;
    private javax.swing.JButton ButtonAgregarPublicacion;
    private javax.swing.JButton ButtonAgregarPublicacionCC;
    private javax.swing.JButton ButtonAgregarPublicacionCM;
    private javax.swing.JButton ButtonCargarMaterial;
    private javax.swing.JButton ButtonCerrarSesionEstudiante;
    private javax.swing.JButton ButtonCerrarSesionEstudiante1;
    private javax.swing.JButton ButtonCerrarSesionProfesor;
    private javax.swing.JButton ButtonCrearCurso;
    private javax.swing.JButton ButtonEntrarInicioEstudiante;
    private javax.swing.JButton ButtonEntrarInicioProfesor;
    private javax.swing.JButton ButtonIngresarInicio;
    private javax.swing.JButton ButtonInicioEstudiante;
    private javax.swing.JButton ButtonInicioProfesor;
    private javax.swing.JButton ButtonMisCursosEstudiante;
    private javax.swing.JButton ButtonRegistrarEstudiante;
    private javax.swing.JButton ButtonRegistrarInicio;
    private javax.swing.JButton ButtonRegistrarProfesor;
    private javax.swing.JButton ButtonRegistroEstudiante;
    private javax.swing.JButton ButtonRegistroProfesor;
    private javax.swing.JButton ButtonRegresarAMisCursos;
    private javax.swing.JButton ButtonRegresarCrearCurso;
    private javax.swing.JButton ButtonRegresarCrearMaterial;
    private javax.swing.JButton ButtonRegresarCrearPublicacion;
    private javax.swing.JButton ButtonRegresarMisCursosEstudiante;
    private javax.swing.JButton ButtonVolverInicioEstudiante;
    private javax.swing.JButton ButtonVolverInicioProfesor;
    private javax.swing.JButton ButtonVolverRegistroEstudiante;
    private javax.swing.JButton ButtonVolverRegistroProfesor;
    private javax.swing.JButton ButtonVolverRol;
    private javax.swing.JButton ButtonVolverRol1;
    private javax.swing.JButton btnCrearPublicacion;
    private javax.swing.JLabel imgBienvenido;
    private javax.swing.JLabel imgCrearCurso;
    private javax.swing.JLabel imgCursosEstudiante;
    private javax.swing.JLabel imgCursosProfesor;
    private javax.swing.JLabel imgInicio;
    private javax.swing.JLabel imgInicioEstudiante;
    private javax.swing.JLabel imgInicioProfesor;
    private javax.swing.JLabel imgMaterialProfesor;
    private javax.swing.JLabel imgPublicacionesEstudiante;
    private javax.swing.JLabel imgPublicacionesProfesor;
    private javax.swing.JLabel imgRegistroEstudiante;
    private javax.swing.JLabel imgRegistroProfesor;
    private javax.swing.JLabel imgRolIngreso;
    private javax.swing.JLabel imgRolRegistro;
    private javax.swing.JComboBox<String> jCCategoriaCurso;
    private javax.swing.JComboBox<String> jComboCursos;
    private javax.swing.JComboBox<String> jComboPublicaciones1;
    private javax.swing.JComboBox<String> jCpaisProfesor;
    private com.toedter.calendar.JDateChooser jDateNacimientoEstudiante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea jTDescripcionCurso;
    private javax.swing.JTextField jTNombreCurso;
    private javax.swing.JTextField jTapellido1Estudiante;
    private javax.swing.JTextField jTapellido1Profesor;
    private javax.swing.JTextField jTapellido2Estudiante;
    private javax.swing.JTextField jTapellido2Profesor;
    private javax.swing.JPasswordField jTcontraseñaEstudiante;
    private javax.swing.JPasswordField jTcontraseñaProfesor;
    private javax.swing.JTextField jTcorreoEstudiante;
    private javax.swing.JTextField jTcorreoProfesor;
    private javax.swing.JTextField jTdireccionProfesor;
    private javax.swing.JPasswordField jTingresarContraseñaEstudiante;
    private javax.swing.JPasswordField jTingresarContraseñaProfesor;
    private javax.swing.JTextField jTingresarCorreoEstudiante;
    private javax.swing.JTextField jTingresarCorreoProfesor;
    private javax.swing.JTextField jTnombre1Estudiante;
    private javax.swing.JTextField jTnombre1Profesor;
    private javax.swing.JTextField jTnombre2Estudiante;
    private javax.swing.JTextField jTnombre2Profesor;
    private javax.swing.JTable jtCursos;
    private javax.swing.JTable jtCursosEstudiante;
    private javax.swing.JTable jtCursosProfesor;
    private javax.swing.JTable jtPublicacionesE;
    private javax.swing.JTable jtPublicacionesProfesor;
    private javax.swing.JPanel panelBienvenido;
    private javax.swing.JPanel panelCrearCurso;
    private javax.swing.JPanel panelCursosEstudiante;
    private javax.swing.JPanel panelCursosProfesor;
    private javax.swing.JPanel panelInicio;
    private javax.swing.JPanel panelInicioEstudiante;
    private javax.swing.JPanel panelInicioProfesor;
    private javax.swing.JPanel panelMaterialProfesor;
    private javax.swing.JPanel panelPublicacionesEstudiante;
    private javax.swing.JPanel panelPublicacionesProfesor;
    private javax.swing.JPanel panelRegistroEstudiante;
    private javax.swing.JPanel panelRegistroProfesor;
    private javax.swing.JPanel panelRolIngreso;
    private javax.swing.JPanel panelRolRegistro;
    private javax.swing.JLabel subirImagen;
    private javax.swing.JTextArea txtAreaDescripcion;
    private javax.swing.JTextField txtNombreMaterial1;
    private javax.swing.JTextField txtTituloPublicacion;
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
        panelCrearCurso.setVisible(false);
        //Material
        panelMaterialProfesor.setVisible(false);
        //Bienvenido
        panelBienvenido.setVisible(false);
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

    private void limpiarCamposInicioEstudiante() {
        jTingresarContraseñaEstudiante.setText("");
        jTingresarCorreoEstudiante.setText("");
    }

    private void MostrarInicioEstudiante() {

        panelInicio.setVisible(false);
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
        panelCrearCurso.setVisible(false);
        //Material
        panelMaterialProfesor.setVisible(false);
        //Bienvenido
        panelBienvenido.setVisible(true);

        ControlCurso cc = new ControlCurso();
        lc = cc.consultarTodoCurso(id_usuario);
        
        
        String matriz[][] = new String[lc.size()][5];

        for (int i = 0; i < lc.size(); i++) {
            matriz[i][0] = lc.get(i).getId_curso() + "";
            matriz[i][1] = lc.get(i).getNombre_curso();
            matriz[i][2] = lc.get(i).getNombre_profesor();
            matriz[i][3] = lc.get(i).getCategoria();
            matriz[i][4] = lc.get(i).getDescripcion_curso();
        }

        jtCursos.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "ID", "Nombre del curso", "Nombre del profesor", "Categoria", "Descripcion"
                }
        ));

        //Ocultar el id de la columna
        jtCursos.getColumnModel().getColumn(0).setMinWidth(0);
        jtCursos.getColumnModel().getColumn(0).setMaxWidth(0);
        jtCursos.getColumnModel().getColumn(0).setWidth(0);

        JOptionPane.showMessageDialog(this, "Haz click sobre un curso para inscribirte en él'");
    }

    private void limpiarCamposInicioProfesor() {
        jTingresarContraseñaProfesor.setText("");
        jTingresarCorreoProfesor.setText("");
    }

    private void mostrarInicioProfesor() {
        panelInicio.setVisible(false);
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
        panelCursosProfesor.setVisible(true);
        panelCrearCurso.setVisible(false);
        //Material
        panelMaterialProfesor.setVisible(false);
        //Bienvenido
        panelBienvenido.setVisible(false);

        ControlCurso cc = new ControlCurso();
        lc = cc.consultarCursosProfesor(id_usuario);

        String matriz[][] = new String[lc.size()][5];

        for (int i = 0; i < lc.size(); i++) {
            matriz[i][0] = lc.get(i).getNombre_curso();
            matriz[i][1] = lc.get(i).getFecha_creacion_curso().toString();
            matriz[i][2] = lc.get(i).getCategoria();
            matriz[i][3] = lc.get(i).getDescripcion_curso();
        }

        jtCursosProfesor.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Nombre del curso", "Fecha de Creacion", "Categoria", "Descripcion"
                }
        ));

    }

    private void limpiarCrearCurso() {

        jTNombreCurso.setText("");
        jTDescripcionCurso.setText("");
        jCCategoriaCurso.setSelectedItem(0);
    }

    private void cerrarSesion() {
        id_usuario = -1;
        tipo = "";
    }

    private void MostrarAgregarCurso() {
        panelInicio.setVisible(false);
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
        panelCrearCurso.setVisible(true);
        //Material
        panelMaterialProfesor.setVisible(false);
        //Bienvenido
        panelBienvenido.setVisible(false);

        ControlCategoria objcat = new ControlCategoria();
        lCategoria = objcat.consultarClasificaciones();

        for (int j = 0; j < lCategoria.size(); j++) {
            Categoria objcategoria = lCategoria.get(j);
            jCCategoriaCurso.addItem(objcategoria.getNombre_categoria());
        }
    }

    private void MostrarAgregarPublicacion() {
        panelInicio.setVisible(false);
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
        panelPublicacionesProfesor.setVisible(true);
        //cursos
        panelCursosEstudiante.setVisible(false);
        panelCursosProfesor.setVisible(false);
        panelCrearCurso.setVisible(false);
        //Material
        panelMaterialProfesor.setVisible(false);
        //Bienvenido
        panelBienvenido.setVisible(false);
        
        lCurso = new LinkedList<>();
        ControlCurso objccl = new ControlCurso();
        lCurso = objccl.consultarCursosProfesor(id_usuario);

        for (int i = 0; i < lCurso.size(); i++) {
            Curso objetoCurso = lCurso.get(i);
            jComboCursos.addItem(objetoCurso.getNombre_curso());
        }
    }

    private void MostrarAgregarMaterial() {
        panelInicio.setVisible(false);
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
        panelCrearCurso.setVisible(false);
        //Material
        panelMaterialProfesor.setVisible(true);
        //Bienvenido
        panelBienvenido.setVisible(false);

        //para llamar la fk que se necesita la publicacion de publicacion
        ControlPublicacion objccl = new ControlPublicacion();
        lPublicacion = objccl.consultarPublicaciones();

        for (int i = 0; i < lPublicacion.size(); i++) {
            Publicacion objetoClasificacion = lPublicacion.get(i);
            jComboPublicaciones1.addItem(objetoClasificacion.getTitulo_publicacion());
        }
    }

    private void MostrarPublicaciones() {
        //Determinar visibilidad inicial de los paneles
        panelInicio.setVisible(false);
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
        panelPublicacionesEstudiante.setVisible(true);
        panelPublicacionesProfesor.setVisible(false);
        //cursos
        panelCursosEstudiante.setVisible(false);
        panelCursosProfesor.setVisible(false);
        panelCrearCurso.setVisible(false);
        //Material
        panelMaterialProfesor.setVisible(false);
        //Bienvenido
        panelBienvenido.setVisible(false);
        
        ControlPublicacion cp = new ControlPublicacion();
        lPublicacionC = cp.consultarPublicacionesCurso(id_cursoe);

        String matriz[][] = new String[lPublicacionC.size()][4];

        for (int i = 0; i < lPublicacionC.size(); i++) {
            matriz[i][0] = lPublicacionC.get(i).getId_publicacion() + "";
            matriz[i][1] = lPublicacionC.get(i).getFecha_publicacion().toString();
            matriz[i][2] = lPublicacionC.get(i).getTitulo_publicacion();
            matriz[i][3] = lPublicacionC.get(i).getDescripcion_publicacion();
        }

        jtPublicacionesE.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "ID", "Fecha de Publicacion", "Titulo", "Informacion"
                }
        ));
        
         //Ocultar el id de la columna
        jtPublicacionesE.getColumnModel().getColumn(0).setMinWidth(0);
        jtPublicacionesE.getColumnModel().getColumn(0).setMaxWidth(0);
        jtPublicacionesE.getColumnModel().getColumn(0).setWidth(0);
    }

    private void MostrarMisCursos() {
        
        panelInicio.setVisible(false);
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
        panelCursosEstudiante.setVisible(true);
        panelCursosProfesor.setVisible(false);
        panelCrearCurso.setVisible(false);
        //Material
        panelMaterialProfesor.setVisible(false);
        //Bienvenido
        panelBienvenido.setVisible(false);
        
        
        
        ControlCurso cc = new ControlCurso();
        lc = cc.consultarCursoEstudiante(id_usuario);

        String matriz[][] = new String[lc.size()][5];

        for (int i = 0; i < lc.size(); i++) {
            matriz[i][0] = lc.get(i).getId_curso() + "";
            matriz[i][1] = lc.get(i).getNombre_curso();
            matriz[i][2] = lc.get(i).getNombre_profesor();
            matriz[i][3] = lc.get(i).getDescripcion_curso();
            matriz[i][4] = lc.get(i).getCategoria(); 
            
            
                     
        }

        jtCursosEstudiante.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "ID","Curso","Profesor","Descripcion","Categoria"
                }
        ));
        //Ocultar el id de la columna
        jtCursosEstudiante.getColumnModel().getColumn(0).setMinWidth(0);
        jtCursosEstudiante.getColumnModel().getColumn(0).setMaxWidth(0);
        jtCursosEstudiante.getColumnModel().getColumn(0).setWidth(0);
        
    }

    private void LimpiarCamposProfesor() {
        
        jComboCursos.removeAllItems();
        jCCategoriaCurso.removeAllItems();
        jComboPublicaciones1.removeAllItems();
        
    }

    private void LimpiarAgregarPublicacion() {
       
        txtAreaDescripcion.setText("");
        txtTituloPublicacion.setText("");
        jComboCursos.setSelectedIndex(-1);
        
    }

    private void LimpiarAgregarMaterial() {
       txtNombreMaterial1.setText("");
       subirImagen.setIcon(null);
       pathImagen = "";
    }

    private Icon ResizeImage(String imgPath) {
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(subirImagen.getWidth(), subirImagen.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }

    
}
