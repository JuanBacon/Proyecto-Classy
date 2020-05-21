
package vista;


public class ClassyInterface extends javax.swing.JFrame {

    
    
    public ClassyInterface() {
        initComponents();
        
        //Determinar visibilidad inicial de los paneles
        panelInicio.setVisible(true);
        panelRegistroEstudiante.setVisible(false);
        panelInicioEstudiante.setVisible(false);
        panelCursos.setVisible(false);
    }

   
    
    //NO TOCAR
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInicio = new javax.swing.JPanel();
        imgInicio = new javax.swing.JLabel();
        panelRegistroEstudiante = new javax.swing.JPanel();
        imgRegistroEstudiante = new javax.swing.JLabel();
        panelCursos = new javax.swing.JPanel();
        imgCursos = new javax.swing.JLabel();
        panelInicioEstudiante = new javax.swing.JPanel();
        imgInicio1 = new javax.swing.JLabel();

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

        imgInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Entrada 1.2.png"))); // NOI18N
        imgInicio.setMaximumSize(new java.awt.Dimension(1920, 1080));
        imgInicio.setMinimumSize(new java.awt.Dimension(1920, 1080));
        imgInicio.setPreferredSize(new java.awt.Dimension(1920, 1080));
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

        panelCursos.setBackground(new java.awt.Color(204, 204, 204));
        panelCursos.setMaximumSize(new java.awt.Dimension(1920, 1080));
        panelCursos.setMinimumSize(new java.awt.Dimension(1920, 1080));
        panelCursos.setLayout(null);

        imgCursos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgCursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Cursos 1.0.png"))); // NOI18N
        panelCursos.add(imgCursos);
        imgCursos.setBounds(0, 0, 1920, 1080);

        getContentPane().add(panelCursos);
        panelCursos.setBounds(10, 11, 1920, 1080);

        panelInicioEstudiante.setBackground(new java.awt.Color(204, 204, 204));
        panelInicioEstudiante.setMaximumSize(new java.awt.Dimension(1920, 1080));
        panelInicioEstudiante.setMinimumSize(new java.awt.Dimension(1920, 1080));
        panelInicioEstudiante.setLayout(null);

        imgInicio1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgInicio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Entrada 1.2.png"))); // NOI18N
        panelInicioEstudiante.add(imgInicio1);
        imgInicio1.setBounds(0, 0, 1920, 1080);

        getContentPane().add(panelInicioEstudiante);
        panelInicioEstudiante.setBounds(10, 11, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JLabel imgCursos;
    private javax.swing.JLabel imgInicio;
    private javax.swing.JLabel imgInicio1;
    private javax.swing.JLabel imgRegistroEstudiante;
    private javax.swing.JPanel panelCursos;
    private javax.swing.JPanel panelInicio;
    private javax.swing.JPanel panelInicioEstudiante;
    private javax.swing.JPanel panelRegistroEstudiante;
    // End of variables declaration//GEN-END:variables
}
