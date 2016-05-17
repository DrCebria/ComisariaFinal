package vistas;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Centro de Administracion Policial");

        //Cambiar Icono de ventana
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono_ventana_policia.png")).getImage());

        //Poner Imagen de fondo en JFrame
//        ((JPanel) getContentPane()).setOpaque(false);
//        ImageIcon MyImgCustom = new ImageIcon(this.getClass().getResource("/imagenes/fondo_poli.jpg"));
//        JLabel fondo = new JLabel();
//        this.setSize(1200, 600);
//        this.setResizable(false);
//        fondo.setIcon(MyImgCustom);
//        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
//        fondo.setBounds(0, 0, MyImgCustom.getIconWidth(), MyImgCustom.getIconHeight());
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btt_multas.setText("Multas");
        btt_multas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_multasActionPerformed(evt);
            }
        });

        btt_policias.setText("Policias");
        btt_policias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_policiasActionPerformed(evt);
            }
        });

        btt_lista.setText("Lista Multas");
        btt_lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_listaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btt_lista)
                    .addComponent(btt_policias)
                    .addComponent(btt_multas))
                .addContainerGap(655, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(btt_multas)
                .addGap(46, 46, 46)
                .addComponent(btt_policias)
                .addGap(48, 48, 48)
                .addComponent(btt_lista)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btt_multasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_multasActionPerformed

        MultasIntroducir multas_ventana = new MultasIntroducir(this, true);
        multas_ventana.setVisible(true);
    }//GEN-LAST:event_btt_multasActionPerformed

    private void btt_policiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_policiasActionPerformed
        PoliciasMantenimiento policias_ventana = new PoliciasMantenimiento(this, true);
        policias_ventana.setVisible(true);
    }//GEN-LAST:event_btt_policiasActionPerformed

    private void btt_listaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_listaActionPerformed
        MultasListado listado_ventana = new MultasListado(this, true);
        listado_ventana.setVisible(true);
    }//GEN-LAST:event_btt_listaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btt_lista;
    private javax.swing.JButton btt_multas;
    private javax.swing.JButton btt_policias;
    // End of variables declaration//GEN-END:variables
}
