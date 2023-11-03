package app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import utils.StringExtension;

public class Principal extends javax.swing.JFrame {

    private final String rutaPorDefectoAndroid = "\\app\\src\\main\\java\\com";

    public Principal() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/img/Logo.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnModificarNombreProyecto = new javax.swing.JButton();
        btnGenerarArquitectura = new javax.swing.JButton();
        taRutaSeleccionada = new javax.swing.JTextField();
        btnSeleccionarProyecto = new javax.swing.JButton();
        imgEstado = new javax.swing.JLabel();
        lbEstado = new javax.swing.JLabel();
        lbTitutlo1 = new javax.swing.JLabel();
        tfNombreProyecto = new javax.swing.JTextField();
        lbTitulo2 = new javax.swing.JLabel();
        btnRecomendacionesNombreProyecto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modificador Proyecto Android");
        setPreferredSize(new java.awt.Dimension(510, 375));
        setResizable(false);

        btnModificarNombreProyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ModificarNombreProyecto.png"))); // NOI18N
        btnModificarNombreProyecto.setText("Modificar nombre proyecto");
        btnModificarNombreProyecto.setToolTipText("Modificar nombre en todo el proyecto");
        btnModificarNombreProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarNombreProyectoActionPerformed(evt);
            }
        });

        btnGenerarArquitectura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/EstructuraCarpetas.png"))); // NOI18N
        btnGenerarArquitectura.setText("Generar arquitectura");
        btnGenerarArquitectura.setToolTipText("Genera arquitectur MVVM Android");
        btnGenerarArquitectura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarArquitecturaActionPerformed(evt);
            }
        });

        taRutaSeleccionada.setFocusable(false);

        btnSeleccionarProyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Carpeta.png"))); // NOI18N
        btnSeleccionarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarProyectoActionPerformed(evt);
            }
        });

        imgEstado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Informacion.png"))); // NOI18N

        lbEstado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbEstado.setText("Selecciona un proyecto de Android.");

        lbTitutlo1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTitutlo1.setText("Ruta seleccionada");

        lbTitulo2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTitulo2.setText("Nombre proyecto");

        btnRecomendacionesNombreProyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/InformacionNombreProyecto.png"))); // NOI18N
        btnRecomendacionesNombreProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecomendacionesNombreProyectoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbTitulo2)
                        .addGap(163, 163, 163))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbTitutlo1)
                        .addGap(163, 163, 163))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(tfNombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRecomendacionesNombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnGenerarArquitectura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnModificarNombreProyecto))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(imgEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbEstado))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(taRutaSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSeleccionarProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbTitutlo1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(taRutaSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeleccionarProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(lbTitulo2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRecomendacionesNombreProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(tfNombreProyecto))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imgEstado))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerarArquitectura)
                    .addComponent(btnModificarNombreProyecto))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private boolean esProyectoAndroid(String ruta) {
        return new File(ruta + rutaPorDefectoAndroid).exists();
    }

    private File obtenRutaProyectoAndroid(File rutaRaiz) {
        return new File(rutaRaiz.listFiles()[0].toString());
    }

    private void modificaContenidoFichero(String rutaFichero, String cadenaAntigua, String cadenaNueva, String[] excepciones) {
        String contenidoFichero = "";

        // Leer fichero
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(rutaFichero), StandardCharsets.UTF_8))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                contenidoFichero += (linea.contains(cadenaAntigua) && !new StringExtension(linea).containsWithArray(excepciones)) ? cadenaNueva.concat("\n") : linea.concat("\n");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer el fichero");
        }
        // Escribir fichero
        try (PrintWriter pw = new PrintWriter( 
                new BufferedWriter(
                    new OutputStreamWriter(
                        new FileOutputStream(rutaFichero, false), StandardCharsets.UTF_8)))) {
            pw.print(contenidoFichero);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al escribir en el fichero");
        }
    }

    private void btnModificarNombreProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarNombreProyectoActionPerformed
        try {
            if(this.taRutaSeleccionada.getText().isEmpty()) throw new Exception("Debes especificar una ruta de un proyecto Android");
            if(!esProyectoAndroid(this.taRutaSeleccionada.getText())) throw new Exception("La ruta especificada no es un proyecto de Android.");
            if(tfNombreProyecto.getText().isEmpty()) throw new Exception("El nombre del proyecto no puede estar vacío");
            File rutaProyectoAndroid = obtenRutaProyectoAndroid(new File(this.taRutaSeleccionada.getText() + rutaPorDefectoAndroid));
            File carpetaTest = obtenRutaProyectoAndroid(new File(this.taRutaSeleccionada.getText() + "\\app\\src\\test\\java\\com"));
            File carpetaAndroidTest = obtenRutaProyectoAndroid(new File(this.taRutaSeleccionada.getText() + "\\app\\src\\androidTest\\java\\com"));

            modificaContenidoFichero(this.taRutaSeleccionada.getText() + "\\settings.gradle.kts", "rootProject.name", String.format("rootProject.name = \"%s\"", tfNombreProyecto.getText()), new String[]{});
            modificaContenidoFichero(this.taRutaSeleccionada.getText() + "\\app\\build.gradle.kts", "namespace", String.format("\tnamespace = \"com.%s\"", tfNombreProyecto.getText().toLowerCase()), new String[]{});
            modificaContenidoFichero(this.taRutaSeleccionada.getText() + "\\app\\build.gradle.kts", "applicationId", String.format("\t\tapplicationId = \"com.%s\"", tfNombreProyecto.getText().toLowerCase()), new String[]{});
            modificaContenidoFichero(this.taRutaSeleccionada.getText() + "\\app\\src\\main\\res\\values\\themes.xml", "name", String.format("\t<style name=\"Theme.%s\" parent=\"android:Theme.Material.Light.NoActionBar\" />", tfNombreProyecto.getText()), new String[]{});
            modificaContenidoFichero(this.taRutaSeleccionada.getText() + "\\app\\src\\main\\res\\values\\strings.xml", "name", String.format("\t<string name=\"app_name\">%s</string>", tfNombreProyecto.getText()), new String[]{});
            modificaContenidoFichero(rutaProyectoAndroid.getAbsolutePath() + "\\ui\\theme\\Theme.kt", "fun", String.format("fun %sTheme(", tfNombreProyecto.getText()), new String[]{});
            modificaContenidoFichero(rutaProyectoAndroid.getAbsolutePath() + "\\ui\\theme\\Color.kt", "package", String.format("package com.%s.ui.theme", tfNombreProyecto.getText().toLowerCase()), new String[]{});
            modificaContenidoFichero(rutaProyectoAndroid.getAbsolutePath() + "\\ui\\theme\\Theme.kt", "package", String.format("package com.%s.ui.theme", tfNombreProyecto.getText().toLowerCase()), new String[]{});
            modificaContenidoFichero(rutaProyectoAndroid.getAbsolutePath() + "\\ui\\theme\\Type.kt", "package", String.format("package com.%s.ui.theme", tfNombreProyecto.getText().toLowerCase()), new String[]{});
            modificaContenidoFichero(rutaProyectoAndroid.getAbsolutePath() + "\\MainActivity.kt", "package", String.format("package com.%s", tfNombreProyecto.getText().toLowerCase()), new String[]{});
            modificaContenidoFichero(rutaProyectoAndroid.getAbsolutePath() + "\\MainActivity.kt", "import com.", String.format("import com.%s.ui.theme.%sTheme", tfNombreProyecto.getText().toLowerCase(), tfNombreProyecto.getText()), new String[]{});
            modificaContenidoFichero(rutaProyectoAndroid.getAbsolutePath() + "\\MainActivity.kt", "Theme", String.format("\t%sTheme {", tfNombreProyecto.getText()), new String[]{ "color =", "import" });
            modificaContenidoFichero(this.taRutaSeleccionada.getText() + "\\app\\src\\main\\AndroidManifest.xml", "android:theme", String.format("\t\tandroid:theme=\"@style/Theme.%s\"", tfNombreProyecto.getText()), new String[]{ ">" });
            modificaContenidoFichero(this.taRutaSeleccionada.getText() + "\\app\\src\\main\\AndroidManifest.xml", "android:theme", String.format("\t\t\tandroid:theme=\"@style/Theme.%s\">", tfNombreProyecto.getText()), new String[]{ String.format("android:theme=\"@style/Theme.%s\"" , tfNombreProyecto.getText())});
            modificaContenidoFichero(this.taRutaSeleccionada.getText() + "\\app\\src\\main\\AndroidManifest.xml", "android:name", String.format("\t\t\tandroid:name=\"com.%s.MainActivity\"", tfNombreProyecto.getText().toLowerCase()), new String[]{ "action", "category", "hardware", "permission", "androidx", "support" });
            carpetaTest.renameTo(new File(carpetaTest.getParent() + "\\" + tfNombreProyecto.getText().toLowerCase()));
            carpetaAndroidTest.renameTo(new File(carpetaAndroidTest.getParent()  + "\\" + tfNombreProyecto.getText().toLowerCase()));
            rutaProyectoAndroid.renameTo(new File(rutaProyectoAndroid.getParent()  + "\\" + tfNombreProyecto.getText().toLowerCase()));
            new File(taRutaSeleccionada.getText()).renameTo(new File(new File(taRutaSeleccionada.getText()).getParent() + "\\" + tfNombreProyecto.getText()));new File(taRutaSeleccionada.getText()).renameTo(new File(new File(taRutaSeleccionada.getText()).getParent() + "\\" + tfNombreProyecto.getText()));
            imgEstado.setIcon(new ImageIcon(getClass().getResource("/img/Correcto.png")));
            lbEstado.setText("Proyecto modificado correctamente.");
        } catch(Exception ex) {
            imgEstado.setIcon(new ImageIcon(getClass().getResource("/img/Error.png")));
            lbEstado.setText(ex.getMessage());
        }
    }//GEN-LAST:event_btnModificarNombreProyectoActionPerformed

    private void btnGenerarArquitecturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarArquitecturaActionPerformed
        HashMap<String, String[]> estructuraCarpetas = new HashMap<String, String[]>() {
            {
                put("ui", new String[]{"theme", "views", "navigation", "composables", "features"});
                put("utilities", new String[]{});
                put("di", new String[]{});
                put("models", new String[]{});
                put("data", new String[]{"mocks", "room", "firestore", "services"});
            }
        };
        
        if (esProyectoAndroid(this.taRutaSeleccionada.getText())) {
            File rutaProyectoAndroid = obtenRutaProyectoAndroid(new File(this.taRutaSeleccionada.getText() + rutaPorDefectoAndroid));

            for (Map.Entry<String, String[]> conjuntoCarpetas : estructuraCarpetas.entrySet()) {
                File carpetaAgrupacion = new File(rutaProyectoAndroid + "\\" + conjuntoCarpetas.getKey());
                if (!carpetaAgrupacion.exists()) carpetaAgrupacion.mkdir();
                for (String subcarpetaAgrupacion : conjuntoCarpetas.getValue()) {
                    File subcarpeta = new File(carpetaAgrupacion.getAbsoluteFile() + "\\" + subcarpetaAgrupacion);
                    if (!subcarpeta.exists()) subcarpeta.mkdir();
                }
            }
            imgEstado.setIcon(new ImageIcon(getClass().getResource("/img/Correcto.png")));
            lbEstado.setText("Estructura generada correctamente.");
        } else {
            imgEstado.setIcon(new ImageIcon(getClass().getResource("/img/Error.png")));
            lbEstado.setText("La ruta especificada no es un proyecto de Android.");
        }
    }//GEN-LAST:event_btnGenerarArquitecturaActionPerformed

    private void btnSeleccionarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarProyectoActionPerformed
        imgEstado.setIcon(new ImageIcon(getClass().getResource("/img/Informacion.png")));
        lbEstado.setText("Selecciona un proyecto de Android.");

        // Mostrar ventana FileChooser
        JFileChooser selectorCarpeta = new JFileChooser();
        selectorCarpeta.setCurrentDirectory(new File("."));
        selectorCarpeta.setDialogTitle("Seleccionar carpeta");
        selectorCarpeta.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        selectorCarpeta.setAcceptAllFileFilterUsed(false);
        if (selectorCarpeta.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            taRutaSeleccionada.setText(selectorCarpeta.getSelectedFile().toString());
            // Poner nombre proyecto automáticamente
            if (esProyectoAndroid(selectorCarpeta.getSelectedFile().toString())) {
                tfNombreProyecto.setText(new File(selectorCarpeta.getSelectedFile().toString()).getName());
                imgEstado.setIcon(new ImageIcon(getClass().getResource("/img/Informacion.png")));
                lbEstado.setText("Modifica el nombre del proyecto.");
            } else {
                imgEstado.setIcon(new ImageIcon(getClass().getResource("/img/Error.png")));
                lbEstado.setText("La ruta especificada no es un proyecto de Android.");
            }
        }
    }//GEN-LAST:event_btnSeleccionarProyectoActionPerformed

    private void btnRecomendacionesNombreProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecomendacionesNombreProyectoActionPerformed
        new Recomendaciones(this,true).setVisible(true);
    }//GEN-LAST:event_btnRecomendacionesNombreProyectoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarArquitectura;
    private javax.swing.JButton btnModificarNombreProyecto;
    private javax.swing.JButton btnRecomendacionesNombreProyecto;
    private javax.swing.JButton btnSeleccionarProyecto;
    private javax.swing.JLabel imgEstado;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbTitulo2;
    private javax.swing.JLabel lbTitutlo1;
    private javax.swing.JTextField taRutaSeleccionada;
    private javax.swing.JTextField tfNombreProyecto;
    // End of variables declaration//GEN-END:variables
}
