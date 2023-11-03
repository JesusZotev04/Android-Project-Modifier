package app;

import javax.swing.ImageIcon;

public class Recomendaciones extends javax.swing.JDialog {

    public Recomendaciones(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/img/InformacionNombreProyecto.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imgArroba = new javax.swing.JLabel();
        jlEspaciosEnBlanco = new javax.swing.JLabel();
        imgEspaciosEnBlanco = new javax.swing.JLabel();
        jlCaracteresEspeciales = new javax.swing.JLabel();
        imgNombresLargos = new javax.swing.JLabel();
        jlNombreLargos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Recomendaciones Nombre Proyecto");

        imgArroba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Arroba.png"))); // NOI18N

        jlEspaciosEnBlanco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlEspaciosEnBlanco.setText("No utilices espacios en blanco.");
        jlEspaciosEnBlanco.setToolTipText("");

        imgEspaciosEnBlanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Espacio.png"))); // NOI18N

        jlCaracteresEspeciales.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlCaracteresEspeciales.setText("No utilices caracteres especiales.");
        jlCaracteresEspeciales.setToolTipText("");

        imgNombresLargos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/NombreLargo.png"))); // NOI18N

        jlNombreLargos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlNombreLargos.setText("No poner nombres muy largos.");
        jlNombreLargos.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imgNombresLargos)
                        .addGap(18, 18, 18)
                        .addComponent(jlNombreLargos))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imgEspaciosEnBlanco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlEspaciosEnBlanco))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imgArroba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlCaracteresEspeciales)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imgArroba, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jlCaracteresEspeciales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgEspaciosEnBlanco, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlEspaciosEnBlanco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgNombresLargos)
                    .addComponent(jlNombreLargos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(Recomendaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recomendaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recomendaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recomendaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Recomendaciones dialog = new Recomendaciones(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgArroba;
    private javax.swing.JLabel imgEspaciosEnBlanco;
    private javax.swing.JLabel imgNombresLargos;
    private javax.swing.JLabel jlCaracteresEspeciales;
    private javax.swing.JLabel jlEspaciosEnBlanco;
    private javax.swing.JLabel jlNombreLargos;
    // End of variables declaration//GEN-END:variables
}
