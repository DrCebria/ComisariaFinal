package vistas;

import datos.JDBCDAO;
import java.sql.PreparedStatement;
import java.util.Calendar;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import modelo.Policia;

public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    java.util.Calendar calendario;
    int dia, mes, año, hora, minutos, segundos;
    String horaf = "";
    JDBCDAO jd = new JDBCDAO();

    public Principal() {
        initComponents();

        //Cargar Tabla
//        String[] titulos = {"idPolicia", "Nombre", "Nº Placa", "Edad", "Departamento"};
//        String[] fila = new String[4];
//        List<Policia> listaPolicias;
//        listaPolicias = jd.MostrarPolicias();
//        DefaultTableModel model = new DefaultTableModel(null, titulos);
//        for (Policia p : listaPolicias) {
//            fila[0] = p.getIdPolicia().toString();
//            fila[1] = p.getNombre();
//            fila[2] = p.getNumPlaca();
//            fila[3] = p.getEdad().toString();
//            fila[4] = p.getDepartamento();
//           
//            model.addRow(fila);
//        }
//        this.jTable1.setModel(model);

        //Titulo
        this.setTitle("Centro de Administracion Policial");

        //Posicionamiento y Tamaño
        this.setSize(1200, 628);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        //Cambiar Icono de ventana
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono_ventana_policia.png")).getImage());

        //Poner Imagen de fondo en JFrame
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon MyImgCustom = new ImageIcon(this.getClass().getResource("/imagenes/fondo_poli.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(MyImgCustom);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, MyImgCustom.getIconWidth(), MyImgCustom.getIconHeight());

        //Reloj
        reloj();
    }

    private void reloj() {

        calendario = new java.util.GregorianCalendar();
        javax.swing.Timer timer = new javax.swing.Timer(1000, new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent ae) {
                java.util.Date actual = new java.util.Date();
                calendario.setTime(actual);
                dia = calendario.get(Calendar.DAY_OF_MONTH);
                mes = (calendario.get(Calendar.MONTH) + 1);
                año = calendario.get(Calendar.YEAR);
                hora = calendario.get(Calendar.HOUR_OF_DAY);
                minutos = calendario.get(Calendar.MINUTE);
                segundos = calendario.get(Calendar.SECOND);
                String hour = String.format("%02d : %02d : %02d", hora, minutos, segundos);
                String date = String.format("%02d / %02d / %02d", dia, mes, año);
                horaf = ("<html><center>" + hour + "<br>" + date);
                reloj.setText(horaf);

            }
        });
        timer.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btt_multas = new javax.swing.JButton();
        btt_policias = new javax.swing.JButton();
        btt_lista = new javax.swing.JButton();
        reloj = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btt_multas.setText("Multas");
        btt_multas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btt_multas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_multasActionPerformed(evt);
            }
        });

        btt_policias.setText("Policias");
        btt_policias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btt_policias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_policiasActionPerformed(evt);
            }
        });

        btt_lista.setText("Lista Multas");
        btt_lista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btt_lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_listaActionPerformed(evt);
            }
        });

        reloj.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "idPolicia", "Nombre", "Nº Placa", "Edad", "Departamento"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btt_lista, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reloj, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btt_multas, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btt_policias, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 48, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btt_multas, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btt_policias, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btt_lista, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(reloj, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btt_multasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_multasActionPerformed

        MultasIntroducir multas_ventana = new MultasIntroducir(this, true, jd);
        multas_ventana.setVisible(true);
    }//GEN-LAST:event_btt_multasActionPerformed

    private void btt_policiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_policiasActionPerformed
        PoliciasMantenimiento policias_ventana = new PoliciasMantenimiento(this, true, jd);
        policias_ventana.setVisible(true);
    }//GEN-LAST:event_btt_policiasActionPerformed

    private void btt_listaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_listaActionPerformed
        MultasListado listado_ventana = new MultasListado(this, true, jd);
        listado_ventana.setVisible(true);
    }//GEN-LAST:event_btt_listaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btt_lista;
    private javax.swing.JButton btt_multas;
    private javax.swing.JButton btt_policias;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel reloj;
    // End of variables declaration//GEN-END:variables
}
