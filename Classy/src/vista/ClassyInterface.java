
package vista;


public class ClassyInterface extends javax.swing.JFrame {

    
    
    public ClassyInterface() {
        initComponents();
        
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
        ButtonIngresarInicio.setOpaque(false);
        ButtonIngresarInicio.setContentAreaFilled(false); //Hacer el contenido Trasnparente
        ButtonIngresarInicio.setBorderPainted(false);
        
        
        ButtonRegistrarInicio.setOpaque(false);
        ButtonRegistrarInicio.setContentAreaFilled(false); 
        ButtonRegistrarInicio.setBorderPainted(false);
        
        ButtonRegistroEstudiante.setOpaque(false);
        ButtonRegistroEstudiante.setContentAreaFilled(false); 
        ButtonRegistroEstudiante.setBorderPainted(false);
                
        ButtonRegistroProfesor.setOpaque(false);
        ButtonRegistroProfesor.setContentAreaFilled(false); 
        ButtonRegistroProfesor.setBorderPainted(false);
        
        ButtonVolverRol.setOpaque(false);
        ButtonVolverRol.setContentAreaFilled(false); 
        ButtonVolverRol.setBorderPainted(false);
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
        imgRegistroEstudiante = new javax.swing.JLabel();
        panelRegistroProfesor = new javax.swing.JPanel();
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
        ButtonIngresarInicio.setText("Ingresar");
        ButtonIngresarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonIngresarInicioActionPerformed(evt);
            }
        });
        panelInicio.add(ButtonIngresarInicio);
        ButtonIngresarInicio.setBounds(730, 780, 460, 100);

        ButtonRegistrarInicio.setBackground(new java.awt.Color(255, 255, 255));
        ButtonRegistrarInicio.setText("Registrar");
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

        imgRegistroEstudiante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgRegistroEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Registro 1.0.png"))); // NOI18N
        panelRegistroEstudiante.add(imgRegistroEstudiante);
        imgRegistroEstudiante.setBounds(10, 0, 1920, 1080);

        getContentPane().add(panelRegistroEstudiante);
        panelRegistroEstudiante.setBounds(10, 11, 1920, 1080);

        panelRegistroProfesor.setBackground(new java.awt.Color(204, 204, 204));
        panelRegistroProfesor.setMaximumSize(new java.awt.Dimension(1920, 1080));
        panelRegistroProfesor.setMinimumSize(new java.awt.Dimension(1920, 1080));
        panelRegistroProfesor.setLayout(null);

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
        ButtonRegistroEstudiante.setText("Estudiante");
        ButtonRegistroEstudiante.setAlignmentY(0.0F);
        ButtonRegistroEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegistroEstudianteActionPerformed(evt);
            }
        });
        panelRolRegistro.add(ButtonRegistroEstudiante);
        ButtonRegistroEstudiante.setBounds(1070, 570, 400, 60);

        ButtonRegistroProfesor.setBackground(new java.awt.Color(153, 0, 0));
        ButtonRegistroProfesor.setText("Profesor");
        ButtonRegistroProfesor.setAlignmentY(0.0F);
        panelRolRegistro.add(ButtonRegistroProfesor);
        ButtonRegistroProfesor.setBounds(530, 570, 400, 60);

        ButtonVolverRol.setBackground(new java.awt.Color(153, 0, 0));
        ButtonVolverRol.setText("Volver");
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
    private javax.swing.JButton ButtonRegistrarInicio;
    private javax.swing.JButton ButtonRegistroEstudiante;
    private javax.swing.JButton ButtonRegistroProfesor;
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
}
