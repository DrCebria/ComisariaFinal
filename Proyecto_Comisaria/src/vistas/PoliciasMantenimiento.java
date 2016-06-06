package vistas;

import datos.JDBCDAO;
import java.io.File;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelo.Policia;

public class PoliciasMantenimiento extends javax.swing.JDialog {

    /**
     * Creates new form PoliciasMantenimiento
     */
    JDBCDAO jd_policias;
    int accion;
    String rutaFoto;

    public PoliciasMantenimiento(java.awt.Frame parent, boolean modal, JDBCDAO jd, Policia pSelected) {
        super(parent, modal);
        initComponents();
        this.setTitle("Mantenimiento de Policias");
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        //Poner Imagen de fondo en JFrame
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon MyImgCustom = new ImageIcon(this.getClass().getResource("/imagenes/fondo_policiamantenimiento.png"));
        JLabel fondo = new JLabel();
        fondo.setIcon(MyImgCustom);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, MyImgCustom.getIconWidth(), MyImgCustom.getIconHeight());

        jd_policias = jd;
        if (pSelected != null) {
            accion = 1;
            FieldIDPolicia.setText(pSelected.getIdPolicia().toString());
            FieldNombre.setText(pSelected.getNombre());
            FieldNPlaca.setText(pSelected.getNumPlaca());
            FieldEdad.setText(pSelected.getEdad().toString());
            FieldDepartamento.setText(pSelected.getDepartamento());
        } else {
            FieldIDPolicia.setText(String.valueOf(Integer.parseInt(jd_policias.recogerUltimoPolicia()) + 1));
            BotonAplicarCambios.setText("Insertar policia");
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PanelFoto = new javax.swing.JPanel();
        Foto = new javax.swing.JLabel();
        FieldNombre = new javax.swing.JTextField();
        FieldEdad = new javax.swing.JTextField();
        FieldDepartamento = new javax.swing.JTextField();
        BotonFoto = new javax.swing.JButton();
        BotonAplicarCambios = new javax.swing.JButton();
        FieldNPlaca = new javax.swing.JFormattedTextField();
        FieldIDPolicia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Policia ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Número Placa");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Edad");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Departamento");

        PanelFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PanelFotoLayout = new javax.swing.GroupLayout(PanelFoto);
        PanelFoto.setLayout(PanelFotoLayout);
        PanelFotoLayout.setHorizontalGroup(
            PanelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFotoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(Foto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelFotoLayout.setVerticalGroup(
            PanelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFotoLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(Foto)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        FieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldNombreActionPerformed(evt);
            }
        });

        BotonFoto.setText("Cambiar Foto");
        BotonFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFotoActionPerformed(evt);
            }
        });

        BotonAplicarCambios.setText("Aplicar Cambios");
        BotonAplicarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAplicarCambiosActionPerformed(evt);
            }
        });

        try {
            FieldNPlaca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####UU")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        FieldIDPolicia.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(63, 63, 63)
                                    .addComponent(FieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(FieldNPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(FieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FieldDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(BotonAplicarCambios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FieldIDPolicia, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldIDPolicia, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(PanelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonFoto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(FieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(FieldNPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(FieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(FieldDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(BotonAplicarCambios)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldNombreActionPerformed

    private void BotonAplicarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAplicarCambiosActionPerformed
        // TODO add your handling code here:

        if (accion == 1) {
            Policia pActualizado = new Policia(Integer.parseInt(FieldIDPolicia.getText()), FieldNombre.getText(), FieldNPlaca.getText(), Integer.parseInt(FieldEdad.getText()), FieldDepartamento.getText(), this.rutaFoto);
            try {
                if (jd_policias.ActualizarPolicias(pActualizado) == 1) {
                    JOptionPane.showMessageDialog(this, "Se ha modificado correctamente el policia.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "No se ha podido modificar el policia correctamente.\nError: " + ex, "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            
            try{
                Policia pInsertar = new Policia(Integer.parseInt(FieldIDPolicia.getText()), FieldNombre.getText(), FieldNPlaca.getText(), Integer.parseInt(FieldEdad.getText()), FieldDepartamento.getText(), this.rutaFoto);
            
            
            
            try {
                if (jd_policias.InsertarPolicias(pInsertar) == 1) {
                    JOptionPane.showMessageDialog(this, "Se ha insertado correctamente el policia.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "No se ha podido insertar el policia correctamente.\nHay campos vacios o incorrectos.\nError: " + ex, "Error", JOptionPane.ERROR_MESSAGE);
            }
            }catch (java.lang.NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Faltan campos necesarios.", "Error", JOptionPane.ERROR_MESSAGE);
         
            }

            if (FieldNombre.getText().isEmpty()) {
                FieldNombre.setBorder(new LineBorder(java.awt.Color.RED));
            } else {
                FieldNombre.setBorder(null);
            }

            if (FieldNPlaca.getText().isEmpty()) {
                FieldNPlaca.setBorder(new LineBorder(java.awt.Color.RED));
            } else {
                FieldNPlaca.setBorder(null);
            }
        }
    }//GEN-LAST:event_BotonAplicarCambiosActionPerformed

    private void BotonFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFotoActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser("C:\\Users\\Gerard\\Documents\\NetBeansProjects\\Comisaria\\Proyecto_Comisaria");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de imagen: ", "png");
        fc.setFileFilter(filter);
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            String rutaImagen = file.getAbsolutePath();
            this.rutaFoto = rutaImagen;
            ImageIcon foto = new ImageIcon(rutaImagen);
            this.Foto.setIcon(foto);

        }
    }//GEN-LAST:event_BotonFotoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAplicarCambios;
    private javax.swing.JButton BotonFoto;
    private javax.swing.JTextField FieldDepartamento;
    private javax.swing.JTextField FieldEdad;
    private javax.swing.JLabel FieldIDPolicia;
    private javax.swing.JFormattedTextField FieldNPlaca;
    private javax.swing.JTextField FieldNombre;
    private javax.swing.JLabel Foto;
    private javax.swing.JPanel PanelFoto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
