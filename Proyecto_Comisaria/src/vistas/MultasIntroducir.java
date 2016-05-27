package vistas;

import datos.JDBCDAO;
import java.awt.BorderLayout;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import modelo.Multa;
import modelo.MultaTipo;
import modelo.Policia;

public class MultasIntroducir extends javax.swing.JDialog {

    /**
     * Creates new form MultasIntroducir
     */
    JDBCDAO jd_multas;

    public MultasIntroducir(java.awt.Frame parent, boolean modal, JDBCDAO jdbcdao) {
        super(parent, modal);
        initComponents();
        this.setTitle("Introducción de Multas");
        this.setLocationRelativeTo(null);
        jd_multas = jdbcdao;

        //Lista auxiliar
        DefaultListModel modelo = new DefaultListModel();

        //Carga de Datos
        int id = Integer.parseInt(jdbcdao.recogerUltimo("select * from multas order by id", "id")) + 1;
        multaID.setText(Integer.toString(id));

        try {
            for (MultaTipo mt : jd_multas.recogerMultasTipo()) {
                TipoCombox.addItem(mt);
            }

            for (Policia p : jd_multas.MostrarPolicias("idPolicia")) {
                modelo.addElement(p);

            }
            this.PoliciaList.setModel(modelo);

        } catch (SQLException ex) {
            Logger.getLogger(MultasIntroducir.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        InsertarMulta = new javax.swing.JButton();
        DescripcionField = new javax.swing.JTextField();
        ImporteSpinner = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PoliciaList = new javax.swing.JList();
        TipoCombox = new javax.swing.JComboBox();
        multaID = new javax.swing.JLabel();
        nifFormatted = new javax.swing.JFormattedTextField();
        FechaChooser = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText(" Policía");

        jLabel2.setText("ID Multa");

        jLabel3.setText("Descripción");

        jLabel4.setText("Fecha");

        jLabel5.setText("Importe");

        InsertarMulta.setText("Insertar Multa");
        InsertarMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarMultaActionPerformed(evt);
            }
        });

        DescripcionField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        DescripcionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescripcionFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("NIF Infractor");

        jLabel7.setText("Tipo Multa");

        jScrollPane1.setViewportView(PoliciaList);

        TipoCombox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TipoComboxItemStateChanged(evt);
            }
        });

        try {
            nifFormatted.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        FechaChooser.setDateFormatString("yyyy-MM-dd HH:mm:ss");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ImporteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(InsertarMulta))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DescripcionField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(multaID, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TipoCombox, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                    .addComponent(FechaChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nifFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(multaID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addComponent(FechaChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(DescripcionField, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TipoCombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(nifFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(ImporteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InsertarMulta)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InsertarMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarMultaActionPerformed
        // TODO add your handling code here:
        String descripcion, nifInfractor, prueba;
        java.util.Date fecha_java;
        double importe;
        int idPolicia, idTipo;
        Policia p;
        MultaTipo mt;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        descripcion = DescripcionField.getText();

        fecha_java = FechaChooser.getDate();

        importe = Double.parseDouble(ImporteSpinner.getValue().toString());

        p = (Policia) PoliciaList.getSelectedValue();
        idPolicia = p.getIdPolicia();

        nifInfractor = nifFormatted.getText();
        if (nifInfractor.equalsIgnoreCase("        - ")) {
            nifInfractor = null;
        }

        mt = (MultaTipo) TipoCombox.getSelectedItem();
        idTipo = mt.getId();

        Multa m = new Multa(descripcion, fecha_java, importe, idPolicia, nifInfractor, idTipo);

        try {
            jd_multas.introducirMulta(m);
            JOptionPane.showMessageDialog(this, "La multa se ha introducido correctamente.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "La multa no se ha introducido. Error: " + ex);
        }

    }//GEN-LAST:event_InsertarMultaActionPerformed

    private void DescripcionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescripcionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescripcionFieldActionPerformed

    private void TipoComboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TipoComboxItemStateChanged

        try {
            for (MultaTipo mt : jd_multas.recogerMultasTipo()) {
                if (this.TipoCombox.getSelectedItem().toString().equalsIgnoreCase(mt.toString())) {
                    this.ImporteSpinner.setValue(mt.getImporte());
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MultasIntroducir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TipoComboxItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DescripcionField;
    private com.toedter.calendar.JDateChooser FechaChooser;
    private javax.swing.JSpinner ImporteSpinner;
    private javax.swing.JButton InsertarMulta;
    private javax.swing.JList PoliciaList;
    private javax.swing.JComboBox TipoCombox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel multaID;
    private javax.swing.JFormattedTextField nifFormatted;
    // End of variables declaration//GEN-END:variables
}
