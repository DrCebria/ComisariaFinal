package vistas;

import datos.ArchivosDAO;
import datos.JDBCDAO;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import modelo.Multa;
import modelo.Policia;

public class MultasListado extends javax.swing.JDialog {

    /**
     * Creates new form MultasListado
     */
    JDBCDAO jd_multas;
    ArchivosDAO archivosdao;

    public MultasListado(java.awt.Frame parent, boolean modal, JDBCDAO jd) {
        super(parent, modal);
        initComponents();
        String[] titulos = {"Descripción", "Fecha", "Importe", "IdPolicia", "NifInfractor", "IdTipo"};
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        this.jTablaMultas.setModel(model);

        this.setTitle("Listado de Multas");
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        //Poner Imagen de fondo en JFrame
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon MyImgCustom = new ImageIcon(this.getClass().getResource("/imagenes/fondo_listamultas.png"));
        JLabel fondo = new JLabel();
        fondo.setIcon(MyImgCustom);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, MyImgCustom.getIconWidth(), MyImgCustom.getIconHeight());

        jd_multas = jd;
        DefaultListModel modelo = new DefaultListModel();
        for (Policia p : jd_multas.MostrarPolicias("idPolicia")) {
            modelo.addElement(p);

        }
        this.jListPolicias.setModel(modelo);
    }

    public void cargaTablaMultas(List<Multa> ListaMultas) {
        String[] titulos = {"Descripción", "Fecha", "Importe", "IdPolicia", "NifInfractor", "IdTipo"};
        String[] fila = new String[6];

//        ListaMultas = jd_multas.MultasListado("idPolicia");
        DefaultTableModel model = new DefaultTableModel(null, titulos);
        for (Multa m : ListaMultas) {
            fila[0] = m.getDescripcion();
            fila[1] = m.getFecha().toString();
            fila[2] = Double.toString(m.getImporte());
            fila[3] = Integer.toString(m.getIdPolicia());
            fila[4] = m.getNifInfractor();
            fila[5] = Integer.toString(m.getIdTipo());
            model.addRow(fila);
        }
        this.jTablaMultas.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaMultas = new javax.swing.JTable();
        BotonBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListPolicias = new javax.swing.JList();
        BotonExportar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTablaMultas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTablaMultas);

        BotonBuscar.setText("Buscar multas");
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        jListPolicias.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListPolicias);

        BotonExportar.setText("Exportar multas");
        BotonExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonExportar, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonExportar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        // TODO add your handling code here:
        List<Policia> ListaPolicias = new ArrayList<>();
        ListaPolicias = jListPolicias.getSelectedValuesList();

        List<Multa> ListaMultas = jd_multas.ObtenerMultasPolicia(ListaPolicias);
        this.cargaTablaMultas(ListaMultas);
    }//GEN-LAST:event_BotonBuscarActionPerformed

    private void BotonExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonExportarActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        String text = "";
        int returnVal = fc.showSaveDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            String[] lineas = new String[jTablaMultas.getRowCount()];
            for (int i = 0; i < jTablaMultas.getRowCount(); i++) {

                for (int j = 0; j < jTablaMultas.getColumnCount(); j++) {
                    text = text + jTablaMultas.getValueAt(i, j) + ", ";

                }
                lineas[i] = text;
                text = "";
            }
            File fileToSave = fc.getSelectedFile();

            try {
                BufferedWriter br = new BufferedWriter(new FileWriter(fileToSave + ".txt"));
                br.write("Descripción, Fecha, Importe, IdPolicia, NifInfractor, IdTipo");
                for (String s : lineas) {
                    br.newLine();
                    br.write(s);

                }
                br.flush();
                br.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex, "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_BotonExportarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonExportar;
    private javax.swing.JList jListPolicias;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablaMultas;
    // End of variables declaration//GEN-END:variables
}
